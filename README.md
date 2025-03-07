# Framework Injection des dépendances
Ce projet est un mini framework d'injection de dépendances similaire à Spring IOC. Il permet de faire l'injection de dépendances entre les différents composants d'une application en utilisant soit un fichier XML de configuration, soit des annotations. Le framework supporte l'injection via le constructeur, le setter et l'attribut (field).

## Structure du Projet
```
Framework_Injection_des_dependances/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── example/
│   │   │   │   │   ├── application/
│   │   │   │   │   │   ├── dao/
│   │   │   │   │   │   │   ├── DaoImpl.java
│   │   │   │   │   │   │   ├── IDao.java
│   │   │   │   │   │   ├── metier/
│   │   │   │   │   │   │   ├── IMetier.java
│   │   │   │   │   │   │   ├── MetierImplConstructor.java
│   │   │   │   │   │   │   ├── MetierImplSetter.java
│   │   │   │   │   │   │   ├── MetierImplField.java
│   │   │   │   │   │   ├── presentation/
│   │   │   │   │   │   │   ├── MainConstructorInjection.java
│   │   │   │   │   │   │   ├── MainSetterInjection.java
│   │   │   │   │   │   │   ├── MainFieldInjection.java
│   │   │   │   │   ├── framework/
│   │   │   │   │   │   ├── ApplicationContext.java
│   │   │   │   │   │   ├── Bean.java
│   │   │   │   │   │   ├── Beans.java
│   │   │   │   │   │   ├── Component.java
│   │   │   │   │   │   ├── ConstructorArg.java
│   │   │   │   │   │   ├── Inject.java
│   │   │   │   │   │   ├── Property.java
│   ├── resources/
│   │   ├── config-constructor.xml
│   │   ├── config-setter.xml
│   │   ├── config-field.xml
├── pom.xml
```
## Composants d'Application
### `IDao.java`
Interface représentant le DAO (Data Access Object).

![img.png](images/img.png)

### `DaoImpl.java`
Implémentation de l'interface `IDao`.

![img_1.png](images/img_1.png)

### `IMetier.java`
Interface représentant le service métier.

![img_2.png](images/img_2.png)

### `MetierImplConstructor.java`
Implémentation de `IMetier` avec injection par constructeur.

![img_3.png](images/img_3.png)

### `MetierImplSetter.java`
Implémentation de `IMetier` avec injection par setter.

![img_4.png](images/img_4.png)

### `MetierImplField.java`
Implémentation de `IMetier` avec injection par champ (field).

![img_5.png](images/img_5.png)

## Framework d'Injection de Dépendances

### `Component.java`
Annotation pour marquer une classe en tant que composant géré par le framework.

![img_6.png](images/img_6.png)

### `Inject.java`
Annotation pour marquer un constructeur, un setter ou un champ pour l'injection de dépendances.

![img_7.png](images/img_7.png)

### `Bean.java`
Classe représentant un bean dans le fichier de configuration XML.

![img_8.png](images/img_8.png)

### `Beans.java`
Classe représentant la collection de beans dans le fichier de configuration XML.

![img_9.png](images/img_9.png)

### `ConstructorArg.java`
Classe représentant un argument de constructeur dans le fichier de configuration XML.

![img_10.png](images/img_10.png)

### `Property.java`
Classe représentant une propriété dans le fichier de configuration XML.

![img_11.png](images/img_11.png)

### `ApplicationContext.java`
Classe principale du framework pour la gestion du contexte d'application et l'injection de dépendances.

![img_12.png](images/img_12.png)

## Fichiers de Configuration XML

### `config-constructor.xml`
Configuration pour l'injection par constructeur.

![img_13.png](images/img_13.png)

### `config-setter.xml`
Configuration pour l'injection par setter.

![img_14.png](images/img_14.png)

### `config-field.xml`
Configuration pour l'injection par champ (field).

![img_15.png](images/img_15.png)

## Classes Main pour Tester les Différentes Injections

### `MainConstructorInjection.java`
Classe Main pour tester l'injection par constructeur.

![img_16.png](images/img_16.png)

### `MainSetterInjection.java`
Classe Main pour tester l'injection par setter.

![img_17.png](images/img_17.png)

### `MainFieldInjection.java`
Classe Main pour tester l'injection par champ (field).

![img_18.png](images/img_18.png)

## Exécution des Tests

Pour tester les différentes méthodes d'injection, exécutez les classes `Main` correspondantes :

- `MainConstructorInjection` pour l'injection par constructeur.

![img_19.png](images/img_19.png)

- `MainSetterInjection` pour l'injection par setter.

![img_20.png](images/img_20.png)

- `MainFieldInjection` pour l'injection par champ (field).

![img_21.png](images/img_21.png)

## Conclusion

Ce projet démontre comment implémenter un mini framework d'injection de dépendances en Java, similaire à Spring IoC. Il supporte l'injection de dépendances via des fichiers de configuration XML et des annotations, et permet l'injection par constructeur, par setter et par champ. Ce framework peut servir de base pour comprendre les concepts fondamentaux de l'injection de dépendances et comment appliquer ces concepts dans une application Java. En testant les différentes méthodes d'injection, vous pouvez voir comment chaque méthode affecte la création et la gestion des dépendances dans votre application.





