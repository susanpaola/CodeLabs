# CodeLabs

## Equipo
- Allipson Nicol Herrera Álvarez
- Susan Paola Herrera Álvarez

## Fin del proyecto
La fecha de entrega del proyecto final es el 07 de Junio 

## Indice
- Entorno GitHub y Eclipse
- Organización del proyecto
- Base de Datos
- Interfaz del proyecto
- Calidad
- Testing
- Mantenimiento

## Entorno GitHub y Eclipse
### Configuración
El primer paso que hemos realizado para hacer este proyecto ha sido crear el entorno en GitHub con un nuevo repositorio al que hemos llamado CodeLabs, en el configuramos las claves necesarias, los token y los permisos. 
También del archivo .vpp generamos el código base y lo llevamos a eclipse, una vez allí subimos el código a GitHub en el que comenzamos a implementar la funcionalidad del proyecto. 

### Ramas implementadas
- [Feature-CapaNegocio](https://github.com/susanpaola/CodeLabs/tree/Feature-CapaNegocio)
En esta rama se han realizado la modificacion de las entidades necesarias. Implementando sus getter, setter y constructores. 
- [Feature-CapaNegocioControllers](https://github.com/susanpaola/CodeLabs/tree/Feature-CapaNegocioControllers)
La creación de esta rama se ha utilizado para añadir codigo a las clases de gestor consulta, gestor matriculación y gestor propuestas curso. 
- [Feature-CapaPresentacion](https://github.com/susanpaola/CodeLabs/tree/Feature-CapaPresentacion)
En la rama de la capa de presentación hemos realizado la funcion de las interfaces del proyecto, las cuales las veremos más adelante en el apartado de "Interfaz del proyecto".
- [Feature-BBDD](https://github.com/susanpaola/CodeLabs/tree/Feature-BBDD)
Aquí codificamos las clases relativas a la base de datos; es decir, las DAO las cuales nos ayudan a conectar con la base de datos y poder utilizar sus filas y sus columnas llamando a las clases necesarias para ello. 
- [Develop](https://github.com/susanpaola/CodeLabs/tree/Develop)
En esta rama es donde residen la mayoría de los Merge y donde se unifican las anteriores ramas para poder ver así el código completo y los cambios o modificaciones que necesite
- [Testing](https://github.com/susanpaola/CodeLabs/tree/Testing)
Por último en la rama testing lo primero que hemos hecho ha sido cambiar la estructura de los directorios teniendo ahora src/main y src/test, en src/test hemos creados los debidos paquetes de las clases que hemos hecho test. 

### Maven
A medida que hemos ido implementando el código, a lo largo del proyecto hemos visto la necesidad de dependencias ya que han habido momentos en los que el codigo mostraba fallos en las librerías, esto se ha debido a la falta de dependencias o plugins necesarios para la buena funcionalidad. 

  <dependencies>
  
  	<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.28</version>
		</dependency>
  
	<dependency>
    		<groupId>org.jdatepicker</groupId>
    		<artifactId>jdatepicker</artifactId>
    		<version>1.3.4</version>
    	</dependency>
  
    <dependency>
  		<groupId>org.apache.logging.log4j</groupId>
  		<artifactId>log4j-core</artifactId>
  		<version>2.14.1</version>
	</dependency>	
  
	<dependency>
  		<groupId>org.slf4j</groupId>
	  	<artifactId>slf4j-api</artifactId>
  		<version>1.7.32</version>
	</dependency>
  
	<dependency>
  		<groupId>ch.qos.logback</groupId>
  		<artifactId>logback-classic</artifactId>
  		<version>1.2.6</version>
	</dependency>    	
  
    </dependencies>    

## Organización del proyecto
### SCRUM
Para nuestro proyecto hemos optado por una metodología agil, proporcionando un enfoque colaborativo y flexible para la planificación, ejecución y seguimiento de proyectos, centrandonos en la entrega de resultados de valor de manera iterativa e incremental.
En Scrum, el trabajo lo dividimos en ciclos de tiempo llamados "sprints", Cada sprint tiene una duración de una a tres semanas. Al final de cada sprint, se revisan los resultados y se realizan ajustes en función de lo que hemos obtenido. 

### Sprints
1. Product backlog: lista ordenada de las características, funcionalidades, requisitos y mejoras que se espera que el proyecto contenga.
2. Sprint backlog: lista de elementos del Product Backlog que el equipo de desarrollo a de completar durante un sprint específico en la metodología ágil Scrum.
3. Asignado: Asignación a un miembro del grupo, la realización de una tarea.
4. In process: Tarea en proceso de realización.
5. Completed: La tarea esta terminada y completada. 

#### Captura de sprints
Cada sprint tiene un conjunto de tareas, en total hemos realizado 6 sprint y al final de cada uno realizamos reuniones de cierre de sprint, en donde hemos acordado las próximas tareas del siguiente sprint. Para ver los sprints de nuestro proyecto puede pinchar [aquí](https://github.com/users/susanpaola/projects/1/views/1).

##### Sprint 1
<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Sprint1.jpg">

##### Sprint 2
<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Sprint2.jpg">

##### Sprint 3
<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Sprint3.1.jpg">
<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Sprint3.2.jpg">
<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Sprint3.3.jpg">

##### Sprint 4
<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Sprint4.jpg">

##### Sprint 5
<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Sprint5.1.jpg">
<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Sprint5.2.jpg">

##### Sprint 6
<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Sprint6.jpg">

## Base de Datos
La base de datos es una parte fundamental, en nuestro proyecto las filas y las columnas han sido implementadas en la base de datos de [phpMyAdmin](https://www.db4free.net/phpMyAdmin/index.php?route=/database/structure&db=proyecto_iso)

| Usuario | Contraseña |
|---------|------------|
|proyecto_iso|contraseña|

## Interfaz del proyecto

La primera interacción con la interfaz del proyecto es realizar una conexión con la base de datos:
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Pantalla%20Conectar.jpg">

### Interfaz del Estudiante
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Pantalla%20Login%20EStudiante.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Mensaje%20bienvenida.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Pantalla%20EstudiantehaceMatricula.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Cursos%20para%20matriculacion%20y%20pago.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Una%20vez%20hecho%20pago.jpg">

### Interfaz del Vicerrector
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Login%20vicerrector.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Mensaje%20bienvenida.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/EvaluarProuestasDisponibles_Vicerrector.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Evaluar%20propuesta%20curso.jpg">

### Interfaz del Profesor
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Login%20profesor.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Mensaje%20bienvenida.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Funciones%20del%20profesor.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Propuestas%20resueltas.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Funciones%20del%20profesor.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Realizar%20propuesta%20curso.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/fecha%20inicio%20propuesta.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/fecha%20fin%20propuesta.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Confimaci%C3%B3n%20de%20propuesta.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/propuesta%20enviada.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Funciones%20del%20profesor.jpg">
<img width="450" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Propuestas%20pendientes.jpg">

## Calidad
La calidad según los apuntes de esta practica para este proyecto se realiza con el uso de la herramienta [SonarCloud](https://sonarcloud.io/projects?sort=name). 
Sonar ayuda a realizar un analisis del proyecto, de esta forma se pueden ver los fallos o aquellas cosas dentro del código que se pueden mejorar. En nuestro caso sonar hace un analisis del proyecto que se encuentra en la rama Develop. 

Antes de realizar cualquier analisis es impresecindible conectar nuestro sonar al repositorio/proyecto que queremos analizar de allí hay que utilizar la dependencia que nos genera para poder realizar el analisis de forma correcta. 
En nuestro proyecto en el pom.xml hemos implementado esa dependencia para poder ejecutar y realizar el análisis hemos utilizado | verify sonar:sonar |.

| <properties>  		
	<sonar.organization>susanpaola</sonar.organization>  		
	<sonar.host.url>https://sonarcloud.io</sonar.host.url>
	</properties> |
 
 Una vez hecha la ejecución y siendo Success, nos hemos dirigido al SonarCloud el cual nos mostraba una serie de errores y nos hemos centrado en corregirlos: 
 - 5 Bugs
 - 438 Code smells
 - 23 Security Hotspots
 - 12.4% Duplicaciones 

<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Calidad1.jpg">

En este momento la covertura no es visible puesto que para ello es necesario implementar las clases test de las debidas clases main. Este paso lo hemos realizado mas adelante en la parte de testing. 

¿Porqué es importante la calidad en nuestro proyecto y como podemos asegurarla?
Es importante tener calidad en cada proyecto y en nuestro caso lo hemos intentado resolviendo poco a poco las advertencias en el análisis de Sonar. La calidad no es un estado sino un objetivo continuo. 

## Testing
En este apartado del proyecto hemos realizado el test de las respectivas clases tales como: 

| Entidades | Persistencia | Controllers |
|---------|------------|-----------|
| Centro | CursopropioDAO | GestorConsultas |
| CursoPropio | MatriculaDAO | GestorMatriculación |
| Materia | - | GestorPropuestasCursos |
| Matricula | - | - |
| ProfesorExterno | - | - |
| Profesor | - | - |
| ProfesorUCLM | - | - |

No hemos hecho testing de las interfaces (capa presentación) puesto que hemos visto que se producian errores, debido a que el usuario que llegue a interactuar con ello puede producir cambios que afecten. 

### Surefire y JaCoCo
Para ejecutar el Maven y generar los informes hemos utilizado la siguiente estructura: | site:site | como resultado de la ejecución hemos obtenido el código html para el sitio del proyecto en la ruta target/site/ 
Para conseguir generar los informes hemos necesitado el uso de las dependencias y plugins apropiados. Todas estas dependencias y plugins quedan definidas y plasmadas en el [pom.xml]( https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/pom.xml) del proyecto.
En nuestro proyecto hemos hecho uso de Junit4, de tal forma que, al ejecutar las clases, estamos evaluando el funcionamiento deseado de cada uno de los métodos implementados. Para permitir que esto funcionase, tal y como hemos mencionado anteriormente hemos implementado sus plugins y dependencias específicas en pom.xml.

<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Coverage%20JUnit.jpg">

Sin embargo, JaCoCo se encargará de evaluar la cobertura de las clases. A la hora de definir el porcentaje de cobertura mínima en nuestro archivo pom.xml de nuestro proyecto hemos establecido un 20% (0.20) de tal forma que esto no nos impida avanzar debido al lanzamiento de errores.
Podemos ver un índice de la cobertura de nuestras clases por medio de JaCoCo en target/site/jacoco/index.html. A continuación, mostramos una captura de lo recientemente mencionado:

<img width="950" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Surefire%20report.jpg">

### Estratégia de prueba
Para realizar el plan de pruebas hemos decidido realizarlas de la capa de negocio mas precisamente de las entidades, de algunos Gestores en los controllers y también de las DAO. Para poder ver las tablas solo hay que hacer click: [Tablas](https://docs.google.com/spreadsheets/d/1tOS7ewaHlQ4KxDNKUhrZLT5aKzZ_5R53/edit#gid=2096290695)

## Mantenimiento
SonarCloud proporciona información valiosa sobre la calidad del código en un proyecto, lo cual es fundamental para el mantenimiento. Utilizando informes y métricas generados por Sonar para identificar problemas. 
El mantenimiento puede incluir correcciones de errores, mejoras en el rendimiento, actualizaciones de seguridad, ajustes de funcionalidad y adaptaciones a cambios en los requisitos. Es necesario realizar un nuevo analisis en Sonar cada vez que se solucionan errores, esto ayudará al proyecto en su mantenimiento.
En nuestro caso con Sonar En primer lugar, nos pusimos manos a la obra con los Bugs que en este caso son los más importantes de resolver, hemos visto como uno a uno hasta llegar a 0 hemos podido solucionar. Algunos de ellos se debian a valores nulos o a falta de excepciones en el código, también se debian a conexiones o partes del código que habiamos dejado abiertas. 
 
Una vez terminamos con los bugs continuamos con los Security Hotspots los cuales eran unos cuantos, entre ellos podiamos encontrar vulnerabilidades en la contraseña de la base de datos y también en funciones de depuración activadas (debug) que las utilizamos durante el desarrollo del proyecto para identificar y solucionar problemas. Para solucionarlo simplemente tuvimos que eliminar la función e.printStack(), en nuestro caso hemos comentado la función ya que no debe estar habilitada en el código final, lo cual nos ha sido útil para fines de depuración pero no es apropiado en el código final. 

Los Code smells que hemos encontrado han sido muchos pero le hemos dado prioridad a los criticos ya que de los bloquedos no había ninguno, pero críticos habian bastantes. Poco a poco hemos ido solucionandolos y hemos encontrado code smells debido a falta de default en los switch, constantes duplicadas en varias clases, falta de @Override, eliminación de algunos comentarios, fallos en los que incluso hemos necesitado añadir nuevas dependencias para su solución. Tambien hemos resuelto code smells llamados "mayor", "Menor" y los de "info" hasta llegar a reducir su número. 
También mientras solucionabamos problemas observamos que las duplicaciones bajaron. 

La grafica muestra la disminución de los code smells; aunque aveces, como se puede ver, corrigiendo las vulnerabilidades llegaron a incrementarse los code smells pero nos centramos en volver a disminuarlos.
Vemos en las graficas como hemos conseguirdo dirminuar hasta 0 los Security Hotspots (vulnerabilidades).

<img width="550" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Grafica%20Sonar1.jpg">

Grafica de todos los posibles fallos que ayudan al mantenimiento en Sonar.
<img width="550" alt="image" src="https://github.com/susanpaola/CodeLabs/blob/Testing/CodeLabs_ISO2/imagenes/Grafica%20Sonar2.jpg">




