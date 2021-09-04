## Metadata:
* Tags:
* Course : [[Theorie des langages et Automates]]
* Started On : 2020-10-07
* Previous Chapter : 
* Next Chapter :
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
* Soit L un langage contenant  un seul mot () 
L={m}
Soit n=|m| alors =)S1,S2,S3....Sn( Si € A )
L={S1,S2,S3,....}
L1={S1}	L2={S2} Ln={Sn}
L1.L2.L3.Ln={S1,S2,S3,....Sn}
or L1,L2,L3,Ln  sont tous régulier -> L est régulier.
* (0+1)=1->{0,1}*{1
{0,1]*{1}={0}U{1}*{1}
{0} est régulier
{1} est régulier
alors {0} U {1} est régulier alors ({0} U {1})* est régulier
* Exercice 11 :
Soit L un langage contenant un nombre fini de mots
Soit N le nombre de mots dans L
L={M1,M2,M3.....Mn}
={M1} U {M2} U {M3} U {Mn}
{Mi} sont régulier
Alors L'union de langage est régulier.


[[TLA- Les Langages Régulier et les expressions régulières-DESKTOP-8BRIB8V#Metadata|up]]