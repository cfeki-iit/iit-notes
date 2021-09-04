---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: #Source/lecture_Note/raw
aliases: [202104091511 LN-Administration Bases de Données 6, ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:
* Date: 2021-04-09
* Given By: [[@Sahbi Zahhaf]]


# Notes 
* SGBD est un systeme multi-utilisateur complexe
	* un utilisateur dispose de 
		* un login et mot de passe 
		* un schema = les objets créer par l'utilisateurs 
		* ensemble de privilièges = roles = droits de l'utilisateur 
		* Profil 
	* Privilèges: 
		* Systeme
			* droit d'executer un ordre sql  
			* permet de créer des tables
		* Objet
			* doit d'accéder à un objet utilisateur 
			* permet de consulter les tables 
		* Attribués directement à l'utilisateur ou a travers des Roles
	* Rôle : c'est un panier qui contient un ensmeble de privilèges 
* Metiers autour des BD 
	* Developpeurs des sgbd
	* administrateurs (DBA)
		* Admin Réseaux 
		* Admin SGBD
		* Roles: 
			* installer le SGBD ( serveur et applications clientes , composantes réseaux si necessaires )
			* configuere l'instance oracles
			* definir les caractéristiques de la BD
				* stockage interne 
	* Utilisateurs 
* Gestion des Profils
	* Profil
		ensemble nommé de limitations de ressources qui peuvent etre attribués a un ensemble d'utilisateurs. 
		* Les ressources limités sont : 
			* Temps CPU : temps pour executer le processus 
				* Par appel : execution d'une seule requete
				* Par Session : temps autorisé pour executer toutes les requetes 
			* Nombre de lectures logiques par Appel/Session
			* Nombre de Sessions ouvertes simultanément 
			* Tmp's d'inactivité par session
			* durée totale de la session
			* espace mmemoire privée dans la SGA
		* La gestion de profils impose aussi toute une politique de gestion des mots de passe! 
		* chaque utilisateur  se voit affecter un profil imperativement et ne peu appartenir qu'a un seul profil à la fois 
		* Profil par défaut : fourni lors de l'installation de la BD
			* automatiquemetn attrivué a un utilisateur so on ne lui attribue pas un profil specifique 
		* Gestion eds profils
		* Supression d'un profil: 
			* DROP PROFILE nom_profile \[CASCADE\]
			* cascade supprime le profile pour tous les utilisateurs concernés en le remplaçant par DEFAULT 
* Gestion des utilisateurs 
	* Creation des Utilisateurs
		* ```CREATE USER user_name IDENTIFIED {BY mdp | EXTERNALLY}```
			* Externally : l'utilisateur est identifié par le systeme d'exploiatation
	* Modification Des Utilisateurs:
		* same as create except for 
		* ```DEFAULT ROLE {role[,role]|All |ALL EXCEPT role[,role...]|NONE} ```
	* Suppression des utilisateurs: 
		* ```DROP USER user_name [CASCADE];```
			* Cascade force la suppression des objets de user, necessaire si l'utilisateur possède eds ojets. 
			* un utilisateur connecté ne peut etre supprimé 
* Gestion des Privilèges
	* Privilèges systemes
		Droit d'executer un ordre SQL 
		chaque ordre sql a au moins un privilege systeme associé qui pourte le meme nom que l'ordre sql 
		L'ordre CREATE TABLE poss_de un priviliege systeme CREATE TABLE qui donne a l'utilisateur de créer des tables dans son propre schema, a condition qu'il ne depasse pas le quota dans les tablespaces qui lui sont alloués. 
		* Attribution 
			* ``` GRANT <privileges> TO <user_name>|public [With Admin Option] ```
			*  une fois attribué il est immediatement actif 
			*  Admin option permet a l'utilisateur de transmettre le privilege 
			*  
		* Suppression 
			* ``` REVOKE  <privileges> FROM <user_name>|public; ```
			* immediatement révoqué
			* pas de cascade dans la révocation d'un privilege 
		* Liste de priviléges
			* Table
				* CREATE \[Any] TABLE 
				* ALTER \[Any] TABLE
				* DROP \[Any] TABLE
			* INDEX
			* VIEW 
			* Synonym
			* SEQUENCE
			* PROCEDURE
			* TRIGGER
			* PROFILE
			* USER
			* ROLE
			* TABLESPACE
			* SESSION
	* Privilèges Objet 

---
[[202104091511 LN-Administration Bases de Données 6#Notes|up]]