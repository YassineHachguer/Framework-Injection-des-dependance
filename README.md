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

