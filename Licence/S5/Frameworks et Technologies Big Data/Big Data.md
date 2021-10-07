---
tags: "Notes"
---

* Course: [[Frameworks et Technologies Big Data]]
* Date: 05-10-2021 


# Big Data
* Big Data est un domaine d'activité vaste et difficile a definir strictement
	* ce n'est pas QUE des logiciels
	* Le but c'est de créer a partir des données générés dans les réseaux sociaux et grace à l'iot de la valeur ( prediction de maladies, detection de fraudes, previsions meteo, medecine personnalisée etc)
	* données non structurées + structurées 
	* données massives 
	* données incertaines 
	* flux de données 
	* données distribuées 
	* machine learning 
	* traitemeents parallèles 
	* visualisation de données 
	* fouille de données 
	* prediction et prevision 
* Historique : 
	* les moteurs de recherche utilisaient, au début, l'indexation pour retrouver les informations dans les pages 
	* à un moment l'utilisation d'internet explose en nombre et en quanitté : 
		* tous le mondecrée son propre site web, et puis la naissance des réseaux sociaux a encore plus democratisé internet 
	* Googlese se retrouve dans l'impossiblité de gerer tant de données de cette maniere => invention du GFS (Google File System )
		* creation de clusters constitués par  des machines standards
		* Basé sur l'architecture Master-Slave(chunk servers)
			* les slave ( chunk servers) servent a stocker des chunks de données ( fichiers volumineux ségmentés )
			* Le master : 
				* contacté par les clients 
				* guide les clients sur les serveurs a contacter pour la lecutre et l'ecriture des données (chunk)
				* contient le mapping des données et leur locations dans les chunk servers (meta-données)
				* le master est un SPOF : single point of failure
					* Si les chunk servers tombent en panne, le cluster continue de fonctionner normalemenet car generalement les CS existent en 3 duplicatas 
					* les masters par contre sont singulaires et si ils tombent en panne tous le cluster n'est plus utilisables 
					* => Shadow masters ( duplicatas du master )
		* probleme : les machines standards sont moins robustes que les serveurs et en plus on ne peut pas effectuer des maintenances a chaud 
	* MAP Reduce

---
[[Big Data#Notes|up]]