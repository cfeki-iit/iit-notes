## Metadata:
* Tags: 
* Course : [[Ingénierie des Bases de données]]
* Started On : 2020-10-01
* Previous Chapter : --
* Next Chapter : [[IDB-Algèbre Relationelle]]
## Slides
# Summary :


* 2020-10-01 :
	* [x]  Modèle entité association de l'étude de cas N°1 

# Introduction et Notions de Base
	
* **Système d'information**
	* un système est un ensemble d'informations reliée entre elles 
	* on parle d'un systeme d'information pour une organisation (ecole institut société etc ) 
	* contient les besoins/données du client
* **Etablissement du cahier de charges**
* **Conception**
	* c'est  le "schema architectural" ( blueprint ) du logiciel pour répondre au besoin 
	* traduction du besoin du client en modeles compréhensibles par les humains (ie modele entité association) 
* **Developpement**
	* Back End: 
		* SGBD : systeme de gestion de base de données
			* LDD : langage de description de données
				* commandes SQL : Create, Drop, Alter
			* LMD : langage de manipulation de données.
				* commandes SQL : Insert, Update, Delete, Select
			* assure la 
				* securité : en cas de panne aucun risque de perte de données ( ou du moins prevoir des mechanismes de récuperation)
				* integrité : s'assurer que les informations stockées sont justes  	
					* ==Attention remplissage des tables interdits avant d'établir les relations dans Access==
				* confidentialité : attribuer des droits d'accès pour chaque utilisateur afin de garantir  
	* Front End:
		*  Interface Graphique

## Modele entité association 
que ce passe quand on modelise ? On prend le monde réel et on le représente par des entités 
* ***Entité***:
	* Un objet du monde réel qui a une existance propre qui peut etre soit concret soit non concret.
* ***Classe d'entité*** ou ***Objet-Type***: 
	* Rassemblement d'entités semblabes qui ont des charactéristiques communes  
* ***Association***:
	* relation entre deux entités 
	* ex: Chedi *(entité)* possède *(relation)* voiture rouge *(entité)*
* ***Classes d'associations*** ou ***Association-type*** ou encore ***Relation Type***:
	* Ensembles d'associations entre des classes d'entités
* ***Dimension*** ou ***Arité d'une association***:
	* le nombre d'ojets-types qui participes à l'association
	* Binaire : 2 
	* Ternaire : 3 
	* etc 
* ***Propriété-Type***: 
* ***Identifiant***:
	* une propriété particulière de l'objet, choisie de telle maniere qu'a chaque valeur prise par cette par cette propriété correspond une et une seule occurence de cet objet 
	* **Identifiant d'une association** :
		* c'est la concaténation des identifiants des objets qui participent à la relation
* ***Modele Conceptuel des données*** (MCD) : 
	* Schema conceptuel des entités et associations constituant le probleme a résoudre  
* ***Cardinalité du'ne relation***:
	* exprime la participation, à cette relation de chacun des objets qui la composent.
	* Pour chaque objet, cette participation peut etre : 
		* **Totale** : chaque occurence participe à la relation
		* **Partielle** : certaines occurences ne participent pas à la relation
	* 1,n
	* 0,n
	* 1,1
## Modele relationnel
le plus utilisé dans le monde ( malgrès l'apparition de l'orienté objet qui unifie données et operations) 
les relations (ou tables)
* domaine
	* Ensemble des valeurs que peut prendre un attribut 
* produit cartésien d'un ensemble de domaines 
	* ![[Pasted image 20201105143315.png]]
	
### Regles de passage
* ==***Règle 1: cas d'un individu non vide***==
	* Tout individu *non vide* (comportant au moins une propriété autre que son identifiant) se transforme une relation au sens relationnel du terme
		* l'identifiant de l'individu devient l'identifiant
		* les autres propriétés deviennent des atributs
* ***==Régle 2: cas d'un individu vide==***
	* Tout individu vide ne se transforme pas en relation
	* **Exception :**
 la regle 2 n'est pas applicable lorqu'il est necessaire de cconstituer un répéertoir des données de l'objet vide et que la projection des autres relations sur l'attribut concerné ne donne pas ce répéertoire
 >(idb r2 relationnel)
 >Pour créer un repertoire des Maisons d'edition, la régle dit de ne pas transformer la classe MAISON_EDITION sauf que meme la relation EDITER ne permet pas d'avoir les maison d'editions pour lesquelles on n'a pas de livres ( cardinalité 0,n )


* ***==Règle 3: cas d'une relation==***
	* Tout e relation conceptuelle, qui n'est pas une DF ( ayant 1,1 comme paire de cardinalités) se transforme en une relation au sens relationnel du terme
		* L'identifian de la relation conceptuelle deviennent la clé primaire de la relation relationnelle
		* Chaque attribut de la clé primaire est défini egalement comme étant une clé étrangère (FK), sauf si l'objet-type correspondant n'est pas transformé en une relation
			* notation : code_doc#
		* une clé étrangère permet de déclarer une contrainte de jointure référentielle
		* Les propriétés de la relation conceptuelle ( si elle est porteuse de données) deviennent des attributs de la relation 
* ***==Règle 4: cas d'une DF binaire forte==*** càd cardinalité de type 1,1 ; faible si 0,1
	* (idb r4 relationnel)
	* les deux individus A et B se transforment conformément à la régle 1 et à la régle 2 
	* l'identifiant de A (cible, car 0,n ou 1,n ) donne lieu à un attribut clé étrangère dans la relation B (source, car 1,1 ou 0,1) ( au sens relationnel) lorsque A se transforme en une relation, ou à un attribut simple autrement
	* **Exception:**
	si la cible est une entité vide 

* ***==Règle 5: cas d'une DF binaire faible==***
	* Sol 1 : Appliquer la régle 4 et obtenir une relation non normalizable
	* Sol2 : les entités se transforment conformément à la régle 1 et à la regle 2 et la DF se transforme conformément à la régle 3 

>Exemple de transformation. 
>(see slide 41)
>1. les classes d"entités non vides : SOCIETE, REGION, ACTIONNAIRE, et PRODUIT se transfroment en des relations (au sens relationnel) selon la régle 1
>    * SOCIETE(NOM_ACTIONNAIRE, ADRESSE_S, PDG, CAPITAL)
>    * REGION(CODE_REGION, LIBELLE_R)
>    * ACTIONNAIRE(NOM_ACTIONNAIRE, ADRESSE A, N_TEL)
>    * PRODUIT( CODE_PRODUIT, LIBELLE_P)
>2. La classe d'entités EXERCICE ne se transforme pas en relation selon la régle 2
>3. Les associations non DF : PARTICIPATION_AU_CAPITAL, PRODUCTION_ANNUELLE se transfroment en relations relationnelles 
>    * PRODUCTION ANNUELLE (CODE_SOCIETE#, CODE_PRODUIT#, ANNEE, QUANTITE_PRODUITE, PRIX_DE_VENTE)
>    * PARTICIPATION_AU_CAPITAL (CODE_SOCIETE, NOM_ACTIONNAIRE)
>4. L'association CIF est DF entre SOCIETE(source de la DF) et Region (cible de la DF ). Cette Association se transforme selon la regle 4 : 
>    * SOCIETE(CODE_SOCIETE, ADRESSE_S, PDG, CAPITAL, CODE_REGION#) 

## Normalisation
* Objectif : 
	* Eliminer la redondance 
		* la redondance n'est pas necessairement de retrouver la meme valeur deux moif mais surtout de deux anieres differentes qui peuvent donner des résultats non cohérants. 
* How ? 
	* décomposer en sous relations 
		* Sans perte de donnée
		* en eliminant les redondances

### Dépendance fonctionelle : 
*  **DF**
	* soit une relation R(...,A,B..) on dit qu'il existe unde DF entre les 3 attributs A et b  de la relation R si à toute valeur de A il existe une et une seule valeur de B 
	*  on note A->B ( A determine B ou B depend fonctionellement de A )
*  **propriétés:**
	*  *==Reflexivité==*:
		*  A->A
		*  si $\exists B \subseteq A$ alors A->B
	*  *==Augmentation==*:
		*  A->B  alors A,C->B,C
	*  *==Transitivié==*:
		*  A->B et B->C alors A->C
	*  *==Union==*:
		*  A->B et A->C alors A->B,C
	*  Pseudo transitivité
		*  A->B et C,B->D alor A,C->D
	*  decomposition
		*  A->B et $C\subseteq B$ alors A->C

### Processus de normalisation
* les formes normales ont été definies (slide 100)
* **==Premiere Forme Normale==**  (1FN):
	* Une relation est 1FN si
		*  elle possede une seule Clé 
		*  Tous ses attributs sont atomiques (non décomposables)
*  **==Deuxieme Forme Normale==** (2FN):
	*  une relation est  2FN si 
		*  Elle est 1FN 
		*  toutes les df entre la clé et les autres attributs sont elementaires. càd aucun attribut ne depend d'une partie de la clé
	*  Cas particuler: si la relation contient un seul attribut dans sa clé elle est automatiquement 2FN 
*  **===Troisieme Forme Normale==** (3FN ):
	*  une relation est 3FN si 
		*  elle est 2FN 
		*  tout attribut non clé ne dépend d'aucun autre attribut non clé.
	*  cas particuler : si la relation contient un seul attribut non clé elle est automatiquement 3FN 
*  **==Forme Normale Boyce-CODD==** (BCNF) : 
	*  une relation est BCNF si 
		*  Elle est 3FN 
		*  aucun attribut membre de la clé ne depend fonctionnellement d'un attribut non membre de la clé. 

### Approche par synthèse:
* Objectif 
	* Obtenir un schema directement en 3FN en partant d'un ensemble F de DF rencensés
	* Automatiser le processus de normalisation
* Conceptes: 
	* **attribut superflu** (ou étranger)
		* soit une DF f qui contient A1,...,An->Y. on dit que Ai est étranger si ça présence dans la partie gauche n'est pas obligatoire ( ne change pas la DF ) 
		* A1,...Ai-1,Ai+1,...An -> Y 
	* **DF redondante **
		* une df f in F est redondante si elle peut etre derivée a partir des autres DFs de F essentjiellement par transitivité.
* Approche
	1. eliminer les attributs Superflus des parties gauches des DF
	2. eliminer les DF redondantes 
	3. Regrouper les DF qui ont une meme parte gauche dans un groupe Hi
	4. fusionner 2 groupes $H_i$ et $H_j$ dans le cas ou il existe des dépendances mutuelles X<- ->Y avec X partie gauche des DFs de $H_i$ et Y partie gauche des DFs de $H_j$
	5. Construire une relation sur chaque groupe (preciser clé primaire (partie gauche) et clé étrangère(element de partie droite si il est partie gauche d'un autre ensemble))
	6. On Obtient un schema en 3FN qu'il faudra décomposer correctement si BCNF requis. (generalement ... ça conciste a défaire le fusionnage)


___
[[IDB- Introduction et Notions de Base#Metadata|up]] 