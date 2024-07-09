#**INTRODUCCIÓN**
Proyecto en el cual se utilizan los patrones de automatización Screenplay, combinado con Cucumber y Serenity.

Las pruebas se corren contra la pagina web SAUCEDEMO. Estas pruebas están enfocadas a realizar las pruebas de E2E.


Detalles generales de la implementación:

+ Herramienta de automatización: Intellij IDEA Community Edition 
+ Compilador:  JAVA
+ Patrón de diseño:  Screenplay
+ Estrategia de automatización: Realizar Flujos automatizados según los casos de pruebas generados.
+ Aplicación que sé está probando: SAUCEDEMO. 


Prerequisitos:

+ Tener permisos de acceso al aplicativo que se desea probar.
+ Tener instalado y verificar su funcionamiento:
+ Intellij IDEA Community Edition 
+ Gradle y variables de entorno configurada
+ Java  y variables de entorno configurada 
+ ChromeDriver
+ GheckoDriver
+ Tener GIT en su ultima versión.


La estructura completa del proyecto es:

+ exceptions: clases que permiten darreportes especifico cuando falla la prueba.
+ integrations: clases que permiten integraciones a otros subsistemas. 
+ interacions: clases que representan las interacciones directas con la interfaz de usuario.
+ models: clases que usan el patrón object builder o relacionadas con el modelo de dominio.
+ questions: objectos usados para consultar acerca del estado de la aplicación.
+ tasks: clases que representan tareas que realiza el actor a nivel de proceso de negocio.
+ userinterfaces: Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario.
+ utils: utilidades que se puedan reusar.


#**PROYECTO AUTOMATIZADO**

**Lenguaje de programación:** Java.  
**Frameworks:** Selenium, JUnit y Serenity BDD.  
**Patrón de diseño:** Screenplay.  
**Feature:** Hecho en lenguaje Gherkin.  
**IDE:** Intellij.  
**Driver:** WinAppDriver.exe, ChromeDriver.exe, GheckoDriver.exe 
**Manejo de dependencias con Gradle.**

**Para correr el proyecto se necesita Java y Gradle**


## Autores ##
Harold Enrique Altamiranda Solis - Analista de Pruebas