---
#chose 1 of the above, usually Raw, becomes Digested when 
tags: Source/Lecture_note/Raw
aliases: [202102051502 LN- Test Logiciel 1, ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:
* Date: 2021-02-05
* Given By: [[@Walid Dhouib| Walid Dhouib]]


# Notes 
* Preparation à la Certification ISTQB Testeur
	* Referentiel Metier : [digital talent](http://www.digitaltalent.tn/fr/)
* [[Systeme d'Information]]
	* c'est un ensemble organisé d"éléments qui permet de regoruper de classifer detraiter et de diffuser l'information sur un phenomene donnée 
	* l'utilisation de moyens informatiques, electroniques et la telecommunicaiton permettent d'automatiser et de dématerialiser les operations qtelles que les procédures d'entreprises 
	* un ensemble organisé de 
	* Exemples: 
		* réseau de guichets automatiques de banque
		* une application de gestion de stocks d'un supermarché 
		* site web de vente en ligne 
		* biblioteque numerique 
	* l'informatisation  est au coeur de toutes les grandes ientreprises,
		* le systeme d'information d'une entreprise est composé de 
			* materiels: 20%
			* Logiciel : 80%
		*  les problemes liés ç l'informatique qsont essentiellement des problemes de logiciel 
* [[Logiciel]] 
	* ensemble de programmes qui permettent a un ordinateur ou a u n systeme informatique d'assurer une tache ou une focnction en particuler 
	* développés par : 
		* une personne seule
		* une petite équipe
		* un ensemble d'équipes coordonnées
	* lors du développement de grands logiciels : 
		* importants problems de conception et de coordination 
		* phase décisive : 
			* le cout du développement d'un logociel est extremement important 
			* maintenance coute &galement très cher 
			* conditionne sa réussite et sa pérénnité
	* Caractéristiques 
		* facile à reproduire
			* tout le cout se trouve dans son développement 
			* par exemple : un CD de windows permet de l'installer dans plusieurs appareils sans avoir a develooper windows again
			* pour d'autres produits, la fabrication est souvent le processus le plus couteu
		* Le Logiciel est intangible
			* il est difficie d'estimer l'effort de développement
		* Le processus de développement est difficile a automatiser
			* l'industrie du logiciel exige beacoupp de main d'oeuvre
		* la qualité n'est pas apparente
			* meme un informaticien peu qualifié peut arriver ç bricoler quzlque chose qui semble fonctionner
		* Semble facile à modifier
			* la tentnation est forte d'effectuer des changements rapides sans vraiment en musrer la portée 
		* Le Logiciel ne s'use pas 
			* il se détériore à mesure que les changements sont effectués (software aging)
	* [[Software Aging]]
		* maintenance (bug fixes)
		* erosion architecturale
		* inflexibilité dés le début
		* documentation insuffisante ou inconsistante
		* duplication de code
		* manque de modularité
		* complexité croissante 
	* Etat de Crise : 
		```mermaid
		pie
			title StandishGroup(1995): Etat de Crise 
			"projet etaient conformes aux prévisions initiales" : 16.2 
			"Subi des dépassement en cout avec diminution du nombre des fonctions offertes" : 52.7 
			"Purement abandonnés durant leur développement" : 31.1
		```
		* pour les grandes entreprises e, 
			* le taux de succes est de 9% seuelemnt 
			* 37% des projets sont arrétés en cours de réalisation
			* 50% aboutissent hors délai et hors budget
		* l'examen des causes de succes et d"echec est instructif 
		* la plupart des echecs proviennen non de l'informatique mais de la maitrise d'ouvrage ( le client )
	* Catégories de logiciels: 
		* Sur mesure ( custom )
			* pour un client specifique
		* Générique (Generic)
			* vendu sur le marché
			* exemple : un SpreadSheet
		* Embarqués (embedded)
			* executent dans du materiel electronique isolé
				* machine à laver, television etc 
			* difficile à modifier
* [[Genie Logiciel]]
	* FR Processus visant la résolution de problemes posés par un client par le déveloopement systématique et l'évolution de systemes logiciels de grande taille et de haute qualité en respectant les contraintes de couts de temps et autre
	* ENG the process of solving customers problems by the systematic development and evolution of large high quality software systems within cost, time and other constraints 
	* 4Ps: 
		* Personnel
			* Qui va développer 
		* Processus 
			* Comment développer
		* Projet 
			* la production réelle du logiciel 
		* Produit
			* tous les objets fabriqués pendant la production 
				* code source 
				* écxécutables, 
				* documentation,
				* modeles de conception, 
				* cahier de charges 
				* RESULTATS DE TESTES
				* mesures de productivité 
	* Risques et difficultés 
		* Complexité et quantité des elements a tenir en compte
		* incertitude concernant la technologie
		* incertitude concernant les exigences
			* Client donne des exigences floues
		* incertitude concernant les compétences 
			* recrutement d'un ingénieur diplomé mais pas compétent
		* adaptation face aux changements
			* Technologique
			* Organisationnel
		* détérioration du produit
		* risques politiques 
	*  Parties prenantes dans le cuycle de developpement 
		*  Utilisateur (user)
			*  ceux qui se servent du logiciel 
		*  Client (customer)
			*  Ceux qui paient pour le logiciel 
		*  Developpeurs (developers)
			*  ceux qui concoivent le logiciel 
		*  Gestionnaires (managers)
			*  ceux qui supervisent la production du logiciel
		*  => tous ces roles peuvent etre remplis par la meme personne
*  [[Cycle de vie d'un projet Informatique|Cycle de Vie d'un Logiciel]]
	*  toutes les étapes du developpement d'un logiciel de sa conception à a disparition 
	*  le cycel de vie permet de detecter les erreurs au plut tot et ainsi de maitriser la qualité du logiciel, le délai de sa realtion etc 
	*  c'est la description d'un processu couvrant les phases de 
		*  la création d'un produit 
		*  distribution sur le marché 
		*  disparition
	*  le but de ce découpage et de 
		*  maitriser les risques 
		*  maitriser au mieu les couts et le delais 
	*  2 types de cycles de bvies : 
		*  le Cycle de développement des logiciels 
		*  le cycle de vie des produits
	*  Etapes 
		*  definition des objectifs 
		*  analyse des besoins et faisabilités 
			*  besoins 
			*  contraintes 
			*  estimation de la faisabilité 
		*  Specification ou conception Générale 
			*  architecture generale
		*  Conception détaillée 
			*  definir precisement tout les sous-ensembles
		*  Codage ( implémentation ou programmatoin)
		*  Tests unitaires : 
			*  sous ensembles confomes au specifications
		*  integration : assuer l'interfacasge des differents elements du logiciel 
		*  qualitifcation : verficiation de la conformité du logiciels aux specifications initiales 
		*  documentation informations necessaires que ce soit pour l'utilisateur et le developpeur ultérieurs 
		*  mise en production : dépoloiement sur le site du logiciel 
		*  maintenance : action corrective, actions evolutives
	*  Modele de cycles de vie : 
		*  Modele en cascade 
			```mermaid
				flowchart TD
					a(Definition des Besoins)-->b(Specification)
					b --> c(Planification)
					c --> d(Conception)
					d --> e(implémentation)
					e --> f(integration)
					f --> g(qualification)
					g --> h(exploitation)
					h --> i(retrait)
					
					h-- Maintenance -->a
					h-- Maintenance -->b
					h-- Maintenance -->d
					h-- Maintenance -->e
			```
		*  modele en V 
			*  le plus connu et certainement le plus utilisé 
			*  il s'agist d'un modele en cascade dans lequel le developpement et les tests du logiciel sont effectués de maniere synchrone 
			*  le principe de ce modele eqy qqu'avec tout décomposition doit etre decrite la recomposition et que toute description d'un compasant 
			```mermaid
				flowchart TD
				a(analyse des besoins) --> b(tests d'acceptation)
				a --> c(specification)
				c-->d(tests Systeme / Qualification)
				d --> b
				c-->e(conception Architecturale)
				e-->f(tets d'integration)
				f-->d
				e-->g(hi)
				
			```
			* la représentation en V tient d'avantage compte de la rélité, le processus de développement n'est pas réduit ç un enchainement de taches séquentielles 
			* c'ent en phase de specification que l'on se préoccupe des procudes de qualification 
			* c'est en phase de conception globale que l'on se préoccupe des procédures d'intégration 
			* c'est une pahse de conception detaillée que l'on prepare les tests unitaires 
			* insuffisances de cascade et V 
				* l'interface utilisateur n'apparaitra que fort tard. il n'ya pas assez de bornes intermediareis permettant de valide ce que  sera la version finale du produit 
					* d'autres modeles
		*  Maquettage prototypage
			*  dans l'industrie de fabrication
				*  maquette ) modele réduit de l'objet 
				*  prototype ) premier d'une série 
			*  DANS le développement logiciel : 
				*  maquette ou protoytpe rapide : 
					*  en amont du cycle de développement anaylse des besoins, specifications fonctionnelles 
					*  nature du produit: interface et les fonctionnalités 
				*  Prototype experimental ( voirs IHM d'UML par exemple)
					*  utilisé au niveau de la conception pour
						*  s'assurer de la faisabilité des parties critiques 
						*  valider des options de conceptions
		*  developpement incrémental 
			*  un logiciel peut etre construit étape par étape
			*  le logiciel est specifié et concu dans son ensemble 
			*  la realisation se fait par incréments de fonctionnalités 
			*  chaque incrément est integr à l'ensemble des précédents et )à chaque étape le priodut et testé exploité et maintenu dans son ensemble 
			*  accepter progressivement un logiciel par les utilisateurs
			*  
		*  Modele en spirale (BOEHM 1988)
			*  réevaluer les risques en cours de développeent 
			*  chaque cycle de la spirale sedéroule en quatre phases 
				*  determination des objectifs du cycles , des alternatives pour atteindre et des contraintes. a partir des résultats de ces précédent ou de la'analyse préliminaire des besoins 
				*  analyse des risques evaluation des alternatives a partir de maquettage et ou prototypage 
				*  develoopppement et verification de la solution retenue. un modele classique petu etre utilisé ici 
				*  revue des résultats et verification du cycle syivant 
			*  Analyse de risque 
				*  Risques Humains 
					*  Defaillance du personnel ou surestimation des compétences 
					*  travailleur solitaire, héroisme, manque de motivation
				*  Risques Processus
					*  pas de gestion de projet
					*  calendrier et budget irréaliste
					*  calendrier abandonné sous pression des clients 
					*  composants externes manquants 
					*  taches externes defaillantes 
					*  insuffisance de données 
					*  validité des besoins 
					*  developpement de fonctions inappropriérs développement d'interfaces utilisateurs inappropriées. 
				*  risques techniques 
					*  produit miracle "plaqué or"
					*  changement de technologie en cours de route 
					*  probleme de performance 
					*  exigences démesurées par rapport à la technologie
					*  incompréhension des fondements de la technologie 
			*  Conditions d'applications : 
				*  s'applique en interne
				*  si l'analyse de risque demontre que le projet doit etre continué 
		*  Methode Merise
		*  Rapid Appilcation Development 
			*  tend a raccourcir le cycle de vie voir l'eliminer 
			*  la phase de specification/ conception remplacée par une phase de prototypage menée conjointement avec le cluient 
			*  la phase de prototypage debouche sur une interface validée par le client 
			*  l'outil genere des squelettes de fonctiones classes etc 
			*  le comportement de chaque objet de l'interface est ensuite décrit dans un langage approprié et sonfctionnalité programmées des sourcis lors de la maintenance da cause du cmanque de conception inhérent à la démarche une conception basée sur l'interface 
			*  récemment la methode DSDM est appraue qui prend en compte ces remarques et structures de l'approche RAD 
				*  la methode s'applique bien dans le cadre de petites appplications de gestion, n'ayant pas de cycle de vie de trop longue durée.
*  [[Logiciel]]
	*  tout ou partie des programmes, procédures regles et documentation associée à in systeme de traitement de l'information 
	* [[Programme]]
	* [[Procédure]]
	* 

* Erreurs, echecs et problemes logiciels 
	* Terminologie reccomandée 
		* Erreur / Error : inséré par un humain  
			* action humaine qui produit un résultat incorrect (ISO24765)
		* Défaut (bug,faute)/ Defect(bug,) : erreurs non detectées 
			* 
		* Défaillance / failure : défaut d'execution
			* 
	* [[Bugs Informatiques]] 
		* conéquences :
			* physiques accidents graves
			* financières cout de correction impact sur les utilisateurs ou clients 
		* les acteurs concernés : 
			* l'entreprise 
			* les utilisateurs finaux 
		* Cout complexe difficile a calculer 
			* Temps de corrections 
			* pénalités de retard de livraison 
			* impact commercial en terme de confiance te image de la société. 


---
[[202102051502 LN- Test Logiciel 1#Notes|up]]