---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: Source/lecture_Note/raw
aliases: ["202102111041 LN- Administration de bases de données 2","LNABD2" ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:[[Bases de Données]]
* Date: 2021-02-11
* Given By:[[@Sahbi Zahhaf]]


# Notes 
* Propriétés ACID des Transaction 
	* Atomicité ...
* les transactions sont délimités par COMMIT ou ROLLBACK. 
	* Attention au ROLLBACK TO qui fait un micro rollback au sein d'une meme transaction jusqu'a un savePoint
* Les transactions on un debut et une fin 
	* debut 
		* connexion a une bd 
		* fin de la transaction précédente
	* fin 
		* Commit pour valider 
		* Rollback to abandonner la transaction courante 
		* fin de session (commit par défeaut)
* Les Points de reprise permettent de supprimer des micro transactions au sein d'une meme transaction 
* [[ORACLE]]
	* application non fermée : 
		* on peut connaitre en detail comment oracle exequte les requetes 
	* application multiplateforme 
	* application protable
	* Architecture du SGBD ORACLE 11gR2
		* structure de l'instance structure de la base de donénées 
		* Outils : 
			* ORACLE DATABASE 11gR2
			* SQL\*plus : interface liigne de commande 
			* ORACLE SQL DEVELOPEr: environnement de développement integré coté client
			* orcl
			* sys 
			* sys 
		* Partie Client 
		* Partie Serveur 
			* Instance
			* base de donnée
			* 
---
[[202102111041 LN- Administration de bases de données 2#Notes|up]]