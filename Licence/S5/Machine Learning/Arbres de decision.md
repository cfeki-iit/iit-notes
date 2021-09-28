---
tags: "Notes"
---

* Course: [[Machine Learning]]
* Date: 21-09-2021 


# Arbres de Decisions
* Arbre  : représentation graphique d'une procédure de classification
* Arbre de decisions est un arbre ou : 
	* Noeud Interne = attribut 
	* Branche d'un noeud = Test sur l'attribut 
	* Feuilles = classe donnée 
	* une Régle est générer pour chaque chemin de l'arbre d'une racine vers une feille 
	* les paires key-vlaue d'un chemin forment une conjonction 
	* le noeud terminal presente la classe predite 
	* les regles sont generalement plus facile a comprendre que les arbres 
* utilisations 
	* Classification de nouvelles données 
	* en faisant de l'estimation d'attribut 
* Construction de l'arbre 
	* init : toutes les instances d'aprentissage sont a la racine de l'arbre 
	* Selectionner un attribut et choisir un test de séparation (pslit ) sur l'attribut, qui sépare le mieux les intances, la selection des attributs est basées sur une heuristique ou une mesure statistique
	* Partitionner les instances entre les noeuds fils suivant la satisfaction des tests logiques
	* Traiter chaque noeud fils de façon recursive 
	* repeter jusquaceque tous les noeuds soient des terminaux
	* un noeud courant est terminal si 
		* Il n y' a plus dattributs disponibles 
		* le noeud et pur : toutes les instances appartiennent a une seule classe 
		* le noeud est presque pur : la majourité des instances appartiennent a une classe majoritaire
	* ==Algorithmes de construction des arbres==
		* **Gain D'information**
			* Selectionner l'attribut avec le plus grand gain d'information 
			* Soient P et N deux classes et S un ensemble d'instances avec p elements de P et n elements de N
			* L'information necessaire pour determiner si une instance prise au hasard fait partie de P ou N est : 
			 $$I(p,n)=\frac{p}{p+n}log_2\frac{p}{p+n}-\frac{n}{p+n}log_2\frac{n}{p+n}$$
			* L'entropie ou l'infomation necessaire pour classifier les instances dans les sous arbres Si est: 
			$$E(A)=\sum_{i=1}^{v}\frac{p_i+n_i}{p+n}I(p_i,n_i)$$
			* le gain d'information par rapport au branchement sur A est donc:
			 $$Gain(A) = I(p,n) - E(A)$$
			 * L'attribut selectionné 
		* 

---
[[Arbres de decision#Notes|up]]