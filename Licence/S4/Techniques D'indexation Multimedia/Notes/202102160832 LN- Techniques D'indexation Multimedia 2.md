---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: Source/lecture_Note/raw
aliases: ["202102160832 LN- Techniques D'indexation Multimedia 2", "LNTIM2"] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:
* Date: 2021-02-16
* Given By: [[@Rafik Khemakhem]]


# Notes 
* Rappel 
	* Le rappel mesure la capacité du systeme de RI a trouver, pour une requete, tous les documents permanenet 
	* le rappel peut donc se definir comme la probabilité pour un document d"'rtre retrouvé sanchant qu"il est pertinene'
* Silence  
	* Silence + rappel = 1 
	* reponces pertinents qui ne sont pas proposée par le systeme alors qu'elles existent
	* plus le silance est Grand plus le rappel est faible
	* causes du silence: 
		* Requet trop prcise 
		* indexation insuffisante des documents. 
* Precision
	* la precision mesure la capacité du systeme de RI a trouver pour une requete uniquement les documents pertinents, L aprecision est une mesure très interessante ^pour mesurer la qualité des reponses du point de vue de l'utilisateurs
	* Rappel & Precision 
		* why not just precision? 
			* la precision evalue la capacité d'un systeme a renvoyer sutout les documents pertinents 
			* renvoyer un seul document pertinent suffit a obtenir 100% de orecusuib
		* Why not just rappel 
			* le rappel evalue la capacité d'un systeme a renvoyer tous les documents pertinents 
			* renvooyer tous les documents du cluster permet d'avoir un rappel de 100%
* Bruit
	* reponses non pertinents proposées par un systeme
	*  Bruit + precision = 1 
	*  plus le bruit est grand plus la précision est faible
	*  causes 
		* requete trop floue 
		* manque de termes dans une requete 
		* termes coordonnées par "OU"
* Courbe d'evaluation 
	* pour comparer deux systeme de recherche d'information le cmem corpus de test est utilisé 
	* pour chaque systeme une courbe rappel/systeme est construite
	* le systeme dont la courbe dépasse, cad dont la courbe se situe au dessus de celle d'un autre est concidérée comme un meilleur systeme.      
* Fonction's d'un[[Systeme d'Information]]
	* **Collecter**
		* pour toute organisation l'information est préc
		* receuillir et integrer l'information au SI
		* enregistrer l'information afin de prcéder a son traitement 
		* l'information collecter sera décomposée 
		* Provenances de l'information
			* Interne
				* flux d'infoormation qui est generé par les entités internes à l'organisation par son fonctionnement mais aussi le flux d'information informelles ( climet social, bien etre des salariés etc)
			* Externe
				* flux d'informations génééres par des parties prenantes externes et qui sont essentiels pour anticiper les mutations et l'adaptation du SI pour servir l'organisation ( Business Intelligenc)
	* **Stocker** 
		* Stockage durable stable et sécurisé
			* Methodes D'archivage
			* techniques de sauvegarde 
			* protection contre le piratage
			* prévenir la destruction
		* Organisation du stockage: 
			* [[Fichier]]
				* un ensemble de données réunies sous un meme nom. techniquement c'est une information numerique consitutée d'une séquence d'octets
			* [[Bases de Données]]
		* Lieu de stockage:  
			* Disques dur des serveurs du SI 
				* accessible seulement depuis ce serveur
			* Aires de stockages au sein du SI de l'[[Organisation]]
				* accessible depuis tous les composants du sI uniquement à l'interieur de l'organisation
			* Cloud 
				* accessible partout dans le mnde
	* **Traiter**
		* porduire de nouvelles informations a partir 'informations' existantes 
		* **Consulter** 
			* acceder a l'information telle qu'elle a été enregistrée 
		* **Organiser l'information** 
			* structurer l'information selon des critères specifiques
		* **Mise a jour de l'information** 
			* reprendere une information précédemment enregistrée et l'actualisée 
		* **Produire de nouvelles informations** 
	* **Diffuser**
		* une information n'a de la valeur qu  su elle est commmuniquée au bons destinataires au bon moment et sous une forme directement exploitable 
		* 




---
[[202102160832 LN- Techniques D'indexation Multimedia 2#Notes|up]]