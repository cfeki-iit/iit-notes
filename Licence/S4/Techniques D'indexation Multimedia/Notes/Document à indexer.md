* **Introduction**
		* Dans le cadre du développement de la société de l’information, de nouveaux métiers se créent autour de la ==Valorisation de gisements(origines) de données==. , ils sont issus du monde de l’intermédiation. Ces nouveaux acteurs sont capables de recueillir de ==l'information==, de la traiter, de ==l'enrichir== par croisement avec d’autres gisements pour produire de nouveaux services.
		* En d’autre terme, avec l'expansion ==d'Internet et du Web==, on assiste à une prolifération des ressources hétérogènes (données structurées, documents textuels, composants logiciels, images), conduisant à des volumes considérables. Dans ce contexte ==les outils d'accès à l'information== (moteurs Web, SGBD, etc.) délivrent des résultats massifs en réponse aux ==requetes de l'utilisateur==, générant ainsi une surcharge informationnelle dans laquelle il est souvent difficile de distinguer l’information ==pertinente ou interessante== d’une information ==secondaire== , ou même du ==Bruit==
		* L’objectif de ce module est de maîtriser les concepts de base de ==la recherche d'information==  (document, requête, approche séquentielle, approche basée sur une indexation).
		* Il introduit aussi les différents ==modeles/methodes de Recherches d'information== ainsi que les algorithmes de RI sur le ==web== (principalement l’algorithme ==pageRank==).
			* algorithme dd'analyse de sliens participant au syseme de classemen des pages Web utilisé par le moteur de recherche google. il mesure quantitaviement la popularité d'une page web.
	* **Chapitre 1 : Introduction à la recherche d’information**
		* **1\. Introduction**
			* ==Un système de Recherche D'information (SRI)==, comme son nom indique, est destiné à fournir de ==l'information== à un utilisateur. En effet, dans le contexte actuel de mise à disposition de grandes ==masses de données==, l’heure est à la recherche de ==l'information Necessaire et suffisante== en réponse à ==une requete particulière==, et non, une large diffusion de toutes les informations disponibles. En fait, ==**un SRI devrait permettreà l'utilisateur de récupérer des informations pertinentes à partir des données auxquelles a accés le systeme**==  Or, cette ==transformation des données== en ==information==, à savoir cette plus-value apportée aux données qui sont ==triées==, ==classées==, ==validées==, et bien souvent ==negligeable==: le système laisse à l’utilisateur la charge de retrouver l’information dans la masse de données qui lui est fournie.
			* La recherche d’information (RI) traite de la ==représentation==, de ==l'acquisition==, du ==stockage==,  de ==l'organisation== et de ==l'accès== à l’information (données, texte, son, images, vidéo). Le but principal d’un système de recherche d’information (SRI) est de ==retrouver== les documents ==pertinents== en réponse à une requête utilisateur.
			* ==une requete traduit le besoin en information de l'utilisateur mais aussi ses preferences sur les informations recherchées.==
			* Les documents pertinents sont généralement présentés sous forme d’une ==liste ordonnée==, où l’ordre est basé sur des estimations ==de pertinence==
			*  Il existe plusieurs critères qui interviennent dans les jugements de pertinence. 
				* le degré ==d'importance==, 
				* la ==validité==, 
				* le degré ==d'actualité==, 
				* la ==la qualité== ou la réputation de la source, 
				* l’accessibilité…
			* Dans un processus de recherche d’information, on distingue quatre activités importantes (cf. Figure 1):
				*  L'expression de besoin
				*  la recherche des données
				*  l'analyse de la pertinance des resultats trouvés 
				*  la visualisation ou la présentation des résultats
				*  ![[Pasted image 20210209103342.png]]
			  	**Figure 1. Système de recherche d’information**
			  
			* Les SRI sont des outils capables de ==distinguer des informations pertinentes== des informations non pertinentes. Ils offrent de plus en plus de services.
			* J.Delado  référence trois types différents de système d’informations :
				*  les moteurs de recherche qui proposent une ==liste de réponces== suite à une demande de l’utilisateur. 
					*  On cite par exemple: Google, Yahoo!, Bing...
				*  le modèles « push » d’informations capables de proposer ==des informations sans demande explicite de l’utilisateur==. 
					*  Par exemple le système Letizia, créé par H. Lieberman (https://www.ijcai.org/Proceedings/95-1/Papers/119.pdf)
				*   ==les agents intelligents==
		* **2\. Notions de document et de requête**
			* Le ==document== représente le conteneur élémentaire d’information, ==exploitables== et ==accessible== par le SRI. Un document peut être un texte, une page ==web== , une ==image==, une bande vidéo, etc. En générale, on peut considérer qu’un document comme toute unité qui peut ==consituter une réponce== à un besoin en information exprimé par un utilisateur.
			* Une ==requete== constitue l’expression du besoin en informations de l’utilisateur. Plusieurs systèmes utilisent des langages différents pour décrire la requête :
				* par une ==Liste de mots clés== : cas des systèmes ==SMART==,
				* en ==langage naturel==. : cas des systèmes ==SPIRIT==,
				* en ==langage Booleen==: cas du système ==DIALOG== \[5\],
				* en ==langage Graphique ==: cas du système ==NEURODOC== \[6\].
			* La vocation d’un système de recherche d’information est de mettre en correspondance une ==requete== avec les ==documents== d’un corpus en vue de déterminer le document de contenu le plus ==pertinent== en réponse à la requête.
			* Dans un système de recherche d’information, on distingue trois niveaux:
				*  ==Niveau utilisateur==: un utilisateur a une représentation mentale d’un besoin d’information dont il souhaite obtenir des documents pertinents, c’est-à-dire capables de répondre à ce besoin.
				*  ==Niveau interface de systeme==: à partir de la définition du besoin d’information de l’utilisateur via une requête, le système fournit un certain nombre de documents qu’il juge pertinent vis-à-vis de ce besoin d’information.
				*  ==Niveau Systeme==: la requête interne représente la requête de l’utilisateur dans un langage de requête. Les documents sont indexés sous une forme représentant leur contenu. Le système interprète la requête afin de pouvoir la mettre en correspondance avec les documents indexés.
			* Pour fournir une information ==pertinente==, il existe plusieurs approches de filtrage d’information :
				* ==Approche Séquentielle==
				* ==Approche par Indexation==
				* ....
		* **3\. Approche Séquentielle**
			* Cette approche naïve consiste à considérer une ==requete== comme une ==chaine de caractères==, et un document ==pertinent== comme celui qui contient ==cette chaine de caractères== 
			* À partir de cette vision simpliste, on peut imaginer l'approche qui consiste à ==balayer== les documents ==séquentiellement==, en les comparants avec la chaîne de caractères qui est la ==requete==.
			* Si on trouve la même chaîne de caractère dans un document, alors il est sélectionné comme réponse. Cette approche est évidemment très simple à réaliser. Cependant, elle a plusieurs lacunes:
				* Vitesse: 
					* L'opération de recherche est très lente. Pour chaque requête, on doit parcourir ==tous les documents de la base de données==. En général, il y en a des centaines de milliers, voire des millions. Il n'est donc envisageable d'utiliser cette approche que sur des collections ==de taille reduites== jusqu'à quelques centaines de documents.
				* Pouvoir d'expression d'une requête:
					*  Une requête étant une simple chaîne de caractères, il est difficile d'exprimer des besoins ==complexes== comme "Trouver des documents concernant la base de données et l'intelligence artificielle utilisés dans l'industri".
			* => Cette approche n'est utilisée que dans des systèmes jouets très petits. La plupart de systèmes existants utilisent une approche différente basée sur une ==indexation de l'information==.
		* **4\. Approche par Indexation.**
			* Dans cette approche, on effectue certains ==pré-traitements== sur les documents et les requêtes, ce qu'on appelle ==Indexation== Cette opération vise à construire une ==table/Structure== d'index qui permet à retrouver ==très rapidement== les documents incluant des mots demandés. ==Une requete== peut être maintenant une expression plus complexe, incluant des opérateurs logiques (==AND/OR==) ou d'autres types d'opérateurs.
			* Utilisant cette deuxième approche, on peut voir les opérations et l'environnement de la RI comme suit(cf. Figure 2):
			* ![[Pasted image 20210216085053.png]]
			**Figure 2 : Recherche d’information par indexation**
			* Par rapport à l'approche précédente, cette approche a les avantages suivants:
				* \- ==Rapidité== En effet, on n'a plus besoin du parcours séquentiel. Avec la structure d'index, on peut directement savoir quels documents contiennent tel ou tel mot.
				* \- ==Expression des requetes peut être très complexes==, exprimant des besoins d'information complexes.
			* L’indexation consiste à identiﬁer l’information contenue dans tout texte et à la représenter au moyen d’un ensemble d’entités appelé index pour faciliter la comparaison entre la représentation d’un document et d’une requête.
			* Techniquement, l'indexation peut être manuelle, automatique ou semi-automatique \[Salton, 88\].
				* ==L'indexation manuelle==, c'est un opérateur humain, généralement expert du domaine, qui se charge de caractériser, selon ses connaissances propres, le contenu sémantique d'un document. Cette approche présente deux inconvénients:
					* 1\. elle est subjective, puisque le choix des termes d'indexation dépend de l'indexeur et des connaissances du domaine,
					* 2\. elle est pratiquement inapplicable aux corpus de textes volumineux
				* ==L'indexation Automatique Classique== est fondée sur l'analyse des documents en vue de l'extraction des ==termes== (mots clés simples ou composés) représentatifs de leur contenu informationnel. Elle repose sur les étapes suivantes : l'extraction des ==termes d'indexation== , la réduction du ==langage d'indexation== et la pondération des ==termes d'indexation==
				* ==L'indexeation semi-automatique== appelée aussi indexation supervisée, est une combinaison des deux approches d’indexation précédentes. Dans ce cas, les indexeurs utilisent un ==vocabulaire== sous forme de thésaurus ou de base terminologique. Le choix final des termes d’indexation à partir du vocabulaire fourni, est laissé ainsi à l’indexeur humain (généralement spécialiste du domaine).
		* **5\. Evaluation globale du système**
			* L’évaluation constitue une étape importante dans la mise en œuvre d’un SRI. Cette étape permet de ==Mesurer les caractèristiques== du système en termes de ==Qualité== de service et de ==facilité== d’utilisation.
			* Deux mesures sont généralement utilisées pour évaluer la qualité d’un système de recherche d’information, c’est-à-dire sa ==performance== à renvoyer des documents ==pertinants== en réponse à une requête utilisateur.
				* − Le ==Rappel== qui mesure la capacité du système à sélectionner tous les documents pertinents. 
				* − La ==Precision== qui mesure la capacité du système à sélectionner que des documents pertinents.
			* Pour calculer ces mesures, on confronte le point de ==vue de l'utilisateur== avec celui du ==systeme==
			* Pour une requête
				* − l’utilisateur fournit les documents qu’il juge pertinents pour cette requête
				* \- le système fournit les documents qu’il retrouve pour cette requête.
				* ![[Pasted image 20210216085203.png]]
				**Figure 3: distribution des entités lors d'une reuquete**
			* Le rappel mesure la capacité du système de RI à trouver, pour une requête, tous les documents pertinents. Le rappel peut donc se définir comme la probabilité pour un document d’être retrouvé, sachant qu’il est pertinent.
				* $$Rappel = \frac{\text{Nombre de Documents Pertinants Retrouves}}{\text{Nombre de Documents Pertinants}}$$
			* La précision mesure la capacité du système de RI à trouver, pour une requête, uniquement les documents pertinents. La précision est une mesure très intéressante pour mesurer la qualité des réponses du point de vue de l’utilisateur.
				* $$Precision = \frac{\text{Nombre de Documents Pertinants et Retrouves}}{\text{Nombre de Documents retrouves}}$$
			* Pour comparer deux systèmes de recherche d’information, le même corpus de test est utilisé. Pour chaque ==Systeme== , une courbe ==Rappel/précision== est construite. Le système dont la courbe dépasse, c'est-à-dire dont la courbe ==se situe au dessus== de celle d'un autre est considéré comme un ==meilleur systeme==
