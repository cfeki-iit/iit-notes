---
tags: "Notes"
---

* Course:  [[Machine Learning]]
* Date: 12-10-2021 


# Validation des Arbres de Decision
* Validation = estimer la probabilité que la classe prédite pour une données quelconque soit correcte 
* l'erreur de classification E d'un classeur est la probabilité que ce classeur ne prédise pas correctement la classe d"une données de l'espace de données 
* l'erreur apparente E_app est mesurée avec les exemples X_app utilisé pour construction du classeur 
* Definitions 
	* VP : vrais positifs 
		* exemples de classes positive et dont la classe est prédite comme positive
	* VN : vrais negatifs 
	* FP
	* FN
* Mesures 
	* Precision :
		* positifs : 
			* $$\frac{VP¨}{VP+FP}$$
		* negatifs:
			* $$\frac{VN¨}{VN+FN}$$
	* Rappel
		* Positifs
			* $$\frac{VP¨}{VP+FN}$$
		* Negatifs 
			* $$\frac{VN¨}{VN+FP}$$
	* F
		* $$F=\frac{2rappel*precision¨}{rappel+precision}=\frac{2VP}{2VP+FP+FN}$$



---
[[Validation des Arbres de Decision#Notes|up]]