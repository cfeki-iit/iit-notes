---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: Source/lecture_Note/raw
aliases: ["202103091436 LN-Entrepots de Données 5","LNED5" ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic: [[Entrepots de données]]
* Date: 2021-03-09
* Given By: [[@Salma Dammak Ktari|Salma Dammak]]


# Notes 
* Phases des systemes decisionneles 
	* Conception 
	* Consturction : travail techniques 
		* extraction de données des differentes BD de productions ( interne ou externes)
		* transformation des données : nettoyage, filtrage ... 
		* techniques d'alimentation 
			* chargement de données dans l'ed 
			* stockage des données dansl s Eds, et les magasins de données 
			* rafraichissement
	* Administration :
		* qualité et perennité des données 
		* gestion des droits d'accès selon le profil de chacun 
		* interdir l'accès a l'ED
		* segmenter les données collectées en contextes qui soient cohérents simples à utiliser et qui correspondent à une activité decisionnelle particuliere 
		* modeliser sous la forme d'un hypercube à disposition via an outil [[On-Line Analytical Processing|OLAP]] 
	* Restitution 
		* but du processus d'entreposage
		* reporting : présenter les informations de façon lisible pour l'aide a la decision 
		* les données sont principaement modelisée par des représentations à base de requetes afin de constituer des tableauxde bords ou des rapports via des outils d'analyse decisionnelle 
		* des instruments de type tableau de bord equipé de fonctions d'analyses multidimensionnelles de types OLAP sont aussi utilisés
* [[On-Line Analytical Processing]]
	* defined by CODD in 1993
	* 12 critères 
		1. Multidimensionnalité
		2. transparence 
			* l'emplacement du serveur est transparent
		3. accessibilité
			*  L'utilisateur dispose de l'accessibilité a toutes les données necessaires a ses analyses
		4. stabilité 
			*  performance des reportings restent stables indépendamment du nombre de dimensions
		5. Architecture Client-Serveur
		6. Dimensionnement 
			1. generique afin de ne pas fausses les analyses 
		7. gestion complete 
			1. assure la gestion des données clairesemées (eparpillées)
		8. Multi-Utilisateurs 
			1. support multiuser qui assure la gestion d'intégrité et de sécurité 
		9. Inter Dimension 
			1. operations inter-dimensionnelles sans restrictions 
		10. intuitif 
			1. manipulation facile des données 
		11. flexibilité 
			1.  flexibilité de l'edition des rapports est intrinsèque au modele
		12. analyse sans limites
	* Nigel récapitule en 5 mots : 
		* [[Fast Analysis of shared Multidimensional Information]] (FASMI)
			* Extraction par lots 
			* modele d'anlayse olap 
			* traitement des données non normalisées 
			* stockage des résultat olap : les séparer das données sources
			* extraction des valeurs manquantes 
			* traitement des valeurs manquantes

---
[[202103091436 LN-Entrepots de Données 5#Notes|up]]