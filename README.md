Resolución del ejercicio N°27 de la unidad 2 de programación 2.
Este programa simula un sistema de facturación automatizado que calcula impuestos y precios finales para diferentes tipos de ítems comerciales de manera polimórfica, utilizando una clase abstracta con atributos y métodos compartidos.

Clases Utilizadas
ItemFacturable (Clase Abstracta): Define los atributos comunes (nombre, precioBase), el método abstracto calcularImpuesto() y la lógica concreta para obtener el precio final.
ProductoImportado: Extiende la clase abstracta aplicando una tasa impositiva de importación (25%).
ServicioProfesional: Extiende la clase abstracta aplicando una retención impositiva correspondiente a servicios (10%).
AlimentoBasico: Extiende la clase abstracta aplicando una tasa reducida de impuestos (2%).
