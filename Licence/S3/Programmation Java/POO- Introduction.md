## Metadata:
* Tags:
* Course : [[Programmation Java]]
* Started On : 2020-09-25
* Previous Chapter : --
* Next Chapter : [[POO- Syntaxe Java]]
## Slides
[[POO- Introduction]]
# Summary :



# Introduction
Paradigmes :
*  Imperatif
*  logique
*  fonctionnel
*  pile
*  orienté objet

l'execution se fait soit par 
* interpretation
* compilation
* Semi-compilation et exécution sur machine virutelle 

## Objectifs de l'OOP : 
* faciliter le devoloppement et l'evolution des applications
* permettre le travail en equipe
* augmenter la qualité des logiciels 
## Solutions proposées : 
* découpler les parties des projets
* limiter les modifications des evolutions 
* réutiliser facilement du code 

>Exemple:
>Pour une application de gestion des inscriptions à l'iit, les objets qu'en va manipuler son des étudiants. Java permet de créer des "Objets" qui représentent ces etudiants avec leur données et leurs methodes specifiques
>Supposons qu"en suite on a besoin de faire une application de gestion des stages. Il n'est pas necessaire de recréer des objets d'etudiants mais on peut utiliser directement celui crée pour l'application précédente

## languages de OOP 
* Java
* C++ 
* Python 
* Ruby 
## Why Java
langayge orienté objet fortement typé avec classes 
a besoin d'un environeement d'éxécution : une machine virtuelle et un ensemble de bibliothques 
un environnement de devolppement et un cmpliteurs

Java est une des langages les plus utilisés 
* Systèmes dynamiques
* internet
* systèmes communicants

### Java Vs C++
C++ 1983 
Java 1991 

Very similar syntax
But all the errors that the original C++ syntax was responsible for ( principalement gestion de memoire and garbage collection ) are removed
* Pointeurs
* Structures de données
* Heritages myultiples 

Java is more dunamic : les instances d'une classe sont instanciées dynamiquement 
la liberation de memoire est transparente .. ( garbage collection ) 

these kind of dynamic processes have a cost : java is slightly slower than c++ 

A strong point of java is portability : it is executable in all kinds of machines. 
with C++ projects you need to create executables pour chaque type d'architexture.
in Java, le code source n'est pas traduit directement en langage machine. il est d'abord traduit dans un langage Bytecode (JVM - Java Virtual Machine) definie par "Sun" ( " \*.class ") 

En bref  Java est : 
*  \+ C like
*  \+ Orienté objet 
*  \+ Robuste ( typage fort ) 
*  \+ Pas de pointeurs 
*  \+ Code intermediare ( bytecode )
*  \-  plus lent que C++ a cause de processus dynamiques en background


## Premier Programme Java

```Java
	public class HelloWorld{
		public static void main (String args[]){
			System.out.println("Hello World !");
		}
	}
```

pour la compilation à travers le Cmd il faut utiliser les commandes suivantes : 
* javac filename.java pour compiler
* java filename(.class) pour executer 

Etapes d'execution: 
1. Ecriture du programme code-source.java
2. compilation
	* Javac code-source.java
	* generation de code-source.class ( bytecode) 
3. Execution
	* java code-source
4. Resultat de l'execution
___
