---
aliases: [CCC, ConsConfCom, Console Configuration Commands]
---

# Affichages 
- interfaces brief : résumé de toutes les interfaces (ipv4, état etc) 
```console
	Router> enable
	Router# show interfaces brief
```

```console
	Router> enable
	Router# show ipv6 interfaces brief
```
* 
	* tous les détails d'une interface specifiée
```console
	Router> enable
	Router# show interface g0/0
```

```console
	Router> enable
	Router# show ipv6 interface g0/0
```
- ip route: affiche la table de routage
```console
	Router> enable
	Router# show ip route
```
```console
	Router> enable
	Router# show ipv6 route
```
- configuration courante : affiche les commanades configurées sur l'interface mentionnée
```console
	Router> enable
	Router# show running-config interface G0/0
```
# Configuration d'un Routeur
- Mode Configuration:
```console
	Router> enable
	Router# config terminal 
	// alt : configure terminal
	// alt : conf t 
```
- Hostname (nom du périphérique): 
```console
	Router(config)# hostname R1
	R1(config)# _
```
- Banner (bannière):
```console
	R1(config)# banner motd $hello world !$
```
- Save Config File: 
```console
	R1(config)# copy running-config startup-config 
	// ken hethi commande lbe9i console text.
	Destination filename [startup-config] ?
	Building configuration...
	[OK]
```
- Secure Access
```console
	R1(config)# enable secret class
	R1(config)# line console 0
	R1(config-line)# password [put your password here]
	R1(config-line)# login [put your login here]
	R1(config-line)# exit
	// ^ bech tconfiguri el console localement ( mel routeur nafsou )
	R1(config)# line vty 0 4
	R1(config-line)# password [put password here]
	R1(config-line)# login [put your login here]
	R1(config-line)# exit
	// ^ bech tconfiguri console distant (mana3rafch what this is)
	R1(config)# service password-encryption
	// ^ bech ya3mel chiffrage lel mot de passe wa9t isajjel el config file.
	
```
- Configuration des Interfaces
	- interface G0/0, IPv4
```console
	R1(config)# interface G0/0
	R1(config-if)# description [put interface description here]
	R1(config-if)# ip address [IPv4] [masque réseau]
	R1(config-if)# no shutdown
	R1(config-if)# exit
```
* 
	- interface S0/0/0, IPv4
```console
	R1(config)# interface s0/0/0
	R1(config-if)# description [put interface description here]
	R1(config-if)# ip address [IPv4] [masque réseau]
	R1(config-if)# no shutdown
	R1(config-if)# exit
```
*
	- interface G0/0, IPv6
```console
	R1(config)# interface G0/0
	R1(config-if)# description [put interface description here]
	R1(config-if)# ipv6 address [IPv6]/[nombre de bits à 1 du masque]
	// ^ exemple : 2001:db8:acad:3:0000:1/64
	R1(config-if)# no shutdown
	R1(config-if)# exit
```
* 
	- interface S0/0/0 IPV6
```console
	R1(config)# interface G0/0
	R1(config-if)# description [put interface description here]
	R1(config-if)# ipv6 address [IPv6]/[nombre de bits à 1 du masque]
	// ^ exemple : 2001:db8:acad:3:0000:1/64
	R1(config-if)# no shutdown
	R1(config-if)# exit
```

- Configuration des l'interface Loopback0
```console
	R1(config)# interface loopback 0
	R1(config-if)# ip address [IPv4] [Masque réseau]
	R1(config-if)# no shutdown
	R1(config-if)# exit
```

# Routage Statique
route ipv4
```console
	Router> enable
	Router# ip route [Adresse Réseau] [Next-Hop IPv4]
```
Route ipv4 par défaut : 
```console
	Router# ip route 0.0.0.0 0.0.0.0 [Exist Interface] [Next-Hop IP]
	// Exit interface = port série li mechi l 'another router
```
# Routage Dynamique
## protocole RIP 
* Activation RIPv1
```console
	Router> enable
	Router# conf t 
	Router(config)# router rip
	Router(config-router)# _
```
* Activation RIPv2
```console
	Router(config-router)# version 2 
```
* Désactivation rip
```console 
	Router(config)# no router rip
```

* Propagation d'une route par défaut :
	* Doit etre faite par un routeur de périférie (end router)
	*  une route par défaut doit étre configurée ( see above )
```console
	Router(config-router)#default-information originate
```
# VLAN
Affichage des vlans configurés sur le switch : 
```console
	Switch> enable
	Switch# show vlan 
```
Affichage des details d'un vlan par nom : 

```console
	Switch> enable
	Switch# show vlan name [Vlan Name]
```
Configuration d'un vlan : 
```console
	Switch> enable
	Switch# conf t
	Switch(config)# vlan 20
	Switch(config-vlan)# name [VLAN NAME]
	Switch(config-vlan)# end
```
Configuration de plusieurs VLANs: 

```console 
	Switch(config)# vlan 20 30 40 // crée  les vlans 20 30 et 40 
	// ou 
	Switch(config)# vlan 20-50 // crée les vlans 20 30 40 et 50
```

## Configuration des interfaces 
* Access port : pour les périphériques (unique à 1 Vlan)

```console
	Switch> enable
	Switch# conf t
	Switch(config)# interface f0/0
	Switch(config-if)# switchport mode access
	Switch(config-if)# switchport access vlan 20
	Switch(config-if)# end
``` 
* Trunk : pour les switches (transmettent plusieurs VLans)

```console
	Switch> enable
	Switch# conf t
	Switch(config)# interface f0/0
	Switch(config-if)# switchport mode trunk
	Switch(config-if)# switchport trunk native vlan 99
	Switch(config-if)# switchport trunk allowed vlan 10,20,30,99 
	//^ liste des vlans qui peuvent communiquer sur ce trunk
	Switchport(config-if)# end;
``` 
# Routage entre VLANs
* Router-on-a-stick:
	* Il faut configuer les interfaces du routeur en dot1q et assigner les differentes sous-interfaces (sub interface / virtual interface) au vlans correspondants: 
```console
	Router(config)# interface g0/0.10 
	// le 10 est l'identifiant de l'interface virtuelle, le . un separateur
	Router(config-subif)# encapsulation dot1q 10 
	// assigne l'interface virtuelle au vlan 10 
	Router(config-subif)# ip address [ipv4 address] [masque réseau]
	Router(config-subif)# exit
	Router(config)# intergace g0/0
	router(config-if)# no shutdown
	// applique le no shutdown a toutes les sous-interfaces
```