#Resume #notes_de_cours
# Administration des Bases de données 
* Fait par : **Chedi feki** 
* Enseignant : **Pr. Sahbi Zahhaf** 
* Année Academique : **2020/2021**

___

## Table des Matières: 
* [[#Généralités sur les Bases de Données]]
* [[#Gestion des Transactions]] 
* [[#Architecture Oracle]] 
* [[#Langage SQL]] 

## Généralités sur les Bases de Données
### Base de Données (BD)
* **Definition**: 
	* **Ensemble Structuré de données**: 
		* Objets et Liens entre objets. 
	* **Support de stockage Permanent**
	* **Minimum de redondance**
		* Accès et mise-a-jour
	* **Plusieurs utilisateurs simultanés**
		* de façon selective
		* Confidentialité et sécurité
	* **Temps opportun**: 
		* Performance
* **Etapes de Mise en Oeuvre d'une BD**
	1. Modelisation Conceptuelle de la BD (MCD) 
		* Modele Entité Association
		* Diagramme de classes UML 
	2. Modelisation Logique Relationnelle de la BD (MLR)
		* Regles de passage du MCD  -> MLR 
		* Regles de Normalisation **1FN->2FN->3FN**
		* Algèbre Relationnelle
	3. Developpement d'une BD Relationnelle
		* SGBD
		* SQL    
### Systeme de Gestion des Bases de Données (SGBD)
* Definition:
* Roles: 
	* Eviter la redondance de données 
	* Exploiter un langage pour la gestion des BD 
		* [[#Langage SQL]]
	* Assurer le stockage de données
		* Indépendance Physique (Fichier physiques)
		* Indépendance Logique (Organisation logique dans les tablespaces)
		* => Assurer la correspondance entre Logique et Physique 
	* Assurer la Cohérence des données 
		* Appliquer les Contraintes d'integrité (CI) a chaque mise a jour
	* Partager les données entre les utilisateurs
		* de façon simultanée 
		* Attention au problèmes lors de mise a jour 
		* [[#Concurrence]]
	* Gérer les requetes Utilisateurs
	* Gérer les Transactions
		* [[#Transactions]]
	* Assurer la Gestion de Reprise face aux pannes
		* Restaurer les BD dans etat cohérent suite a une Panne
			* Panne de systeme (arrêt brusque)
				* La Reprise est Automatique et Rapide
				* La Reprise s'appuie sur les Fichiers de journalisation
			* Panne de Disque (Hardware defectueux)
				* La Reprise est plus longue 
				* La Reprise S'appuie en plus sur les Fichiers de journalisations Archivés
## Gestion des Transactions 
### Transactions 
* **Séquence d'operations LMD** qui accèsde à et modifie le contenu d'une BD
* **Unité Atomique de traitement**
	* en 1 etape, Etat Actuel Cohérent -> Nouvel Etat Cohérent 
		* *Rq: Etats incohérents possibles durant traitement*
	* elle doit se realiser completement, et ne laisser aucune trace d'execution dans le cas echéant (Annulation / Panne)
* LCT
* **Propriétés ACID**
	* **A**tomicité
		* elle doit se realiser completement, et ne laisser aucune trace d'execution dans le cas echéant (Annulation/Panne)
		* Etats intermediaires invisibles aux transactions concurrents 
	* **C**ohérence
		* Garantir l'intégrité des données
		* Assurer le passage Etat Actuel Cohérent -> Nouvel Etat Cohérent
		* En cas de problèmes, l'Etat Actuel Cohérent doit etre restauré
	* **I**solation
		* Exécution séquentielle des Transactions concurrentes accédant aux mêmes données en même temps
		* le niveau d'isolation d'une transactions par rapport aux autres est planifiable
	* **D**urabilité
		* Le SGBD garantit l'execution des transactions validées même en cas de problèmes (Pannes/Défaillances)
		* Utilisation d'un Gestionnaire  de Reprise
* Gestion des Transactions Avec SQL
	* [[#Langage de Controle de Transaction LCT]]
	* Points de reprise (Save Point)
		* Marque speciale à l'interieur d'une Transaction
		* Autorise l'annulation des touts les operations exécutées après le savepoint
		* Permet de restaurer la transaction dans un état avant l'execution de ce savepoint
### Concurrence  d'Accès
* **Anomalies**:
	* le SGBD est un système multiutilisateur
	* une même donnée peut etre manipulée par plusieurs utilisateurs à la fois 
	* => problèmes d'accès concurrent si pas de Synchronisation et controle de transaction concurrentes 
		* **Perte de Mise à jour** (Lost update)
			* Une des transactions est complétement ignorée
			* Solution: Bloquer les accès aux tables lorsque de nouveaux accès pourraient produire des problemes 
				* *Attention : Peut causer des InterBloquages*
		* **Lecture inconsistante ou impropre** (dirty Read)
			* une Transaction des données mises-à_jour par une autre transaction pas encore validée. 
			* Solution: les modifications non validées (sans COMMIT) ne sont pat visibles par les autres transactions
		* ** Lecture non Reproductible** (Non-Repeatable Read)
			* Deux lectures successives d'une meme données -> valeurs differentes
			* Données modifiée par une autre transaction entre deux lectures 
			* Solutions: une transaction bloque les données à modifier.  
		* **Lecutre fantôme** (Phantom Read)
			* une relecture fait apparaitre des tuples qui n'existaient pas lors de la premiere lecture. 
			* validité des tuples fantomes?
* **Niveaux D'isolation des Transactions**
	* Afin de garantir l'integrité des données, l'isolement d'une transaction se fait par un verrouillage de certaines ressources.
		* Trade-Off : baisse du   flux transactionnel 
	* Modes de Verrouillage des Transactions: 
		* **Read uncommitted**
			* Transaction non isolée
			* indisponible sous ORACLE
		* **Read Commited**
			* Chaque Requete d'une Transaction voit les données validées avant le début de **la Requete**
			* Par défaut sous ORACLE 
			* Empeche les Dirty Read 
			* n'empeche pas les lectures non reproductibles 
			* n'empeche pas les tuples fantomes
		* **Repeatable Read**
			* Toutes les données utilisée par une requete sont verrouillées
				* Utilisation d'un verrou pour chaque ligne de table 
				* les autres utilisateurs peuvent seulement insérer de nouvelles lignes
			* Empeche les Dirty Read 
			* Empeche les Lectures non- reproductibles
			* n'empeche pas les tuples fantomes
		* **Serializable**
			* Chaque requete voit les données validées avant le début de **la transaction**
			* mode le plus sécurisant
			* Execution séquentielle des transactions concurrentes 
			* Empeches les Dirty Read 
			* Empeche les lectures non-reproductibles 
			* Empeche les tuples fantomes 
			* Provoque un ralentissement important du débit transactionnel 
		* RECAP : 
			 ![[Pasted image 20210613122845.png]]
## Architecture ORACLE
![[Pasted image 20210613124153.png]]
### Base de Données ORACLE
![[Pasted image 20210613124303.png]]  
les fichiers de la BD ORACLE sont des fichiers binaires, il ne peuvent pas etre lu ou ecrits directement par un editeur de Texte
Il faut passer par des requetes SQL. 
#### Fichiers de Controle (FC)
* au minimum 1 
* Contient les informations sur l'etat de la BD 
	* Nom 
	* Date/Heure de creation 
	* Nom, Chemins d'accès et Taille des autres Fichiers de La BD
	* Numero de Séquence du Groupe Actuels relatif au fichiers de journalisation
	* Informations sur les points de reprise (Check Point)
		* Check Point: Permet de savior la position et la séquence courante au niveau des fichiers de journalisation
		* Enregistré automatiquement par le processus CKPT
		* *Attention : Différent de Save Point dans les transactions*
* Premier fichier ouvert lorsqu'une instance est lancée pour ouvrir une BD
* Permet à l'instance de localiser et ouvrir les autres fichier de la BD 
* Si Perdu ou endommagé alors la BD ne peut pas etre ouverte
* Multiplexable : 
	* Avoir plusieurs copies sur différents disques 
	* Toutes les copies sont identiques 
	* Toutes les copies sont mises a jour lors de chaque modification de la Structure de la BD
* Taille du fichier determinée automatiquement par ORACLE 
#### Fichiers de Données
* 1 ou plusieurs par BD 
* unité physique de stockage 
* contiennent des données relatives à la BD 
* Logiquement organisés dans des Tablespaces
* **Tablespace**
	* Correspond à un ou plusieurs Fichiers physique
	* Deux Tablespace par défaut et résérvés pour ORACLE: 
		* SYSTEM : fonctionnalité principales de la BD
			* Tables du dictionnaire de données par EX 
		* SYSAUX: Systeme auxiliaire pour réduire la charge à SYSTEM
			* Tablespace par défaut des Composants ORACLE  
	* Organisation logique du Stockage: 
		* **Bloc** de donnée
			* Taille: 4Ko, 8Ko ... 
			* correspondance Bloc logique <->  Bloc physique du disque dur
		* **Extension** : ensemble consécutif de Blocs
			* Alloués simultanément à un Objet du Schéma.
		* **Segment** : ensemble d'extensions non cosécutifs destinés à un même objet.
			* Tables 
			* Synonyms 
			* Sequences 
			* Index 
			* Clusters
			* Programme PL/SQL
	* L'espace occupé par un objet dans un TableSpace est un Ségment 
	* => Tablespace = ensemble d'objets = ensemble de ségments
	* ![[Pasted image 20210613133522.png]]
	* SQL:  [[#Gestion des Tablespace]]
* **Dictionnaire de Données ORACLE** (DD)
	* ensemble de tables et Vues <- infos sur le contenu de la BD:
		* Structures de stockage
		* les utilisateurs et leur droits
		* les objets (Tables, Vues, index ... )
	* Appartient à SYS et est stocké dans le tablespace SYSTEM
	* Créé à la creation de BD 
	* Mis à jour par oracle lorsque les ordres LDD SQL sont executés
	* Chargé dans le Dictionary Cache du SHARED POOL de la SGA 
	* Contient: 
		* **Tables et vues Statiques**:
			* Basées sur de vraies tables stockés dans SYSTEM
			* Sont accessibles uniquement quand la BD est Ouverte
			* Categories basées sur le préfixe: 
				* USER_% : 
					Informations sur les objets qui appartiennent à l'utilisateur  
				* ALL_% :
					Informations sur les objets auxquels l'utilisateur a accès ( les siens + ceux sur lesquels il a reçu des droits) 
				* DBA_% :
					Informations sur les objets de la BD 
			* DICTIONARY et DICT_COLUMNS: description de toutes les tables et vues du DD
		* **Tables et vues Dynamiques**: 
			* basées sur des informations en memoire ou extraites du FC
			* Sont accessibles meme quand la BD n'est pas ouverte mais seulement par les DBA
			* Préfixe: v$ 
				* v$INSTANCE : informations sur l'instance 
				* v$DATABASE : information sur la BD
				* v\$SGA et v\$SGAINFO: Informations sur la SGA
				* v$ PPARAMETER ... 
			* Sont décrites dans les vues DICTIONARY et DICT_COLUMNS
#### Fichiers de Journalisation( Redo-Log)
![[Pasted image 20210613131657.png]]
* minimum 2 groupes de plusieurs membres 
	* Chaque groupe possède un numero de séquence spécifique
	* tous les membres d'un groupe ont la meme taille qui est definie lors de la creation du groupe
* Créés automatiquement lors de la creation de la BD
* Conservent toutes les modifications successives approtées à la BD
* utiles pour : 
	* restauration de l'instance si arrêt brusque ( panne systeme ) .
	* récuperation des données si un fichier de données est endommagé (panne disque) 
* L'ecriture dans les fichiers de journalisation: 
	* Circulaire : les Données sont periodiquement ecrasées
		* Si Groupe Plein ( tous les membres sont pleins) alors Basculement ( switch ) vers le groupe suivant 
		* Si dernier groupe plein alors basculement vers et ecrasement du premier groupe 
		* pour eviter la perte de données, il faut archiver les Redo-log remplis.
	* Simultanée : dans un groupe, les membres contiennent tous la meme information ecrite par le processus LGWR
		* 2 ou 3 membres par groupe ( multiplexage ) sur des disques differents idealement
	 
### Instance ORACLE
![[Pasted image 20210613124244.png]]
#### Memoire System Global Area (SGA)
* memoire contenant les données et les informations de controle de l'instance 
* memoire partagée par des processus serveurs et processus en arrière plan
* Contient un ensemble de Sous memoires:
	* **DataBase Buffer Cache** (DBBC)
		* Memoire tampon dans laquelle ORACLE charge les blocs de données demandés par l'utilisateur
		* types de blocs: 
			* Blocs de tables 
			* Blocs d'index 
			* Blocs de Ségments d'annulation:
				*  contenant la version précédente des données en cours de modification
			* Blocs temporaires
		* Les Blocs sont chargés dans la DBBC par des Processus serveur et sont ecrits dans les Fichiers de données par les processus $DBW_n$
		* toute modification ( INSERT, UPDATE, DELETE) s'effectue dans le DBBC, l'ecriture sur les fichiers de données se fait en diféré. 
		* la taille du DBBC est finie, est dimensionné par les parametres (DB_CACHE_SIZE) et (DB_nk_CACHE_SIZE)
	* **Redo-Log Buffer**
		* Memoire Tampon pour l'enregistrement des modifications atomiques apportées aux données de la BD avant leur ecriture dans les fichiers de journalisation
		* une redo-entry pour chaque modification est ecrite dans le redo-log buffer
		* une redo-entry est composé de change vectors 
			* chaque vecteur decrit une modification atomique d'un bloc 
			* la nouvelle valeur et l'ancienne valeur sont enregistrés par le processus LGWR dans les redo-log 
		* Utilisé de maniere 
			* Séquentielle : les modifications de plusieurs transactions se melangent
			* Circulaire: si le redo-log buffer est rempli alors on ecrase et on réecrit sur le premier Redo 
		* Dimensionné par le parametre (LOG_BUFFER)
	* **Shared Pool** (SHARED_POOL_SIZE)
		* **Library Cache** 
			* concerne le plan d'execution des requetes
			* informations sur les ordres SQL et PL/SQL les plus récement executés. 
			* Lors de la premiere execution d'une requete, ORACLE analyse et stocke le résultat d'analyse dans la library cache (Etape de Parsing)
			* Lors d'executions ultérieures, ORACLE est en mesure de retrouver et executer directement sans refaire l'analyse la requete.
		* **Dictionary Cache**
			* pour charger le dictionnaire de données oracle lors du démarrage de l'instance
			* ORACLE utilise le DD durant le Parsing pour verifier que les objets demandés existent, que l'utilisateur a le droit d'y accéder; pour determiner ou sont stockés les objets etc 
	* Java Pool : pour la JVM integrée ( JAVA_POOL_SIZE)
	* Large Pool: pour la configuration du serveru partagé (LARGE_POOL_SIZE)
	* Streams Pool: pour faire circuler des informations entre processus (STREAMS_POOL_SIZE)
	* Result Cache: pour les résultats des requetes ou fontions PL/SQL (RESULT_CACHE_MAX_SIZE)
* est allouée au démarrage de l'instance et libérée lors de l'arret
* dimensionnée par un ensemble de parametres dans le pfile (SGA_MAX_SIZE)
#### Memoire Program Global Area (PGA)
* memoire propre pour chaque processus serveur et chaque processus en arrière plan
#### Processus d'arrière plan 
* Permettent d'etablir la communication SGA -> BD ( fichier Physiques)
* la plupart Lancés au demarrage et arrété lors de l'arret de l'instance
* certains sont lancés et arrété au cours du fonctionnement de l'instance
* Il en existe un trentaine, pouvant etre lancés en plusieurs copies
* Principaux: 
	* **$DBW_n$**: Data Base Writer 
		* Chargés d'ecrire les blocs modifiés du DBBC dans les Fichiers de données
		* il peut en exister plusieurs copies : DBW0 DBW1....
		* Ecrit dans les Fichiers de données en Différé par rapport aux modifications réalisées dans les blocs du DBBC
		* est déclanché par un evenement: 
			* Un processus Serveur ne trouve pas de blocs libres pour charger des données dans le DBBC
			* le Processus CKPT le déclanche periodiquement pour faire avancer le point de reprise
		* COMMIT n'est pas un evenement déclancheur !! 
	* **LGWR**: Log Writer
		* chargé d'ecrire le contenu du redo-log buffer dans les redo-log du groupe courant
		* Ecrit séquentiellement dans les redo-log
		* il en existe une seule instance pour faire face aux transactions concurrents 
		* Déclanché par : 
			* COMMIT 
			* 1/3 du redo log buffer est plein 
			* quand un DBW s'apprête a ecrire des blocs modifiés de transactions non validés dans les fichiers de données 
			* un délai est dépassé (3s par défaut) 
	* **CKPT**
		* assure la synchronisation et la cohérence des données 
		* provoque periodiquement l'execution des DBW_n pour faire avancer le Point de Reprise
		* Definit un point de reprise dans les Fichiers de journalisation
			* corréspond à la mdofication du bloc la plus ancienne qui n'as pas encore été ecrite dans un fichier de données 
		* est declanché lors d'un basculement de redo log 
		* Interdit le processus LGWR de commencer à ecrire dans un fichier de journalisation dont la synchronisation n'est pas terminée 
	* **SMON**: System Monitor
		* chargé de 
			* la récuperation de l'instance après un arrêt anormal, a travers les operations : 
				* Roll Forward
					* appliquer aux Fichiers des Données les Modifications non enregistrées des transactions validées 
				* Roll Back 
					* Enlever des fichiers de données les modifications enregistrées des transactions non validées
			* libréer les segments temporaires inutilisés 
			* compacter l'espace contigu disponible dans les tablespaces gérés par le DD 
			* 
	* **PMON**: Process Monitor 
		* chargé du nettoyage lors du plantage d'un processus utilisateur 
		* réalise le ROLLBACK d'une transaction 
		* libére les verrous et les ressources 
	* **$ARC_n$**: Archiver 
		* Chargés de l'archivage des redo logs pleins vers les fichiers de journalisation archivés. 
#### Processus Serveur (PS)
* Chargé de: 
	* Traiter les requetes utilisateurs 
	* Charger les données necessaires dans la DBBC
* Communication entre PS et Processus Utilisateur (PU):
	* Mode dédié: PS pour Chaque PU 
	* Mode Partagé: 1 PS pour plusieurs PU
### ORACLE NET 
est utilisé dans une architecture client/serveur distants
### Fichiers de Journalisation Archivés (Archived Redo-log)
* Objectif : 
	* Avoir des copies des Redo-Log avant la perte d'information a cause de l'utilisation circulaire. 
	* 
### Fichiers Paramètres 
#### PFILE 
* Parameter File 
* init\<SID>.ora
* Fichier texte utilisé via un editeur 
* la BD ORACLE peut LIRE mais pas Modifier le Fichier 
* Si Modification du fichier: l'Instance doit etre arrétée puis redémarrée
* Modifications manuelles 
* Peut etre crée a partir de SPFILE 
	* CREATE pfile FROM spfile; 
#### SPFILE
* Server Parameter File
* Spfile\<SID>.ora
* Fichier binaire 
* la BD ORACLE est la seule à lire et ecrire dans le  
* Modifications prises en compte automatiquement meme si la BD est ouverte
* Modification automatiques 
* Peut se créer depuis PFILE
	* CREATE spfile FROM pfIle;
### Fichier de Mot de passe
utilisé pour etablir la connexion des utilisateurs à la BD 
## Langage SQL 
### Types de données
### Langage de Definition de données (LDD)
#### Gestion des Tables
* Creation de Tables: 
	```sql
		CREATE TABLE nom_Table 
		(
		 [Attr_1 TYPE_1],
		 [Attr_2 TYPE_2],
		 [Attr_3 TYPE_3 DEFAULT valeur], -- DEFAULT : val par def 
		 [Attr_4 [NOT] NULL TYPE_4], -- si on peut ou non mettre un val vide
		 [Attr_5 TYPE_5 UNIQUE], -- pas de doublon
		 [Attr_6 TYPE_6 CHECK(condition)], -- verifie une condition
		 .....,
		 [CONSTRAINT clé_pri PRIMARYKEY (Attr_i[,Attr_j],...)],
			-- pour la definition de la/des clés primaires
		 [CONSTRAINT clé_etr_1 FOREIGNKEY (liste d’Attributs clés de Table_1)
				 REFERENCES Table_1],
			-- pour la definition de la/des clés etrangères
		 [CONSTRAINT clé_etr_2 FOREIGNKEY ( liste d’Attributs clés de Table_2)
				 REFERENCES Table_2]
		);
	```
	* Creation d'une table a parti d'une autre: 
		```SQL
			CREATE TABLE nouvelle_table
			AS SELECT [attribut_1,...]
		   	   FROM table_a_copier
		   	   [WHERE <condition sur les tuples>];
		```
* Modification D'une Table: 
	```sql
		ALTER TABLE nom_Table 
		(
			[ADD nom_ColonneTYPE],
			[DROP COLOMN nom_Colonne],
			[ADD CONSTRAINT nom_Contrainte],
			[DROP CONSTRAINT nom_Contrainte],
			[MODIFY nom_Colonne TYPE],
			[RENAME COLUMN ancien_nom TO nouveau_nom]
		);
	```
* Renommer une Table 
	```sql
		RENAME ancien_nom TO nouveau_nom;
	```
* Vider une Table
	```sql
		TRUNCATE TABLE nom_table;
	``` 
* Suppression d'une Table definitive
	```sql
		DROP TABLE nom_table;
	``` 
* Creation de synonymes ( nom different à une meme table )
	```sql
		CREATE SYNONYM nom_synonyme FOR nom_tabke;
	``` 
* Creation de Séquence
	* une séquence est une colonne définie dans une table comme clé primaire
	* le SGBD gere l'incrémentation automatique de cette Colonne
	* On peut specifier une valeur de départ, un pas, et une valeur maximale
	```Sql
		CREATE SEQUENCE S_Num
		[START WITH val]
		[INCREMENT BY step]
		[MINVALUE min]
		[MAXVALUE max];
	```
#### Gestion des Vues 
* une vue n'est pas un objet proprement dit mais le résultat d'une requete
* une vue n'autorise pas les mises a jour des données 
* une vue représente a un instant t l'image de la table quelle utilise
* une vue crée peut etre utilisée dans de nouvelles requetes select pour garantir la sécurité des tables. 
* une vue est une représentation logique de la Bse 
* une vue est concidérée comme une table virtuelle specifique pour un domaine ou pour une classe d'utilisateurs
* une vue permet de masquer certaines colonnes (informations confidentielles...)   


* Creation d'une Vue
	```sql
		CREATE VIEW nom_Vue
		AS SELECT [Attribut_1, Attribut_2, ...] 
		FROM [Table_1, Table_2, ...]
		[WHERE <conditions logiques de niveau Tuples>]
		;
	```
* Suppression d'une vue 
	```sql
		DROP VIEW nom_Vue;
	```
#### Gestion des Index 
* Creation d'un Index 
	```sql
		CREATE [UNIQUE] INDEX nom_Index -- unique interdit les doublons
		ON nom_Table
		(
			Attribut [ASC| DESC], -- ordre ASCendant ou DESCendant
			....
		);
	```
* Suppression d'un Index 
	```sql
		DROP INDEX nom_Index;
	```
	
	
	
	
### Langage de Manipulation de données (LMD)
* Insertion des Données 
	```SQL
		INSERT INTO nom_Table (Colonne 1,...,Colonne n)
		VALUES (Valeur 1,...,Valeur n);
	```
	```SQL
		INSERT INTO nom_Table (Colonne 1,...,Colonne n)
		SELECT (Colonne 1, ... Colonne n)
		FROM table_a_copier
		[WHERE <condition sur les tuples>];
	```
* Modification des données 
	```SQL
		UPDATE nom_Table
		SET 
			<Colonne 1> = <valeur 1> ,
			<Colonne 2> = <valeur 2> ,
			<Colonne 3> = <valeur 3> ,
			.....................
		[WHERE<conditions logiques de niveau Tuples>]; 
	``` 
* Suppression des données
	```sql
		DELETE FROM nom_Table
		[WHERE <conditions logiques de niveau Tuples> ];
	```
### Langage d'Interrogation de données (LID)
* Requete SELECT Simple: 
	```SQL
		SELECT * | [DISTINCT|ALL] <Attribut(s)>
		FROM <Table(s) source(s)>
		[WHERE <Condition(s) logique(s) sur le(s) Tuple(s)>]
		[GROUP BY <Regroupement sur l(es) Attribut(s)>]
		[HAVING<condition(s) ou restriction(s) sur le Groupe>]
		[ORDER BY <Tri sur l(es) Attribut(s)>];
	```
	* fonctions de groupement: 
		* COUNT: nombre de lignes 
		* SUM : somme des valeurs d'une colonnes
		* AVG : Moyenne des valeurs d'une colonne
		* MAX : valeur maximale d'une colonne
		* MIN : valeu minimale d'une colonne
* Jointures 
	* SI on ne precise pas les conditions de jointure alore le SGBD réalise le produit cartésien des tables par defaut 
	* types 
		* **Jointure Interne**
			```sql
				SELECT<Attribut(s)>
				FROM R1,R2 
				WHERE R1.A=R2.A;
			```
			```sql
				SELECT<Attribut(s)>
				FROM R1 INNER JOIN R2 
				ON R1.A=R2.A;
			```
		* **Jointure Externe**
			```sql
				SELECT<Attribut(s)>
				FROM R1,R2 
				WHERE R1.A=R2.A(+); -- R1 est la table maitre
				-- les resultats de R1 seront affichés 
				-- Même s'ils n'ont pas de correspondance dans R2
			```
			```sql
				SELECT<Attribut(s)>
				FROM R1 LEFT OUTER JOIN R2 -- Left indique que R1 est Maitre
				ON R1.A=R2.A;
			```
			```sql
				SELECT<Attribut(s)>
				FROM R1 RIGHT OUTER JOIN R2 -- Right indique que R2 est Maitre 
				ON R1.A=R2.A;
			```
		* **Jointure Naturelle**
			```sql
				SELECT<Attribut(s)>
				FROM R1 NATURAL JOIN R2;
				-- laisse le SGBD associer les colonnes qui ont le meme nom
				-- pas conseillé car peut fausser les résultats
			```
		* **Jointure Croisée** = Produit Cartésien	
			```sql
				SELECT<Attribut(s)>
				FROM R1,R2 ;
			```
			```sql
				SELECT<Attribut(s)>
				FROM R1 CROSS JOIN R2 ;
			``` 
* Requêtes Imbriquées 
	* souvent placée à la suite d'un WHERE ou d'un HAVING 
	* Liaison a travers les operateurs 
		```sql
			{\=|!=|\>|\>=|<|<=}
			{ANY|ALL}
			[NOT]IN
			[NOT]EXISTS
		```
	* Exemple: 
		```sql
			SELECT * 
			FROM Employé
			WHERE Salaire > (SELECT Salaire
							 FROM Employé
							 WHERE Matricule = 4271054 ) ;
		```
* Fonctions 
	* NVL(exp1,exp2): prend la valeur exp1 si exp1 not null, sinon exp2
	* DECODE(Critère, val_1, res_1,..., val_defaut)
		* resultat = res_1 si critère à la valeur val_1
		* resultat = res_2 si critère à la valeur val_2
		* ....
		* resultat= val_defaut si le critère est à une autre valeur 
		* EX: 
			```sql
				DECODE (Comm,NULL,‘sans’,0,‘sans’,Comm)"commission" 
				-- si comm = null alors 'sans commission'
				-- si comm = 0 alors 'sans commission
				-- autre : Comm "commission";
			```
* Operateurs Ensemblistes: 
	* UNION
		* toutes les lignes des deux tables
		 ```sql
		 	SELECT Colonne 1, <Colonne 2>, .... 
			FROM Table1 
			WHERE <Conditions>
				UNION 
			SELECT Colonne 1, <Colonne 2>, .... 
			FROM Table2
			WHERE<Conditions>
			[ORDER BY <Colonne 1>, ...] ;
		 ```
	* INTERSECT
		* Lignes communes au deux tables
		```sql	
			SELECT Colonne 1, <Colonne 2>, .... 
			FROM Table1
			WHERE<Conditions>
				INTERSECT
			SELECT Colonne 1, <Colonne 2>, .... 
			FROM Table2
			WHERE <Conditions>
			[ORDER BY <Colonne 1>, ...] ;
		```
	* EXCEPT ( ou MINUS)
		* Selectionne les lignes d'une tables non présentes dans une autre table 
		```sql	
			SELECT Colonne 1, <Colonne 2>, .... 
			FROM Table1
			WHERE<Conditions>
				EXCEPT
			SELECT Colonne 1, <Colonne 2>, .... 
			FROM Table2
			WHERE <Conditions>
			[ORDER BY <Colonne 1>, ...] ;
		```
### Langage de Controle de Données (LCD)
#### Gestion des Profils
* ensemble noimmé de limitations de ressources attribué a un utilisateur 
* les Ressources sont : 
	* Temps CPU par Appel et / ou Par session
	* Nombre de Lectures logiques par appel et/ou par session
	* Nombre de sessions ouvertes simultanément pour un même utilisateur 
	* Temps d'inactivité par session 
	* Durée totale par session 
	* Espace memoire privée dans la SGA
* la Gestion des profils impose aussi toute une politique de gestion de mots de passes 
* chaque utilisateur doit avoir un profil, et ne peut appartenir qu'a un profil a la fois
* il existe un profil par défaut (DEFAULT)



* Creation d'un profil 
	```SQL
		CREATE PROFILE nom_profile
		LIMIT
			-- nombre de sessions simultanées
			[SESSIONS_PER_USER {entier | Unlimited | default}]
			
			-- Temps CPU par session (centième de seconde)
			[CPU_PER_SESSION {entier | Unlimited | default}]
			
			-- Temps CPU par Appel (centième de seconde)
			[CPU_PER_CALL {entier | Unlimited | default}]
			
			-- temps total de Connexion (minutes)
			[CONNECT_TIME {entier | Unlimited | default}]
			
			-- Temps total d'inactivité (minutes)
			[IDL_TIME {entier | Unlimited | default}]
			
			-- Nombre de lectures logiques par Session 
			-- correspond au nombre de lectures de blocs autorisé
			[LOGICAL_READS_PER_SESSION {entier | Unlimited | default}]
			
			-- Nombre de lectures logiques par appel 
			[LOGICAL_READS_PER_CALL {entier | Unlimited | default}]
			
			-- Espace memoire privé dans la SGA
			-- seulement dans une architecture Serveurs Partagés
			[PRIVATE_SGA {entier [K|M] | Unlimited | default}]
			
			-- nombre de tentatives de connection
			-- = 10 dans le profile Default
			[FAILED_LOGIN_ATTEMPTS {entier | Unlimited | default}]
			
			-- Durée de vie d'un mot de passe avant changement (jours)
			-- = 180 jours dans le profile Default
			[PASSWORD_LIFE_TIME {entier | Unlimited | default}]
			
			-- nombre de Jours avant réutilisation d'un mot de passe périmé
			[PASSWORD_REUSE_TIME 
			 	-- Nombre de changements de mots de passe avant réutilisation
			     | PASSWORD_REUSE_MAX {entier | Unlimited | default}]
			
			-- Nombre de jours de blocage du compte après
			-- epuisement des tentatives de connexion 
			[PASSWORD_LOCK_TIME {entier | Unlimited | default}]
			
			-- Periode de grace après expiration (jours)
			-- permet la connexion et le changement du mdp  après expiration
			[PASSWORD_GRACE_TIME {entier | Unlimited | default}]
			
			--Definir la fonction PL/SQL pour la verification du mot de passe
			[PASSWORD_VERIFY_FUNCTION { fonction | null | default}]
			
			;
			
	```
* Modification d'un profil 
	```SQL
		ALTER PROFILE nom_profile
		LIMIT
			[SESSIONS_PER_USER {entier | Unlimited | default}]
			[CPU_PER_SESSION {entier | Unlimited | default}]
			[CPU_PER_CALL {entier | Unlimited | default}]
			[CONNECT_TIME {entier | Unlimited | default}]
			[IDL_TIME {entier | Unlimited | default}]
			[LOGICAL_READS_PER_SESSION {entier | Unlimited | default}]
			[LOGICAL_READS_PER_CALL {entier | Unlimited | default}]
			[PRIVATE_SGA {entier [K|M] | Unlimited | default}]
			[FAILED_LOGIN_ATTEMPTS {entier | Unlimited | default}]
			[PASSWORD_LIFE_TIME {entier | Unlimited | default}]
			[PASSWORD_REUSE_TIME 
			     | PASSWORD_REUSE_MAX {entier | Unlimited | default}]
			[PASSWORD_LOCK_TIME {entier | Unlimited | default}]
			[PASSWORD_GRACE_TIME {entier | Unlimited | default}]
			[PASSWORD_VERIFY_FUNCTION { fonction | null | default}]
			;
			
	``` 
* Suppression d'un profil
	```SQL
		DROP PROFILE nom_profile [CASCADE];
		-- cascade permet de supprimer le profil pour 
		-- tous les utilisateurs concernés
	```
#### Gestion des Utilisateurs 
* Creation d'un utilisateur
	```SQL
		CREATE USER nom_utilisateur
		-- Externally indique que l'utilisateur est identifié par le SE
		IDENTIFIED {BY mdp | EXTERNALLY}
		
		-- Indique dans quel tablespace les segments sont créés par défaut
		[DEFAULT TABLESPACE nom_tablespace]
		
		--Indique dans quel tablespace les segments temporaires sont créés
		[TEMPORARY TABLESPACE nom_tablespace]
		
		-- limiter l'espace dans un tablespace pour créer des segments
		[QUOTA { valeur [K|M] | UNLIMITED } ON nom_tablespace]
		
		-- Specifie le profile a attribuer a un utilisateur
		[PROFILE nom_profile]
		
		-- Forcer le changement du mdp lors de la premiere connexion
		[PASSWORD EXPIRE]
		
		-- Verouille ou active le compte (default activé)
		[ACCOUNT { LOCK | UNLOCK } ]
		;
	```
* Modification d'un utilisateur
	```SQL
		ALTER USER nom_utilisateur
		IDENTIFIED {BY mdp | EXTERNALLY}
		[DEFAULT TABLESPACE nom_tablespace]
		[TEMPORARY TABLESPACE nom_tablespace]
		[QUOTA { valeur [K|M] | UNLIMITED } ON nom_tablespace]
		[PROFILE nom_profile]
		[PASSWORD EXPIRE]
		[ACCOUNT { LOCK | UNLOCK } ]
		
		-- Modifier les Roles de cet utilisateur 
		[DFAULT ROLE {role[,role...] | ALL | ALL EXCEPT role[,role..]| NONE }]
		;
	``` 
* Suppression d'un utilisateur 
	```sql
		DROP USER nom_utilisateur [CASCADE];
		-- Si l'utilisateur possède des objets, CASCADE devient obligatoire
		-- un utilisateur connecté ne peut pas etre supprimé 
	```
* Pour qu'un nouvel utilisateur puisse se connecter, il faut lui donner le droit de le faire 
	* il est necessaire de lui accorder lr privilege systeme CREATE SESSION. 
* On peut attribuer des privilèges atravers des roles a un utilisateur après ça creation en utilisant ALTER USER
#### Gestion des Droits
* Gestion des Privilèges 
	* Privilèges Systeme
		est le droit d'executer un ordre SQL 
		Chaque ordre SQL a au moins un privilège systeme associé qui porte le même nom
		Sources de pouvoir => Danger 
		* Attribution des PSys
			* une fois attribué un PSYS est immediatement actif 
			```SQL
				-- grant permet d'attribuer n'importe quel Psys 
				GRANT 
					<psys>[,<psys>...]
				TO 
				--public permet d'affecter le PSYS a tout le monde
					<username> | PUBlIC
					
				-- Autorise celui qui a reçu le privil_ge de le transmettre
				[WITH ADMIN OPTION]
				-- dangereuse car les privilèges transmits ne sont pas
				-- révoqués en cascade. 
			```
		* Suppression des PSys 
			```SQL
				-- Revoke permet de révoquer n'importe quel Psys 
				Revoke 
					<psys>[,<psys>...]
				FROM 
				--public permet d'affecter le PSYS a tout le monde
					<username> | PUBlIC; 
				-- il n'ya pas de cascade pour la révocation. 
				
			``` 
		* Liste de quelques PSys
			* **Table**
				* CREATE \[ANY] TABLE, ALTER  \[ANY] TABLE, DROP \[ANY] TABLE
			* **Index** 
				* CREATE \[ANY] INDEX, ALTER \[ANY] INDEX, DROP \[ANY] INDEX
			* de même por (view, Sequence,Synonym )
			* **Procedure**
				* CREATE \[ANY] PROCEDURE, ALTER \[ANY] PROCEDURE, DROP \[ANY] Procedure, EXECUTE \[ANY] PROCEDURE
			* **Trigger**
				* CREATE \[ANY] TRIGGEr, ALTER \[ANY] TRIGGER, DROP \[ANY] TRIGGER
			* **Profile**
				* CREATE PROFILe, ALTER PROFILE, DROP PROFILE
			* **User**
				* CREATE USER, ALTER USER, DROP USER
			* **Role**
				* CREATE ROLE, ALTER \[ANY] ROLE, DROP \[ANY] ROLE
			* **Tablespace** 
				* CREATE TABLESPACE, ALTER TABLESPACE, DROP TABLESPACE
			* **SESSION**
				* CREATE SESSION, ALTER SESSION, DROP SESSION
	* Privilèges Objet 
		Est Le Droit d'exploiter un objet d'un autre utilisateur
		Par default le propriétaire de l'objet possède tous les droits dessus
		
		* Attribution des PO
			* une fois attribué, un PO est immediatement actif 
			* Certains privilèges systemes donnent implicitement des privilèges objet
				* Ex: SELECT ANY TABLE 
			```SQL
				GRANT
					{PO[,PO;....] | ALL [PRIVILEGES]}
				ON [Schema.]Objet
				TO 
					{nom_utilisateur | Public }
				[WITH GRANT OPTION]
			```
		* Suppression des PO
			```SQL
				Revoke
					{PO[,PO;....] | ALL [PRIVILEGES]}
				ON [Schema.]Objet
				FROM 
					{nom_utilisateur | Public }
				-- !il y a cascade dans la révocation des privilèges objet!
			``` 
		* Liste de quelques PO
			* **SELECT** \[(col;..)] 
				* Droit de lecture eventuellement limité a certaines colonnes
			* **INSERT** \[(col;..)]
				* Droit d'insertion de lignes (eventuellement limité a certaines colonnes)
			* **UPDATE** \[(col;..)]
				* Droit de mofication de lignes (eventuellement limité a certaines colonnes)
			* **DELETE** \[(col;..)]
				* droit de suppression de lignes (eventuellement limité a certaines colonnes)
			* **REFERENCES** \[(col;..)]
				* droit de faire reference a des contraintes definies sur un objet 
			* **EXECUTE** 
				* droit d'executer une procédure une fonction ou un package 
			* **ALL** 
				*  tous les droits 
* Gestion des Roles 
	un Role est un regroupement nommé de privlèges (Sys et/ou Objet) qui peut etre attribué a un utilisateur, un groupe d'utilisateurs ou a un autre role 
	Tous les privilèges regrougpés dans le role sont alors simultanément attribués. 
	* Roles Standard: 
		* **CONNECT** 
			* Autorise la connexion ( PSys CREATE SESSION)
		* **RESOURCE**
			* Permet la creation des principaux objets d'un schema(Table Vue etc)
		* **DBA**
			* Donne toues les privlèges Systemes avec l'option WITH ADMIN OPTION
	* Creation D'un role
		* Pour créer un role il faut avoir le privilege systeme CREATE ROLE 
		* Avant de recevoir des privileges, un role doit etre créé 
		```sql
			CREATE ROLE nom_rôle
			
			--identifié par mot de passe ou via le SE
			[IDENTIFIED {BYmdp| EXTERNALLY}|
			 
			 -- seul le package peut activer le role
			 USING nom_package|
			 
			 --aucune identification necessaire
			 NOT IDENTIFIED]; 
		```
	* Modification d'un Role
		```SQL
			ALTER ROLE nom_rôle 
			[IDENTIFIED {BYmdp|EXTERNALLY}|
			 USINGnom_package | NOTIDENTIFIED];
		```
	* Attribution d'un PSYS a un role 
		```SQL
			GRANT
				<PSys>,[,...]
			TO
				<rôle>[<rôle>]...
			[WITHADMINOPTION];
		```
	* Attribution d'un PO à un role 
		```SQL
			GRANT
				<PO>,[,...]| ALL [PRIVILEGES]
			TO
				<rôle>[<rôle>]...
			-- l'option With admin option est interdites pour le
			-- roles pour les PO
		```
	* Suppression d'un PSYS à  un role 
		```SQL
			Revoke 
				<psys>[,<psys>...]
			FROM 
				<role> [<role>]; 				
			```  
	* Suppression d'un PO à un  role 
		```SQL
			Revoke
				{PO[,PO;....] | ALL [PRIVILEGES]}
			ON [Schema.]Objet
			FROM 
				{nom_utilisateur | Public }
				
		``` 
	* Attribution d'un Role à un utilisateur ou un role 
		```SQL
			GRANT
				<rôle>[,<rôle>,...]
			TO
				{<nom_utilisateur>|<rôle>|PUBLIC} [...]
				[WITHADMINOPTION];
		```
	* Suppression d'un role à un utilisateur ou un role 
		```SQL
			REVOKE
				<rôle>[,<rôle>,...]
			FROM
				{<nom_utilisateur>|<rôle>|PUBLIC}[...];
		```
	* Suppression d'un Role
		```SQL
			Drop ROLE nom_role;
		```
	* Activation / Desactivation des Roles
		* Role par défaut automatiquement activé lors de la connexion de l'utilisateur 
		* si utilisiateur connecté au moment de l'attribution, alors l'activation n'est pas automatique 
		* L'utilisateur doit activer le role grace a l'ordre SET ROLE 
		```SQL
			SET ROLE
			{nom_rôle1[IDENTIFIEDBYmdp],
			nom_rôle2[IDENTIFIEDBYmdp],...}|
			ALL|
			[ALLEXCEPTrôle[,rôle]...]|
			NONE;
		```

### Langage de Controle de Transaction (LCT)
* Creation de Transactions
	* Implicite 
		* Premiere instruction après connexion à la base
		* Après COMMIT
		* Après ROlLBACK 
	* Explicite
		```SQL
			SET TRANSACTION {READ ONLY | READ WRITE};
		```
	* Lancer une Transaction : 
		```SQL
			BEGIN TRANSACTION;
		```
* Validation des Transactions
	* Implicite
		* à la Fin de la connexion
	* Explicite
		* COMMIT : Les Modifications deviennent definitives
	* Activer/Desactiver la validation automatique: 
		```SQL
			SET AUTOCOMMIT ON/OFF;
		```
* Annulation d'une Transaction
	* Explicite Toujours : 
		* ROLLBACK 
		* ABORT
* Points de Reprise: 
	* Definition d'un SavePoint  
		```SQL
			SAVEPOINT nomPoint;
		```
	* Annuler les Modifications depuis un point de reprise 
		```SQL
			ROLLBACK TO nomPoint;
		```

### Gestion des Tablespace
* Creation d'un Tablespace: 
	```SQL
		CREATE TABLESPACE nom_TableSpace
		DATAFILE 'Chemin d\' accès du fichier' SZIE valeur [K|M] -- Ko ou Mo 
		[MINMUM EXTENT valeur [K|M]] -- taille min d'une extension
		[MAXIMUM EXTENT valeur [K|M]] -- taille max d'une extension
		[DEFAULT STORAGE( -- Caractéristiques du Stockage
			[INITAL valeur [K|M]] -- taille de la permiere extension allouée
			[NEXT valeur [K|M]] -- taille de la 2eme extension allouée
			[MINEXTENTS nombre]-- nombre min d'extensions allouées au segment
			[MAXEXTENTS nombre]-- nombre max  // 
			[PCTINCREASE pourcentage]
			-- pourcentage d'accroissement des extensions
			-- appliqué a partir de la 3eme 
		)];
		-- tout ce qui est entre [ ] est optionnel
	```
* Modification d'un TableSpace: 
	* Agrandissement de l'espace de stockage 
		```SQL
			ALTER TABLESPACE nom_tableSpace
			ADD DATAFILE nouveau_fichier[, Nouveau_Fichier_ .... ];
			--nouveau_fichier = chemin d'accès au fichier
		``` 
	* Modification des Caractéristiques de stockage
		```SQL
			ALTER TABLESPACE nom_TableSpace
			[DEFAULT STORAGE(
				[INITAL valeur [K|M]] 
				[NEXT valeur [K|M]] 
				[MINEXTENTS nombre]
				[MAXEXTENTS nombre]
				[PCTINCREASE pourcentage]
			 )];
			 -- les tablespaces déja créé ne sont pas affectées par 
			 --ce changement
		```
	* Modification des caractéristiques des fichiers associés 
		```SQL
			ALTER TABLESPACE nom_TableSpace
			RENAME DATAFILE fichier_existant [,autre_fichier_existant...]
			TO fichier_nouveau[, autre_fichier_nouveau];
			-- fichier_existant et fichier nouveau sont de la forme:
			-- 'Chemin\nom_fichier.dbf' SIZE taille
		``` 
	* Mise hors service d'un tablespace 
		```SQL
			ALTER TABLESPACE nom_tableSpace
			OFFLINE [NORMAL  -- mis hors service lorsque tous les utilisateurs 
					 --du tablespace on terminé leurs transactions en cours
					 
					 | IMMEDIATE] -- mis hor service immediatement
		```   
	* Mise en service d'un tablespace 
		```SQL
			ALTER TABLESPACE nom_Tablespace 
			ONLINE ;
		```
	* Tablespace en Lecture seule 
		```sql
			ALTER TABLESPACE nom_Tablespace 
			READ ONLY ;
			-- pour recevoir des tables de type historiques 
			-- dont les données ne doivent jamais être modifiées
		```
	* TableSpace en lecture/Ecriture
		```sql
			ALTER TABLESPACE nom_Tablespace
			READ WRITE ;
		```
* Suppression d'un tablespace :
	```SQL
		DROP TABLESPACE nom_Tablespace 
		[INCLUDING CONTENT] ; -- doit etre utilisée si le tablespace 
							  -- contient des données
		-- a noter: Drop ne detruit pas les fichier physiques.
	```