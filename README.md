# Trabajo_1_Patrones
## Integrantes:
Andrés Felipe Rivero Burgos 
Andrés Restrepo David 

## Descripción del Problema 
Se requiere desarrollar una aplicación de mensajería para una empresa que ofrece diferentes servicios en el área se mantenimiento y reparación de motocicletas. La aplicación debe enviar notificaciones personalizadas a los clientes a través de WhatsApp para simplificar ciertos procesos y tener un acercamiento al usuario y brindar una atención más rápida de cara al cliente. Estas notificaciones pueden ser de diferentes tipos, como mensajes de bienvenida, recordatorios de citas, promociones de servicios, etc. Cada tipo de mensaje tiene un formato específico (plantilla) y puede requerir diferentes parámetros.

El problema principal es cómo gestionar la creación y envío de estos mensajes de manera eficiente y escalable, asegurando que el código sea fácil de mantener y extender a medida que se agregan nuevos tipos de mensajes y servicios.

##Patrones aplicados:
1. Patrón Singlenton
Problema: 
Se tiene la necesidad de que solo haya una instacia del servicio de WhatsApp para evitar múltiples conexiones innecesarias y posibles inconsistencias en el envío de mensajes.
Solución:
Con el patrón Singlenton se garantiza que solo haya una instancia del servicio de WhatsApp en toda la aplicación. Esto simplifica la gestión de la conexión y asegura que todos los     mensajes se envíen a través de la misma instancia.
2. Patrón Factory Method
Problema: 
Se tiene la necesidad de crear diferentes tipos de mensajes con formatos específicos sin acoplar el código a clases concretas, facilitando la extensión para nuevos tipos de mensajes.
Solución:
Con el patrón Factory Method se permite crear objetos de diferentes tipos de mensajes sin especificar las clases concretas. Esto facilita la extensión del sistema para soportar nuevos tipos de mensajes sin modificar el código existente.
3. Patrón Builder
Problema: 
Se tiene la necesidad de construir mensajes complejos con múltiples parámetros de manera flexible y legible intentando evitar un código con constructores con múltiples parámetros y y así tener una posible flexibilidad en la construcción de los mensajes.
Solución:
Con el patrón Builder se permite construir objetos complejos paso a paso. En este caso, se utiliza para construir mensajes con diferentes parámetros de manera flexible y legible.
