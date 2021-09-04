---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: Source/lecture_Note/raw
aliases: ["202102121204 LN- Entrepots de Données 2", "LNED2" ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic: [[Entrepots de données]] [[Data Science]] [[Business Intelligence]]
* Date: 2021-02-12
* Given By: [[@Salma Dammak Ktari]]


# Notes 
* [[Modelisation Multidimensionnelle de données]]
	* la Modelisation E/R ne répond pas aux besoins décisionnel 
		* Avantages 
			* Normalisation 
				* eliminer les redondances
				* preserver la cohérence des données
			* Optimisation des transactions
			* Réduction de l'espace de stockage
		* Inconveniants 
			* schemas trop complexe avec beacoup de tables 
			* pas d'interface raphiques 
			* odonnées historiques difficielement représentées 
			* difficulté d'utilisation pour des utilisateurs non informaticiens
	* Pour répondere au besoins analytiques et decisionnels on a besoin 
		* introduction de nouvelles représentations de deonnées 
	* avantages : 
	* compréhensibilité
		* les données sont regourpée selon des catégories d'affaires 
		* performances pour les analyses 
	* MMMDD : OLAP (CODD 1993)
	* table de faits
		* phénomène étudié 
		* contient les clés primaires des differentes dimensions de l'étude en tant que clès étrangères 
	* Mesures : 
		* un indicateured d'analyse de type numerique et cumulable 
		* accompagnée d'un ensemble de fonctions d'agrégation qui permettent l'agréger en fonction des axrs d'analyse 
		* types: 
			* additive : additionables selon toutes les dimensions 
			* semi additive : additionable suivant certains dimenses 
			* non additives : non additionable quelque soit la dimension 
	* Dimensions : 
		* axe d'analyse selon lequel vont etre etudiées les données
		* dimension = axe  
		* la dimension temporelle ("Temps") est commune à l'ensemble du DW. elle est reliée à tout table de faits.
		* Parametre = attribut appartenant à une dimension
			* représente un nniveau de détail selon lequel sont visualisées les mesures d''activité d'un sujet d'analyse 
			* les parametres d'une dimension 
		* Hierarchie : 
			* regroupement d'un ensemble de parametres groupé selon la granularité la plus fine very la plus generale dans une hierarchie. 
	* Resultats: 
		* dumunution du nombre de tables 
		* modele evelutif 
* [[Schemas Dimensionnels]]
	* Schema en Etoile : 
		* 1 sujet d'analyse comportant un ou plusueurs d'indicateurs 
		* n axes d'analyses ( dimension ) 
		* m perspectives d'analyse (hierarchies)*
			* exemple : 
				* Temps: Jour -> Mois -> trimestre -> année
		* 

---
[[202102121204 LN- Entrepots de Données 2#Notes|up]]