## Metadata:
* Tags:
* Course : [[Probabilité et Statistiques]]
* Started On : 2020-11-05
* Previous Chapter : --
* Next Chapter :[[PS- Variables Aleatoires Discrètes]]
# Support de Cours
# Résumé
* epreuve ou experience aleatoire
* "$\Omega$" l'univers : l'ensemble des résultats possibles
* "$\omega$" un evenement élémentaire
	*  $\omega \in \Omega$
*  $Card(\Omega)$ : nombre d'eléments de Omega
*  $P(\Omega)$ : ensemble de parties de Omega
*  $Card(\:P(\Omega)\:) : 2^{Card(\Omega)}$
*  "A" un evenement
	*  $A \subset \Omega$
	*  $\Rightarrow A \in P(\Omega)$ 
* Soient A et B des Evenements : 
	* $A \cap B$ = "Avoir A et B"
	* $A \cup B$ = " Avoir A ou B"
	* $\bar{A}$ = "Ne Pas Avoir A"
	* $A \cup \bar{A} = \Omega$
* $P(A) = \frac{Card(A)}{Card(Omega)}$ ="La probabilité d'avoir A"
	* $0\leq P(A) \leq 1$
	* $P(\varnothing) =0$
	* $P(\Omega)=1$
	* ==$P(\bar{A}) = 1-P(A)$==
	* ==$P(A\cup B) = P(A)+P(B)-P(A\cap B)$==
* A et B sont dit **incompatibles** si $A \cap B = \varnothing$ et donc $P(A\cap B)=0$
* A et B sont dits **independants** si $P(A\cap B)=P(A).P(B)$
* **Probabilité Conditionelle**:
	* $P(B|A)$ "P de B sachant A" : Calcul de l'influence de l'evenement A sur la chance d'occurence de B 
	* ==$P(B|A)=\frac{P(B\cap A)}{P(A)}$==
	* **Probabilité Totale**
		* $P(B) = P(B|A).P(A)+ P(B|\bar{A}).P(\bar{A})$
	* **Probabilité Totale Generalisée**
		* $\cup_{i=0}^n A_i = \Omega$ et $A_i\cap A_j = \varnothing$
		* ==$P(B)=P(B|A_1).P(A_1)+...+P(B|A_n).P(A_n)$==
* **Formule de Bayes** : 
	* Savoir P(A|B) en ayant P(B|A)
	* ==$P(A|B)=\frac{P(B|A).P(A)}{P(B)}$==
# PS- Notions de Base et Vocabulaire Probabiliste 
* Univers : 
	* Ensemble de tous les résultats possibles d'une experience aléatoire
	* notation : $\Omega$
* Evenement :
	* un ou plusieurs résultats possibles 
	* Elementaire si un seul et apparteint a Omega ( noté omega )
	* non-Elementaire si un ensemble de solutions elementaires possibles 
	   ```python
			 ex;
			 Lancer 1 dès 
			 Omega = 1 2 3 4 5 6
			 w1 : Obtenir 1 = evenement elementaire
			 w2 : obtenir un chiffre pair (2 4 6) = evenement non elementaire
		```
* ![[Pasted image 20201105093515.png]]
	* Evenement certain : Evenement dont l'ensemble des résultats et egale a Omega, il a une probabilité de 1 
	   ```python 
	    A= optenir un nombre inférieur a 7 
	   ```

* Probabilité 
	* la probablitié d'un evenement est valeuyr numérique qui représente la proportion de fois ou l'evenement va se realiser, quand on repete l'experiece dans des condditions identiques.
	* valeur generalement entre 0 et 1
	* correspend à la somme des probabilités de chaqun des evenements elementaires qui le constituent


> DEFINITION : 

* Signification des valeurs probabiliste
	* 0.95 : va très probabelement se produire
	* 0.003 a très peu de chance d'être realisé
	* 4 : incorrect
	* -2 : incorrect
	* 0.4 : va se produire un peu moins que la moitié des essais
	* 0.5 : une chance sur 2 
	* 0 : aucune chance que A soit réalisé


> Proposition 1.2
> ![[Pasted image 20201105095851.png]]

* Probabilité uniforme 
	* ![[Pasted image 20201105101045.png]]

* Independance et conditionnement 
	* ![[Pasted image 20201105104143.png]]
	* ![[Pasted image 20201105104335.png]]
	* ![[Pasted image 20201105105054.png]]

[[PS-Complément1 - Elements d'analyse Combinatoire]]
___
[[PS- Notions de Base et Vocabulaire Probabiliste#Metadata|up]]