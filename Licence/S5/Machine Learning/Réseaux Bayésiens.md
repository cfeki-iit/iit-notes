---
tags: "Notes"
---

* Course: [[Machine Learning]]
* Date: 26-10-2021 


# Réseaux Bayésiens
* les réseaux bayesiens sont une combinaison de la theorie des graphes et les probabilités 
	* [[Theoreme de Bayes]] 
		* $$P(A|B) = \frac{P(B|A)P(A)}{P(B)}$$
	* [[Theoreme de Bayes Generalisé]]
		* $$P(A_1...A_n)=P(A_1)P(A_2|A1)P(A_3|A_1A_2)...P(A_n|A_1...A_{n-1})$$
	* Travaux de [[Judea Pearl]]
	* Rappels probabilité 
		* A et B son indépendants ssi 
			* $P(A,B) = P(A)xP(B)$
			* $P(A|B)=P(A)$
			* $P(B|A)= P(B)$
		* Marginalisation 
			* $$P(A)=\sum_i P(A,M_i)$$
		* Theoreme de Probabilité Totale 
			* un evt A peut resulter de plusieurs causes $M_i$ tel que 
				* $P(M_i)$ sont connus 
				* $P(A|M_i)$ sont connus
				* $$P(A) = \sum_i P(A|M_i)P(M_i)$$
* Un réseau bayesien est defini par 
	* une description qualitative des dependances ou des indépendances conditionnelles entre des variables dans un grpahe orienté sans circuit 

---
[[Réseaux Bayésiens#Réseaux Bayésiens|up]]