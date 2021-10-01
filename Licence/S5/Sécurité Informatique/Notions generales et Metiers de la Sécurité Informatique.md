
---
tags: "Notes"
---

* Course: [[Sécurité Informatique]]
* Date: 01-10-2021 


# Notions generales et Metiers de la Sécurité Informatique
* Sécurité :
	* protection de ssystemes de l'information et des services contre les menaces 
* Metiers de la sécurité
	* Auditeur 
	* Responsable du plan de continuité d'activité 
		* rend compte à la Direction Generale
		* Collabore avec tous les départements de l'enreprise
		* Si au sein du Département IT => sous supervision du DSI 
		* ou à la tête d'un Département Business Continuity 
* Risque:
	* un exposition a un danger (un Evenement dommageable) inhérent a une situation ou une activité
	* le risque est inhérent à l'activité ( impossible a eliminer ).que fair?
		* Réduction 
		* transfert 
		* acceptation 
		* arrêt d'activité
* Quels documents meritent une protection ? 
	* il vaut mieux chercher a securiser une zone restreinte mais de maniere optimale plutot que de chercher a tout securisé
	* **Diffusion controlée** = Importance Faible 
		* leur diffusion n'entrainera qu'une perturbation faible pour l'entreprise 
	* **Confidentiel** = Importance non disctuable 
		* leur diffusion entraine des séquelles
	* **Secret** = importance centrale et irréprochable
		* leur diffusion entrainera des séquelles graves et durables 
* Terminologie
	* Menace 
		* personne ou entité de l'environnement qui met aun atout a risque 
	* Atout
		* objet ayant de la valeur 
	* Contre-mesure
		* Objet ou process qui prévient une menace sur un atout 
		* actions mises en oeuvre pour prévenir la menace, une fois qu'elle est mesurée => passage necessaire par une prise de conscience
		* procedures ou techniques pour résoudre une vulnerabilité 
		* ou contrer une attaque specifique 
		* Compromis efficacité/Cout des contremesures 
		* 
	* Vulnérabilité 
		* Faille qui offre l'opportunité d'atteindre un atout
		* une architecture défaillante
		* faille de sécurité du systeme causée par des faiblesses dans la conception la mise en oeuvre ou l'utilisatio d'un composant materiel ou logiciel du systeme mais il s'agit generalement de lexploitation de buss logiciels 
		* ces dysfonctionnements logiciels sont en general corrigés a travers les correctifs fourni par les editeurs de logiciels 
		* l'exploitation d'une faille d'un logiciel peut etre publiquement document&e et utilisable sous la forme dd'un petit logiciel appelé exploit 
		* 
	* Impact : 
		* perte ou dommage a un atout 
	* Scénario 
		* Exploitation d'une vulnerabilité par une menace pour causer un impact 
	* Attaques 
		* n'importe quelle action qui pcompromet a securité de l'infromation 
		* appelée aussi un exploit 
		* un exploit informatique est un morceau de code ou de logiciel qui identifie et utilise les faiblesses au niveau de la securité des sytemes et réseaux pour le benfices de cybercriminels 
		* generalement associés avec d'autres logiciels et dissimiés dans des kits 
		* pour ce proteger contre les kits d'exploit et les maliciels qu'ils envoient, il faut mettre régulièrement tous les leogiciels de l'ordinateur a jour 
		* 
	* => Le risque encouru par un systeme st lié de manieere etroite a la menace et la vulnerabilité qui le touchent mais egalement aux contre mesures mises en oeuvre 
* La menace en sécurité informatique
	* pannes et erreurs non intentionnelles
		* Pannes / dysfoncitonnements 
			* du materiel 
			* du logiciel de base 
		* Erreurs d'exploitation ( oubli de sauvegarde, ecrasement de fichiers)
		* erreur de manipulation des info 
		* erreurs de conception des applications
	* Ebios classifie 6 grands types d'entités menacés 
		* Logiciels 
		* materiel 
		* réseau 
		* sites 
		* organisations 
		* personnels 
	* Menaces intentionnelles
		* ensembled'actiones malveillantes 
		* constituent la plus grosse partie du risque 
		* objet principal des mesures de protection
		* action dont le declanchement peut porter atteinte a une compostnate de securité 
		* nee peut s'executer toute seule il lui faut un reactif : vulnerabilité. 
			* Menaces Passives 
				* ecoute indiscretion capture de contenu de msg analyse de traffic etc 
				* generalement difficiles a detecter 
			* Menaces Actives 
				* mascarade
					* usurpation d'identité / privilèges 
				* modification 
					* msg légitimes altérés, retardés ou réorganisés 
				* rejeu 
					* capture passiv"e de données et retransmission ulterieru en vue de produire un effet non autorisé 
				* déni de service 
					* empecher l'utilisation normale mettre hors service degrader les performances 
				* difficiles a prévenir mais detectable
	* Qui sont les ennemeis ? 
		* Agresseurs 
			* hacker 
				* individu curieux qui cherche a se faire plaisir 
				* Pirate par jeux ou par défi 
				* possède souvent un code d'honneur et de conduite
				* ne nuit pas intentionnellement 
			* Cracker 
				* cherche a nuir et montrere qu'il est le plus for 
				* il peut causer de nombreux dégats en cherchat a se venger d'une société ou d'individus qui l'a rejeté ou qu'il deteste 
				* veut prouver sa superuiruté et fait partie des clubs ou il peut echanger des informations avec ses semblables 
		* Fraudeurs 
			* personne qui cherche a gagner de l'argent,
			* en general il a besoin d'un complice chez la vitime (volentaire ou non)
			* peut attaquer une banque 
			* falsifier des cartes de crédit  ou se placer sur des réseaux de transferts de fonds et , si c'est un particulier il peut vouloir falsifier sa facture d'electricité ou de telephone
		* Employés malveillants 
			* fraudeur interne
			* possedent de bonnes compétences sur le plan technique il est souvent informaticien et sans antécédents judiciaires
			* il peut penses que ses qualités ne sont pas reconnues et qu'il n'sest pas apprécié a sa juste valeur,. il veut se venger de son employeur et chercher a lui nuire en lui faisant perdre de l'arget
			* il peut répondre a un besoin materiel personnel qui induit des conduites de dépendances (sex drugs .. ) our parvenir a ses fin il possèdes les moyens qu'il connait parfaitement et qui ont été mis a sa disposition par son entreprise 
		* militants 
			* motivé par une idéologie ou une religion 
			* dispose de compétences techniques variables 
			* objectifs limités a la diffusion massive de messages et peuvent s'etendre à des nuisances effectives sur des systèmes
		* espions 
			* participent a la guerre economique
			* travaillent pour un etat ou un concurrent 
			* patients motivés 
			* savent garder le secret de leur reussite pour ne pas eveiller les soup_ons etcontinuer ler travail dans l'ombre 
			* ils agissent souvent depuis l'interieru de l'organisme soit en ayat trouvé un moyen d'yn pnenetrer soit en soudoyant une personna ayant accès aux biens ils ont pour but de voler des informations de de detruire des données strategiques pour l'oriiganisme
			* dans tous les cas les espions ont un excellent niveau de maitrise de soi ainsi qu'une grande capacité d'adaptation aux envrionnements 
		* terroristes
			* cyber-terroristes 
			* veulent faire parler deux 
			* les actions se veulent spectaculaires, influentes voir meurtrières
	* Quels sont leur motifs ? 
		* les motifs de 	
	* Quels sont leur outils 
		* Attaque standard 
			* un ou des ordinateurs modestes + connexion internet 
			* puisera sa connnaissance dans la documentation technique et la littérature ouverte 
			* il se procurera les logiciels necessaires à l'accomplissement de ses mefaits sur des serveurs publics ou les développera lui meme 
		* Espionnage et terrorisme 
			* fiat d'organisment gouvernementaux et para gouvernementaux structurés et organisés pour la recherche du renseignement et disposant de moyens financiers et techniques très importants leur permettant d'envisager tous les types d'attaque su







---
[[Notions generales et Metiers de la Sécurité Informatique#Notes|up]]