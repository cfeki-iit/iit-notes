---
#chose 1 of the above, usually Raw, becomes Digested when 
tags: Source/Lecture_Note/raw
aliases: ["202102051002 LN- Entrepot de données","LNED1" ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:
* Date: 2021-02-05
* Given By: [[@Salma Dammak Ktari|Salma Dammak Ktari]]


# Notes 
* [[Systeme d'Information]]
	* Composante importante d'une [[Entreprise]] ou une [[Organisation]]*
		* [[Systeme de Pilotage]]
		* [[Systeme d'Information]]
		* [[Systeme Operationnel]]
	* c'est un systeme de couplage entre le sysPil et le sysOp
	* une entreprise provenant d'une quantité importante et riche de données ( data )
	* l'analyse  de ces donnée peut etre un atout majeur dans la prise de decison ([[Informatique décisionnelle]])
	* une [[Bases de Données|base de données]] classique ne permet pas de faire ceci car elle est principalement [[Transactions|transactionnelle]]
		* une base de données est concitutuée d'un ensemble de données et on gere ces données quantitativement.
* [[Entrepots de données]] = Data WareHouse 
	* c'est la transition de la base de données transactionnelle vers une base de donnée Decisionnelle 
	* l'analyse de ces données permet d'avoir des statistiques, des prédictions etc utiles a la prise de décision. 
	* dans les entrepots de données on ne parle pas de tables mais de dimensions
	* **Definition par [[@Bill Inmon|Bill Inmon]] 1996** 
	*  une collection de données 
		*  **orientée sujet**
			*  LES DONN2ES SONT ORGANIS2ES PAR SUJET
		*   **integrées**
			*   viennent de plusieurs sources, hétérogenes sont consolidées et integrées dans l'entrepot
		*    **historiques** 
			*    generellamenet la composante temporelle dans un entrepot de données 
		*  **non volatiles** 
			*  une fois insérées dans l'entrepot les données ne sont jamais modifiées ou effacées, elle sont conservées pour ldes analyses futurez
	*  [[On-Line Analytical Processing]] (OLAP) vs [[On-Line Transactional Processing]] (OLTP)
		*  ![[Pasted image 20210205114110.png]]
		*  les  instructions OLTP consultent et assurent la mise a jour, l'insertion, la suppression de données m'ai n'offrent aucun outil analytique suyr les données 
			*  execution en temps réel des transactions, pour l'enregistrement des operations quotideiennes, intentaires commandes, paye, comptabilité
		*  OLAP lisent les données seulement pour avoir de nouvelles informations a partid des données sources
			*  Rapports états, tableaux de bord, Graphiques, Synthèses, groupeement 
			*  Traitement efficace des requetes d'analyse pour la prise de decision 
		*  Il est fortement déconceillé de partager une meme base de donnée entre OLAP et OLTP a cause de leur differences temporelles et Quantitatives
			*  OLTP = temps réeel or OLAP = Historiques
			*  OLTP = nombre réduit de tuples vs OLAP = fonctionne sur des bases avec un nombre trés important de tuples 
* [[Architecture des Entrepots de Données]]
	* ![[Pasted image 20210205114417.png]]
	* Sources de données
		* sOURCES dIVERS ET DISPARATES
		* SURCOES SUR DIFF2RENTEES PLATEFORMES ET os 
		* qUALIT2 DES DONN2ES DOUTEUSE ET CHANGEANTE DANS LE TMEMPS
		* iNcohérence 
		* Exemples: 
			* **Entreprise Ressource Planneing** (ERP)
				* gerent les processus operationnels d'une entreprises 
				* Customer Relationship Management (CRM)
				* System Legacy 
			*  **Point of Sale**
				*  Materiels logiciels utilisés dans les caisses de sorties d'un magasin
			*  **Web**
				*  ClickStreams ( fichier log ), sturcture site web
			* **Externes** 
				* données concurrentielles achetées, données démographiques. 
	* Processus Extract-Transform-Load (ETL) 
		ETL résume généralement les données afain de résduire leur taille et d'ameiliorer leur performance pour des tpes d'analyses spécifiques 
		c'est la partie la plus longue duu développement d'un entrepot de données ( up to 70%)
		* Selection
		* Extraction
			* identifies les données sources utiles 
			* determiner tous les changements survenus durant une pééruide données
		* Transformation
			* consolider les donnée
			* Données redonandantes manquantes incohérentes etc
			* operations de décuoupage fusion conversion aggregation etc 
		* integration
		* chargement
			* faire les chargement en lot 
			* [[Data Staging Area]]
				* zone de preparation de données 
				* base de données intermediaire qui stocke les données issues des systeme de production operationelle dans un format proche de ces derniers 
				* un stockage tampon avant l'untegration des données dans l'ED 
	* Accès
		* Metadonnées
		* entrepots = datawarehouse
			* lieu de stockage centralisé
			* integre et historise l'ensemble des données utiles pour les prises de décision
			* son organisation doit faciliter la gestion 
				* Datamart
					* contiennet une portion du contenu de l'entrepot de données 
					* se concentrent sur un seul sujet d'analyse
				* DataCube
	* Intergiciels 
	* Applications
* Creation d'un entrepot de données
	* Approche de Bill Inmon : Approche Top-Down
		* conception integrale de l'ED 
		* ED le dépot centralisé de données 
		* les ata marts des differents secteurs sont ensuite crées sur la bas ede u modele de l'entrepot 
			* + vision conceptuelle complete de l'ED 
			* + normalisation des données, absence de redondance
			* - difficulté de mise en oeuvre 
	* Approche de Ralph Kimball : Approche Bottom-Up
		* cponception incrémentale de l4ED 
		* le data warehouse est simplement une combinaison union de differents data marts qui facilite le reporting et l'analyse 
			* + simpluicité de mise en oeuvre 
			* - Difficulté d'integerer les magazins de données 
* [[Big Data Warehousing]]
	* Grande quantité de données 
	* une architecture de gestion et do'rganisation des données 
	* utilise a la fois des architectures entrepots 
* [[Cloud Warehousing]]
	* DWaaS : **D**ata **W**arehousing as a **S**ervice
  
  
---
[[202102051002 LN- Entrepot de Données 1#Notes|up]]