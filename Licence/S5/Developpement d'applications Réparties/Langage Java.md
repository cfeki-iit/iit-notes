---
tags: "Notes"
---

* Course:[[Developpement d'applications Réparties]]
* Date: 23-09-2021 


# Langage Java
* Omniprésence de java dans le monde répartis grand public ( mobile ) industriel (serveurs d'entreprise)
* historiquement : Applications réparties = CORBA (Common Object Request Broker Architecture) développées en c++ par OMG
* Avantage de Java pour les Systèmes Répartis
	* facilité de communication entre machines 
	* gestion automatique et protection de memoire ( garbage collector)
	* simplicité de la syntaxe 
	* environnements de développements ide evolués : netbeans etc 
* **Programmation orientée Objet** 
	*  Avantages: 
		* modularité 
			* le code source d'un objet peut etre développé et maintenu independamment du code source des autres types d'objets, 
			* une fois crée un objet peut etre véhiculé aisément au sein d'une application 
		* Masquage de l'information 
			* graçe a l'encapsulation pas besoin de connaitre les details d'implementation 
		* Réutilisabilité du code 
		* Pluggabilité et facilité pour Débugger 
			* correction de bugs dynamique durant la phase de debuggage 
	* **Objet** 
		* Etats = champs (fields)  / variables 
		* Comportement = methodes / fonctions 
	* **Encapsulation** 
		* le développeur cache l'etat de ses objets et oblige l'utilisateur à interagir avec l'oobjet uniquement visa ses methodes publiques
	* **Classe**
		* plan ou frabrique d'objets 
		* **Variables**
			* Nommage: 
				* le nom des variables est case-sensitive 
				* il est conseillé de commencer par une lettre en miniscule et eviter l'usage de $ et _ 
				* espaces blancs interdits 
				* il est conseillé et de bon sens d'utiliser les noms complets sans abbreviation et decommencer le nom de la variable par une minuscule
				* use camel naming convention
			* Variables Locales 
				* permet de preserver l'etat d'une methode d'effectuer des calculs 
				* syntawxe de declaration similaire aux variables d'instances
				* une variable d'instance est accessible uniquement au sein de la methode qui la sdeclare pas dans le reste de la classe 
			* Types primitifs 
				* Java est fortement typé 
				* byte : 8bit, signé
				* short: 16bit, signé
				* int : 32bit, signé
				* long: 
				* float:
				* double: 
				* boolean: 
				* char:
		* **Paramètres**
	* **Heritage**
		* l'OOP permet a certains classes ( nommée classes filles ) d'heriter des états et comportements usuels d'autres classes (nommées classes mères)
		* en Java : une classe fille ne peut etre liée qu'à une seule et unique classe mere directe; une classe mère a une nombre illimité de classes failles
		* mot clé : extends 
	* **Interface**
		* regroupement declaratif de methodes pas de champs 
		* definissant le comportement visible depuis l'exterieru d'un objet 
		* une interface est assimilable a un contrat formel passé entre une class et  le monde exterieur ; il est verifié a la compilation 
	* **Paquetage**
		* espace de nommage qui permet l'organisation logique d'un ensemble de classes et interfaces 
		* concecptuellement les packages sont proches des dossiers et sous dossiers présents sur votre système de fichier 
	* **Java API**
		* API = Application Programming Interface
		* bibliothèque de classes très importantes 
	* 





---
[[Langage Java#Notes|up]]