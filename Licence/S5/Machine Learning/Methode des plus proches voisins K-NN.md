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
		* Vote Majoritaire Pondéré : chaque classe est pondérée
	* Algorithme :
		* voir cours !
	* Distance 
		* Le choix de la distance est primordial au bon fonctionnement de la methode 
		* prop : 
			* d(A,A)=0
			* d(A,B) = d(B,A)

Exercice : 
* Resultats 
	* Pour K=1
		* l'instance la plus proche et qui possède ka vakeur de la fct de decision la plus elevéee est (1,3) qui appartient a C2 donc X sera classée C2
	* Pour K=3
		*  les 3 instances les plus proches sont classée respectivement C1 C2 C1 alors la 	classe majoritaire est C1 ainsi X sera classé dans la classe C1 
	*  pour K=5 
		*  les 5 instances les plus proches sont classées respectivement c2 c1 c1 c2 c1 alors la classe majoritaire est c1 et X sera classé dans la classe C1 

---
[[Methode des plus proches voisins K-NN#Notes|up]]