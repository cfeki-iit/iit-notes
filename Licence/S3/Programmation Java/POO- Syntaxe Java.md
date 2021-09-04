## Metadata:
* Tags: 
* Course : [[Programmation Java]]
* Started On : 2020-09-25
* Previous Chapter : [[POO- Introduction]]
* Next Chapter : [[POO- Conceptes de bases de la POO]]

# Summary :

# Syntaxe Java
## Commentaires 
êrùettent de rajouter du texte dans le code source sans que le compilateur ne le concidère comme du code. 

```java
class HelloWorld{
	public static void (String args[]){
		// ceci est un commentaire sur une seule ligne 
		/* 
		ceci est un commentaire 
		sur plusieurs lignes
		*/
		System.out.println("hello world!")
	}
}
```

## Instructions, Variables : 
```java
class HelloWorld{
	public static void (String args[]){
		int a = 5; // declaration d'une variable
		int b = 9;
		
		b = b + a; // instructions
		a = 2*b + x 
	}
}
```

une variable possède un nom, un type et une valeur 
il est ensuite possible de changer la variable
le symbole "=" designe l'affectation
lors de la compilation java verifie que chaque expression située a droite de l'affectation est compatible avec le type de la variable

### les types primitifs : (attention toujours en minuscule)
* byte
	* entier 8bits
* short
	* entier 16bits
* int
	* entier 32 bits 
* long
	* entier 64 bits
* float
	* virgule flotante 32bit
* double
	* virgule flottante 64bit
* char
	* 
* boolean

### les Operateurs
just like C, nothing different 
### Instructions conditionnelles : 
* **if**
```java
	if <condition> {
		<instructions>;
		}
	[else {
		<instructions>;
		}]
```

* **Switch**
```java
	switch <expression> {
		case val1 : <instructions>; break;
		case val2 : <instructions>; break;
		...
		default : <instructions>; break;
		}
```

### Les Boucles 
* **For**
```java
	for(<initialisation compteur> ; <condition> ; <incrémentation>) {<instructions>}
```
*  **while**
```java
	while (condition) {<instructions>}
```
*  **do ... while **
```java
	do { <instructions> } while (condition) ;
```
___
[[POO- Syntaxe Java#Metadata|up]]