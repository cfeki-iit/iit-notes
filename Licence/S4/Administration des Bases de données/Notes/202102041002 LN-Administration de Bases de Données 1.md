---
#chose 1 of the above, usually Raw, becomes Digested when 
tags: Source/Lecture_note/Eat
aliases: ["202102041002 LN-Administration de Bases de Données 1","LNABD1", ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic: [[Bases de Données]]
* Date: 2021-02-04
* Given By: dr. [[@Sahbi Zahhaf]]


# Notes 
<!-- hello -->
* Administration
	* Après la creation, vient l'administration 
	* Gestion des transactions 
	* Architecture ORACLE ( why oracle ? )
	* Langage de Controle de données
* [[Bases de Données]] 
	* [[Systeme d'Information]] des [[Entreprise|entreprises]] ou [[Organisation|organisations]]
	* une base de donnée est un ensmeble structuré de données(1) enregistré sur un support de stockage permanant(2) avec le minimum de redondances possibles(3) pour satisfaire sumulatnément plusieurs utilisateurs(4) de façon selective en un temps opportun(5)
		* (1) 
		* (2) stockage sur disque
		* (3) Accès et mise ç jour des données 
			* LID et LMD
		* (4) confidentialité et sécurité d'accès
			* Language de Controle de données
	* Etapes de creation d'une base de données : 
		* Cahier de Charges 
		* [[Modele Conceptuel d'une Base de Données|Modele Conceptuel]]
			* [[Modele entité/association]]
			* [[Diagramme de classes UML]] 
		* [[Modele Relationnel|Modele Logique Relationnel]]
			* [[Regles de passages  MCD -> MLR]]
			* [[Regles de normalisation 1FN -> 2FN -> 3FN]]
			* Utilisation de l'[[algèbre relationnelle]]
		* Développement d'une BD avec un [[Systeme de Gestion de Base de Données|SGBD]]
* [[Systeme de Gestion de Base de Données|SGBD]]
	* assure la traduction entre le niveau logique et le niveau physique
	* Roles: 
		* **Eviter la redondance de données** 
		* **Exploiter un langage pour la Gestion de Bases de données (norme SQL )**
			* [[Langage de Definition de Données]]
			* [[Langage de Manipulation de Données]]
			* [[Langage d'Interrogation de Données]]
			* [[Langage de Controle de Données]]
		* **Assurer le Stockage de données**  
			* Vision utilisateur 
				*  indépdendande au niveau physique 
					*  Pas besoin de travailler directement sur les fichier physiques 
				*  Inpendance au niveau logiques 
					*  Pas besoin de connaitre l'organisation logique dans les [[Tablespaces]]
		*  **Assurer la cohérance de données**
			*  [[Contraintes D'Integrité]] doivent être respectées ç chaque mise a jour de la BD
		*  **Gérer les requêtes utilisateur**
		*  **==Gérer les [[Transactions]]==**
			*  Séquence d'operations LMD qui modifie le contenue du'ne BD 
			*  La transaction est une unité atomique, elle doit se réaliser complétement. dans le cas échéant elle ne doit laisser aucune trace d'exécution dans la BD l
			*  [[Structured Query Language|SQL]] prévoir un LCD
		* ** Assurer la Géstion de Reprise face aux Pannes** 
			*  Réstaurer la base de données dans un état cohéraent suite ç une Panne 
				*  Panne de Systeme 
					*  L'[[Systeme de Gestion de Base de Données|sgbd]] s'arrete brusquement avant meme de terminer une mise à jor
					*  la mise a jour n'est pas encore terminée donc l'état d'une base de donnée est en cours d'alteration
						*  Retour à un état précédent 
						*  achevage automatique de la mise à jours en cours
				*  Panne de disque
					* Portions du disque sont défectueux   
					* ORACLE permet de récuperer les informations perdues a travers des fichiers LOG ( journalisation )
	* Principaux [[Systeme de Gestion de Base de Données|SGBD]] sur le marché 
		* Application Fermée : On ne peut pas connaître en détails comment ces [[Systeme de Gestion de Base de Données|SGBD]] executent les requêtes
			* [[SQL Server]]
				* n'est pas multiplatformes car produit microsoft.
			* [[DB2]]
			* [[Sybase]]
		* [[Application Open Source]]: code source accessible, mais pas forcément robustes
			* [[MySQL]]
			* [[PostgreSQL]]
		* Pourquoi [[ORACLE]] ?
			* **non fermées** : on peut connaitre en détail comment ORACLE exécute les reuetes 
			* **Multiplateforme**
			* **Portable**
* Gestion des [[Transactions]]
	* séquence d'operations LMD qui accèdent et modifie le contenu d'une BD 
	* Unité de traitement atomique qui fait passer en une seule étaple la BD d'un état actuel cohérent vers un nouvel état cohérent 
		* ensemble d'ordres SQL traitée comme une op&ration atomique
		* rq: au cours de la transaction , la BD peut passer par ces etats incohérents 
	* une transaction s'effectue
		* complétement => toutes les mises ç jour effectuée depuis le début de la transaction sont validée
		* Inomplétement (annulation ou panne ) => toutes les mises a jour effectuées sont annulée et aucune trace de celles ci n'est laissées 
	* Propriétés 
		* **Atomicité**
			* si une transaction est lancées alors elle doit etre complétement executées sinon elle ne doit laisser aucune trace de son écévution
			* une transaction ne peut pas etre à moitié executée 
			* une transaction constitue une unité d'exévcution dont les opérations doivent être annulées SI la transaction est interrompue 
			* les états intermédiaires générés par les opérations d'une transaction spécifique ne sont pas visibles aux autres transactions concurrents 
		* **Cohérance**
			* une transsaction doit garantir l'intégrité des donner; elle doit assurer le passage d'une bd d'un état cohérent ç un autre état cohrent 
			* en cas de probleme l'eétat initial doit etre 
		* **Isolation** 
			* les transactions qui s'executent en parallèle ne doivent jamais s'interferer entre elles 
			* les transactions sont isolées les unes des autres 
			* les transactions s'executent comme si elle étaient lancées séquentiellement si elle manipulent les memes données 
		* **Durabilité**
			* Si un transaction est validée alors le [[Systeme de Gestion de Base de Données|SGBD]] garantit que les mises a jour seront effectuées meme s'il ya la présence d'une panne quelconque 
			* Deux genre de pannes: 
				* Panne de système le [[Systeme de Gestion de Base de Données|SGBD]] s'arrête brusquement avant même de termine une mise ç jour 
					* la reprise est réalisée automatiquement et rapidement, pour terminer les operation inachevées, s'appuie sur les [[Fichiers de Journalisation]] qui gardent la trace de tous les evenements d'une Transaction
				* Panne de Disque : Portion du disque dsont déféctueux
					* la reprise est eventuellement plus longue car elle s'appuie en plus sur les [[Fichiers de Journalisation Archivés]] qui gardent l'historique let l'archivage des fichier de journalisation
	* Le Langage SQL permet aux utilisateurs de gérer leurs transactions,
	* Les points de Reprise : 
		* besoins : 
			* eliminer quelques operations d'un transaction 
			* controler les operations a l'interieur d'une transaction 
		* Point de Reprise (SavePoin) est une marque speciale à l'interieur d'une transaction : 
			* SQL definition : SAVEPOINT nomPoint;
			* SQL annuler les modifications : ROLLBACK TO nomPoint
* [[Gestion de la Concurrence]] : Anomalie des transactions
	* un [[Systeme de Gestion de Base de Données|SGBD]] est Multi-utilusateur
	* une même donnée peut etre manipulée par plusieurs utilisateurs à la fois 
* Gestion de la concurrence : niveaux d'isolation des transactions.
	* modes de lectures SQL 
		* Read uncommitted
		* Read committed 
		* Repeatable read 
		* Serializable 


---
[[202102041002 LN-Administration de Bases de Données 1#Notes|up]]