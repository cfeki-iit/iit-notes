## Metadata:
* Tags:
* Course : [[Theorie des langages et Automates]] 
* Started On : 2020-09-16
* Previous Chapter :  --
* Next Chapter :[[TLA- Les Langages Régulier et les expressions régulières]]

## Slides
![[TLA-Introduction aux langages.pdf]]
# Summary :
* [[homework]] - 2020-09-30 :
	* [x]   Fix equations and and stuff 
	* [ ]   partie 2 demo (LM)N=L(MN)
	* [ ]   Demonstration $L(M+N)=LM+LN$
	* [ ]   Demonstration $L(M\cap N) \subset LM\cap LN$

# Intoduction et concepts fondamentaux
## Alphabet, Mot, Langage
*  **Alphabet** est un ==*ensemble fini*== d'éléments appelés ==*symboles*== ou ==*lettres*==
	* Ensemble :  { , , , }
	* Symbole : 
		* Lettres : a,b..z ; A,B..Z
		* Chiffres décimaux : 0,1..9
		* Caractères du clavier
	* Alphabet binaire : {0,1}
	* Alphabet Octal : {0, ... ,7}
	* Alphabet Hexadecimal : { 0, ... ,9,A, ... , F}
	* Alphabet Informatique : **ASCII** , **EBCDIC** (obsolete)
* **Mot** sur un Alphabet A est une *==séquence finie de symboles==* de A 
	* sequence signifie que l'ordre est important 
	* les symboles d'un mot sécrivent jusxtaposés l'un à l'autre de gauche a droite.
	* La ==langueur d'un mot== s est le nombre de symboles constituant le mot s 
		* On note | s |  ou lg(s)
	* Sur tout alphabet A on peut definir un mot special : ==le mot vide== $\varepsilon$ tel que $|\varepsilon|=0$
		* $|s|=0 \text{ si et seulement si } s=\varepsilon$
	* pour un mot $s=\alpha_1\alpha_2..\alpha_n$ de longueur n sur un alphabet A, $\alpha_i$ est le Symbole (ou terme ) de ==rang== i et noté s(i)
* **Langage** L sur *un alphabet A* et un* ensemble de mots* sur A 
	* Exemple : L = {a, b, aa, ab, ba, bb, aaa, aab, abb, bbb} A = {a,b}
	*  un langage sur un alphabet A peut être Vide, Fini ou Infini. 
	*  un alphabet A est un langage sur A, en effet, un symbole est un mot de longueur 1
	*  l'ensemble vide $\varnothing$ est un langage sur A
	*  {$\varepsilon$} est un langage sur A, attention $\{\varepsilon\} \neq \varnothing$
	*  **==Monoïde Libre==** sur A : l'ensemble formé par tous les mots possibles sur l'alphabet A est un langage A. Noté par  **A\*** 
		*  si $A=\varnothing$ (alphabet vide ), alors A\* ={ $\varepsilon$ }
			*  $\Rightarrow\varepsilon\in A^*$ toujours 
			*  $A^*=\{\varepsilon \}$ si et seulement si $A=\varnothing \: ou \: A=\{\varepsilon \}$
		*  Tout langage L sur un alphabet A est une partie de l'ensemble de A* : L est un langage sur l'alphabet A, si et seulement si $L\subset$ A\* 
*  **Langage Formel** est tout sous ensemble de A\*  dont les mots peuvent êtres definis de deux façons :
	*  **==Definition par propriété==**:  modelisation formelle d'une description naturelle du langage 
		*  Exemple : L = ensemble des mots definis sur {a,b} de longueur paire 
		*  $\Rightarrow L_1=\{ w\in \{a,b\}^* ; |w|=2n, n>=0\}$
	*  **==Definition par Récursivité==**: Modelisation dans laquelle un langage est defini sur lui même
		*  Exemple 1: $L_2=\{w\in A^* \: ; w=a \text{ ou } w=aw_1 \: ; w1\in L_2\}$
		*  Exemple 2 : $L_3=L_1=\{w\in A^* \: ;w=\varepsilon \text{ ou } w=w_1w_2 \text{ avec } |w_1|=2 \text{ et } w_2\in L_3$

## Operations sur les mots 
* **Concaténation** ( collage, jointure )
	* ***Definition*:** 
	Soit S et t deux mots sur un meme alphabet A,
    La **concaténation** de s et de t est le mot obtenu en écrivant d'abord les symboles de s, suivis ensuite par les symboles de t
	
	* ***Definition Formelle*** : 
	si $s=\alpha_1\alpha_2...\alpha_n$ et $t= \beta_1\beta_2...\beta_m$ alors la concaténation de s et de t notée st donne le mot suivant $st= \sigma_1 \sigma_2 ..\sigma_{n+m}$ 
	où $\begin{cases}\sigma_i = \alpha_i \: ; \: i \in \{1,n\} \\ \sigma_i = \beta_i\: ; \: i \in \{n+1,m\}\end{cases}$
	* ***Propriétés de la concaténation*** : 
		* Loi interne : $(A^*,\cdot)$
			* $\begin{array}{cc}A^* \times A^* & \rightarrow & A^* \\ s_1,s_2\in A^* &\Rightarrow & s_1\cdot s_2 \in A^*\end{array}$
		* Associativité : $(st)u = s(tu) = stu$
		* Element nteutre : $\varepsilon s=s \varepsilon = s \text{ pour tout s sur A}$ 
		* $|st|=|s|+|t|$
		* Non Commutative ( en général ): $st \neq ts$
		* $|st|=0 \: ssi\: s=t=\varepsilon$
* **Puissance**
	* ***Definition***:
	Soient s un mot sur un alphabet A et n un entier naturel 
	La **puissance** nème de s notée s^n est definie de façon recusive par :
	$$\begin{array}{cc}s^0=\varepsilon & \\ s^n=s^{n-1}s \:; & n\geq 1 \end{array}$$
	
	* ***Propriétés de la puissance***: 
		* $\forall s\in A^* : s^0=\varepsilon \: et \: s^1=s$
		* $\forall s \in A^* , \forall n,m \in \mathbb{N} : s^ns^m=s^{n+m}$
		* $\forall s\in A^*  , \forall n,m \in \mathbb{N} : (s^n)^m=s^{nm}$
		* $|s^n|=n|s|$
* **Mirroir** (renversé)
	* ***Definition***:
	Le mirroir de u est le mot obtenu à partor de u en inversant les lettres de celui ci 
	il est noté $u^R$ ou $\tilde{u}$
	
	* ***Propriété***:
		* $(uv)^R =v^R u^R$
		* $(u^R)^R=u$
		* $|s^R|=|s|$
* **Préfixes, Suffixes, Facteurs**
	* Préfixe : u préfixe ssi existe v tel que s= uv
	* Suffixe : v suffixe ssi existe u tel que s= uv
	* facteur : w facteur ssi existe u v tel que s= uwv
	* *Préfixe propre*:
		* tout préfixe different de $\varepsilon$ et s 

## Structure du Monoïde 
En algèbre un Monoïde est un ensemble M muni d'une loi de composition interne ==\*== ( c'est à dire une application $M\times M \rightarrow M$ ) qui: 
- soit associative : $(c*y)*z=x*(y*z)$
- Admet un element neutre e: $e*x=x*e=x$

> ==**Theoreme1**==
> L'ensemble de tous les mots sur un alphabet A est un monoide pour l'operation de concaténation des mots  
> Ce monoide s'appelle le **monoide libre**

## Operations sur les langages
Soit A un alphabet et L et M deux langages sur A
* **l'intersection**
	* $L \cap M = \{s\in A^* \:|\: s\in L \: ET \: s\in M\}$
	* tous les mots de A appartenant simultanément à L et M
* **la reunion**
	* $L \cup M = \{s \in A^* \: | \: s\in L \: OU \: s \in M\}$
	* Tous les mots appartenant a L ou M
* **la concaténation**
	* $LM=\{ s\in A^* \: | \: \exists u\in L, \: \exists v \in M : s=uv$
	* tous les mots de A obtenus par concaténation de tous les mots de L avec tous les mots de M
* **la Fermeture de kleene (étoile)**
	* $L^* = L^0 \cup L^1 \cup L^2... =\{s \in A* \:|\: \exists u_1,..,u_n \in L : s=u_1...u_n\}$
	* toues les mots sur A qui sont des puissances de mots de L 
	
* **La fermeture Positive de Kleeen**
	* $L^+ =L^* \\\ \{ \varepsilon \}$
	* tous les mots sur A qui sont des puissances non nulles de mots de L
* **la complémentation**
	* $\bar{L} =\{ s\in A^* | s\notin L\}$
	* toues les mots sur A n'appartenant pas à L
* **Puissance**
	* on note $L^n$ l'ensemble formé par les puissances $n^{eme}$ des mots appartenant à L
	*  $L^0=\{\varepsilon\}$
	* $L^1 = L \: et \: L^2 = LL ...$  
* **Mirroir**
	*  $L^R=\{s^R ;s\in L\}$ 
	*  $L^R=\{w \in A^* \: | \: \exists m\in L \: ;\: w=m^R\}$
	*  les mirroirs des mots appartenant à L
	*  ***Propriétés***
		*   $(L^R)^R=L$
		*   $(LM)^R = M^RL^R$
		*   $(L+M)^R = L^R +M^R$
		*   $(L\cap M)^R = L^R \cap M^R$
### Demonstrations de propriétés importantes : 
* l'intersection et la réunion sont commutatives, associatives et distributives l'une par rapport à l'autre
	* $L\{\varepsilon \}=\{\varepsilon \}L = L$
	* $(LM)N=L(MN)$
	* $L(M+N)=LM+LN$
	* $L(M\cap N) \subset LM \cap LN$


> **==Demonstration $(LM)N = L(MN)$==**
> la demo se fait en deux etapes: 
> * **Montrons que $(LM)N \subset L(MN)$**  
>    1. Soit $s\in (LM)N$ montrons que $s\in L(MN)$
>    2. $s\in (LM)N$ alors $\exists s_1 \in LM \: et \:s_2\in N \: ; \: s=s_1s_2$
>    3. $s_1\in LM$ alors $\exists s_11\in L \:et\: s_{12}\in M \: ; \: s_1=s_{11}s_{12}$
> $\Rightarrow s=s_{11}s_{12}s_2 = s_{11}(s_{12}s_2)$
>    4. or $$\left. \begin{array}{cc} & & s_{11} \in L \\ \left. \begin{array}{cc}s_{12}\in M \\ s_2 \in N \end{array}\right\} &\Rightarrow &s_{12}s_2 \in MN\end{array}\right\}\Rightarrow s=s_{11}(s_{12}s_2) \in L(MN)$$
> $\Rightarrow$ d'ou $(LM)N \subset L(MN)$
> * **Montrons que $L(MN) \subset (LM)N$**
>    * 


>**==Demonstration $L(M+N)=LM+LN$==**

>**==Demonstration $L(M\cap N) \subset LM\cap LN$==**



___
[[TLA- Intoduction et concepts fondamentaux#Metadata|Up]]  ----  

