---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: #Source/lecture_Note/raw
aliases: [202102251041 LN-Administration de Bases de données 4, ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:[[Bases de Données]]
* Date: 2021-02-25
* Given By: [[@Sahbi Zahhaf|Sahbi Zahhaf]]


# Notes 
* Commandes : 
	* SHOW PARAMETER PASS
		* ![[Pasted image 20210225105413.png]]
		* Exclusive means you can't access this file from outside this DB
	* SELECT \* FROM v$PWFILE_USERS;
		* ![[Pasted image 20210225105643.png]]
	* **Demarrage d'instance**
		* STARTUP NOMOUNT;
			* permet de démarrer une instance sans monter la base de donnée
			* le sgbd lit le fichier parametre spfile.ora ou init.ora et 
				* alloue les tructures de memoires
		* STARTUP MOUNT; ALTER DATABASE MOUNT;
			* monter la base de données à l'instance démarée 
			* la base de donnée est montée mais n'est pas ouverte 
			* la base de données n'est pas accessible aux utilisateurs
			* le sgb localise les fichier de controle qui contiennent les noms et les chemins d'acces des fichiers de données et les fichers de journalisation 
			* L'instance est lancée et la base de données est montée toutfois non accessible au utilisateurs
			* utile lorsqu'un administrateur doit effectuer des operations de maintenance
		* STARTUP {OPEN} {RESETLOGS}; ALTER DATABASE OPEN;
			* ouvrir une base de données 
			* oracle ouvre les fichiers de données et les fichiers de journalisation
			* la base de données est accessible aux utilisateurs
		* ALTER DATABASE OPEN READ ONLY;
			* lecture seule
		* STARTUP force;
			* Si (base de donnée ne s'est pas arretée correctement ) ET il ya un probeme dau niveau de son redémarrage ALORS l'administrateur (SYSDBA) utilise cette option pour focer le redémarrage de la base de données.
			* entraine un arret avec abandon : elle force la fermeture de la base de données suis d'un redémarrage de la base de données 
				* SHUTDOWN ABORT;
	* **Arret D'instance**
		* SHUTDOWN NORMAL;
			* une fois l'administrateur tape cette commande 
				* la base de données est fermée si tous les utilisateurs soient deconnectés et toutes les transactions soient terminées 
			* Si cette commande est émise alors les nouveau utilisateurs ne sont plus autorisés a ouvrir une session 
			* INCONVENIENT MAJEUR : on doit attendre la cdéconnexion de tous les utilisateurs 
				* Si les utilisateurs resent connectés longtemps 
		* SHUTDOWN IMMEDIATE;
			* tous les utilisateurs sont déconnectés 
			* toutes les transationcs non validées sont annulées avec ROLLBACK 
			* aucune nouvelle Transaction n'est permise 
			* RAPIDE si la phase de ROLLBACK n'est pas trop importante
		* SHUTDOWN TRANSACTIONAL;
			* toutes les transactions en cours sont autorisées à se terminer 
			* les utilisateurs sont immediatement déconnectés une fois que leurs transactions sont terminée par une validation ( COMMIT ) ou par une annulation( ROLLBACK )
			* aucune nouvelle transaction n'est permise 
			* METHODE UTILE SI : on ne souhaite pas fermer la base de données tant que les transactions ne sont pas terminées 
		* SHUTDOWN ABANDON;
			* administrateur tape cette commande 
			* tout les transactions sont immediatement fermées sans attendre l'execution de commit ou de rollback 
			* les utilisateurs sont immediatement déconnectés 
			* aucune nouvelle transaction n'est permise 
			* Utilisée dans le cas ou l'administrateur rencontre des problemes pour fermer la base de données à l'aide du'ne des trois operations précédentes. 
			* Lors du démarrage la base de donénes fera l'objet d'une tentative de récuperation.
* Base de donnée Oracle : 
	* **Fichiers de données **
		* contiennent toutes les données relatives à la BD
		* Unité physique de stockage
		* fichiers les plus volumineux de la base de donnée
		* Logiquement Oranisés dans des Tablespaces qui stockent ces données dans les tables, les sysnonymes, les séquences, les Index et les clusters
		* Tablespaces:
			* unité logique de stockage
			* correspond a un ou plusieurs fichiers physiques 
			* SI un tablespace est créer ALORS des fichiers physiques sont egalement crées pour contenir ces données 
			* une BD comporete aiu minimum deux fichiers de données correspondand a deux tablespaces reserv"s paroracle 
			* Organisation logique de stockage 
				* 3 level of granularité
					* Bloc de données : unité logique la plus fine 
						* taille_bloc : 4ko 8ko etc 
					* extension 
						* ensemble contigus de blocs  alloués simultanément çç un objet du schema
					* segment 
						* ensemble non necessairement contigus d'extesions
						* 1 objet correspond a 1 seul ségment 
			* Regroupe un ensemble d'objets => un ensemble de ségments
			* Bloc_oracle : 
	* **Fichiers de controle **
		* informations de contres sur la bd 
		* infos : 
			* Nom de la BD
			* DAte/Heure de création
			* Nom, emplacement et taille des autres fichiers de la BD
			* numéro de séquence du groupe actuel relatif aux fichiers de journalisation
			* information sir les points de reprise (checkpoint)
				* un pointeur qui permet de récupere l'instance dans un état cohérent suit a une panne quelconque)
		* Premier fichier ouvert lorsqu'une instance est lancée pour ouvrir une BD
		* Il Permet à l'instance de localiser et d'ouvirr les autres fichiers de la BD
			* SI FC perdu ou Endomagé alors BD ne peut pas etre ouverte 
			* => multiplexer le ficher de controle est necessaire
				* cad avoir plusieurs copies sur differents disques si possibles 
				* toutes les copies sont identiques 
		* La taille du FC est determinér automatiquement par oracle 
		* SELECT NAME FROM v$CONTROLFILE;
			* ![[Pasted image 20210225114220.png]]
	* **Fichiers de journalisatoin **
		* enregistrent tous les modifications apportées a la bd
		* Automatiquement crées lors qde la creation de la bBD 
		* concervent toutes les mofidications successives apportées à la BD ( journaux de transactions de la BD)
		* Utile pour : 
			* restaurer l'instance suit a un arret anormale ( panne systeme)
			* recuperation de données si un fichier de données est endommagé ou perdu après une eventuelle modificiation ( panne disque)
			* => très important pour la sécurité d'une BD
		* Organisation ( Groupes de Fichier de Journalisation) 
			* minimum 2 groupes 
			* chaque groupe possède au moins 1 membre
			* chaque groupe possède son numero de séquence unique 
			* chaque membre d'un meme groupe contient la meme information
		* l'ecriture se fait de maniere circulaire ( le contenu est ecrasé après un certain temps)
		* l'ecriture sur les membres d'un meme groupe se fait simultanément par le processus LGWR (contiennent la meme information)
			* meme notion de multiplexage des FC : avoir plusieurs copies pour ne pas tout perdre en cas de probleme
		* SI groupe Plein (càd tous membres Plein) alors ORACLE passe (Switch) au Groupe suivant (jusqu'a atteindre le dernier groupe). Si dernier groupe atteint on retounr au premier groupe (ecrasement de données )
		* SELECT GROUP#, MEMBER FROM v$LOGFILE ORDER BY GROUP#;
			* ![[Pasted image 20210225115903.png]]
	* **Fichiers de Journalisation Archivés**
		* SELECT Group#, Archived FROM  v$LOG;
* Gestion des Tablespace
	* Creation 
		```SQL
		CREATE TABLESPACE nom_tablespace
		DATAFILE 'chemin d\'accès du fichier' SIZE valeur [k|M]
		[MINIMUM EXTENT valeur [K|M]]
		[MAXIMUM EXTENT valeur [K|M]]
		[DEFAULT STORAGE(
			[INITIAL valeur [K|M]] /*taille de la premiere extention*/
			[NEXT valeur [K|M]] /*taille de la prochaine extension*/
			[MINEXTENTS nombre] /** nombre d'extensions minimal*/
			[MAXEXTENTS nombre] /* nombre d'extensions maximale*/
			[PCTINCREASE pourcentage] /* pourcentage d'accroissement de la taille des extensions appliqué a partir de la 3eme extension*/
		)];
		```
	* Modification
		* Agrandissemen de l'espace de stockage 
			```sql
				ALTER TABLESPACE nom_tablespace
				ADD DATAFILE fichier_nouveau [,Fichier_nouveau2 ...]
				/*il est possible d'agrandir les tablespace avec 1 ou plusieurs fichiers*/
			```
		* Modification des caractéristiques de stockage 
			```sql
			ALTER TABLESPACE nom_tablespace
			[DEFAULT STORAGE(
			[INITIAL valeur [K|M]] /*taille de la premiere extention*/
			[NEXT valeur [K|M]] /*taille de la prochaine extension*/
			[MINEXTENTS nombre] /** nombre d'extensions minimal*/
			[MAXEXTENTS nombre] /* nombre d'extensions maximale*/
			[PCTINCREASE pourcentage] /* pourcentage d'accroissement de la taille des extensions appliqué a partir de la 3eme extension*/
				]);
			```
		* modification des caracteristiques de sfichiers associés
			```sql
			ALTER TABLESPACE nom_tablespace
			RENAME DATAFILE fichier_existant[, autre_fichier_existant]
			TO fichier_nouveau[,autre_fichier_nouveau];
			/*avec  fichir_nouveau = chemin d'accès relatif */
			```
		* mise hors service 
			```sql
			ALTER TABLESPACE nom_tablespace
			OFFLINE [NORMAL | IMMEDIATE]
			/*NORMAL : attend que tous les utilisateurs ont terminé leurs transactions*/
			/*Immediate : n'attend pas que les transactions en cours ne sont pas terminées*/
			```
		* mise en service
			```sql
			ALTER TABLESPACE nom_tablespace
			ONLINE;
			```
		* Lecture Seule 
			```sql
			ALTER TABLESPACE nom_tablespace
			READ ONLY;
			``` 
	* Suppression 
		```sql
			DROP TABLESPACE nom_tablespace
			[including content]
			/*Attention : il faut mettre le tablespace offline avant de le supprimer*/
			/*INCLUDING CONTENT doit etre utilisée si la tablespace contient des données*/
			/*!!!!! Ne Supprime pas les fichiers physiques !!*/
		``` 
	* Sahbi@zahaf.net


---
[[202102251041 LN-Administration de Bases de données 4#Notes|up]]