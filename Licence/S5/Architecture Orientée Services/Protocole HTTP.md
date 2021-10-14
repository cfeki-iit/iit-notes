---
tags: "Notes"
---

* Course: [[Architecture Orientée Services]]
* Date: 14-10-2021 


# Protocole HTTP
* http permet d'accéder aux fichiers situés  sur le réseau Internet 
* HTTP se place au dessus de TCP et fonctionne selon un principe requête reponse 
	* le client transmet une requête comportant des informations sur le document demandé 
	* le serveur renvoie docuent si disponible ou le cas 
* HTTP est un protocole synchrne initialement sans connexion et chaque couple de requete/responce est de fait indépendant
* "Adresses" HTTP
	* Uniform Resource Identiier, URI 
		* string strucutré permettant d'identifier de maniere unique une ressource dans un espace de nom defini
		* chaque ressource sur internet est identifiée par un un URI unique 
		* une Ressource peut être designée soit par un URL soit par un URN
		* format : ```http://<host>:<port>/<path>?<query>#<fragment>```
			* **Host** permet de specifier le FQDN ( IP adress) du serveur possédant la ressource à accéder
			* **Port** permet de specifier le numer de port a uitiliser pour atteindre le serveur possédant la ressource
				* Par défaut le protocole http est affecté au port 80, il n'est pas necessaire de specifier le numero de port dans l'URL 
			* **Path** permet de specifier l'emplacement du fichier sur le serveur, ce champ est general constitué par une suite de repertoires séparés par des '/' puis du nom du fichier a acceder
			* **Query**  permet de passer un ou plusieurs paramètres à un script php perl etc 
			* **Fragment** permet d'indiquer une position ( ancre, fragment) dans une page 
	* Unifrom Resource Name, URN 
		* permet d'identifier un ressource par son nom même lorsque celle ci n'est plus dispoinible 
	* Uniform Resource Locator, URL 
		* permet de localiser une ressource 
		* dans le cas du protocole http, l'URL permet de localiser 
* **Requête HTTP**
	 ```html
	 	<methode><url> HTTP/<Version>
		[<Champ_d_en_tête>:<VALEUR>]
			...
		//ligne blanche
		[Corps de la requete pour la methode POST]
	 ```
	 * methodes
		 * GET
			 * a3tini l'information 3la ressource
			 * l'information fournie en réponnse est sous forme d'une ensemble de headers et d'une représentation 
			 * Corps de la requete est vide 
		 * POST
			 * 5outh l'information
		 *  DELETE, PUT, HEAD, OPTIONS, TRACE, CONNECT

---
[[Protocole HTTP#Notes|up]]