# Entrepot de Données TP3
* **Etudiant** : Chedi Feki 
* **Année Académique** : 2020-2021
* **Institut** :  IIT  
___ 


## Job : gestAgeClient
* **Graphe du Job**
	![[Pasted image 20210511131712.png]]
	* tMap_1
		![[Pasted image 20210511131745.png]]

* **Fichiers en Entrée**
	* Customers.txt
		![[Pasted image 20210511131836.png]] 
		
* **Expression pour determiner si Majeur:**
	```java
			TalendDate.diffDate(TalendDate.getCurrentDate(),
								row1._Birth_Date_,"yyyy",true) >18 

	```
* **Affichage en Sortie: **
	* tlog1 : Tous
		![[Pasted image 20210511132112.png]] 
	* tlog 2: Majeurs 
		![[Pasted image 20210511132142.png]] 
	* tlog 3: Mineurs
		![[Pasted image 20210511132300.png]] 
	 


## Job : gestTypeClient
* **Graphe du Job**
	![[Pasted image 20210511135641.png]]
	* tMap_1
		![[Pasted image 20210511135706.png]]
* **Fichiers en Entrée**
	* Même ficher que l'exercice précédent
	
* **Expression pour filtrer selon le type:**
	```java
			row1._Customer_Type_ID_.equalsIgnoreCase("2030,00") 

	```
* **Affichage en Sortie: **
	* tlog1 : les Autres
		![[Pasted image 20210511140009.png]] 
	* tlog 2: Type1 (2030,00)
		![[Pasted image 20210511140035.png]]