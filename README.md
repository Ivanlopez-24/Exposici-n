
# Sistema de Generación de Informes Modulares  
### Proyecto de Patrones de Diseño – Bridge, Decorator, Flyweight y Proxy  

- Diseñar e implementar un sistema de generación de informes modulares que emplee de forma combinada los patrones Bridge, Decorator, Flyweight y Proxy, atendiendo a los siguientes requisitos:


###  Bridge – Separación de formato de contenido  – Separación de formato de contenido

Define una abstracción Report que represente un informe genérico, hay también reportes detallados y reportes ejecutivos.

Separa la implementación de exportación (Exporter) de la abstracción, de modo que puedas añadir nuevos formatos de salida (por ejemplo, PDFExporter, HTMLExporter, MarkdownExporter) sin modificar las clases de los informes.

###  Decorator – Adición dinámica de seccione

Permite enriquecer un Report con elementos adicionales en tiempo de ejecución: portada, tabla de contenidos, encabezados y pies de página, marcas de agua, etc.


###  Flyweight – Reutilización de estilos tipográficos  

Identifica el estado intrínseco compartible de los estilos de texto (tipo de letra, tamaño, color).

Crea un StyleFactory que gestione un pool de objetos TextStyle y devuelva instancias compartidas para evitar duplicar en memoria estilos iguales.

###  Proxy – Control de acceso  

Verificación de permisos: solo usuarios con rol “Administrador” pueden incorporar decoradores.

##  Integrantes  
- Juan Diego Martinez 20231020131
- Luis Felipe Suarez 20231020033
- Carlos Brito 20241020147
- Ivan Lopez 20232020113
