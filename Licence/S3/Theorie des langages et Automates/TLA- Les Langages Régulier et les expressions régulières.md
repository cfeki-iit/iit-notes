## Metadata:
* Tags: 
* Course : [[Theorie des langages et Automates]]
* Started On : 2020-10-07
* Previous Chapter : [[TLA- Intoduction et concepts fondamentaux]]
* Next Chapter : [[TLA- Les Automates finis]]
# Slides
# Summary :
* 2020-10-14 :
	* [x] Exercice 6 TD1

# TLA- Les Langages Régulier et les expressions régulières
## Definitions: 
* ***Language reguliers:*** (definition par induction)
	* $\varnothing$ est un langage régulier
	* $\{\varepsilon\}$ est un langage regulier 
	* $\{a\}$ avec |a| = 1 ; est un langage régulier
	* si L et M sont réguliers alors 
		* $L.M$ est régulier
		* $L+M$ est régulier
		* $L^*$ est régulier


* ***Expression Regulières:*** (definition par induction)
	* $\varnothing'$ est une expression régulière qui dénote le langage $\varnothing$
	* $\varepsilon$ est une expression régulière qui dénote le language $\{\varepsilon\}$
	* a est une expression régulière qui dénote de langage {a}
	* si  $r$ et $s$ sont deux expressions réguliers qui dénotent $R$ et $S$ alors:
		* $r\cdot s$ est une expression régulière qui dénote $R.S$
		* $r+s$ est une expression régulière qui dénote $R+S$
		* $r^*$ est une expression régulière qui dénote le langage $R^*$

___
[[TLA- Les Langages Régulier et les expressions régulières#Metadata|up]]