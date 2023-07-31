# ucse-prog2-2023-U1-Karchesky
Agregado de nueva categoría:
Cuando se necesita agregar una nueva categoría de productos, el patrón Factory Method permite crear una nueva clase que implemente la interfaz del creador de productos. Por ejemplo, podríamos crear una clase "CategoriaAlimentos" que implemente los métodos para crear productos relacionados con alimentos. De esta manera, el cliente del sistema solo necesita interactuar con el creador de productos y no necesita conocer los detalles de implementación específicos de cada categoría. Esto hace que el sistema sea más flexible y evita que el código existente se vea afectado al agregar nuevas categorías.

Modificación de costo de envío de un tipo de envío particular:
Para hacer frente a cambios en los costos de envío de un tipo de envío particular, el patron Strategy puede ser de gran ayuda. En este caso solo deberiamos de agregar la clase correspondiente al nuevo metodo de envio e implementar el metodo "costoenvio" con sus respectivos calculos.

Agregado de un medio de pago nuevo:
El patrón Bridge también facilita la incorporación de nuevos medios de pago al sistema. Si se desea agregar un nuevo medio de pago, solo se deben crear las clases "...PaymentGateway" y "...PaymentProcessor" correspondientes al nuevo medio de pago que implementen la interfaz "PaymentGateway" y la clase "PaymentProcessor".Tambien se deberia agreagar como opcion en "PaymentManager".

Aclaracion: Como metodo de practica y para entender mejor el patron cree varios packages con fabricas para crear objetos de tipo metodo de pago y metodo de envio. No eran requeridos por el enunciado pero decidi dejarlos implementados.

![Diagrama](https://github.com/AndresKarch/ucse-prog2-2023-U1-Karchesky/assets/110938792/fec25822-488d-4333-b5ff-3a8bde6db79c)

Las conecciones estan expresadas como flechas que representan las clases que implementan otrasclases o interfaces.
