# Acquisio Web.com - test en ligne
(See below for the english version - Acquisio Web.com - online test)

Bonjour et bienvenue au test en ligne d'Acquisio Web.com. Nous vous remercions de prendre le
temps de remplir ce test. Ceci nous permettra d'évaluer vos connaissances générales
au niveau du développement logiciel. Il n'y a pas de limite de temps, et n'hésitez pas 
à envoyer vos questions si vous avez besoin de clarification à [pldupont@acquisio.com](mailto:pldupont@acquisio.com)

Veuillez travailler directement dans le répertoire GitHub.com qui vous sera fourni.

Le test en séparé en 3 sections principales. Soit:
 1. Questions génériques sur Java
 1. Questions génériques sur SQL
 1. Questions d'implémentation d'une fonctionalité dans une Application Web

Afin de voir votre méthode de penser et votre cheminement, veuillez commit aussitôt que possible.
Lorsque vous aurez terminer, n'oubliez pas de faire un "push" de vos changements. Svp, ne pas faire
de "Squash" sur vos commits.

### Générique Java
Pour les questions reliées à votre connaissance de Java, vous les trouverez dans le 
package "com.acquisio.basic.java". Il y a 8 questions à répondre. Chaque sous-package
contient 1 classe avec un main. Suivez les instructions dans la documentation de cette
classe. Veuillez ajouter les tests et la javadoc que vous jugez nécessaire.

Les points d'entrées sont:
 * [FooBar.java](src/main/java/com/acquisio/basic/java/question01/FooBar.java)
 * [TreeNavigation.java](src/main/java/com/acquisio/basic/java/question02/TreeNavigation.java)
 * [IssueResolving.java](src/main/java/com/acquisio/basic/java/question03/IssueResolving.java)
 * [Generics.java](src/main/java/com/acquisio/basic/java/question04/Generics.java)
 * [Refactoring.java](src/main/java/com/acquisio/basic/java/question05/Refactoring.java)
 * [Debugging.java](src/main/java/com/acquisio/basic/java/question06/Debugging.java)
 * [Calculator.java](src/main/java/com/acquisio/basic/java/question07/Calculator.java)
 * [Lambdas.java](src/main/java/com/acquisio/basic/java/question08/Lambdas.java)

### Générique SQL
Pour les questions reliées à votre connaissance SQL, vous les trouverez dans le package
"com.acquisio.basic.sql". Il y a 2 questions à répondre. Chaque sous-package contient
1 classe avec un main. Suivez les instructions dans la documentation de cette classe.
Nous regarderons seulement la requête SQL que vous aurez ajouté. Le code utilise
une base de données H2, en mémoire, ré-initialiser à chaque exécution.

Les points d'entrées sont:
 * [Aggregation.java](src/main/java/com/acquisio/basic/sql/question01/Aggregation.java)
 * [Extraction.java](src/main/java/com/acquisio/basic/sql/question02/Extraction.java)

### Application Web

#### Contexte
Cette application affiche une liste des employés. L'application consiste en 2 partie. Le back-end, fait en Java 8 avec Spring-Boot
et le UI fait avec Angular 5.

#### Projet
Le projet consiste à utiliser le service externe [Gravatar](https://fr.gravatar.com/site/implement/). Gravatar est un outil
en ligne permettant d'associer une image de profil à une adresse courriel. Donc, en suivant les instructions sur le site de
Gravatar, modifier l'application Spring-Boot afin que le endpoint /employees retourne l'information nécessaire afin d'afficher
le gravatar correspondant à l'adresse courriel des employés. 

La 2e partie du projet est optionelle et consiste à modifier l'application Angular afin d'afficher l'image de profile pour
chacun des employées.

Ajouter toute documentation et tous les tests que vous jugez pertinent.

Les instructions pour démarrer l'application Spring-Boot et l'application Angular sont disponibles ci-dessous.

#### Au niveau Java
Tout le code de l'application se trouve sous le package "com.acquisio.com" et les classes principales sont:
 * [FullStackApp.java](src/main/java/com/acquisio/app/FullStackApp.java) ==> Application principale
 * [EmployeeController.java](src/main/java/com/acquisio/app/controller/EmployeeController.java) ==> REST Endpoint
 * [Employee.java](src/main/java/com/acquisio/app/domain/Employee.java) Classe représentant un employé, dommaine

Pour démarrer l'application Spring-Boot, vous devez:
 1. Avoir java 8 d'installé.
 2. Avoir maven d'installé. (version 3.x)
 3. Exécuter la commande suivante à partir de la racine du projet: 
```
mvn clean spring-boot:run
```
Une fois démarré, vous devriez pouvoir appeler le endpoint suivant: http://localhost:8080/employees


#### Au niveau Angular
Le code se retrouve sous la structure 'client/src/app' et les composants principaux sont:
 * [app.component.html](client/src/app/app.component.html) ==> Application principale
 * [app.component.ts](client/src/app/app.component.ts) ==> Application principale
 * [employee-list.component.html](client/src/app/employee-list/employee-list.component.html) ==> Composant pour afficher la liste des employées
 * [employee-list.component.ts](client/src/app/employee-list/employee-list.component.ts) ==> Composant pour afficher la liste des employées
 * [employee.service.ts](client/src/app/shared/employee/employee.service.ts) ==> Service pour appeler le REST endpoint du back-end.
 

Pour démarrer l'application Angular, vous devez:
 1. Démarrer la partie back-end.
 2. Avoir npm d'installé.
 3. Installer Angular avec la commande suivante:
```
npm install -g @angular/cli@1.7.4
```
 4. Exécuter les commandes suivantes à partir du répertoire client/ du projet:
```
npm install
ng serve
```
  
Une fois démarrer, vous devriez pouvoir appeler le endpoint suivant: http://localhost:4200/

# Acquisio Web.com - online test
Welcome to the Acquisio Web.com online test. Thank you for taking the time to do this test.
It will allow us to evaluate your basic knowledge as a software developer. There is no
time limit to complete the test and feel free to send us all your questions if you
need clarification to [pldupont@acquisio.com](mailto:pldupont@acquisio.com)

Please, work directly into the GiHub.com repository that will be provided to you.

This test is split into 3 main sections.
 1. Generic questions about Java
 1. Generic questions about SQL
 1. Implementation of a new Web Application

In order to see your methodology and your way of thinking, please commit as soon and 
often as possible. When the test is complete, don't forget to push your changes. Do not squash
your commits at the end.

### About Java
For the questions related to your knowledge of Java, you will find them in the
"com.acquisio.basic.java" package. You will find 8 questions. Each subpackage contains
1 class with a main method. Follow the instruction in the class documentation. Please,
add any tests and javadoc that you see fit.

The entry points are:
 * [FooBar.java](src/main/java/com/acquisio/basic/java/question01/FooBar.java)
 * [TreeNavigation.java](src/main/java/com/acquisio/basic/java/question02/TreeNavigation.java)
 * [IssueResolving.java](src/main/java/com/acquisio/basic/java/question03/IssueResolving.java)
 * [Generics.java](src/main/java/com/acquisio/basic/java/question04/Generics.java)
 * [Refactoring.java](src/main/java/com/acquisio/basic/java/question05/Refactoring.java)
 * [Debugging.java](src/main/java/com/acquisio/basic/java/question06/Debugging.java)
 * [Calculator.java](src/main/java/com/acquisio/basic/java/question07/Calculator.java)
 * [Lambdas.java](src/main/java/com/acquisio/basic/java/question08/Lambdas.java)

### About SQL
For the questions related to your knowledge of SQL, you will find them in the
"com.acquisio.basic.sql" package. You will find 2 questions. Each subpackage contains
1 class with a main method. Follow the instruction in the class documentation. We will
only look at the SQL statement that you will add. The code is using an H2 database,
in memory. That database is reset at each execution.

The entry points are:
 * [Aggregation.java](src/main/java/com/acquisio/basic/sql/question01/Aggregation.java)
 * [Extraction.java](src/main/java/com/acquisio/basic/sql/question02/Extraction.java)

### Web Application

### Application Web

#### Context
This application displays a list of employees. It is split into 2 parts. The back-end, which is a Java app with Spring-Boot
and the UI with Angular 5.

#### Project
For the project, you need to use the external service named [Gravatar](https://en.gravatar.com/site/implement/).
Gravatar is an online tool allowing to associate a profil image to an email address. Following the instruction from the
Gravatar website, modify the Spring-Boot application /employees endpoint in order to return all the information needed to display the gravatar
associated to each employee's email address. 

The second part is optional. Modify the Angular application to display the profil image for each employee.

Add all the documentation and tests that you see fit.

All instructions to start the Spring-Boot app and the Angular app are available below.

#### Java
All the application code is available under the "com.acquisio.com" package and important classes are:
 * [FullStackApp.java](src/main/java/com/acquisio/app/FullStackApp.java) ==> Main application
 * [EmployeeController.java](src/main/java/com/acquisio/app/controller/EmployeeController.java) ==> REST Endpoint
 * [Employee.java](src/main/java/com/acquisio/app/domain/Employee.java) Domain class, representing an employee.

To start the application, you need:
 1. Java 8 installed.
 2. Maven installed. (version 3.x)
 3. Run the following command from the root of the project: 
```
mvn clean spring-boot:run
```
Once started, you should be able to access the following endpoint: http://localhost:8080/employees

#### Angular
Le code se retrouve sous la structure 'client/src/app' et les composants principaux sont:
 * [app.component.html](client/src/app/app.component.html) ==> Application principale
 * [app.component.ts](client/src/app/app.component.ts) ==> Application principale
 * [employee-list.component.html](client/src/app/employee-list/employee-list.component.html) ==> Composant pour afficher la liste des employées
 * [employee-list.component.ts](client/src/app/employee-list/employee-list.component.ts) ==> Composant pour afficher la liste des employées
 * [employee.service.ts](client/src/app/shared/employee/employee.service.ts) ==> Service pour appeler le REST endpoint du back-end.
 

To start the Angular application, you need:
 1. Start the back-end.
 2. npm installed.
 3. Install angular with the following command:
```
npm install -g @angular/cli@1.7.4
```
 4. Run the following commands from the client/ directory of the project:
```
npm install
ng serve
```
  
Once started, you should be able to access the following endpoint: http://localhost:4200/

