---
tags: "Notes"
---

* Course: [[Developpement d'applications Réparties]]
* Date: 16-09-2021 


# Introduction au systemes repartis 
* Systeme
	* Neumann : un ensemble de materiels et logicielas poeratn en vue de'un objectif precis, generalement l'execution cohérent d'une ou plusieurs applications et sa mise a la disposition de plusieurs utilisateurs finaus 
* Application 
	* ensemble d'entités logicielle qui permet a un ordinateur dou a un susteme informatuique d'assurer une tache ou une fonction particulièree
	* capacité de traitement importantes mais besoin toujours plus important en puissance de calcul en espa e de données et en partage e l'informations
* Répartition 
	* est un état de fait pour un nombre important d'application 
		* developpement des réseaux (Internet réseaux sans fils etc 0
		* integratin des applications existantes initialement séparées 
		* penetration de l'informatique dans de nouveau domaines d'applications etc 
* Système réparti : 
	* ensemble de machine autonomes connectées par un réseau et equipée d'un logiciel dedia a la coordination des activités du systeme ainsi qu'au partage de ses ressources 
	* accès commun aux ressources ( calcul stockage )
	* partage d'information ( travail cooperatif  / algorithmes répartis )
	* Categories 
		* Multi processeurs a memoire partagées 
			* plusieurs processeurs homogeme 
			* un seul OS 
			* + communication rapide et fibale , faible latence 
			*  - Cout elevéet peu versatile 
		*  Multi ordinateurs a memoire répartie 
			*  plusieurs processeurs homogènes ou heterogènes 
			*  plusieurs systèmes d'exploitation 
			*  + cout minimal 
			*  - communicattion lente et non fiable, latence élevéée et variable
		*  
* Répartition = distribution ? 
	* Distribué : fabricants d'ordinateurs 
	* Réparti : genie logiciel 
* Application repartie : 
	* une application découpée en plusieurs unités composantsconnectées via un réseau ou 
		* chaque unité ou ensemble de 
	*	Problematiques : 
		*	Performance : 
			*	Disponibilité 
			*	temps de réponsse 
		*	Tolérance au pannes 
			*	Mateirel 
			*	logiciel 
			*	systeme de communication 
		*	Securité 
			*	Confidentialité 
			*	integrité 
			*	controlee d'accès 
		*	Extensibilité 
			*	elements 
			*	utilisateurs 
			*	géographique
	* Comment assurer le QoS ( quality of Service )
* Phases de construction d'une AR : 
	* 1 conception de l'architecture 
	* programmation des composants 
	* configuration des entitées pour qu'elle puissent communiquer et echanger des donner 
* Programmation des applications réparties
	* Intergicielle (Middleware ) 
		* gerer la repartition 
		* heterogénéité materielle logicielle (haut niveau )
		* complexité des mecanisems ( bas niveau ) 
		* => est une couche intermiediaire entre le systeme d'exploitation et l'application 
		* Types 
			* Remote procedure RALL ( RPC // JMI )
			* MESSAGE oriented middleware
		* Avantage 
			* Utilisation  simple 
			* multi plateforme 
			* interoperable 
			* evolutif 
		* Inconvénients 
			* mauvaises performances 
			* fonctionnalités limitées 

---
[[Introduction au systemes repartis#Notes|up]]