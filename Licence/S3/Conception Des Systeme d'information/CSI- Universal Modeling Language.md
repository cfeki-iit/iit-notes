## Metadata:
* Tags: 
* Course : 
* Started On : 2020-11-06
* Previous Chapter : 
* Next Chapter :
# Slides
# Summary
# CSI- Universal Modeling Language
## Introduction
[[CSI-Introduction UML.pdf]]
[[CSI-SurvolDiagrammesUML.pdf]]
il existe une variété de logiciel permettant la modelisation uml
on peut les classifier en deux parties : 
solution open source gratuits : 
## Diagramme Cas d'utilisation (Use-Case)
[[CSI-Diagramme des Cas d'utilisations.pdf]]
### Utilité / Role 
* decrore les **fonctionalités** du systeme
* point d'entrée pour lancer le cycle de developpement 
	* comprendre les attentes de l'utilisatuer
	* specifier les besoin de l'utilisater 
* garantir la satisfaction de l'utilisater
* a utiliser dans un **Cahier de Charges**
### Symboles et notation / concepts
* "**==Cas Utilisation==**" : Fonctionalité Systeme 
	* ![[Pasted image 20201113153038.png]]
	* ensemble / séquence d'action qui permettent d'apporter une valeur ajoutée à l'utilisateur.
* "**==Acteur==**" : Utilisateur de l'application : 
	* Bonhomme : ![[Pasted image 20201113153550.png]]
		* représente un humain ou un agent unique
	* classe stereotypée : ![[Pasted image 20201113154118.png]]
		* permet de représenter des systemes (Serveur sms etc ) 
* "**==Relations==**" : 
	* **Association** : relation entre un acteur et un cas d'utilisation
		* notation : $\rightarrow$
	* **Heritage** :  
		* Entre deux cas d'utilisation
		* Entre deux Acteurs. 
	* **inclusion**
		* A include B : a s'execute si et seulement si B et est exécutée
	* **Extention**
		* A extends B : fonctionalité additionelle non obligatoire

un institut de formation nous appelle Afin de fournir une solution informatique pur gerer le suivi des cours de formation au sein de cet institut. 
on vous demande alors de fournir une modelisation a travers le language uml de présenter en premier lieu l'aspect fonctionnel du systeme. 
cet institut dispose d'un staff ==administrateur== et ==academique==
les agents administratifs préparent des catalogues de formation
n'importe quelle personne ( etudiant ou autre ) peut s'inscrire aux cours de formation selon les catalogues présentés. 
il y a lieu alors planification des cours de formation pour lequelle on appelle un formateur.
durant les seances de cours de formations, un état de suiviest  élaboré par l'agent administratif. 
à la fin de la formation il y a lieu un test d'evaluation préparé par l'enseignant et un questionnaire de satisfaction elaboré par l'agent administratif.

Description textuelle (détaillé) du diagramme cas d'utilisation = présenter un scenario possible de realisation qui permet d'executer le cas d'utilisation.
càd enumerer les interactions possible entre l'acteur et le cas d'uilisation 

![[CSI- UseCaseDiagram1.jpg]]
Exemple: 
cas identification
l'utilisateur demande d'acceder 
le systeme affiche une interface afin d'introduire ces parametres d'accès
l'utilisateur saisit par exemple son login et mot de passe et ensuite valide
le systeme verifie ces valeurs de login et mot de passe saisits 
si les valeurs sont valides alors le systeme renvoie un accès avec succes. sinon un message d'erreur ou d'echec d'identification

completer de maniere exhaustive une 2eme iteration du rapport 
un document word compte rendu bien structuré avec un diagramme global et un raffinage adéquat. 
___