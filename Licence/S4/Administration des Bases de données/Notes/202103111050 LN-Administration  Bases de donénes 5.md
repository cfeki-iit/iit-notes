---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: Source/lecture_Note/raw
aliases: ["202103111050 LN-Administration  Bases de donénes 5", "LNADB5" ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:[[Bases de Données]]
* Date: 2021-03-11
* Given By: [[@Sahbi Zahhaf|Sahbi Zahhaf]]


# Notes 
<!-- hello -->
* Architecture Oracle : 
	* instance 
		* Mode demarrage de l'instance 
			* STARTUP NOMOUNT : demarrer juste l'instance et pas la base de données 
				* le sgbd lit le fichier de parametres (spfile.ora ou init.ora)
				* alloue les structures de memoires 
				* demarre les processus arrière plan
			* STARTUP MOUNT ; ALTER DATABASE MOUNT;
				* monter la base de données a l'instance demarrées 
				* la base de données est montée mais non accessible au utilisatuers
				* a partir du spfile
			* STARTUP OPEN ; ALTER DATABASE OPEN; 
				* ouvrire la base de données aux utilisateurs 
		* Forcer un démarrage : 
			* STARTUP FORCE : si la base de données ne s'est pas arretéer correctement et s'il ya un probleme au niveau de son redémarrage alors l'administrateur utilise cette option pour forcer les redémarrage de la base de données 
			* cette commande entraine un shutdown immediat de la base de données si ouver, a utiliser avec précaution 
		* Arrêt de base de données 
			* SHUTDOWN nomrla: 
				* la base de données est fermée si tous les utilisateurs soient déconnectés et toutes les transactions terminée 
			* SHUTDOWN IMMEDIATE : 
				* tous les utilisateurs sont defacto  déconnectés 
				* toutes les transactions non validées sont annulées avec rollback 
				* aucune nouvelle transaction n'est permisie 
			* SHUTDOWN TRANSACTIONAL : 
				* toutes les transactions en cours sont autorisée a se terminer ( commit ou rollback ) mais aucune nouvelle transaction 
			* Shutdown Abandon : 
				* toutes transactions sont immediatement fermées sans attendreCOMMIT ou ROLLBACK 
				* cette methode est utilisée si l'administrateur a des probleme pour fermer la base de données à l'aide d'une des trois options precedente 
			
	* Base de donnée
	* Dictionnaire de données ORACLE 
		* un ensemble de tables et de vues contiennet des infos d'une base de données 
			* structures de stockages 
			* les utilisateurs et les droits
			* les objets ( tables, vues, index, procédures, fonctions etc)
		* appartient a SYS et est stocké dans le Tablespace SYSTEM
		* Créer lors de la creation de la base de donnée automatiquement 
		* mis a jour automatiquement par oracle lors de la creation/modification de chaque obket 
		* SYS peut consulter le dictionnaire avec SELECT 
		* chargé dans le dictionary cache de la shared pool 
		* Contient deux groupes 
			* tables et vues statiques 
				* basées sur de vraies tables stockées dans le tablespace System
				* uniquement accessibles si la base de données est ouverte
			* Tables et vues dynamiques de performance
				* réellement non basées sur de vraies tables, mais sur des informations en memeoire ou extraites du fichier de controle 
				* on peut les interroger comme de vraies tables 
				* sont accessibles meme quand la base de données n'est pas ouverte
	* **Vues Statiques**
		* USER_% : informations sur les objets qui appartiennent a l'utilisateur 
		* ALL_% : information sur les objets auquels l'utilisateur a accès ( les siens + ceux sur lesuels il a recu des droits)
		* DBA_% : informations sur tous les objets de la base de données (specifique à l'administrateur)
* Gestion automatique de la memoire ORACLE 
	* Les Structure de memoire associés a une instance ORACEL : 
		* SGA 
			* contenant les données et les information de controle 
			* Partagés par les processus serveurs et processus arrères plan
		* PGA
	* Activation de la gestion automatique : 
		* SI le Paramtre MEMORY_TARGET != 0 alors la taille_memoire allouée à l'instance est répartie automatiquement enre la SGA (SGA_TARGET) et la PGA(PGA_AGGREGATE_TARGET)
		* il faut que le parametre STATISTICS_LEVELS soit TYPYCAL ou ALL 
	* SGA : 
		* zone de memoire partagée entre les processur de l'instance ( serveurs et arrières plan
		* contient un ensemble de sous memoires 
			* DataBase Buffer Cache 
				* memoire tampon (cache de donnée) ORACLE charge les blocs de données demandées par l'utilisateur dedans 
				* Contient les blocs de données les plus récemment utilisée 
				* 4 types 
					* blocs to tables 
					* blocs d'index 
					* blocs de ségment d'annulation, contenant la version precedente des données en cours de modification 
					* blocs temporaires
				* Processus serveur charge les données dans le database buffer cache
				* Les données sont ecrites dans les fichiers de données par le process DBWn 
				* toutes modification (INSERT UPDATE DELETE) s'effecture dans le DBBC, l'ecriture se fait en différé (pas déclanché par commit)
				* Oracle utilise LRU ( least recently used) pour charger la memoire
				* la taille du DBBC est finie, en cas de besoin oracle supprime les données les plus enciennement utilisée  
			* Redo Log Buffer 
				* memoire tampon pour l'enregistrement des modification atomiques
				* pour chque modification une entrée REDO est ecrite dans le RLB
				* une entrée REDO est composée de Change Vectors, 
					* chaque vecteur decrit une modification atomique approtée sur un bloc ( dbbc blocs )
					* LogWriter(LGWR) enregistres l'ancienne valeur et la nouvelle valeur dans les fichiers de journalisation
					* => les blocs sont protégés par les fichiers de journalisation. 
				* RLB est utilisé de maniere séquentielle et circulaire 
					* Séquentiel : 
						*  les modifications de plusieurs transaction se melangent
					*  Circulaire : 
						*   SI redo log bugger =plein alors oracle repasse au premier redo => le contenu de sa 
			* Shared Pool : 
				* memoire tampon contient deux zones 
					* Library Cache 
						* concerne le plan d'execution des requetes 
						* contient des informations sur les ordres SQL et PL/SQL les plus récement executés : le texte de l'ordre, sa version analysée et le plan d'execution 
							* SI une requete est executée pour la premiere fois alors oracle stocke le résultat d'analyse (Parse)
							* SI une requete est executée une nieme fois, oracle retrouve ces données. 
					* Dictionary Cache 
						* ppour charger le dictionnaire de données oracle
						* pracle utilise le dictionnaire de données lors de la phase d'analyse (parsing ) pour determiner si les objet existent et ou ils se trouvent.  
			* others : 
				* java pool 
					* pour JVM integrée
				* large pool 
					* optionnelle pour la ocnfig de serveur partagé 
				* streams pool 
					* zone de memoire utilisée par la fonctionnalité streams, qui permet ed efaire circuler des informations entre processus 
				* result cache 
					* résultats des Requetes SQL ou les fonctions PL/SQL 
		* est allouée au démarrage de l'instance et libérée lors de l'arret de l'instance 
	* Procéssus d'arrière plan : 
		* DataBase Writer (DBWn)
			* permet d'ecrire le contenu modifié de la cache de onnée dans les fichier de données 
			* il peut exister plusieurs dbw : dbw0, dbw1.....dbwn
			* ecrit dans les segments de tables en différé ( not realtime ) also not related to COMMIT 
			* Evenement déclancheur : 
				* processus serveur ne trouve pas de blocs libres pour charger de nouvelles données dans le dbbc 
				* Periodiquement déclenché par le processus ckpt (checkpoint) pour faire avancer le point de reprise 
					* point de reprise : position dans les fichiers de journalisation a partir de laquelle la récupérantion de l'instance est susceptible d'etre démarrée en cas d'anomalie quelconque
				* 


---
[[202103111050 LN-Administration  Bases de donénes 5#Notes|up]]