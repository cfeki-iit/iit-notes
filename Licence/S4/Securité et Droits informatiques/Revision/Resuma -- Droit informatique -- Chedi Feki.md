#Resume #notes_de_cours
# Droit Informatique
* Fait par : **Chedi feki** 
* Enseignant : **Pr. Chafik Aloulou** 
* Année Academique : **2020/2021**

___

## Table des Matieres 


## Conceptes de Base 
* Sécurité Informatique
	* Ensemble de Techniques de protection des systèmes informatisés permettant de prévenir les pertes 
	* Ensemble des moyens mis on oeuvre pour minimiser la vulnérabilité d'un système contre des menaces
		* **Securité = Safety**
			* Protection de systemes informatiques contre les accidents dus à l'environnement, les defauts du système.. 
		* **Securité = Security**
			* Protection des systemes informatiques contre les actions malveillantes intentionnelles. 
	* **Prévention** 
		* prendres des mesures avant que les biens et les actifs ne soient attaqués 
	* **Détéction**
		* prendre des mesures pour detecter quand, comment et par qui un actif ou un bien a été endommagé
	* **Réaction**
		* prendre des mesures après un incident de sécurité afin de pouvoir restaurer et reduire l'impact de l'incident
	* Services de la sécurité
		* **Confidentialité des données** 
			* les données de la communication ne peuvent pas etres connues d'un tiers non autorisé
		* **Integrité des données** 
			* empeche l'altération des données 
		* **Disponibilité**
			* l'information, les systemes et les services sont disponibles a tout moment. 
	* Terminologie: 
		* **Vulnérabilité** 
			* Faille de sécurité du systeme causée par des faiblesses dans la conception, mise en oeuvre ou l'utilisation dr'un composant materiel ou logiciel du systeme 
			* plus generalement exploitation de bugs logiciel
				* les exploits sont generalement documentés et disponibles au public et sont corrigés a travers les correctifs. 
		* **Menace** 
			* Ensemble des actions de l'environnement d'un système pouvant entrainer des pertes financieres 
			* Causes 
				* Accidents : incendies, inondations ...
				* Erreurs : utilisation maladroite, mauvaise conception ... 
				* Malveillance: vol d'equipement, copies illicite de logiciels ... 
		* **Attaque** 
			* Action malveillante qui compromet la sécurité des informations
			* moyen d'exploiter une vulnérabilité
				* Un Exploit informatique est un morceau de code ou de logiciel qui identifie et utilise les faiblesses au niveau de la sécurité des systèmes et réseaux pour le bénéfice des cybercriminels
				* pour ce protéger contres le exploit, il faut mettre a jour régulièrement tous les logiciels de l'ordinateur 
			* Exemples: 
				* **Ecoute sur réseau** 
					* Sniff: ecouter le traffic sur un réseau 
					* Spoof : se faire passer pour une autre machine pour discrètement emettre des informations falsifiée, en particulier pour pouvoir mieux sniffer. 
				* **Accés non autorisé** 
				* **Déni de Service** 
				* **Vol de Données** 
				* **Malware**
				* **Spam**
		* **Contre-Mesures**
			* Résoudre une vulnérabilité 
			* Contrer une attaque specifique
		* **Politique de sécurité** 
			* Procédure internes 
			* Mecanismes de protéction
				* Antivirus, pare feu , pro systems etc 
			* Outils de surveillance
				* Audit de sécurité 
				* historique de detection des intrusions
		* **Piratage** 
			* Pirate:
				Personne commettant des actes illégaux liés à l'informatique 
				* White Hats:
					* Consultants, cyber-policiers...
					* se servent de leurs compétences pour avertir l'organisme concerné des problèmes de sécurité 
				* Black Hats: 
					* créateurs de virus, Cyber-espions ... 
					* ont une préférence pour les actions illégales
				* Grey Hats:
					* hackers...
					* agissent parfois éthiquement, parfois non.   
## Cyber-Attaques
* Attaques Passives : 
	* collecte/ Utilisateion des informations relatives au système, sans affecter son état 
		* **Interception**
			* interpreter les données et extraire l'information a partir d'un trafic echangé 
		* **Analyse de Trafic**
			* extraction des informations en obsérvant
				* l'identité des communicants 
				* la fréquence et la longeur des messages echangés 
				* ... 
			* effective meme en présence de mecanismes de cryptage
	* Difficiles a detecter car aucun changement sur les systèmes
* Attaques Actives: 
	* introduire des modifications sur les ressources du système ou affecter leur fonctionnement normal 
		* **Mascarade**
			* se faire passer pour quelqu'un d'autre pour obtenir des privilèges supplémentaires. 
			* fait appel a d'autres techniques d'attaques actives 
		* **Rejeu**
			* capture passive des données et leur transimission pour les utiliser plus tard
		* **Modification**
			* Altération, destruction, reclassement d'une partie des messages echangés en vue de produire un effet non autorisé
		* **Déni de Service**
			* Inhiber l'utilisation normale des moyens de communication
			* surcharge serveur 
* Buts : 
	* Interruption 
		* vise la disponibilité des informations
	* Interception 
		* vise la confidentialité des informations
	* Modification 
		* vise l'intégrité des informations
	* Fabrication
		* vise l'authenticité des informations 
* Methodologies:
	* Collecte d'informations 
	* Repérage de failles 
	* Intrusion dans le systeme 
	* Exploitation 
* Attaques Répandues: 
	* **Malwares** 
		* Malicious software 
		* tout programme malvveillant présent sur un ordinateur ou appareil mobile
		* Souvent installés a l'insu des utilisateurs 
		* effets indésirables: 
			* Paralysie des performances informatiques 
			* Exploitation de données personnelles 
			* suppression de données 
			* dysfonctionnement du materiel physique. 
		* Types de Malwares 
			* **virus**
				* Objectif : Réplication 
				* Caractéristiques 
					* a besoin d'un hote executable pour fonctionner 
					* se répand automatiquement
			* **Ver**
				* Objectif : Propagation 
				* Caractéristiques : 
					* léger
					* il peut rapidement saturer le réseau
			* **Cheval de Troie**
				* Objectif:  S'infiltrer et effectuer des actions malveillantes
				* Caractéristiques 
					* se cache dans des logiciels bénins téléchargés sur internet
			* **Backdoor**
				* Objectif: Controler une machine a distance
			* **Rootkit**
				* Objectif: se cacher
				* Caractéristiques: 
					* désactive les utilitaires de sécurité
			* **SpyWare**
				* Objectif : Vol de données 
				* Caractéristiques: 
					* se cache dans des logiciels bénins telechargés sur internet 
					* il s'execute discrètement en arrière plan
			* **AdWare**
				* Objectif: collecte de données pour des raisons publicitaires
				* Caractéristiques 
					* souvent installé sous forme de freeware, ou de plugin du navigateur 
			* **RansomWare**
				* Objectif : Demander une Rançon
				* Caractéristiques: 
					* Crype les données et empeche l'utilisation partielle ou totale de l'ordinateur et demande de l'argent pour fournir la clé
					* Affichent des message d'avertissement demandant de l'argent pour remettre l'appareil en état de fonctionnement normal
			* **Bots** et Botnets 
				* programmes conçus pour executer automatiquement de nombreuses operations répétitives
				* Démarche 
					1. Intrusion et prise de controle d'une/plusieurs machine via Virus ou Cheval de troie.
					2. prendre la main sur les machines contaminées ( Machines zombies) qui deviennent au service du pirate
					3. une personne malveillante loue un service auprès du pirate
					4. le pirate ordonne les machines zombies pour envoyer des courrier en masse, ou tenter d'acceder des millions de fois a un site web (DDoS)
				* SPAM 
				* DDoS
				* Brute Forcing 
				* Crypto-Mining
			* **Keylogger**
				* Objectif : enregistrer les frappes au clavier 
	* **Remote Code Execution (RCE)** 
		* l'attaquant exploite une vulnérabilité dans le systeme et introduit un logiciel malveillant qui éxecutera des codes malveillants a distance.
		* cela revient a confier le controle de l'ensemble du pc a une autre personne disposant de tous les privilèges d'un administrateur
		* ex: 
			* Coss site scripting ( XSS )
			* injection SQL 
			* Inclusion de fichier 
	* **Phishing** 
		* Un courrier electronique don't l'expediteur se fait generalement passer pou un organisme financier et demandant au destinataire de fournir des informations confidentielles 
		* 3 types: 
			* **Phishing traditionnel** 
				* Email impersonnel envoyé a grande echelle, souvent Urgent et menaçant 
				* continet des hyperliens 
			* **Spear phishing**
				* Email personnel et envoyé a un groupe restreint 
				* invitant et personnalisé 
				* continet des hyperliens
				* emploie souvent le social engineering pour rassembler un maximum d'informations sur la cible.  
			* **Trojan Downloaders**
				* pièce jointe cachan un trojan 
	* **Social Engineering**
		* recourir à une conaissance en  psychologie et la tromperie pour tenter d'accéder aux données personnelles 
		* le pirate va contacter une entreprise en se faisant passer pour une personne specifique et en demandant des données sur le compte de la victime. Si l'entreprise lui delivre ces données, il les exploiera pour accéder aux comptes et données de la personne 
## Protection des Données 
### Cryptage / Chiffrement
* Cryptographie 
	* Science permettant de préserver la confidentialité des messages 
	* **Chiffrement** : 
		* transformer un texte en clair en un texte indéchiffrable sous le controle d'une clé et / ou une fonction de transformation 
		* Ex 
			* **le chiffre de césar** : Substitution mono-alphabetique en décalant les lettres n-pas
			* **Substitution mono-alphabetique** : remplacer chaque lettre de l'alphabet par un signe donnée qui peut etre une autre lettre
			* **Carré de Polybe**: 
				* ![[Pasted image 20210614155613.png]]
				* chaque lettre est ensuite remplacé par deux chiffres (ligne - colonne)
			* **Chiffre de Vigenère** : substitution Plyalphabétique 
				* substituer une lettre par une autre choisie en fonction d'un état du cryptosysteme (position dans une clé)
		* **Chiffrement Symétrique**
			* une seule clé secrète
			* traitement relativement rapide
			* problème d'echange et de gestion des clés 
			* Chiffrement par bloc 
				* Chiffrer un certain nombre d'octets ( bloc ) par le biais de la même clé
					* Ex: 
						* AES 
						* BlowFish
			* Chiffrement de flux
				* chiffrer chaque caractère du texte en clair en une seule fois par le biais d'un flux de clés pseudo-aléatoires
				* une clé differente est utilisée pour chaque bit 
					* Ex: 
						* RC4
						* Salsa20
		* **Chiffrement Asymétriques**
			* Deux clés :
				* Clé publique
					* peut etre distribuée a un large public 
				* Clé privée 
					* reste en possession du propriétaire de la paire de clés
			* Les messages chiffrés avec la clé publique ne peuvet etre déchiffrés que par la clé privée
				* ex: 
					* Diffie-Hellman-Merkle 
					* RSA
					* Elliptic Curve Cryptography
			* Traitement relativement lent
		* **Chiffrement Hybride**
			* fait appel au chiffrement symetrique et asymetrique a la fois 
			* combiner les avantages 
				* Confidentialité du cryptage asymetrique pour l'echange de clé
				* Rapidité du cryptage symétrique pour la communication
			* Ex: 
				* TLS 
				* SSL 
				* la majorité des ransomwares utilisent ceci
	* **déchiffrement**: 
		* l'Operation invese du chiffrement 
		* déchiffrer un cryptogramme et le transformer en un texte clair en utilisation une fonction de transformation et/ou la clé de décryptage 
* Cryptanalyse 
	* l'art de décrypter des messages chiffrés
	* ensemble de techniques pour déduire un texte en clair d'un texte chiffré sans posséder la clé de chiffrement
### Signature
* Signature Numerique 
	* Mecanisme  permettant de garantir : 
		* integrité du document electronique 
		* Authentifier l'auteur par analogie a la signature manuscrite. 
	* N'est pas visuelle, corréspond a une suite unique de caractère
	* Propriétés : 
		* Identification : connaitre qui a apposé sa signature 
		* Integrité : garantir que le document n'a pas été altéré
## Protection niveau Réseau 
* Fire-Wall
	* Programme ou materiel charger de protéger du monde externe en controlant tout ce qui pasese, et surtout tout ce qui ne doit pas passer entre internet et le réseau local. 
	* **Controle** 
		* Gerer les connexion entrante/sortantes à partir d'un LAN
	* **Sécurité** 
		* Protéger le réseau interner des intrusions venant de l'exterieur 
	* **Vigilance**
		* surveriller/tracer le traffic entre le réseau local et internet 
## Reglementation de la Protection des données 
### IPNDP et loi de 2004
### RGDP 