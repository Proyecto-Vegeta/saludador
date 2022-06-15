# saludador
Aplicacion hecha para aprender Java

##Creacion
Esta aplicacion fue creada desde Intellij, como un nuevo proyecto Maven
en la carpeta src/main/java se creo la clase Main.java, donde se creo el método:


```java
public static void main(String[] args) {}
```

Que es siempre el método inicial en java

##Repositorio
Este proyecto puede encontrarse en el repositorio:

https://github.com/Proyecto-Vegeta/saludador

Es posible clonarlo localmente desde Intellij desde:

```markdown
New Project -> from VCS
```

y pegando la dirección: https://github.com/Proyecto-Vegeta/saludador.git

Para poder hacer push, ademas de pedir permisos al [administrador](manquius@gmail.com) es necesario crear un token, puede generarse desde el mismo [Intellij](https://www.jetbrains.com/help/idea/github.html#register-account)


###Ramas
Para hacer un cambio, antes debe generarse una nueva rama. Para eso, primero nos aseguramos de tener lo ultimo de Github haciendo PULL. Luego vamos a:

```markdown
GIT -> New branch
```

Ponemos un nombre y creamos.

Se realizan los cambios, se agregan los archivos, se commitea y al hacer push, seleccionamos la rama con el nombre que creamos.

Despues vamos a https://github.com/Proyecto-Vegeta/saludador y creamos un nuevo "Pull Request".


##Manejo de Errores
Una vez identificada la excepción que vamos a recibir, encerramos la parte del código que queremos cuidar con:

```java
try {
    //Codigo a cuidar
} catch(Exception e) {
    //Reaccion al error
}
```
