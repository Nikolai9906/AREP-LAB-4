# AREP-LAB 4

Para este taller los estudiantes deberán construir un servidor Web (tipo Apache) en Java. El servidor debe ser capaz de entregar páginas html e imágenes tipo PNG. Igualmente el servidor debe proveer un framework IoC para la construcción de aplicaciones web a partir de POJOS. Usando el servidor se debe construir una aplicación Web de ejemplo y desplegarlo en Heroku. El servidor debe atender múltiples solicitudes no concurrentes.

Para este taller desarrolle un prototipo mínimo que demuestre capcidades reflexivas de JAVA y permita por lo menos cargar un bean (POJO) y derivar una aplicación Web a partir de él. Debe entregar su trabajo al final del laboratorio.
## Diseño
Los detalles del diseño, la arquitectura del programa, problema, definiciones y pruebas se pueden encontrar en el siguiente documento [Artículo Sobre el Diseño](AREP_LAB3.pdf).

## Integración Continua
[![CircleCI](https://circleci.com/gh/Nikolai9906/AREP-LAB-3.svg?style=svg)](https://circleci.com/gh/Nikolai9906/AREP-LAB-3)

## Despliegue
[Despliegue en Heroku](https://secure-oasis-54291.herokuapp.com)

## Prerequisitos

Tener capacidades reflexivas de JAVA que le permitan por lo menos cargar un bean (POJO) y derivar una aplicación Web a partir de él.

## Comandos
Para compilar y correr las pruebas: ```mvn package```

Para ejecutar y utilizar el programa: ```mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.spring.MicroSpringBoot"```

Para ejecutar las pruebas: ```mvn test```

Para generar javadoc con maven: ```mvn javadoc:javadoc```

Para generar javadoc de las pruebas: ```mvn javadoc:test-javadoc```

**IMPORTANTE:** Para poder utilizar el aplicativo es necesario compilar primero el proyecto con **mvn package**.


## Intalación
Si quieres saber como funciona el programa, tienes que seguir los siguientes pasos:
1. Descargar eclipse (última versión) o cualquier editor de JAVA.
2. Abra el proyecto en el editor.
3. Corra el aplicativo y verifique que no tiene errores.
4. Pruebelo y disfrute el servidor web.

## Instalación (Proyecto Maven)
Para tener una mejor experiencia con el programa, es recomendable tener instalado maven en el sistema operativo,
de esta forma se puede visualizar de una mejor manera las pruebas y ejecutarlas desde consola.
Para instalar maven seguimos los siguientes pasos:
1. En eclipse vamos al menu que dice help.
2. Ahí le damos a install new software.
3. Nos abrirá una nueva pestaña, allí le damos donde aparece "add".
4. En "Name" escribimos lo siguiente: M2Eclipse
5. En "Location" escribimos la siguiente dirección: http://download.eclipse.org/technology/m2e/releases
6. Le damos Add, señalamos los plugins que aparecieron.
7. Aceptamos los terminos y condiciones, y se instalará automáticamente.
8. Reiniciamos eclipse y ya está instalado maven en eclipse.

## Pruebas
- https://arcane-sands-61705.herokuapp.com/apps/hola

![](img/hola.jpg)


- https://arcane-sands-61705.herokuapp.com/apps/hello

![](img/hello.jpg)


## ¿Cómo usar el aplicativo?
1. Copie el enlace proporciano por el git del proyecto y clone el repositorio en el directorio de su preferencia.

   - git clone https://github.com/Nikolai9906/AREP-LAB-4
2. Entre a la carpeta **AREP-LAB-4**.
3. Compile el proyecto antes de comenzar a utilizar sus funcionalidades.

   - **NOTA:** Recuerde que el proyecto se compila con el comando **mvn package**.
4. Ejecute el aplicativo y verifique en su navegador web localmente escribiendo localhost:36000
   mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.spring.MicroSpringBoot

## Ejemplos de uso con maven
Para ello nos dirigimos a la carpeta principal del proyecto, dependiendo de lo que queramos hacer.

Si queremos compilar el proyecto y ver que no tiene fallos, utilizamos el comando **mvn package**.

Si queremos ejecutar las pruebas y ver que todo está perfecto, utilizamos el comando **mvn test**.

**NOTA:** El comando **mvn package** compila y ejecuta las pruebas al mismo tiempo.

## Construido
[Eclipse](https://www.eclipse.org/) Editor de JAVA donde se puede compilar el proyecto.

[JUnit](https://junit.org/junit5/) Framework para pruebas en JAVA.

## Autor
Nikolai Bermudez Vega- Trabajo Programación AREP 02/26/2021

## Licencia
Este programa es de uso libre, puede ser usado por cualquier persona.

