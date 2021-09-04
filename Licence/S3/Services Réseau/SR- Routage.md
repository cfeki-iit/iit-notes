## Metadata:
* Tags:
* Course : [[Services Réseau]]
* Started On : 2020-09-14
* Previous Chapter : [[SR- Rappel]]
* Next Chapter : [[SR- VLAN]]


## Slides 
* [[SR-Routage1.pdf]]
* [[SR-Routagfe2.pdf]]
* [[SR-Routage3.pdf]]
# Summary :

* 2020-09-29 :
	* [x] finir paragraphe page 10
 

# Chapitre 1 - Routage

Routing is all about linking Networks one to another throught their default gateways (routers). 
This is done by filling up a router's Routing Table which contains subnet masks of various LANs and the next Hop to reach them. 

## Router (Routeur)

Routers are basically specialized computer in that they are composed of a Processing unit ( CPU ), Memory and an Operating System.

* **Boitier** ( specificly panneau arrière)
	* Port Console (RJ-45)
		* pour configuration initiale
		* usually its cable is a RJ-45 into a serial female head ... most probably need a Serial male to USB ( might require Driver to work properly ) to plug it into modern PCs
	* Port USB (usb type A to Usb type B mini cable )
* **CPU** 
* **Memory**
	* Volatile
		* *RAM* - Random Access Memory (mémoire vive)
			* Stockage temporaire pour divers processus et applications y compris
				* IOS en cours d'execution
				* Fichier de configuration en cours
				* Tables ARP et routage IP
				* Memoire tampon de paquets
		* *Cache registers*
	* Permanante
		* *ROM* - Read Only Memory (Memoire Morte)
			* Instructions de démarrage ( BIOS )
			* Logiciel de diagnostique de base
			* IOS limité en cas de probleme de chargement de l'ios complet
		* *NVRAM* - Non Volatile RAM 
			* Fichiers de configuration initiale 
			* fichier de configuration après intervention du gestionnaire réseaux pour ne pas perdre la configuration après chaque redémarrage du routeur 
		* *Flash*
* OS

### Configuration des paramètres de base du routeur
une fois connecté par cable console et le logiciel d'émulation démarré. on doit naviguer d'un mode "utilisateur" vers un mode "priviligié" ou "administratuer" en utilisant la commande *enable*. Ensuite on doit acceder a l'environnement de configuration avec la commande *Configure terminal*

1. Enable
2. Configure Terminal
	* Securiser l'accès à la gestion
		* creation du login et mot de passe au mode priviligié en accès console
		* creation du login et mot de passe au mode priviligié en accès distant
		* Encryptage des mots de passes dans les fichiers de configuration
	* Configurer une bannière
		* Customized message displayed when accessing the console
	* Sauvegarder la ocnfiguration
		* 
	* Configurer les interfaces
		* ip address
		* ipv6 address
		* i
		* *Interface loopback*  ou *interface de bouclage*: 
			* interface logique et interne au routeur avec des addresses ip appartenant des interface physiques du routeur pour tester le routage sans forcément relier le routeur au réseau .
			* l'interface de bouclage et utilisée en cas de tests ou de configuration car elle garantie qu'au moins une interface ( meme virtuelle ) est toujours disponible Pour tester le routage / filtrage dynamique / fonctionalités internes du routeur 
			* la configuration de l'interface loopback0 se fait exactement comme la configuration d'une interface physique 
	* Affichage des récapitulatifs de l'interface 
		* R# show ip interfaces brief
			* details IP en bref
		* R# show ip interfaces
			* tous les details IP des interfaces
		* R# show interfaces
			* Toutes les informations sur toutes les interfaces du routeur 
	* Afficher la table de routage
		* R# Show IP Route
### Fonction de commutation du routeur 

## IPv4 - IPv6
* Adresse ipv4 : 4 octets ( décimale )
* Adresse ipv6 : 16 octets ( hexadecimale )
* 
___