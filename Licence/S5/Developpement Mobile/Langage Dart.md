---
tags: "Notes"
---

* Course:[[Developpement Mobile]]
* Date: 09-10-2021 


# Langage Dart
* Google(2011)
	* alternative à Js 
	* Interprété et compilé 
	* compilable pour mobie, desktop backend ou traduit en JavaScript
	* Fortement Typé 
	* Orienté Objet 
		* classes heritages, interfaces, mixin 
	* permet des taches asynchrones syur le meme processus que l'UI
		* 
	* Single Thread (= Isolate ) par défaut mais possible de créer plusieurs Isolates 
	* Hot Reload
		* le code est mis à jour est executé sans devoir runner de nouveau
		* pour le web : il y a un render du DOM ( rafraichir la page en rafraichissant les states de la page)
		* Pour le mobile : refrech du state de la page 
	* Testable 
	* CI/CD
		* Continuous Integration / Continuous Deployment 
* Dart Native
	* cible les péripheriques mobiles, desktop et serveurs 
	* Indut une VM Dart avec compilateur JIT lors du developpement 
		* JIT est un compilateur java 
	* Indut un compilateur AOT pour le code machine + runtime pour le deploiement 
* Dart Web 
	* indut un compilateur pour le developpement (dartdevc) et un compilateur pour la production ( dart2js )
* Syntax : 
	```Dart
		void main(){
			print('hello, world!');
			var result = 
		}
	```



---
[[Langage Dart#Notes|up]]