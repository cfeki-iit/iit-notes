---
tags: "Notes"
---

* Course:[[Machine Learning]]
* Date: 14-09-2021 


# Classification
* permet de predir si un element est membre d'un groupe  ou d'une categorie donnée 
* Applications 
	* Classification de documents 
		* Identification et categorisation des emails 
	* Marketing Ciblé 
	* Reconaissance texte
	* Reconaissance audio , debruitage, transicription musicale ...
	* Detection de visages/Objets
	* Systemes de recommendation de musiques/ films/produits / amis etc 
* Processus a 2 etapes: 
	* Construction du modele
		* chaque instance est supposée appartenir a une classe prédéfinies 
		* la classe d'une instance et determniée par l'attribut classe 
		* l'ensemble des instances d'apprintassge est utilisé dans la construction du models  
	* Utiliser le modele
		* classification de nouvelles instances ou instances inconnues 
		* estimer le taux d'erreur du modele 
			* la classe connue d'une instance test est comparée aec le resultat du modele 
			* taux d'erreur => pourcentage de tests classés par le modele
		* Partitionnement : apprentissage et test ( ensemble de données importants )
		* Validation croisée ( cross validation )
			* diviser les données en k sous ensembles
			* utiliser les k-1 sous ensembles comme données d'apprentissage et un sous ensemble comme données test 
		* Bootstrapping 
			* n instances de test aleatoires 
* Evaluation des methodes de classification 
	* taux d'erreur ( accuracy )
	* temps d'execution ( construction utlisation 
	* robustesse (bruit données manquantes )
	* extensibilité 
	* interprétabilité
	* simplicité
* Methodes de classification 
	* [[Methode des plus proches voisins K-NN]]
	* [[Arbres de decision]] 
	* Machines a vecteurs supports ( svm ) 
	* classification bayesienne 
	* réseaux de neurones 

---
[[Classification#Notes|up]]