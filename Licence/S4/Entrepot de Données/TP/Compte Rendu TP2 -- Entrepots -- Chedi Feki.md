# Entrepot de Données TP2 
* **Etudiant** : Chedi Feki 
* **Année Académique** : 2020-2021
* **Institut** :  IIT  
___ 


## Job : gestionDepartement
* **Graphe du Job**
	![[Pasted image 20210504135558.png]]
	* tMap_1
		![[Pasted image 20210504135637.png]] 
	* tMap_2
		![[Pasted image 20210504135659.png]] 
	* tMap_3
		![[Pasted image 20210504135722.png]]
* **Fichiers en Entrée**
	* Departements.csv
		![[Pasted image 20210504140005.png]] 
	* Marketing.csv
		![[Pasted image 20210504140034.png]] 
* **Code de la routine "Code"**
	```java
		
		package routines;
		import java.util.regex.Pattern;

		public class code {

			public static String corrigerNumMagasin(String s) {

				if (Pattern.matches("M.*", s)==false) return "M"+s;

				else return s;

				}
		}

		
	```
* **Fichier csv en Sortie**
	![[Pasted image 20210504140356.png]] 


## Job : gestCustomer 
* **Graphe du Job**
	![[Pasted image 20210504142030.png]]
	* tMap_1
		![[Pasted image 20210504142050.png]]
* **Fichiers en Entrée**
	* CustomerPetit.txt
		![[Pasted image 20210504142201.png]]
	* Customer_type.txt
		![[Pasted image 20210504142236.png]]

* **Fichier csv en Sortie**
	![[Pasted image 20210504142259.png]]