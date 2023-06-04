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
- Testing
- Mantenimiento

## Entorno GitHub y Eclipse
### Configuración
El primer paso que hemos realizado para hacer este proyecto ha sido crear el entorno en GitHub con un nuevo repositorio al que hemos llamado CodeLabs en el configuraremos las claves necesarias, los token y los permisos. 
También del archivo .vpp generamos el código base y lo llevamos a eclipse, una vez allí subimos el código a GitHub en el que comenzamos a implementar la funcionalidad del proyecto. 

### Ramas implementadas
- [Feature-CapaNegocio](https://github.com/susanpaola/CodeLabs/tree/Feature-CapaNegocio)
En esta rama se han realizado la modificacion de las entidades necesarias. Implementando sus getter, setter y constructores. 
- [Feature-CapaNegocioControllers](https://github.com/susanpaola/CodeLabs/tree/Feature-CapaNegocioControllers)
La creación de esta rama se ha utilizado para la añadir codigo a las clases de gestor consulta, gestor matriculación y gestor propuestas curso. 
- [Feature-CapaPresentacion](https://github.com/susanpaola/CodeLabs/tree/Feature-CapaPresentacion)
En la rama de la capa de presentación hemos realizado la funcion de las interfaces del proyceto las cuales las veremos más adelante en el apartado de "Interfaz del proyceto".
- [Feature-BBDD](https://github.com/susanpaola/CodeLabs/tree/Feature-BBDD)
Aquí codificamos las clases relativas a la base de datos; es decir, las DAO las cuales nos ayudan a conectar con la base de datos y poder utilizar sus filas y sus columnas llamando a las clases necesarias para ello. 
- [Develop](https://github.com/susanpaola/CodeLabs/tree/Develop)
En esta rama es donde residen la mayoría de los Merge y donde se unifican las anteriores ramas para poder ver así el código completo y los cambios o modificaciones que necesite
- [Testing](https://github.com/susanpaola/CodeLabs/tree/Testing)
Por último en la rama testing lo primero que hemos hecho ha sido cambiar la estructura de los directorios teniendo ahora src/main y src/test, en src/test hemos creados los debidos paquetes de las clases que hemos hecho test. 

### Maven
A medida que hemos ido implementando el código, a lo largo del proyecto hemos visto la necesidad de dependencias ya que han habido momentos en los que el codigo mostraba fallos en sus librerías, esto se ha debido a la falta de dependencias o plugins necesarios para la buena funcionalidad. 

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

### Sprint 1
### Sprint 2
### Sprint 3
### Sprint 4
### Sprint 5
### Sprint 6

## Base de Datos

## Interfaz del proyecto

## Testing

## Mantenimiento

