---
tags: "Notes"
---

* Course:[[Architecture Orientée Services]]
* Date: 23-09-2021 


# Technologies XML
* Extendable Markup Language 
	```xml
		<?xml version="1.0" encoding="UTF-8"?>
		<etudiants>
			<etudiant matricule="inf3-12" cin="..">
				<nom> ali </nom>
				<prenom> bensalah </prenom>
				<cin> 0843 </cin>
			</etudiant>
		</etudiants>
	```
* XML versus html 
	* Structure vs Presentation
		* HTML: comment présenter les données ?
		* XML: comment structuer des données ?
	* Fond vs Forme
		* HTML: Forme (table, br, bold, italic, img, divs etc)
		* XML: Fond
	* XML ne remplace pas HTML 
* XML vs bases de données 
	* XML ne remplace pas la base de donnée, mais est simplement plus pratique pour les usages courants à petites quantités de données
* XML 
	* Meta-language universel pour les données sur le web qui permet de developpeur de delivrer du contenu depuis des applications à d'autres applications ou aux navigateurs 
	* developpé par [W3C](https://www.w3.org/XML) 
	* Supporté par les grands constructeurs : IBM, Microsoft .net, ORACLE ... 
	* Objectifs : 
		* etre directement utilisable par le web
		* prendre en charge une variété d'applications 
		* compatible SGML 
		* nombre de caractéristique optionnelle maintenu à un niveau minimal 
		* doit faire l'objet d'un développement rapide
		* *conception formelle et concise*
		* documents faciles a créer 
		* la concision du marquage XML n'a qu'une importance minime
	* Balise
		* il faut fermer les balises ouvrantes et respecter la casse
		* une balise est associée à un element
		* une balise peut contenir plusieurs attributs 
		* une balise peut contenir plusieurs sous-balises
		* un document xml contient une seule balise Racine ( placée après le prologue)
	* Prologe : ```<?xml version="1.0" encoding="UTF-8" standalone="yes"?>```
		*  Attributs : 
			*  version 
				*  optionnelle mais recommandée ( versionnage )
			*  encoding 
				*  permet d'indiquer la représentation physique des caractères du fichier afin d'eviter de coder chaque caractère special 
			*  standalone (Standalone Document Declaration)
				*  determine si le document est autonome
				*  s'il ne l'est pas c'est qu'il fait réérence à une DTD ( schéma XML ) externe
		*  les Attributs version encoding et standalone doivent etre déclarés dans cet ordre 
	* Validié des documents 
		* Document bien formé ( Well Formed Document)
		* Document Valide (Valid Document)

---
[[Technologies XML#Notes|up]]