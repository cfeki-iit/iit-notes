---
tags: "Notes"
---

* Course:
* Date: 14-09-2021 


# Methode des Plus proches Voisins ( K-NN)
* K-nn : K-nearest neighboors
	* methode de raisonnement a partir de cas :
		* prendre des decisions en recherchant un ou des cas similaires deja résolus 
	* Pas d'etape d'apprentissage: 
		* construction d'un modele a part d'un echantillon d'apprentissage 
	* Objectif : 
		* Affecter un classe a une nouvelle instance de données : un echantillon de m enregistrements classés (x, c(x))
		* entrée: un enregistrement y 
			* determiner les k plus proches enregistrements de y 
			* combiner les classes de ces k exemples en une classe C ( faire voter les voisins de y )
		* Sortie: 
	* Solution simple :
		* rechercher le cas le plus proche et prendre la meme decision ( 1-NN )
	* Combinaison de K-classes : 
			* heuristique k = nombre d'attributs ° 1
			* Vote majoritaire : prendre la classe majoritaire 
			* Vote Majoritaire Pondéré : chaque classe est 
	* Algorithme 

---
[[Methode des plus proches voisins K-NN#Notes|up]]