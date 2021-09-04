## Metadata:
* Tags: 
* Course : 
* Started On : 2020-11-03
* Previous Chapter : 
* Next Chapter :
# Slides
# Summary
# Définitions de base en théorie des Graphes

un graphe est defini par l'ensemble vini V dont les elements sont appeleés sommets (vertices ). et par l'ensemble E dont les elements sont appelé des Arêtes(Edges).
si une arrete e de l'ensemble E est definie par une pa

ordre d'un grapghe = nombre de sommets 

```mermaid

```

Graphe planaire si on sait ordonner les arrete tel qu'il n'ya pas d'intersection entre eux 
graphe simple au plus une arrete entre chaque 2 noeuds 
multigraphe : arretes multiples entre chaque noeuds 

graphe complet si chaque sommet lié directement a tous les autres
graphes bi parti: si les sommets peuvent etre divisé en sous ensembles X et Y de sorte que tous les arpetes du graphe relient un sommet dans X à un somet dans Y 

## Utilisation pour résoudre un probleme 
données: 
6 wagons a trier
entrent dans le centre de triage 2 5 3 6 1 4 ( ordre d'entrée)
doivent sortir a l'ordre croissant (1 2 3 4 5 6) ( odre de sortie)

2 wagons i et j peuvent etre mis sur la meme voie, ssi ils entrent dans le meme ordre dans lequel il doivent sortir ( i < j )

Traduction en graphe : 
sommets = wagons 
on relie deux sommets si il peuvent etres dans la meme voie ( ordre croissants )
ou on relie deux sommets qui ne sont pas sur la meme voie 
le plus important c'est la declaration. 
choix 1 : 
```mermaid
```
choix2 :
```mermaid
```

## Graphe partiel et sous Graphe : 
un graphe partiel = enleve quelque arrpêtes 
un sous graphe = supprime quelques sommets ( et leur arrpetes connexe)

un graphe partiel d'un sous graphe est une sous graphe partiel 

Clique = sous graphe complet de G 

___
[[TD2-Graphes]]
___
[[Définitions de base en théorie des Graphes#Metadata|up]]