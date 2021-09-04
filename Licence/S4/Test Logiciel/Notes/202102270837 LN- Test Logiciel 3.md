---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: Source/lecture_Note/raw
aliases: ["202102270837 LN- Test Logiciel 3","LNTL3" ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic: 
* Date: 2021-02-27
* Given By: [[@Walid Dhouib]]


# Notes 
* [[ISTQB]] 
	* ASBL qui fournit les bonnes pratiques de tests logiciels 
	* développé par plus de 100 experts dans plus que 40 pays 
	* Certification la plus reconnue dans le monde de test logiciel 
	* il ya plus que 320000 testeurs certifiés à travers le monde 
	* le représentant ISTQB en Tunisie est a tunis, le passage de l'examen coute environs 300dt 
	* certification : 
		* Foundation  CTFL 
		* Advanced CTAL
			* test manager 
			* test analyst 
			* technical test analyst
		* Expert CTEL 
			* test management 
			* improving the testing process 
			* test automation 
			* Security testing 
* [[Test Logiciel]]
	* [[ISO 29119 Software testing]]
		* part 1: concepts et definitions 
		* part 2: test process 
		* part 3: test documentation 
		* part 4: test techniques 
		* part 5: keyword driven testing
	* Why ? 
		* les systeme s logicielles deviennent une part de notre existance, des applications déféectueurx peuvent generer un nombre de pertes 
			* financieres, 
			* temps
			*  réputation 
			*  accidents, eventuellement mortels 
		*  => il est important de corriger ces défaillances avant qu'elles ne soient livrés aux clients 
		* Le role du testeur est de ==detecter== seulement les erreurs, c'est à l'equipe de dévleoppement ou une equipe specialisée de débogage de les corriger 
		* => il est necessaire de bien communiquer entre ces equipe 
	* What ? 
		* les tests existent dans toutes les etapes de cycle de vie logiciel 
		* il peuvent etre dynamiques ou statiques 
		* il faut planifier, et budgetiser l'effot de test depuis le début du cycle de vie.
		* Objectifs : 
			* ==TROUVER DES DEFAUTS==
			* acquérir de la confiance sur le niveau de qualité 
			* fournire de l'information utile aux prises de décision 
			* prévenir des défauts 
			* evaluer les produits d'activités tels que les exigences, les user Stories, la conception et le code. 
		* Principes generaux 
			* P1 : les tests montrent la présence de défauts 
			* les tests exhaustifs sont impossibles 
			* tester tôt
			* regroupement des défauts: un petit nombre de modules contiennent generalement la majorité des défauts détéctés 
			* paradoxe du perticide : si les memes tests sont repete de nombres fois il arrivera que le meme ensemble de cas de tests ne trouvera plus de nouveau défauts 
			* les tests dependes du contexte
			* l'iullusion de l'absence d'erreurs: touver et corriger des défauts n'aide pas si le systeme concu est inutlisable et ne comble pas les besoins et les attentes des utilisateurs. 
		* Process de Test fondamental : 
			* **planficiation des tests et controle **
				* concite a definir les objectifs et les risuqeus du projet 
					* determine l'approche de test a entreprendre 
					* determine les ressources neceessaires 
					* determine les critères de sorite
				* le controle des tests est une activité continue de compairaisement de l'avancement actuel par rapport au plan, et d'information y compris les deviation par rapport au plan 
			* **analyse et conception des tests** 
				* represente les activités ou les objectifs de tests generaux sont transformés en des conditions de test et des conceptions de tests tangibles 
					* par exemple 
						* pour tester la somme de deux variable :
						* Précondition : 
							* 2 variables de types réels 
						* déroulement : 
							* je vais essayer de sommer deux valeurs réelles et voir si le résultat est correct. 
				* Taches majeures : 
					* réviser les bases du test 
						* les exigences, 
						* niveau d'integrité logiciel 
						* rapports d'analyse de risque 
						* l'arcihtecture 
						* la conception et les interfaces 
					* evaluer la testabilité des exigences et du systeme 
					* identifier et prioriser les conditions de test sur la base de l'analyse des articles de la specification, le comportement et la structure du logiciel 
					* concevoir et prioriser les tests de haut niveau 
					* identifier els données de tet necessaires pour les conditions de test et ls cas de test 
					* concevoir l'initialisation de l'environnement de test et identifier les infrastructures et outils requis 
					* concevoir l'initialisation de l'environnement de test et eidentifier les infrastructures et outils requis: 
						* certains tests sont automatisés, il faut prévoir l'environnement et les outils qui permettent cela
							* exemple:  RobotFramework + Jenkins
					* créer une traçabilité bidirectionnelle entres les bases de test et les cas de test 
			* **imlémentation et l'execution des tests** 
				* finaliser développer et prioriser le cas de test y cmpris l'identification des données de test 
				* développer et prioriser les procédures de test, créer les données de test et eventuellement préparer les harnais de test et ecrire mles scripts de tests automatiques 
				* créer des suites de test a partir des procédures de test pour une execution rentable des tests
				* evaluer la testabilité des exigences systeme 
				* identifier et prioriser les conditions de test sur la base de l'analyse des articles de test, la specification, le comportement, 
				* consigner les resukltats de l'excution des tests et enregistrer les identités et versions de tests effectués. 
			* **evaluation des critère de sortie et informer l'equipe de developpement** 
				* l'activité ou lexecution des tests est evaluée en fonction des objectifs définis. Ceci devrait etre fait pour chacun des niveaux de test
				* evaluer les criteres de sorties : 
					* verifier les registres de tests en fonction des critères de sortie specifié dans la planification des tests 
					* evaluer si des tests supllementaires sont requis 
			* **activiter de cloture des tests**
				* verifier quels livrable on eté été 
				* cloturer les rapports d'incidents ou créer des demandes déevolution pour ceux restant ouvert 
				* documenter l'acceptation du systeme 
				* finaliser et archiver les testwares, environnements de test et infrastructures de test pour une réutilisation future 
				* fournir les testwares a lo'ganisation en charge de la maintenance 
				* analyser les leçons apprises pour identifier les changements necessaires pour les versions et projets futurs 
				* utiliseer l'information colelcter pour ameliorer la maturité des tests. 
		* Facteurs qui influences le process de test : 
			* le modele de cyclce de vie du devlopmment logiciel et les methodologies projet utilisées
				* Modele en cascade different du Modele en V etc
			* les niveaux de test  et types de test prévus
				* chaque niveau de test correspond a une etape du cycle
			* les risques liées au produits et aux projets 
			* les domaines d'activité 
			* les contraintes operationnelles
				* budgets 
				* ressources 
				* délais 
				* complexité 
				* exigences contractuelles 
				* reglementations
		* Psychologie du test: 
			* un certain deegré d'indépendance est souvant plus efficace pour détecter des défauts et des défaillances 
				* un test conçu par la personne qui a ecrit le logiciel à tester
				* un test conçu par une autre personne de la meme equipe de developpement 
				* un test concu par une groupe different ( equipe de test indépendandta) dans la meme organisation 
				* un test concu par une personne / organisation teirce ( sour traitance ou certification par un oganisme externe)
			* Plusieurs manieres d'amerliorer la communication entre les testeurs et les interlocuterurs 
				* commencer par une collaboration plutto que par des conflits; rappeler a chacun l'objectif xommun de systemes de meilleure qualité 
				* communiquer les découvertes sur le produit de façon neutre et factuelle sans critiquer la personne responsable 
					* exemple : ecrire des rapports d'incident objectfs et factuels 
				* essayer de comprendre ce que ressent une autre personne etp ourquoi elle réagit comme elle le fait 
				* confirmer que l'autre personne a compris ce que l'on a dit e t vice versa. 
		* Code d'ethique : 
			* ACM/IEEE/ ISTQB : 
				* PUbLIC: les testeyurs ceritifiés  doivent agir en fonction de l'interet tpublic 
				* CLIENT ET EMPLOYEUR: les testeurs de logiciels certeifiés doivent agir pour l'interet de leur client et de leur employeur tout en respectant l'interet public 
				* PRODUIT: les testeurs de logiciels 
				* GESTION : les chefs de projet de test de logiciels certifiés et les responsables doivent respecter et prmouvoir une approche morale dans la gestion de projet d test de logiciel
				* PROFESSION: les testeurs de logiciels certifiés m
				* COLLEGUES : doivent etre loyaux aider leurs collègues et promouvoir 
				* PERSONNELLEMENT
---
[[202102270837 LN- Test Logiciel 3#Notes|up]]