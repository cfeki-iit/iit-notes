## Metadata:
* Tags: 
* Course : [[Ingénierie des Bases de données]]
* Started On : 2020-12-10
* Previous Chapter : [[IDB-Algèbre Relationelle]]
* Next Chapter :
# Slides
# Summary
# SQL
==**S**tructured **Q**uery **L**anguage==

 Principales caractéristiques du SQL sont 
 * **Normalisation**: 
	 * implémente le modele relationnel
 * **Standard** :
	 * la plus part des SGBD Supportent le langage SQL (notament Oracle, SQL Server)
 * **Non-Procedural** :
	 * SQL est un langage de requetes QUI PERMET 0 L4UTILISATEUR DE DEMANDER UN RESULTAT SANS SE PR2OCCUPER DES STRUCTURES ET PROCEDURES COMME DANS c W JAVA 
 * **Universel**
	 * peut etre utilisé dans tous les niveau dans la gestion d'une BDR


il y a plusieurs parties a concidérer en SQL :

* **LDD** : langage de definition de données
	permet la description de la structure de la base de données (Objets = tables, vue, attributs, index)
	* CREATE  : création des objets
	* DROP  : supression des objets
	* ALTER : Modification de la structure des Objets
* **LMD** : Langage de Manipulation de données
	Permet la modification
	* SELECT
	* INSERT
	* UPDATE
	* DELETE
* **LCD** : Langage de Controle de données
	comprend les primitive de gestion des transactions ( modifications ) et des privilèges d'accès.
	* COMMIT
	* ROLLBACK
	* GRANT
	* REVOKE

## Langage de Definitoin de Données:

* Syntaxe de **Création d'une Table**
	* Defini le nom , les colonnes, et leur types.
		```sql
		CREATE TABLE nom_table (col 1  type \[taille] \[default valParDefaut] \[null / not Null], col2 ... );
		```
	* definition des colonnes 
		* taille : indique max long du champs
		* types :
			* **CHAR(n)** : chaine de caractères de longeur fixz avec 1<n<2000, si on ne specifie pas le n stocke une seule lettre
			* **VARCHAR2(n)** : chaine de caractères de longeur <= n avec 1<n<4000
			* **NUMBER** : nombre entier ou decimal de 40 positions maximum de la fomre
				* chiffre de 0 à 9 avec les signes + - et . decimal
			* **NUMBER(n)** : taille specifique, n<=105
			* **NUMBER(n,m)** : taille specifique don't m après la virgule, n<=105
			* **DATE** : de format standard est DD-MON-YYYY
			* BLOB : données binaires non structurées ( 4go au maximum )
			* BFILE : données binaires stockées dans des fichiers exxterieurs à la base de donnée ( 4go maximum) 
	* definition des contraintes:
		une contrainte est une régle qui definit la cohérence d'une donnée ou d'un ensemble de données de la bae de données.
		* **NOT NULL** : Non nullité des valeurs d'un attribut 
		* **UNIQUE** : Unicité de la valeur d'un attribut ou d'un groupe d'attributs. 
		* **PRIMARY KEY** : indique que l'attribut est une clé primaire
			* Comme Contrainte de Colonne : PRIMARY KEY
			* Comme Contrainte de Table :  dans le cas d'une clé composée
				CONSTRAINT nom_contrainte PRIMARY KEY (att1, att2, ... ,attn)
		* **FOREIGN KEY** : lorsque la clé primaire figure dans une autre table en tant qu'un attribut 
			* Comme Contrainte de Colonne : REFERENCES nom_table(nom_att) \[on delete cascade]
			* Comme Contrainte de table
			```sql
			CONSTRAINT nom_contrainte FOREIGN KEY(nom_att) REFERENCES nom_table(nom_att)[ON DELETE CASCADE]
			```
		* **CHECK** : contrainte de valeur, le controle se fera lors des insertions des données
			```SQL
			CONSTRAINT nom_contrainte CHECK (nom_colonne condition)
			```
			* la condition peut utiliser
				* un operateur de comparaison
				* between val1 and val2
				* IN(val1 val2 .. valn)
* Syntaxe de **Modification d'une table**
	* /!\ different de modifier un enregistrement
	* Ajout de Colonne 
		```SQL
		ALTER TABLE nom_table
		ADD (col1 type [(taille)] [null / not null]), ....);
		```
	* Supression de Colonne
		```sql
		ALTER TABLE nom_table
		DROP (col1, ....coln);
		```
		
	* Modification de colone
		* Changement de type/taille
			```sql
			ALTER TABLE nom_table
			MODIFY (col1 type [taille] [null / not null], ....);
			``` 
		* Renommage
			```sql
			ALTER TABLE nom_table
			RENAME old_col1 TO new_col1;
			```
	* Ajout de Contraintes
		```sql
		ALTER TABLE nom_table
		ADD Constraint def_constraint;
		```
	* Supprimer une Contrainte
		* Supprimer la (contrainte) clé primaire (pas la colonne)
			```sql
			ALTER TABLE nom_table
			DROP PRIMARY KEY [Cascade];
			``` 
		* Supprimer une autre Contrainte
			```sql
			ALTER TABLE nom_table
			DROP Constraint nom_contrainte;
			``` 
		* ==Remarque== : Pour retrouver la liste des contraintes :
			```sql
			SELECT * from user_constraints
			[WHERE table_name = "NOM_TABLE"];
			```  
		
* Syntaxe de **Suppression d'une table** : 
	* 
		```sql
		DROP TABLE nom_table;
		```
	* 
		```sql
		DROP TABLE nom_table CASCADE CONSTRAINTS
		``` 
* Syntaxe de Renommage et Creation de synonymes de Tables 
	* Renommage
		```sql
		RENAME ancien_nom_table TO nouveau_nom_table;
		```
	* Creation de synonyme : Alias pour le tableau afin d'eviter 
		```sql
		CREATE SYNONYM nom_synonyme FOR nom_table;
		```
	* Suppression de synonyme :
		```sql
		DROP SYNONYM nom_synonyme;
		```
		

## Langage De Manipulation de Données 
* **INSERT**
	* ajoute des lignes a une table
	* la valeur ajoutée doit verifier toutes les contraintes définies. 
	* *Forme 1:*
		* insertion des vlauers pour la totalité des valeurs de la table
		* les colonnes de type CHAR ou VARCHAR2 doivent apparaitre entre deux cotes ( ' ' )
			```sql
			INSERT INTO nom_table [(list_champs_table)]
			VALUES (list_values);
			```
	* *Forme 2:*
		* insertion à travers la copie des valeurs des colonnes d'une autre table 
		* les insertions doivent être dans l'ordre et respecter les types des champs respectifs.
			```sql
			INSERT INTO nom_table [(list_champs_table)]
			SELECT [list_champs_autre_table] FROM nom_autre_table
			[WHERE condition]
			``` 
* **UPDATE**
	* met a jour une colonnes dd'une table par de nouvelles valeurs
	* La modification des donnée n'est autorisée que si les contraintes sont toujours valides. 
		```sql
		UPDATE nom_table
		SET col1 = val1 , .... coln = valn
		[WHERE condition] ;
		```
	* les valeurs peuvent etre des constantes, des expressions, des resultats de sous-requêtes ou NULL ( pour supprimer la valeur initiale du champ)
* **DELETE**
	* supprime un ou plusieurs enregistrements tout en gardant la base cohérente. 
	* la clause WHERE specifie la condition de suppression
		```sql
		DELETE FROM nom_table
		[WHERE condition]
		```
* **SELECT**
	* choix du nom : elle va selectionner des lignes qui répondent à un critère de selection. 
	* SQL est basé sur l'utilisation de blocks de qualification dont la structcture est composée principalement de trois elements : 
		* **SELECT** permet de définir la liste des colonnes (projection) 
		* **FROM** indique les nom de tables
		* **WHERE** indique la condition de selection 
			```sql
			SELECT [col1,...coln / * ]
			FROM nom_table
			[WHERE condition]; 
		 	```
	* Selection disctincte
		```sql
		SELECT DiSCTINCT col1....coln
		FROM nom_table
		[WHERE condition]
		```
	* la notion d'ALIAS :
		* On peut modifier les nom de colonnes, à l'affichage uniquement en ajoutant des alias
		* Si l'alias est composé de plusieur mots il doit apparaitre entre double-cotes (" ")
			```sql
			SELECT col1 [alias1], col2 [alias2], ... 
			FROM nom_table
			[WHERE condition]; 
		 	```
	* Specification d'un critère :
		* la condition est composée generalement de trois termes 
			* nom de colonne
			* operateur
				* Operateurs classiques de comparaison 
				* Operateurs Spécifiques Oracle
					* **IS NULL**
					* **IN**
					* **BETWEEN v1 AND v2**
					* **LIKE** 
						* % remplace une chaine 
						* - remplace un seul caractère
				* Operateurs logique ( si condition composée )
					* AND 
					* OR 
					* NOT (not in, not like, not between)
			* constante, colonne, une liste de valeurs, une expression ou une requete
			* 
		





___
[[IDB-TD SQL]]