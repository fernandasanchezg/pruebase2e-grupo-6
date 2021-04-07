# language: es
Característica: PetBook Search
  Como usuario web
  Quiero usar PetBook
  Para encontrar perros o gatos

  Escenario: Buscar Perros
    Cuando El usuario da click en el boton perro en Petbook Search
    Entonces debe ver como mínimo un resultado Imagenes de perro
  Escenario: Buscar Gatos
    Cuando El usuario da click en el boton gato en Petbook Search
    Entonces debe ver como mínimo un resultado Imagenes de gato
  Escenario: Buscar Todos los animales
    Cuando El usuario da click en el boton all en Petbook Search
    Entonces debe ver como resultados todas las mascotas