## Metadata:
* Tags: 
* Course : [[Ingénierie des Bases de données]]
* Started On : 2020-11-19
* Previous Chapter : [[IDB- Introduction et Notions de Base]]
* Next Chapter :[[IDB- SQL]]
# Slides
# Summary
# Algèbre Relationelle
* kesako
* Operations
	* Ensemblistes binaires
		* **union**
			* relation entre deux relations de même schema qui retourne une relation de même schema contenant l'ensemble des tuples qui appartiennent à au moins une des deux relations 
			* remarque : pas de dublipcation de tuples 
			* Syntaxe : R U S
			* notation fonctionelle : Union(R,S) ou OR(R,S)
			* à utiliser pour la question "Produit Présent à Tunis ou Sfax"
			* Graphe : 
		* **intersection**
			* relation entre deux relations de même schema qui retourne une relation de même schema contenant uniquemenet les tuples qui aparaissent a la fois dans les deux relations
			* Syntaxe : R inter S
			* Notation fonctionelle: INTERSECT(R,S) ou AND(R,S)
			* à utiliser pour la question "Produits Présents a Tunis et Sfax à la fois "
			* Graphe : 
		
		* **produit cartésien**
			* relation entre deux relations n'ayant pas d'atributs de même nom qui retourne une relation ayant pour schéma la concaténation des deux schémas et contenant toutes les concaténations possibles des tuples des deux relations. 
			* remarque : commutative
			* Syntaxe: $R\times S$ 
			* notation fonctionnelle: PROD(R,S) or PRODUCT(R,S)
			* à utiliser pour la question : lister toutes les combinaison possibles entre la table A et la table B 
			* pré condition : !! R et S n'ont pas d'attributs de même nom !! 
			* Graphe : 
		* **difference**
			* relation entre deuw relations de même schema qui retourne une relation de mpeme schema contenant l'ensemble des tuples appartenant ç la premiere et n'appartenant pas à la deuxieme 
			* remarque : non commutative
			* Syntaxe : R - S 
			* notation fonctionelle : Diff(R,S) ou MINUS(R,S)
			* à utiliser pour la question "Produit présent à tunis uniquement"
			* Graphe :
		* **Jointure**
			* relation entre deux relations qui retourne une relation de meme schema que le produit cartésien et contenaant un sous ensemble des tuples du produit cartésient qui verifie un prédicat 
			* remarque : 
				*  meme chose que pour la selection sauf pour la condition simple ou on a uniquement rleation1.attribut comparateur relation2.attribut1
			* but : créer toutes les combinaisons significative entre tuples de deux relations 
			* Syntaxe : $R\inf[p]S$
			* question : lister les clients qui ont passé des commandes
			* bien a savoire : l'operation de jointure est celle qui consomme le plus de memoire et de temps CPU .... une methode de l'otpimiser et d'effectuer les jointures sur des tables d'indexes (versions reduites des tables listant seulement les attributs indexés (usually clés))
			* Graphe :   
	* Unaires : 
		* **Renommage**: 
			* relation qui modife le nom d'un attribut  d'une relation
			* Syntaxe: $\rho$\[ancien_nom]:\[nouveau_nom] 
			* question : renommer l'attribut X par l'attribut Y
			* Pré condition : Y n'existe pas déja dans la table 
		* **projection**
			* operation sur une relation qui retourne une relation dont le schéma st celui de la relation initiale à l'exception des attributs non mentionnés en argument
		* remarque : pas de duplication de tuples 
			* Syntaxe: $\Pi$\[liste Attributs] R
			* notation fonctionnelle : R\[liste d'attributs] or PROJECT(R,A1,...,An)
			* !!! Donne lieu à la commande SELECT DISTINCT en SQL. !!!
			* Question : lister les libellés de tous les produits 
			* Graphe : 


		* **selection**
			* Operation sur une relations qui retourne une relation de meme schema mais avec uniquement des tuples qui vérifie un prédicat spécifié en argument (restriction) 
			* remarque 
				* condition sumple : \<attribut> \<comparateur> \<attribut>
				* ou
				* attribut comparateur valeur 
				* où 
			* !!! Donne lieu a SELECT FROM WHERE en  SQL !!!
			* Syntaxe : $\sigma$\[p] R
			* Notation fonctionnelle: $S_{condition}(R)$ ou RESTRICT(R,condition) ou SELECT(R, condition)
			* Question : lister tous les produits dont le prix unitaire est < 20.000
			* Graphe: 
* Arbres d'expression pour l'algèbre relationnelle : 
	* il est possible de représenter les expressions de l'algebre relationelle sous fome d'arbe.
	* les feuilles sont étiquetées par les opérandes des relations spécifiques ou des variables représenant des relations
	* chaque noeud est :... 
	* 


___