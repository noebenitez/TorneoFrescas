# Investigación de conceptos

## ¿Qué es Maven?

Maven es una herramienta open-source creada en el 2001 para la gestión y construcción de proyectos Java. Viene con objetivos predefinidos para realizar ciertas tareas claramente definidas, como la compilación del código y su empaquetado.

Una característica clave de Maven es que está listo para usar en la red. El motor incluido en sus núcleo puede dinámicamente descargar plugins de un repositorio que provee acceso a muchas versiones de diferentes proyectos. Maven provee soporte no solo para obtener archivos de su repositorio, sino también para subir artefactos al repositorio al final de la construcción de la aplicación, dejándola al acceso de todos los usuarios.


## POM: Definición y uso

POM es la abreviación de **Project Object Models**. Es una representación XML de un proyecto Maven que se encuentra en un archivo llamado `pom.xml`.

El POM contiene toda la información necesaria sobre un proyecto, así como las configuraciones de los plugins que se utilizarán durante el proceso de compilación. Es usado por Maven para describir el proyecto de software a construir, sus dependencias de otros módulos y componentes externos, y el orden de construcción de los elementos.


## Diferencia entre Archetype y ArfifacId

Un **archetype** es un artefacto muy simple que contiene el prototipo del proyecto que se desea crear, en cambio **artifactid** es solo un elemento que pertenece a un artefacto e indica el nombre base del mismo.



## Algunos de los goals de Maven:

- `clean`: Limpia los artefactos creados por compilaciones anteriores.
- `package`: Toma el código compilado y lo empaqueta en un formato distribuible, como un JAR.
- `install`: Instala el paquete en el repositositorio local para usarlo como dependencia en otros proyectos de forma local.
- `compile`: Compila el código fuente del proyecto


## Scopes

Los scopes son usados para limitar la transitividad de una dependencia y determinar cuando una dependencia es incluida en los classpath.

- `compile`: Es el scope predeterminado que se usa si no se especifica ninguno. Las dependencias de compilación están disponibles en todos los classpath de un proyecto. Además estas dependencias se propagan a proyectos dependientes.
- `provided`: Es muy parecido a compile pero indica que espera que el JDK o un contenedor proporciones la dependencia en tiempo de ejecución. La dependencia con este scope es añadida en el classpath usado para la compilación y test, pero no en el classpath de compicación. No es transitivo.
- `runtime`: Indica que la dependencia no es requerida para la compilación, pero lo es para la ejecución. Maven incluye la dependencia con ese scope en el classpath de ejecución y test, pero no en el de compilación.
- `test`: Indica que la dependencia no es requerida para el uso normal de la aplicación y solo está disponible para compilación de test y las fases de ejecución. No es transitivo. 
- `system`: Es similar al scope provided a exepción de que debe proporcionar el JAR que lo contiene explícitamente. El artefacto siempre estará disponible y no se busca en un repositorio.



### Source: [Apache Maven](https://maven.apache.org/index.html)
