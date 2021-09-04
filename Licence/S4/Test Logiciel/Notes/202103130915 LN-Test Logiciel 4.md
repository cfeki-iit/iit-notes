---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: Source/lecture_Note/raw
aliases: [202103130915 LN-Test Logiciel 4, ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:[[Test Logiciel]]
* Date: 2021-03-13
* Given By: [[@Walid Dhouib|Walid Dhouib]]


# Notes 
* tester pendand le cycle de vie logiciel 
	* Le modele en V introduit 4 niveaux de test  correspondant au 4 niveau de developpements 
		* **Test de composants** (unitaires)
			* junit pour java 
			* Bases de tests 
				* exigences des composants 
				* conception détaillée 
				* code
			* Objets habituels de test 
				* comoosants 
				* programmes 
				* conversions de données / utilitaires de migration 
				* Modules de bases de données
			* les tests de composants peuvent inclure des tests de fonctionnalités ert des tests de carateristiques non fonctionelles telle que les comportement des ressources f ou des tests de robustessee ainsi que des tests  structurels. 
				* les c	s de test sont derivés dees livrables tels que les specifications des composants, la conception du logicelles ou le modele de données 
				* il sont fait dans un environnement de développement 
				* preparer et automatiser les cas de tests unitaires avant le développement s'appele développement piloté par les tests 
		* **test d'integration** 
			* testent les interactions entres les composants logiciels ( après les tests de composants )
			* Similairement les tests d'integreation systeme testent l'interaction entres les differents systemes 
			* Testent les interfaces entres les composants, les interactions entre differentes parties d'un systeme comme par lexemple le systeme d'ecploitation le systeme de fchier le matierel ou les interfaces entre les systmees 
			* des stratégies d'integration systematique peuvent etre basées sur l'architecture des systemes ( top down bottom up ) les taches fonctionnelles, les séquences d'exécuion de transactions ou d'autres aspects du systeme ou du composant.
		* **tests syteme **
			* des tests qui traitent le comportement dy ststeme produit complet dans un environnement de test qui devrait correspondre a la cible finale ou a un envoironnement de production de façon a minimiser les risques de défaillances dues à l'environnement. 
			* ces tests sont opérés par une equipe de test indépendantes, ils peuvent etre aussi bien fonctionnels que non fonctionnels 
			* il peuvent aussi etre des tests boite blanche ( basée sur les structures ) ou boite noire ( basée sur les specifications avec une table de décision par exemple )
		* **tests d'acceptation** 
			* Objectif : 
				* savoir si le produit est livrable. 
				* etablir un niveau de confiance par rapport au logiciel 
			* la recherche d'anomalies n'est pas l'objectif principal des tests d'acceptation
			* responsabilité du client finale ou les utilisateurs finaux du systeme 
			* les tests d'acceptation peuvent evaluer si le systeme esst préet a etre deployé et utilisé bien que ce ne soit pas necessarement le dernier niveau, par exemple une integration systeme à grande echelle peut arriver apr_s les tests d'acceptation du systeme. 
			* les formes habituelles des tests d'acceptation incluent : 
				* Testes d'acceptation utilisateur : 
					* verifie l'aptitude et l'utilisabilité du systeme par des utilisateurs 
				* tests d'acceptation operationneles 
					* tests des backups et restaurations, 
					* la reprise après ssnistre, 
					* la gestion des utilisateurs 
					* les taches de maintenances 
					* les chargements de données et taches de migration 
					*  la verification periodique des vulnérabilités de securité 
				*  Test d'acceptation contractuelle et reglementaire. 
				*  Alpha Testing : 
					*  sont executé sur le site de l'organisation mais pas par des equipes de développement
				*  Beta Testing : 
					*  tests sur terrain
					*  executés par des personnes sur leurs sites propres. 
		* Les Tests peuvent commencer a etre implémentés dés le début du projet, en effet dès qu'il ya un squelette/ architecture du systeme on peut se lancer dans la creation des tests. Cependant leur execution necessitera la fin de la phase de developpement à laquelle ils sont liés 
		* Types 
			* Tests fonctionnels : 
				* les tests fonctionnels concernenet le comportement exterieur du logiciel (tests boite noire ) et peuvent etre executés a tous le s niveaux de tetss 
				* exemple : 
					* test de securité: 
						* examine les fonctions ( par ex pare feu ) liée a la dtetction de probleme réseau 
			* Tests non-fonctionnels : 
				* tests de performance 
				* tests de chare 
				* tests de stress 
				* tests d'utilisabilité 
				* tests de maintenabilité 
				* tests de fiabilité 
				* tests de portabilités 
	
	* Les Modeles iteratifs ( RAD, RUP , other Agiles)
		* Le logiciel est un ensemble d'incréments, 
		* une application peut etre testée a plusieurs etapes durant une seule iteration. chaque incrément peut etre un livrabre a part entieres 
* 

---
[[202103130915 LN-Test Logiciel 4#Notes|up]]