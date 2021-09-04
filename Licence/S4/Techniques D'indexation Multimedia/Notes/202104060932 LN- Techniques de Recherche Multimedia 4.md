---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: #Source/lecture_Note/raw
aliases: [202104060932 LN- Techniques de Recherche Multimedia 4, ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:
* Date: 2021-04-06
* Given By: [[@Rafik Khemakhem]


# Notes 
* Les Modeles de recherche d'information
	* Intro
		* le modele de recherche pour un SRI indique comment les documents et les requetes sont représentés et comment ces représentations sont utilisée pour evaluer la pertinence.
		* Les modele de RI, manipulent les documents, les termes, les requetes, les jugements de pertinence et les utilisateurs 
	* Formulation
		* un MRI est un 4-uplet $\{D,Q,F,R(q^i, d^j)\}$ avec :
			* **D** est l'ensemble des représentants des documents de la collection a evaluer et a ranger selon leur degré de pertinance a une requete utilisateur
			* **Q** est l'ensemble des representants des besoins en information ( hard words to say : requete ). Designe la famille des critères a partir desquelles les documents seront évalués. Cette famille représente les sources de pertinence 
			* **F** est le schema du support de représentation des documents, requetes et relations associées. c'est l'ensemble des evaluations des documents selon chaqu'un des critères, c'est à dire, l'ensemble des vecteurs de performance (1 vecteur par document)
			* **$R(q^i,d^j)$** est une fonction d'ordre associé à la pertinence. elle designe la procédure de rangement qui exploite les evaluations des documents a fin de construire une liste triée des documents potentiellement pertinents,...., plus grande sera la pertinence du document. plus la requete et le document ont une distribution de termes similaires
				* ..... , une valeur de pertinence vis-a-vis d'une requete.Les documents ayant une pertinence positive sont selectionnés. La mesure de pertinence est calculée a partir d'une fonction de similarité RSV(Q,D).
		* Appariement Exact:
			* Requete specifie de maniere precise les  crièteres recherchés 
			* respectant la reuete sans selectionner 
		* Appariement approché: 
			* les documents sont selectionnés et triés selon un degré de pertinence
			* le Best-Match a en general de meilleurs performances 
				* les meilleurs documents apparaissent en tête de tri 
				* les autres documents n'apparaissent pas exactement avec la requete; en effet la requete peut etre trop pauvre pour exprimer l'attente de l'utilisateur oubien elle ne reflete pas toutes les idées présentes dans les documents.
	* Categories des SRI 
		* **Les Modeles Booléens**
			* permier modele utilisé en RI
			* propositions: 
				* représentation des documents par un ensemble de termes 
					* ex: d1(t1,t2,t5).. 
				* la représentation d'une requete sous forme d'une equation logique: les termes d'indexation sont reliés par des connecteurs logiques **ET**(^),**OU**(v) et **NON**(!)
					* q=t1^(t2 v !t3)
				* L'appariement requete-document est stricte et se base sur des operations ensemblistes selon les regles : 
						* $RSV(d,t_i)=1 \text{ si } t_i \in d\text{, } 0 \text{ sinon }$
						* $rsv(d,ti^tj))1 si (t_i\in d)^(tj\in d) 0 sinon$
						* rsv(d, ti OR tj) = 1 si (ti \in d)v(tj \in d) 0 sinon
						* rsv(d, not ti)=1 si ti \not \in d, 0 sinon
			* avantages 
				* simplicité de mise en oeuvre du systeme
			* Inconvénients 
				* selection de documents basée sur une decision binaire; les documents sont classés que dans deux categories:  l'ensemble des documents pertinents et l'ensemble des documents non pertinents
				* les documents selectionnés ne sont pas triés 
				* les termes d'un document ou d'une requete sont d'egales importances (pondérés à 0 ou 1) 
				* la formulation d'une requete booléenne est difficile, la difficulté s'accroit avec la taille de la collection
		* **Les Modeles Vectoriels**
			* proposé dans les systemes SMART (Systeme d'analyse mathematiqu)
			* se repose sur des bases mathematiques des espaces vectoriels
				* les documents de la requete sont représentés sous forme d'un vecteur dans l'espace vectoriel composé de toutes les tables d'indexations.
				* L'ensemble des vecteurs de base sont linéairement indépendant : les termes sont supposés indépendants ( 1 terme = 1 dimension )
				* un document $d_i$ est représenté par un vecteur de dimension n 
					* $d_i=(w_{i1},w_{i2}...,w_{in})$ pour i = 1...m;
						* avec $w_{ij}$ est le poids du terme $t_j$ dans le document $d_i$
						* m est le nombre de documents dans la colection
						* n est le nombre de termes d'indexation
				* une requete Q est aussi représentée par un vecteur de mots clés définis dans le même espace vectoriel que le document
					* $Q=(w_{Q1},w_{Q2}...w_{Qn})$ avec 
						* $w_{Qj}$ est le poids du terme $t_j$ dans la requete Q
		* **Les Modeles Probabilistes**

---
[[202104060932 LN- Techniques de Recherche Multimedia 4#Notes|up]]