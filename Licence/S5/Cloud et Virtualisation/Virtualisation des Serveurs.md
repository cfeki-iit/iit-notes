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
* Hyperviseur 
	* logiciel qui permet de faire la virtualisation 
	* Type 1 : Bare Metal  
	* Type 2 : Hébergé
		* logiciel qui s'installe et s'execute
* Techniques de virtualisation
	```mermaid
	graph TD
	A(Virtualization)-->B(Operating System Virtualization)
	B-->X1(Linux LXC, Docker, AIX WPAR)
	A-->C(Emulation / Full Virtualization)
	A --> D(ParaVirtualization)
	A --> E(Hybrid Paravirtualization)
	
	C-->VT(Hardware Assisted-VT)
	C --> BT(Software Assisted -- BT)
	BT --> H2(Hosted)
	H2-->X4(VMware Workstation 32bit, Virtual PC, Virtual Box 32bit, VMware Server)
	VT --> BM(Native / Bare-Metal)
	BM --> X2(VMware ESXi/ESX, KVM, Hyper-V, Xen)
	VT --> H1(Hosted)
	H1--> X3(VMware Workstation, Virtual Box)
	```
	
* Docker : 
	* 

---
[[Virtualisation des Serveurs#Notes|up]]