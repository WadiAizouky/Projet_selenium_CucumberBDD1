# Projet_selenium_CucumberBDD1
Un Framwork pour automatiser un site web e-commerce avec Selenium en l'itégrant avec Cucumber BDD Framwork.

**périmètre de test** : site web http://automationpractice.com/index.php .

**Les techniques utilisés** : Java, intellij IDE, Maven, Jenkins, BDD Cucumber, Selenium web driver.

**La configuration** : faite avec Maven pour automatiser l'installation de dépendances :
* API selenium web driver
* WebDriver manager
* Cucumber Junit
* Cucumber Java

**Les features coverts** :
* Autentification
* Recherche
* L'ajoute au panier
* Payement

**L'architecture projet** :
le projet est divisé en plusieurs répertoire de travail dont en utilisant POM(page modele objet) :
* des modules et des classes réutilisables.
* répertoir d'objet partagé
* des fichiers de feature écrits en Gherkin.
* leurs implémentations en Java ou les fichiers de tests.
* paramétrés d'environnement.
* compatibilité avec les navigateur Chrome, Firfox, Edge, internet explorer.
* Fichier yml pour la configuration CI/CD avec GitHub Action.
* Fichier POM pour l'installation aitomatisée de dépendances.

**Les fonctionnalités principaux**
* utilisation variée de plusieur méthode d'identification d'objet(Id, Tag, Cass selecter, Xpath, Relative idintifiant).
* Junit pour mettre en place des Asserts et checkpoints.
* fichier de configuration de navigateur permettant de lancer les cas de tests sur plusieur navigateurs.
* un fonctionnalité pour exécuter les cas de tests sans lancer navigateur pour avoir une exécution rapide.
* un fichier yml(fichier de configuration).
* intégration avec CI jenkins.

**Les défis rencontrés**:
* la synchronisation ( il faut mettre en place des points de attante afin d'avoir un téléchargement complét d'objets de la page.
* Une fois le projet devint grand, l'exécution sera lente.
* pour l'exécution par lots il faut utiliser un autre outil(px: ligne de commande)
* la construction des flows d'actions est difficile.
* probléme avec les objets cachés.
* pour fournir un rapport détails avec capture d'écrin est difficle
