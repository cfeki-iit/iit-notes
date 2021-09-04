---
#chose 1 of the above, usually Raw, becomes Digested when
# uncomment the line below
tags: #Source/lecture_Note/raw
aliases: [202102230835 LN-Techniques de Recherche Multimedia 3, ] 
---
<!--topic should reference the big themes of a certain lecture, not necessarily the Title of the Course -->
* Topic:
* Date: 2021-02-23
* Given By: [[@Rafik Khemakhem]]


# Notes 
* Indexation : 
	* [[processus]] permettant de construire un ensemble d'éléments clés permettant de caractériser le contenu d'un deocument 
	* permet de retrouver ce document en réponse ua une requete 
* les indexes sont utilisés pour représenter le contenu des documents 
	* ils ne represente qu'une partie du contenu des documents 
	* ils peuvent prendre pluieirs formes 
	* il sont plus ou moinsn difficiles a extraire 
	* leur stockage requiert plus ou moins de mémoire 
* Terme 
	* une unité lexicale ayant un sens specifique dans un domaine de specialité specifique 
		* simple 
		* complexe 
* Modes d'indexation 
	* Indexation manuelle
		* Choix des mots effectuée par des indexeurs (people)
		* basée sur un vocabulaire controlé 
		* souvent utilisée dans les bibliotheques et 
		* inconvenients
			* très couteuse a construire 
	* Indexation Automatique 
		* processus complétement automatisé qui permet d'extraire les termes caracteristiques 
		* capacité a traiter les textes sfaster que l'indexation manuelle
		* adaptés au corpus volumineux
		* processus : 
			* Extraction des termes 
				* terme = suite de caractères séparés par un séparateur 
				* dépend du langage
				* Supression des Mots trop fréquents
					* the or a you i us 
					* le la de des je tu
					* /!\ US for USA
					* /!\ a for vitamin a
			* Normalisation
				* niveau syntaxique 
					* en analyse syuntaxique il s'ait de repere les groupes de mots ou des mots composés l'utilisation ds trermes xomposés doit permettre d'augmenter la precision de réponse dans la mesure ou le critere possede une signification
				* Niveau Lexical 
					* les mots composants le texte sont exctraits et le modtes vides sont éliminés 
					* etape supplémentaire eventuellement requise pour eliminer les variantes morphologiques des mots. 
					* deux procédures: 
						* Lemmatisation 
							* processus morphologique permettant de regtouper les variantes d'un mot 
							* ex : ==Econom==ie ==econom==ique ==econom==iquement
						* Troncature/ Racinisation
							* supprimer le suffixe ( rarement préfixe) des mots significatifs du texte indexé
				* Niveau Sémantique
					* s'interesse a reconnaitre les sens des mots, les mots synonimes, 
			* Reduction du langage: 
				* Pondération des termes 
					* $$W_{ij}=\frac{tf_{ij}}{df_j}=tf_{ij}\times \frac{1}{df_j}= tf_{ij}\times idf_j$$
					* avec i = nombre du terme 
					* et j = nombre du document
			
	*  Indexation Semi-Automatique/ supervisée
		*  ccombinaison des methodes precedentes en privilégiant l'intervention humaine
		*  les experts caractérisent les idées contenues dans une entrée (metadata)
		*  indexation automatique vient ensuite en tenant compte des metadata
		*
* Présentations : 
	* notions de pertinence et de modele de recherche d'informations 
	* problematiques multimedia 
	* evaluation des performances qualitatives des systemes 
	* notions de rappel et precision 
	* methodes pratiques d'evaluation 
	* comparaison de systemes




# Document Word
* Chapitre 2 : Indexation pour la recherche d’information**
	* 1\. Introduction**
		* Rappelons qu’un Système de Recherche d’Informations est un système informatique qui permet de retourner à partir d’un ==corpus documentaire==, ceux dont le contenu correspond le mieux à un besoin en ==information== d’un utilisateur, exprimé à l’aide d’une ==requete==
		* Il inclut un ensemble de procédures et d'opérations qui permettent la gestion, le stockage, l’interrogation, la recherche, la sélection et la représentation de cette masse d’informations. Afin de mettre en correspondance la requête et les documents, une interprétation de la requête et une ==indexation== des documents du corpus s’avèrent nécessaires
	* **2\. L’indexation**
		* Généralement, la recherche dans un ==SRI== consiste à comparer la représentation interne de ==la requete== aux représentations internes ==des documents== de la collection. La requête est formulée, par l’utilisateur, dans un langage de requêtes qui peut être le langage naturel, un langage à base de mots clés ou le langage booléen. Elle sera transformée en une représentation interne équivalente, lors d’un processus d’interprétation. Un processus similaire, dit ==d'indexation==, permet de construire la représentation interne des documents de la base documentaire. En fait, l'indexation est le processus qui a pour but, à partir d'un texte de base, ==d'extraire== les mots les plus importants utilisés ensuite pour représenter le texte lors de la phase de recherche.
		* ![](file:///C:\Users\user\AppData\Local\Temp\msohtmlclip1\01\clip_image002.jpg)
		Figure 1. Processus d’indexation
		* Les **==Indexes==** sont utilisés pour représenter le contenu des documents:
			* Ils ne représentent qu’une partie du contenu des documents
			* Ils peuvent prendre plusieurs formes (ex : mots simples, termes, syntagmes, entrées dans un thésaurus, etc.)
			* Ils sont plus ou moins difficiles à extraire
			* Leur stockage requiert plus ou moins de mémoire
		* En phase d'indexation, le document (ou la requête) est analyse(e) et les ==mots clés== caractérisant son contenu informationnel, sont extraits. Un mot clé peut-être soit un mot simple ou un groupe de mots. Les mots-clés descriptifs du contenu sémantique d'un document sont dits ==termes d'indexation==
	* **3\. Modes d’indexation**
		* Une indexation est la description d’un document effectuée dans la perspective d’une utilisation. Elle peut être ==Manuelle==, ==Automatique== ou ==Semi-automatique==.
			*  ==**L'indexation Manuelle**== est réalisée par des documentalistes. Ces experts ont pour tâche de caractériser au mieux les idées contenues dans les unités documentaires. Cette indexation requiert un important effort intellectuel et cognitif pour identifier et décrire la catégorie des unités documentaires. Ce type d’indexation permet d’obtenir une caractérisation performante mais subjective car cette approche dépend fortement des connaissances du domaine des documentalistes. En plus, elle trouve ses limites pour de grandes bases de documents qui nécessitent énormément de temps pour être traitées. Une autre caractéristique fréquemment soulignée de l'indexation humaine est sa variabilité. En effet, même si l'indexation s'appuie sur un langage documentaire, des descripteurs différents peuvent être proposés pour représenter un même document suivant l'interprétation faite du contenu du document.
			*   ==**L'indexation automatique**== est un processus complètement automatisé qui permet d’extraire les termes caractéristiques du document. L’intérêt d’une telle approche réside dans sa capacité ==à traiter les textes plus rapidement== que l’approche précédente, et de ce fait, elle est particulièrement adaptée aux corpus volumineux. L’indexation automatique est l’approche la plus étudiée en RI.
			*    L==**'indexation semi-automatique ou supervisée**==, est ==une combinaison== des méthodes d’indexation manuelle et automatique en privilégiant toutefois l’intervention humaine. Ainsi, les experts (spécialistes du domaine) caractérisent les idées contenues dans une unité documentaire sous la forme de méta-informations. Une indexation automatique est ensuite réalisée pour l’unité documentaire en tenant compte de ces méta-informations. L’intérêt d’une telle indexation réside principalement dans sa rapidité d’exécution qui est tout à fait adaptée à des volumes très importants. Pour de grandes bases, la tendance générale s’oriente vers un processus d’indexation automatique permettant d’extraire rapidement les termes représentatifs des unités documentaires.
	* **4\. Indexation automatique**
		* L'indexation automatique classique est basée sur l'analyse des documents ==en vue de l'extraction des termes==(mots-clés simples ou composes) représentatifs de leur contenu informationnel. Elle repose sur les étapes suivantes : l'extraction des termes d'indexation, la réduction du langage d’indexation et la pondération des termes d'indexation.
		* 1\. Extraction des termes d’Indexation
			* L'extraction des termes d’indexation se base sur une analyse linguistique du texte du document. Plusieurs niveaux d’analyse peuvent être distingues : ==Analyse Lexicale==,==Analyse Syntaxique== et ==Analyse Semantique==
				* En **analyse lexicale**, les mots composant le texte sont extraits et les mots vides (prépositions, pronoms personnels,…) éliminés. Une étape supplémentaire peut être nécessaire en vue d'éliminer les variantes morphologiques (genre, nombre, dérivations, ...) des mots. Le traitement associe repose sur deux procédures : la lemmatisation et la troncature (ou racinisation). La racinisation consiste à supprimer le suffixe (et plus rarement le prefixe) des mots significatifs du texte indexe. La lemmatisation (stemming en anglais) a pour objectif de prendre la forme canonique du mot.
				* En **analyse syntaxique**, Il s’agit de repérer les groupes de mots ou des mots composés. L’utilisation des termes composés doit permettre d’augmenter la précision de réponse dans la mesure où le critère possède une signification plus précise et un usage plus restreint (plus significatif) que les mots qui le composent.
				* L'**analyse sémantique** s'intéresse a reconnaitre les sens des mots, les mots synonymes, les concepts représentatifs de ces mots, et plus généralement les relations sémantiques entre les mots.
		* 2\. Réduction du langage d’Indexation
			* Cette étape vise à réduire le nombre de termes d’indexation en éliminant tous les mots non importants (mots rares ou mots trop fréquents) du langage d’indexation.Pour mesurer l’importance d’un mot dans un document, l’indexation s’appuie sur la fréquence d’occurrence de ce mot dans le document. Les mots de fréquence quasi nulle et les mots à fréquence trop élevées peuvent être éliminés de l’index.
		* 3\. Pondération des termes d’Indexation
			* La pondération des termes d’indexation consiste à affecter un poids d’importance (ou valeur de représentativité) _wij_à chaque terme _tj_ d’un document _di._.Généralement, les formules de pondération utilisées sont basées sur la combinaison d’un facteur de pondération local quantifiant la représentativité locale du terme dans le document, et d’un facteur de pondération global quantifiant la représentativité globale du terme vis-à-vis de la collection de documents
			* Plusieurs formules existent, dont :
				*  _Wij\=tfij/dfj\=tfij\*1/dfj\=tfij\*idfj_
					*  \- _tfij_ : est la fréquence d’occurrences du terme _$tj$_dans le document di.
					*  - _$dfj$ :_ est la fréquence documentaire du terme _$tj$_ (la proportion de documents de la collection qui contiennent $t_j$).
					* Idfj : sa fréquence documentaire inverse.
			*  Soit le document Djet le terme ti, alors la fréquence du terme dans le document est :
			*  ![](file:///C:\Users\user\AppData\Local\Temp\msohtmlclip1\01\clip_image004.jpg)
			*  où ni,j est le nombre d'occurrences du terme ti dans Dj. Le dénominateur est le nombre d'occurrences de tous les termes dans le document Dj.
			*  Rappelons aussi que La fréquence inverse de document idf (inverse document frequency) est une mesure de l'importance du terme dans l'ensemble du corpus. Elle consiste à calculer le logarithme de l'inverse de la proportion de documents du corpus qui contiennent le terme :
			*  **![](file:///C:\Users\user\AppData\Local\Temp\msohtmlclip1\01\clip_image006.jpg)**
				*  Où │D│: nombre total de documents dans le corpus
				*  │ {dij : tiÎDj} │: nombre de documents où le terme _ti_ apparaît.

Sachant que Wij = tfij× idfi, Calculer les poids d’importance W21, W22, W31, W32, W61,. (Avec W_ij_ : le poidsd’importance à chaque terme tidans un document Djpar exemple W21représente le poid d’importancedu terme 2 dans le document 1) ?

**5\. Conclusion**

Le résultat de l’indexation constitue, ce que l’on nomme le **descripteur** du document ou de requête. Ce dernier est souvent une liste de termes ou groupe de termes significatifs pour l’unité textuelle correspondante, généralement assortis de poids représentant leurs degrés de représentativité du contenu sémantique de l’unité qu’ils décrivent.

Les descripteurs des documents (mots, groupe de mots) sont rangés dans une structure appelée dictionnaire constituant le **langage d’indexation**.

# Résumé :

1. Définir la notion d’indexation
	1. processus permettant de contruire un ensemble de mots clés caractérisant  l'information contenu dans un corpus documentaire

2. Donner et définir les différents méthodes d’indexations
	1. Indexation Manuelle 
		1. 
	2. Indexation Automatique 
		1. 
	3. Indexation Semi Automatique
		1. 

3. L'extraction des termes d’indexation se base sur une analyse linguistique du texte du document. Plusieurs niveaux d’analyse peuvent être distingues : *le niveau lexical*, *syntaxique* et *sémantique*.
	1. Lexical 
		1. 
	2. Syntaxique
		1. 
	3. Sémantique
		1. 
4. Définir :
	1. Pondération
		1. calcul du nombre d'occurences d'un mo 
	2. Lemmatisation
		1. processus morphologique permettant de regrouper les variantes d'un meme terme
	3. Troncature
		1. le faite de supprimer le préfixe ou generalement le suffixe d'un mot. EN français la longeur optimale est de 6 caractères
---
[[202102230835 LN-Techniques de Recherche Multimedia 3#Notes|up]]