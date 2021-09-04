
```sql
CREATE TABLE PRODUIT (Numprod   NUMBER(6) [PRIMARY KEY],
					  Desprod   VARCHAR2(15) UNIQUE    ,
					  Couleur   CHAR  NOT NULL         ,
					  Poids     NUMBER(8,3)            ,
					  Qte_stk   NUMBER(7,3)            ,
					  Qte_seuil NUMBER(7,3)            ,
					  Prix      NUMBER(10,3)           ,
					  CONSTRAINT PK_Produit PRIMARY KEY(Numprod)
					 );
```
---
```sql
CREATE TABLE MAGASIN ( NumMag NUMBER(6) PRIMARY KEY,
					   Adresse VARCHAR2(40) , 
					   Surface NUMBER(7,3) 
					 );
					 
CREATE TABLE PRODUIT ( NumProd NUMBER(6) PRIMARY KEY,
					   DesProd VARCHAR2(20) ,
					   Couleur CHAR      ,
					   Poids NUMBER(7,3) , 
					   Qte_STK NUMBER(7) ,
					   CodMag NUMBER(6)  ,
					  CONSTRAINT FK_PROD FOREIGN KEY(CodeMag) REFERENCES MAGASIN(NumMag),
					  CONSTRAINT poids_pos CHECK(Poids > 0),
					  CONSTRAINT Qte_maxMin CHECK(Qte_STK BETWEEN 0 and 1000),
					  CONSTRAINT Color_in CHECK (Color IN ('N', 'G', 'B'))
					 );
```
---
```sql
CREATE TABLE COMPAGNIE ( NComp NUMBER(6),
						 NomComp VARCHAR2(20) NOT NULL,
						 AdrComp VARCHAR2(20) NOT NULL,
						 Ville VARCHAR2(20),
						CONSTRAINT PK_COMPAGNIE PRIMARY KEY (Ncomp)
					   );
CREATE TABLE PILOTE ( NPIL NUMBER(6),
					  Nom VARCHAR2(20) NOT NULL,
					  NbHvol NUMBER(7,3) ,
					  Compa NUMBER(6),
					  CONSTRAINT PK_PILOTE PRIMARY KEY(NPil),
					  CONSTRAINT CK_NBHvol CHECK(NbHvol BETWEEN 0 and 2000),
					  Constraint UN_Nom UNIQUE(nom)
					  CONSTRAINT FK_Pilote FOREIGN KEY(Compa)
					                       REFERENCES COMPAGNIE(NComp)
					);
```
---