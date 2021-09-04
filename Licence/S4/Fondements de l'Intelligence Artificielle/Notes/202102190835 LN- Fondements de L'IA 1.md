---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: #Source/lecture_Note/raw
aliases: ["202102190835 LN- Fondements de L'IA 1","LNFIA1" ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic: [[Intelligence Artificielle]]
* Date: 2021-02-19
* Given By: [[@Hatem Hadj Kacem]]


# Notes 
* Rappel [[Logique Formelle]]
* [[Intelligence Artificielle]]
	* **Questions** : 
		* What is AI ? 
			* Créer des Systemes qui se comportent comme des humains
				* Alan Turin 
			* Créer des systemes qui pensent comme l'humain 
			* Créer des systemes qui pensent rationellement 
			* Créer des systemes qui possèdent des comportements rationnels
		* Les Approches de L'IA?
			* Caractère utilitaire 
				* faiire à la machine ce que l'homme est capable de faire et rendre les ordinateurs plus yutiles
			* 
		* Domaine d'application?
			* systemes expers 
			* planification / optimisation 
			* robotiques 
			* machine learning 
			* natural language Processing 
			* la vision  / image synthesis and analysis
			* Speech Synthesis (text to speech and speech to text)
	* **Answers** 
		* AI 
			* Transmettre des facultés mentales de l'etre humain à la machine
		* Approches
			* Brute Forcing Solutions : programmer toutes les solutions possibles à un probleme 
				* => ça marche parfois mais Puissance de calcul immense et temps d'implémentation infini . mehh 
			* Faire apprendre a la machine ce que l'homme peut faire (raisonner)
				* => comprendre le comportement et le raisonnement humain
				* => prévoir des methodes d'apprentissage
* [[Algorithmes de Recherche]]
	* Probleme
		* un probleme est une situation devant laquelle on ne voit pas directement les etapes permettant de dépasser la situation et satisfaire un besoin
	* Resoudre un probleme 
		* chercher un chemin qui pmeret d'aller d'une situation initiale a une situation finale pour atteindre un but
	* Problemes a résoudre : 
		* jeux 
		* preuves de theoremes 
		* generation de plan d'action 
	* Facteurs dictant le raisonnement sur un probleme 
		* Optimisation 
		* Reversibilité 
		* Prévision 
		* Décomposition 
		* Connaissances
	* [[Représentation des problemes en espaces d'états]]
		* Etat initial (Start S)
		* Etats finaux ( Goal G)
		* Operateurs (O)
		* représenté par un arbre de choix descendant partant d'un état initial vers un ensemble de feuilles non descendantes (états finaux ) au moyens d'un ensemble d'operateurs 
		* résoudre un probleme selon les algorithmes aveugles s'agit de trouver un chemin possible de S vers un G. 
	* >* Probleme exemple:  
		>	*  on dispose de 2 récipients A et B de contenance N_A et N_B et contenant initialiement i_A et i_B. le but est d'obtenir un Contenu particulier dans le récipient B qu'on appelle F_b. pour cela on peut
		>		*  J : jetter complétement le contenu d'un récipient
		>		*  V : Vider un récipient d'ans l'autre s'il ne déborde pas 
		>		*  R : Remplir un récipient avec tous ou une partie du contenu de l'autre 
		>	*  Specifier l'espace d'états pour ce probleme
		>	*  Developper le graphes d'états pour ce probleme pour le cas i_A = 5 , i_B=0 F_b=1, N_A=5 , N_B=2
	* >* Solution 
		> S = {i_A/N_A, }
```mermaid
flowchart TD
	e1((5,0)) --"J(A)"--> e2((0,0))
	e1 --"R(A,B)"--> e3((3,2))
	e3 --"R(B,A), V(B,A)"--> e1
	e3 --"J(A)"--> e4((0,2))
	e4 --""--
```
(More Syntax [Here](https://mermaid-js.github.io/mermaid/#/flowchart))

*	
	* [[Algorithmes Aveugles]]
		* [[Recherche en Largeur]]
		* ----------------- Stopped here REVIEW!
		* [[Recherche en Profondeur]]
	* [[Algorithmes Heuristiques]]
		* [[Algorithme A*]]
* [[Systeme Expert]]
	* [[Chainage avant]]
	* [[Chainage Arriere]]
* [[ProLog]]

---
[[202102190835 LN- Fondements de L'IA 1#Notes|up]]