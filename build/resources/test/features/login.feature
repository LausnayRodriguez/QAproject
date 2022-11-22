#language: es

Característica: login

  Escenario: login exitoso
    Dado el usuario se encuentre en la pagina web
    Cuando el ingrese el usuario con la clave
      | Usuario | Clave    |
      | solv    | Beta.123 |
    Entonces el visualizara un mensaje de bienvenida