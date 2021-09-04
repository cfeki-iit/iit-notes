## Metadata:
* Tags: 
* Course : [[Conception des systèmes  d'information]]
* Started On : 2020-12-15
* Previous Chapter : [[CSI- Diagramme de Séquence]]
* Next Chapter :
# Slides
# Summary
# Diagramme de Classes
Description structurelle Statique du systeme, en terme de classes et de relations entre les classes. 
présentation d'un systeme:
*  identifier les objets
	*  classes frontiere ("interface")
		*  modelisent les interactions entre le systeme et ses acteurs
	*  classes "controle"
		*  rreprésentent la coordinatione, le séqencement , les transactions et le controle d'autres objets
	*  classes "entité"
		*  modélisent les informations durables et persistantes


>l'apport de l'orienté objet : 
>*   la classe permet d'encapsuler les informations du systeme, qui ne sont plus accèssible qu'a travers des operations internes au systeme
>* encapsulation
>* abstraction
>* association
>* L'heritage


*   les Association 
	*   peuvent etre implicites ou explicite (classe d'association)
	*   a un nom
	*   des attributs et des operations
	*   Cardinalités : 
		*   un couple de nombres qui indiques le nombres d'instances de participation d'une classe d'entités par rapport a une autre: 
			*   1..1 un et un seul
			*   0.001 
			*   0..* 
			*   1..*
			*   n..m
*  les Roles : role joué par une classe entité par rapport a une
*  Compositoin / aggregation : 
	*  relation entre structure composé -composite
	*  composition : la durée de vie de la classe composite depend de la durée de vie de la classe composée
	*  Aggregation : les composites sont accessoires, le durée de vie de la classe 
		```mermaid
		classDiagram
			eau<|--h
			eau <|--O
		```
		
*  L'heritage : relation entre et père et fils ( mère fille )
	*  la classe de base hérite tous les attributs et les operations de la classe heritée
	*  Polymorphisme : 
		*  Redéfiniton : on peut hcanger le comprtement de nos classes de base par rapport à la classe heritée
		*  Surfcharge :
___