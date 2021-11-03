---
tags: "Notes"
---

* Course: [[Frameworks et Technologies Big Data]]
* Date: 14-10-2021 


# Hadoop distributed file System - HDFS
* Systeme de fichié distribué 
	* inspiré de GFS 
	* ecrit en java 
	* Tolerant au pannes 
	* SGF du type Write Once Read Many  on y ecrit une fois le fichier puis on y accède plusieurs fois 
	* Se base sur le pricnipe de maître esclave 
* Architecture : 
	* Les machines sont concidérées comme des disques de stockage de données 
		* ![[Drawing 2021-10-14 16.11.31.excalidraw ]]
		* Rack : 
			* Armoire ou tirroire permettant d'optimiser l'encombrement, d'assurer une cohérence au niveau du cablage, de mutualiser les systemes d'alimentation et de refroidissement entre les equippements 
	* Taille des blocs 
		* Bloc : 64Mo 
		* Chunk : 64 Mo
		* pour optimiser en temps et en nombre d'accés en lecture, on essaye de synchroniser les blocs et les chunks 
		* Regle : One block <- One File  donc il faut harmonizer et minimiser les pertes tout en gardant un nombre de blocs reduits par fichier
* Composantes du systeme HDFS : 
	* **Name Node** 
		* ![[Drawing 2021-11-01 11.48.12.excalidraw]]
		* Gestion des data nodes en cas de panne et d'ajout de nouveau data nodes 
		* gestion des requetes utilisateurs ( clients )
		* gestion des duplications 
		* gestion des méta-données 
			* liste des fichiers 
			* liste des data nodes pour chaque chunk 
			* liste des chunks pour chaque fichier  
		* Centralisation de localisation des chunks de donnée répartis
		* Identification des data nodes dans lequels les chunks sont stockés  
		* SPOF! 
	* **Secondary Name Node** 
		* name node secondaire qui verifie periodiquement l'etat du name node principal et fait un copie des metadonnées 
		* en cas de panne dans le Name node principal, le namenode secondaire le remplace 
	* **Data Node** 
		* enregistrer (écriture) et recupère (lecture) les chunks de données 
		* en lecture, les data nodes transmettent au client les chunks correspondants aux fichier  grace au Name node 
		* en ecriture les data nodes retournent l'emplacement des chunks crées au name node
		* chaque data node envoie periodiquement au namenode la liste des chunks de données qu'il contient a travers les heartbeats 



> ### Exercice 1 : 
> Bloc = 128MB
> Taille totale disque : 15GB
>  nombre de blocs : 120 blocs 
> 50 fichiers de taille 20mb  
> One block One File => 50 blocs 
> 2 copies ( 1 original + 1 copies ) =>100 blocs 
> 20 blocs restants 

> ### Exercice 2 : 
> 50 machines 
> 100 GB par machine => total 5000Gb
> taille bloc 128MB
> nombre total de blocs : 5,120,000 / 128 = 40,000 blocs
> 5 fichiers ( x3 car copies ) 200gb each 
> 15 x  204,800 / 128 = 24,000 blocs
> blocs restants : 40,000 = 16,000 blocs 


![[Drawing 2021-11-01 12.55.06.excalidraw]]

---
[[Hadoop distributed file System - HDFS#Notes|up]]