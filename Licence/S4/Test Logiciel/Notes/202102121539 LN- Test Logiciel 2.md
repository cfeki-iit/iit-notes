---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: Source/lecture_Note/raw
aliases: ["202102121539 LN- Test Logiciel 2", "LNTL2"] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:
* Date: 2021-02-12
* Given By: [[@Walid Dhouib]]


# Notes 
* [[Bugs Informatiques]]
	* **Error / erreur** : 
		* faute insérée par un humain 
		* une action humaine qui produit un résultat incorrect (ISO 24765)
	* **Défaut / defect**: 
		* faute non detectée 
		* un probleme q, s'il n'est pas corrigé pourrait entrainer l'echec du'ne application ou produir des résultat sincorrects (iso24765)
		* une imperfection ou une deficience dans un logiciel ou un composant du systeme qui peut empecher le composant de remplir sa fonction par ex une definition de données ou une instruction de code source incorrecte, une défaut s'il est executé pour entrainer la défaillance d'un logiciel ou d'un composant systeme(ISTQB201)
	* **défaillance / failure** :
		* défaut d'exécution
		* la fin de la capacité d'un produi a executé une focntion require ou son incapacité a fonctionner dans les limites précédemment specifiés  (ISO 25010)
		* ecar constaté du composant ou systeme par rapport au livrable au service ou résultat attendu (ISTQB201)
	* **Incident** 
		* tout evenement arrivant pendans les tests qui requiert une cérification 
		* divergence entre le résultat obtenu et le résultat attendu lors d'une execution d'un test. 
	* => il est moins coutuer de crriger les erreurs avant la phase operationnelle
* [[Qualité Logicielle]]
	* les erreurs peuvent survenir a tout moment du cycle de developpement d'un logiciel 
	* les défauts doivent etre identifiés et corrigés avant qu'ils ne deviennet des defaillances
	* [[Sources D'erreurs Logiciels]]
		* Beizer(1990)
			* 25% Structurels 
			* 22% données
			* 16% fonctionalités implémentées
			* 10% codage/construction
			* 9% d'integration
			* 8% des exigence/specification
	* [[Categories D'erreurs Logiciels]]
		* PRobleme de definition des exigences
			* soit on n'a pas compris le client
			* soit le beosoin n'a pas été clairement specifié 
			* soit manque de documentation du besoin
			* identifier les parties prenantes cad les acteurs clé qui doivent participer 
		* Maintenir une communication effic	ace entre le clientet le developpeur
			* unifier les langages entre cleint et développeur 
			* utilisation du meme vocabulaire est necessaire pour une comuunication efficace
			* Ecrats par rapport aux specifications
			* erreurs d'architecture et de conception 
			* erreurs de codage (y compris le code de test)
			* non-respect des processus/ procédure en vigeurer
			* examens et tests inadéquats
			* Erreurs de documentation
			* Pour minimiser 
				* prendre des notes a chaque réunion et distribuer le comprte rendu (pv) a tout l'equipe du projet 
				* revoir les docuyments produits 
				* etre cohérent a vec votre utilisation des termes et devlopper in glossairs des termes a partager avec les toutes paarties prenantes 
				* informer ces clients du cot de moficiation des specifications 
				* choisissez une approche de développement qui permet d'accepter les changement en cours de route 
				* numeroter chaque exigence et mettre en place un processus de gestion des changements; 
	* Determination des Exigences logicielles q
		* exigences: 
			* Fonctionnels : 
				* ce qui doit etre executé
			* Contraintes 
				* les obligation
			* Non fonctionne
				* exigences de qualité et de performance
		* conaissance du domaine et règles métier
		* envrionnement organisationnel et operationnel 
		* observations, histoires utilisateus et scenarios 
		* classification et documentation des exigences 
		* entretiens, brainstorming et reunion 
	* Qualité : 
		* aptitude d'un ensemble de carctéristiques (physiques, sensorielles, comportementales, temporelles, ergonomiques, temporelles ... ) intrinsèque d'un objet(poduit, service, processus, systeme, organisme, logiciel...) a satisfaire des exigences (ISO 9000 2015)
	* Exigence
		* beoin ou attente formulé généralement implicite ou obligatoire
	* Qualité logiclle: 
	* confomité aux exigences logicielles etablies:
		* la capacité dun logiciel a satisfaire les 
	* [[International Standardization Organisation|ISO]]
		* federation mondiale d'organismes nationaux de normalisation ayant pour but de contribuer au développement de la normalisation et produire les normes internationales dans les domaines industirels et commerciaux appelées normes ISO afin de simplifier les échanges de produits et ou de service entre pays 
		* L'iso n'a pas de pouvoir réglementaire ou législatif. 
		* [[Normes ISO250xx]]
			* relative aux exigences de qualité et evaluation des logiciels SQuaRE
			* appelé aussi devisions
				* Quality Model [[ISO/IEC 25010:2011]]
					* modele qualité de fonctionnement composé de cinq caractéristiques dont certains suont subdijisiées en sous caractéristiques qui se rapportent au résultat de linteratioction losqu'un produit est utilisé dans un context d'utilisation particuler 
					* un modele de qualité de produit composé de huit caractéristiques qui sont subdivisés qui se rapportent au propriétés statiques du logiciels aux propriété dynamiques du systeme informatique 
					* Logiciel Qualité en cours d'utilisation : 
						* Efficace 
						* efficience
						* satisfaction 
							* utile 
							* ocnfiance 
							* plaisir 
							* confort
						* absence de risques
							* risques economiques 
							* risques liés a la santé et al la sécurité 
							* réduction des risques environnementaux
						* couverture contextuel
							* complétude du contextuel 
							* flexibilité
					* Logiciel Qualité du produit: 
						* La capcité fonctionelle
							* complétude fonctionnelle 
								* l'ensemble des fonction couvrent toutes les taches cspecifiée et les objectifs de l'utilisateur
							* exactitude fontionnelle
								* le produit ou systeme met a disponibilité les résultats corrects avec un degré de precision necessaire
							* pertinance fonctionnelle
								* les fonctions facilitent l'accomplissement de taches et d'objectifs précis.
						* les perfomances 
							* utilisation des ressources 
								*  les quantités et types de ressources utilisés par un produit ou un systeme dans l'exercice de ses fonctions. 
							* comportement temporel 
								* les temps de réponse 
								* les temps de traitement 
								* debit d'un produit ou du'n systeme
							* capacité. 
								* limites maximales d'un produit ou d'un parametre du systeme 
						* la compatibilité
							* coexistance
								* produit execute ses fonctions de maniere efficace tout en partageant un envrionnement et des ressources en comuns avec d'autres produits sans impact negatif sur tout autre produit 
							* interoperabilité
								* deux ou plusieurs systemes, produits, ou  composants peuvent evahnger des informations et utiliser les informations échangées.
						* l'utilisabilité
							* aptitude à la reconaissance 
								* l'utilisateur peut reconnaitre qu'n produit ou un systeme est adapté à leurs besoins
							* facilité d'apprentissage
								* compréhensible de maniere intuitive par un utilisateur d'un niveau d'expertise précisé. 
							* protection contre les erreurs de l'utilisation 
							* esthetique de l'interface utilisateur
							* accessibilité. 
						* Robustesse 
							* maturité 
							* tolerance au pannes
							* disponibilité 
							* la récupérabilité
						* sécurité 
							* confidentialité
							* integrité
							* non-répudiation
							* la responsabilité
							* authenticité
						* maintenabilité 
							* modularité
							* réutilisabilité
							* analysibilité
							* possibilité de modification 
							* testabilité
						* portabilité
							* l'adaptabilité
							* facilité d'installation 
							* remplaçabilité
							*  
		* [[Norme ISO29911]]
		 
	* [[International Eletrotechnical Comission|IEC]]
		* organisation international de normalisation chargée des domaines de l'electricité de l'electronique de la compatibilité electromagéntique de la nanotechnologie et des techniques 
	* [[Institute of Electrical and Electronics Engineers|IEEE]]
		* constituée d'ingénieurs electriciens, d'informaticiens de professionels 







---
[[202102121539 LN- Test Logiciel 2#Notes|up]]