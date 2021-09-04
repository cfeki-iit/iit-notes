---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: Source/lecture_Note/raw
aliases: ["202104151205 LN-Administration des Bases de Données 7","LNABD7" ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:[[Bases de Données]]
* Date: 2021-04-15
* Given By: [[@Sahbi Zahhaf|Sahbi Zahhaf]]


# Notes 
* Attribution de privilèges systeme 
	* GRANT \<privliege_systeme> TO \<username> \[WITH ADMIN]
* Supression de privileges : 
	* REVOKE \<privilege> FROM \<username> 
	* si un privliege a été donné a un utilisateur et à PUBLIC la revocation sur l'utilsateur est sans effet 
	* REVOKE ALL PRIVILEGES enlevee simultanément tous les privileges 
* Attribution de privileges objets :
	* GRANT SELECT,INSERT,DELETE
* GESTION DES ROLES : 
	* un role est un regroupement nommé de privilèges systemes ou objets qui peut etre attribué  un utilisateur ou a un groupe d'utilisateurs ou a un autre role 
	* Attribution : 
		* 
---
[[202104151205 LN-Administration des Bases de Données 7#Notes|up]]