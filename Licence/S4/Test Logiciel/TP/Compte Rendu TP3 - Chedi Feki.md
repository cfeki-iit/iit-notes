# TP3: Test avec le framework Robot et la bibliothèque SeleniumLibrary
* Etudiant : **Chedi Feki **
* Institut : **IIT**
* Enseignant : **Mr DHOUIB Walid**
* Matiere : **Test Logiciel**
* Année Académique : **2020/2021**

___ 

## Test Case 1 
### Objectif  
L'objectif de ce test et de verifier le fonctionnement de l'operation d'authentification sur le site "https://demo.nopcommerce.com/".
pour ce faire il faut : 
* ouvrire le navigateur et accéder a l'URL mentionné 
* identifier et cliquer  le lien de la page d'authentification avec son XPath 
* saisir l'email et le mot de passe 
* identifier et cliquer sur le bouton d'authentification.  


### Code du Test Case

```python 
*** Settings ***
Library     SeleniumLibrary

*** Variables *** 
${url}  https://demo.nopcommerce.com/
${BROWSER}  Chrome
*** Test Cases ***

LoginTest 
    
    open browser    ${url}  ${BROWSER}
    click link      xpath://a[@class="ico-login"]
    
    input text      id:Email    godox71289@art2427.com
    
    input text      id:Password     123456789
    
    click element   xpath://button[@class='button-1 login-button']
   
    close browser
```

### Résultats  
![[Pasted image 20210417121505.png]]
![[Pasted image 20210424093535.png]]

## Test Case 2 
### Objectif 
Tester les parametres des éléments d'une page web, en l'occurence ici, le champ input pour l'adresse mail lors du login.  
### Code du Test Case 
```python
*** Settings *** 
Library     SeleniumLibrary

*** Variables *** 
${url}  https://demo.nopcommerce.com/

*** Test Cases ***
Test Parametre 
    open browser    ${url}
    maximize browser window
    title should be     nopCommerce demo store
    click link          xpath://a[@class="ico-login"]
    ${"email_txt"}      set variable     id:Email
    element should be visible       ${"email_txt"}
    element should be enabled       ${"email_txt"}

    input text  ${"email_txt"}     alibensalah@yahoo.com
    
    clear element text  ${"email_txt"}
  
    close browser
```
### Résultats
![[Pasted image 20210424094135.png]]
![[Pasted image 20210424094037.png]]
![[Pasted image 20210424094055.png]]

## Test Case 3 
### Objectif
Test d'un formulaire avec des champs de selection. 
  
### Code Du Test Case 
```python
*** Settings ***
Library     SeleniumLibrary

*** Variables *** 
${url}  http://www.practiceselenium.com/practice-form.html
#${BROWSER}  Chrome
*** Test Cases ***

Practice form
    open browser    ${url}
    maximize browser window
    #radio box
    select radio button     sex     Female
    select radio button     exp     5

    select checkbox     Black Tea
    select checkbox     Red Tea

    select from list by label       continents       Australia
    
    select from list by index       continents  6
    select from list by label       selenium_commands   Switch Commands
    select from list by label       selenium_commands   WebElement Commands

    
    close browser


```
### Résultats 
![[Pasted image 20210424094409.png]]
![[Pasted image 20210424094334.png]]
![[Pasted image 20210424094348.png]]


## Test Case 11
### Objectifs : 
Tester l'enregistrement d'un nouveau compte en remplissant les champs obligatoires. 
### Code source du Test Case : 
```python
*** Settings ***
Library     SeleniumLibrary
#selenium.dev
#robotframework.org -> selenium
*** Variables ***
 

*** Test Cases***

RegisterTest
    open browser    https://demo.nopcommerce.com/
    click link  xpath://a[@class="ico-register"]

    input text  id:FirstName    Ali
    input text  id:LastName     BenSalah
    input text  id:Email        test@gmail.com
    input text  id:Password     123456789
    input text  id:ConfirmPassword  123456789

    select radio button    Gender      M
    select from list by label       DateOfBirthDay  26
    select from list by label       DateOfBirthMonth    August
    select from list by label       DateOfBirthYear     1979     

    
    click element   xpath://button[@id="register-button"]
    
   
```
### Résultats: 
![[Pasted image 20210424095213.png]]
![[Pasted image 20210424095302.png]]
![[Pasted image 20210424095144.png]]