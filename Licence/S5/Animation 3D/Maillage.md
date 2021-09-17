---
tags: "Notes"
---

* Course:
* Date: 17-09-2021 


# Notes 

* Maillage : 
	* Réseau de points sommets reliés entre eux par des arrêtes, si les sommets sont tous situés dans un meme plan le maillage sera 2d , dans le cas contraire c'est un maillage 3d
	* les polygones composants des maillages peuvent etres des triangles, rectangles (4-gone) ou poly-gone ( n-gone )
	* Maillage 3d : 
		* Les sommets :
			* (x,y,z) qui représente la position du point dans l'espace 
		* Les Faces 
			* chaque face est codée et représentée par l'ensemble des points qui la constitues
		* les Attributs
			* des informations concernant la nature de l'objet a modeliser ( matiere / temperature etc )
		*  ==Maillage Surfacique ==: 
			*  c'est la description du'n objet bolumiquequi peut se limiter a la description de la surface de clui ci 
			*  c'est une représentation de la surface de l'objet en un ensemble de plygones
		*  ==Maillage Volumique== :
			*  dans certains cas la descritpion de la surface seule n'est pas suffisante par exemple dans le cas de materiau translucides on a alors besoin de creuser dasn l'objet 
			*  on utilise alors la generalisation en trois dimensions des maillages surfaciques pour former le volume total de l'objet => Polyhèdres pour la représentation volumique 
		*  Utilité : 
			*  simulation numerique de phénomènes medicaus cinematographiques etc 
			*  dans tous ces domaines l'objectif est de remplacer ou de completer l
	* **Modelisation Geometrique**
		* établir le modele ou la description simplifiée d'un phenomene d'un processus ou du'n systeme en vue d'en etudier le fonctionnement par simulation 
		* description dans un langage compréhensible par l'ordinateur de la forme du mouvement et des caractéristiques d'un objet ou du'n ensemble d'objets  
		* elle se trouve dans plusieurs domaines 
			* la simulation par réaité virtuelle 
				* robotique monde virtuel 
			* Le monde du jeu 
			* television 
			* cinema ... 
		* c'est l'ensemble des outils mathematiques avec des outils informatiques qui permettent de construire un modele virtuel d'un objet réel 
	* **recouvrement**
		* couvrir une region donné par un ensemble fini de polygones (2d) ou polyhèdres(3d) 
	* **recouvrement simplicial**
		* recouvrement utilisant des triangles ou des tetrahedres uniquement 
		* Triangulation : 
			* un probleme de triangulation est un probleme se rapportant à un ensemble de points et plus précisément l'enveloppe convexe de cet element 
		* Triangulation de Delaunay : 
			* 2d verifie le critère suivant : le disque circonscrit a un triangle est vide c'est a dire ne contient aucun sommet en son interieur 
	* **enveloppe convexe**
		* le plus petit polygone convexe incluant tous les points initiaux 
		* 

---
[[Maillage#Notes|up]]