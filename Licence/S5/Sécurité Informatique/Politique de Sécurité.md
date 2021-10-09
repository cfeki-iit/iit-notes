---
tags: "Notes"
---

* Course: [[Securité informatique]]
* Date: 08-10-2021 


# Politique de Sécurité
* Politique de securité de l'information 
	* decrit les principes sur lesquels se fonde l'organisme pour proteger la confidentialité l'integrité et la disponibilité de ses données, pour classer et traiter les informations confidentielles et pour faire face aux violations de la présente politique
	* Objectif 
		* Proteger le SI contre les menaces identifiées par l'analyse de risques 
		* definir les objectifs de securité:
			* confidentialité 
			* integrité
			* disponibilité 
		* definir l'etat du systeme ou ces propriété 
	* Categories 
		* politique de securité interne 
			* touche l'aspet organisationnel  / procédures sur la : 
				* repartition des taches et responsabilités entreutilisateurs 
				* limitation du cumul de pouvoir 
				* separation de pouvoir dans une organisation
				* Fiche de postes
		* politique de scurité technique
			* aspect materiels et logiciels / procédures sur 
				* les pannes / maintenances 
				* le Vol / Guerilla 
				* Catastrophe naturelles / incendies 
		* Politique de securité Systeme 
			* emseble de lois, reglements, et pratiques qui regissent la façon de 
				* gerer 
				* proteger 
				* diffuser 
			* les informations et autres données sensisbles
			* s'appuie sur : 
				* politique d'identification
					* identifier de maniere unique chaque utilisateur 
				* politique d'authentification 
					* permet à l'utilisateur de prouver son identité
				* politique d'autorisation
					* determine les operations legitimes qu'un utilisateur peut réaliser
	* Une politique de securité doit être bien definie 
		* cohérente
		*  complète
	* une politique de securité doit etre mise en application 
		* sensibilisation 
		* simplicité ( definition et implantation )
	* Methodes 
		* MARION
			* Methodologie d'analyse de risques informatiques, orientée par niveau  
		* MEHARI
			* Methodologie Harmonisée d'analyse de risques 
		* EBIOS
			* Expression des Besoins et Identification des Objectifs de Sécurité
	* Etapes de réalisation 
		* Etude de contexte 
		* Redaction de la politique 
		* Validation , approbation et communication 
		* evaluation et revision 
	* Mise en oeuvre d'une politique de sécurité 
		* choix des mecanismes les plus simples possibles permettant de prtéger les ressources, de maniere la plus efficace avec un cout acceptable
		* Systeme d'authentification ( biometrie, serveur d'authentification )
		* Chiffrement ( PKI, IPSEC, mecanismes integrés a des protocoles de communication)
		* pare feux (firewall)
		* systeme anti-virus
		* outil de detection de failles de sécurité
		* systeme de détection d'intrusions 
		* systeme d'exploitation securisé
	* Validation d'une politique de securité
		* Audit de securité par un tiers de confiance qui 
			* valide les moyens de protection mis en oeuvre par rapport à la politique de securité 
			* verifie que 
				* chaque regle de securité est correctement appliquée
				* l'ensemble des dispositions forme un tout cohérent et sûr 
		*  Test d'une politique de securité 
			*  le test se fait avec l'accord de la hierarchie 
				*  le propriétaire du systeme doit donner une autorisation 
				*  degats possibles sur le systeme
			*  Permet de sensibiliser le personnel 
			*  ne permet pas de garantir la securité du système 
			*  Test D'intrusion 
				*  eprouver les moyen de protection d'un SI en essayant de s'introduire dans le systeme en situation réelle 
				*  Black Box 
					*  s'introduire dans le systeme sans aucune conaissance préalable de celui-ci ( situation réelle )
				*  White Box 
					*  S'introduire dans le systeme en ayant connaissance l'ensemble du systeme (éprouvere au maximum le systeme)
	*  que faire après des incidents ? => Plan de continuité de l'activité 
		*  definir les responsabilités (à l'avance)
		*  constitution de preuves sur l'attaque ( en cas d'enquete judiciaire)
		*  datation de l'intrusion ( degré de compormission de la machine)
		*  confinement de la compromission (eviter la propagation)
		*  sauvegarde(comparaison des données du systeme avec la sauvegarde)
		*  mise en place d'un plan de repli ( continuité de service)
		*  politique de Sauvgarde
			*  definition des parties du SI a sauvegarder 
			*  disponibilité des sauvegardes 
			*  politique des supports de sauvegarde
				*  en local ? distant ? 
				*  armoires anti-feu pour garder les disques de sauvegarde
			*  organisation de sauvegardes
			*  replication sur un site distant 
			*  outil de simulation 
*  Formalisation de la politique de securité 
	*  Reglement de rsécurité a pour objectif de definir les actions que les agents ont 
	*  Exemple de regles : 
		*  R1 tout agent jouant le role d'utilisateur etst autorisé a lire
* Objectif de la politique de securité : 
	* Apporter a la securité de l'information une orientation et un soutien de la part de la direction conformément aux exigences metier et aux lois et reglements en vigueur 
* Contenu du document 
	* Definition de la securité informatique, objectifs et domaine d'application, importance de la sécurité en tant que mecanissme necessaire pour partage d'information 
	* intentions de la direction vis a vis de la securité de l'information, en conformité avec la strategie et l'objectif de l'organisme 
	* demarche de definition des objectifs de securité et des mesures integrant l'appréciation et le management de risque 
	* une brève explication des politiques, principes normes et exigences en matiere de conformité qui présentent une importance particulière pour l'organisme 
		* conformité avec les exigences legales, reglementaires et contractuelles 
		* les exigences en terme de formation et de sensibilisation en matiere de securité
		* la gestion de la continuité de l'activité
		* les conséquences des violations de la securité informatique 
	* une definition des responsabilités generales et specifiques dans le domaine de la gestion de la sécurité de l'information traitant en particuler de la remontée d'incidents de securité 
	* des références à la documentation susceptible d'appuyer la politique et devant etre respectée parexemple pdes politique et des procédures de sécurité plus détaillées ou des règles de securité devant etre respectées par les usager
* Bonnes Pratiques : 
	* designer un responsable de la politique de securité de l'information
		* mission : 
			* Développer
			* réexaminer 
			* Evaluer 
	* la ré-examination de la politique de sécurité de l'information tienne compte des revues de gestion qui contiennent : 
		* un retour des parties interessées 
		* les resultats de srevues indépendantes
		* l'etat des actions préventives et correctives 
		* les resultats des précédettes revues de gestion 
		*  la conformité avec les exigences de perfomance du processus et la politique de securité de l'information 
		*  les approches pouvant avoir un incidence sur l'approche de l'ofganisme en matiere de gestion de securité de l'information, par exemple les changements dans l'environnement organisationnel, les circonstances proresà l'activité, la disponibilité des ressources, lesconditions contractuelles, reglementaires et legaldes de l'envrironnement technique 
		*  les tendances relatives aux menaces de la vulnerabilité 
		*  les incidents de securité remontés 
		*  les recommendations emanant des autorité compétentes
		*  aelioration de l'approche de l'oranisme en matiere de gestion de la securité des processus supports 
		*  l'amlioration des objectids de securité et des mesures 
		*  l'amelioration de l'affectation des ressources et ou des responsabilités 
		*  




---
[[Politique de Sécurité#Notes|up]]