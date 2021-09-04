## Metadata:
* Tags: 
* Course : [[Programmation Java]]
* Started On : 2020-12-01
* Previous Chapter : [[POO- Encapsulation]]
* Next Chapter :
# Slides
# Summary
# Classes Abstraites
* classe astraite est une classe qu'on ne peut pas instancier et qui contient des methodes eventuellement sans implémentation( methodes abstraites). leur implémentation est laissée au classes filles.
* une classe abstraite est declarée avec le mot clé abstract
* il est possible de declarer une classe abstraite sans aucune methode abstraite
* si une classe contient au moins une methode abstraite cette classe devient automatiquement une classe abstraite ( compilateur oblige la declaration abstraite de la classe)
```java
	abstract class Document{
		abstract void traduire();
		void afficheb
		
	}
```

* Methode abstraite :
	* une methode declarée abstract
	* une methode dont le corps est remplacé par ; ( vide )
* Classe Abstract: 
	* a

```java
abstract class ObjetGraphique{
	int x,y;
	
	ObjetGraphique(int x, int y){
		this.x=x;
		this.y=y;
	}
	abstract void affiche();
	void resize(int r){
		x=x+r;
		y=y+r
	}
}

public class Rectangle extends ObjetGraphique {
	float largeur , longueur;
	Rectangle( float la, float lon){
		largeur = la ;
		longueur = lon
	}
	
}
```

# les Interfaces 
* Java interdit les heritages multiples 
* les interfaces permetten de mettre en oeuvre une solution de remplacement
* les interfaces sont une collection de methodes abstraites à implémenter ultérieurement

```java
interface AfficheType{
	void affiche(); // methode abstraite meme sans declaration abstract 
} 

class Personne implements AfficheType{
	void affiche(){
		System.out.println("je suis une personne")
	}
}
```

* (vs classe abstract) l'interface ne peut definire que des methodes abstraites
* l'interface ne peut pas avoir des attributs, on peut y declarer seulement des constantes 
* l'interface ne definit pas de constructeurs 
* en java une classe ne peut heriter que d'une seule classe parente, par contre il peut implémenter plusieurs interfaces : 
```java
class nomClasse extends classA implements classB [, classC, ... ]
```

* contraitrement aux classes, une interface peut posséder plusieurs interfaces parents ( heritage multiple enabled )
```java
interface monInterface extends monInterface2, monInterface3;
```

___