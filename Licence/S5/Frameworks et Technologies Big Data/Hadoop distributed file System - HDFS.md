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


---
[[Hadoop distributed file System - HDFS#Notes|up]]