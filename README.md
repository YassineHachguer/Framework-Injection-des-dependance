# Framework Injection des dépendances
Ce projet est un mini framework d'injection de dépendances similaire à Spring IOC. Il permet de faire l'injection de dépendances entre les différents composants d'une application en utilisant soit un fichier XML de configuration, soit des annotations. Le framework supporte l'injection via le constructeur, le setter et l'attribut (field).

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






