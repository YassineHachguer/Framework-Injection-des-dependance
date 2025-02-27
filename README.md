# Framework Injection des dépendances
Ce projet est un mini framework d'injection de dépendances similaire à Spring IOC. Il permet de faire l'injection de dépendances entre les différents composants d'une application en utilisant soit un fichier XML de configuration, soit des annotations. Le framework supporte l'injection via le constructeur, le setter et l'attribut (field).

## Composants d'Application
### `IDao.java`
Interface représentant le DAO (Data Access Object).
![img.png](images/img.png)

### `DaoImpl.java`
Implémentation de l'interface `IDao`.
![img_1.png](images/img_1.png)

