---
tags: "Notes"
---

* Course:[[Cloud et Virtualisation]]
* Date: 06-10-2021 


# Virtualisation des Serveurs
* La virtualisation des serveurs est le faite d'executer plusierus machines virtuelles sur une machine physique 
* Hypervisor
	* Type 1 : ESXI
		* s'installent directement sans OS sur la machine physique
	* Type 2 : (VMWare, Virtual Box)
		* necessitent un OS sur la machine physiqe pour lancer la virtualisation
* La virtualisation est une abstraction des ressources informatiques 
	* Percevoir une ressource physique comme plusieurs ressources logiques 
	* ET 
	* Percevoir plusieurs ressources physiques come une seule ressource Logique 
		* VMware VCenter permet de regrouper tous les hyperviseurs (physiques et logiques) sous une seule machine (cluster)
* Cloud Privé : 
	* Architecture des Serveurs 
		* Carte mère
			* Multi-processeur
				* Intel XEON ou AMD RYZEN
				* memoire Cache
					* très petites quantités de memoire dans l'architecture meme des processeurs à très grande vitesse 
				* Hyper Threading 
				* Turbo Boost
			* Tera-Octets de RAM
				* Error Correction Code(ECC) Rams, technologie pour detecter et corriger les erreurs 
				* Barettes avec registre ou tampon ( buffered)
				* Dual Channel & Quad Channel 
			* +2 Blocs d'alimentation (pour alimenter via 2 fournisseurs d'electricité)
				* pour eviter les pannes de sources externes 
			* Tera-octets de Disques Durs remplaçables a chaud 
			* Carte memoire ou USB pour installer les hyperviseurs

---
[[Virtualisation des Serveurs#Notes|up]]