# poo_tp6_grupo12
Repositorio del grupo 12 destinado al desarrollo del TP N°6 de Programación Orientada a Objetos - APU (SP).

## Respuestas Teóricas - Problema 1 (Punto 1)

**a. ¿Cuántos atributos y operaciones tiene la clase PorHora y Mensual?**
Mirando las cajas en el diagrama, la clase "PorHora" tiene 2 atributos propios ("-cupon" y "-valorHora") y ninguna operación. Por su lado, la clase "Mensual" tiene 1 solo atributo propio ("-cliente") y tampoco tiene operaciones declaradas en su caja. (Obviamente, ambas heredan los atributos y métodos de la clase padre, pero como propios solo tienen esos).

**b. ¿Un ingreso por hora es un tipo de RegistroIngresoSalida?**
Sí. En el diagrama se ve claro porque hay una flecha con la punta de triángulo vacío que va desde "PorHora" hacia "RegistroIngresoSalida" . Eso indica herencia, o sea que es un tipo de registro.

**c. ¿Un cliente es un tipo de RegistroIngresoSalida?**
No,  La clase "Cliente" no tiene ninguna flecha de herencia que la conecte con "RegistroIngresoSalida". Solamente esta asociada a la clase "Mensual" con una línea simple.

**d. ¿Cuantas clases abstractas y metodos abstractos hay?**
Hay solo 1 clase abstracta que es "RegistroIngresoSalida" (nos damos cuenta porque el nombre está escrito en letra cursiva). Y tiene 1 solo método abstracto que es "obtenerImporte()", que también está en cursiva.

**e. ¿El método obtenerImporte() es necesario implementarlo en las subclases de RegistroIngresoSalida?**
Sí, Como el método es abstracto en la clase padre, las clases hijas ("PorHora" y "Mensual") están obligadas a implementarlo/sobreescribirlo para darle un comportamiento específico, si no, el programa tira error.

**f. ¿El método registrarIngreso (registro: RegistroIngresoSalida) es necesario implementarlo en las subclases de Manager?**
No. Primero, porque la clase "Manager" no tiene ninguna subclase en el diagrama (no hay flechas de herencia apuntando hacia ella). Y segundo, porque el método no está en cursiva, así que no es abstracto; se implementa ahí mismo en el Manager.

**g. ¿Vehiculo es una subclase de RegistroIngresoSalida?**
No, no es una subclase. La línea que las une tiene un rombo blanco, lo que significa que es una relación de Agregación, no de herencia. Básicamente un registro "conoce" o "tiene un" vehículo, pero un vehículo no "es un" registro.


### Historias de Usuario - Gestión de Salarios de Empleados (Actividad 2)
1. **HU01 - Registro de empleado:** Como encargado de RRHH, quiero dar de alta un empleado cargando su legajo, documento, nombre, fecha de ingreso y cantidad de hijos para mantener actualizado el padrón del personal sin duplicar legajos.
2. **HU02 - Asignación de adicionales por tipo:** Como encargado de RRHH, quiero clasificar al empleado según su tipo (Profesional, Administrativo o Limpieza) para asociar sus beneficios específicos.
3. **HU03 - Cálculo de salario:** Como analista de liquidación, quiero procesar los conceptos remunerativos, el salario familiar y los descuentos para obtener el sueldo neto exacto de cada trabajador.
4. **HU04 - Emisión de recibo de sueldo:** Como encargado de RRHH, quiero poder ubicar a cualquier trabajador cargado en el sistema utilizando su legajo para poder conocer sus datos personales de manera rapida y sencilla.
