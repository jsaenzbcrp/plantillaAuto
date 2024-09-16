#language: es
  @testfeature
  Característica: LoginTest
    como usuario del sistema quiero ingresar

    @testLogin
    Esquema del escenario: : Iniciar sesion con usuario y contraseña
      Dado que me encuentro en la pagina principal TEST
      Cuando inicio sesion com mis credenciales usuario "<user>" pass "<pass>"
      Entonces valido que deberia ingresar al home de la web TEST

      Ejemplos:
        | user | pass       |
        | 2831 | S72706509. |
        | 2810 | test123.   |

    @testLoginFail
    Esquema del escenario: Iniciar sesion con usuario y contraseña incorrecta
      Dado que me encuentro en la pagina principal TEST
      Cuando inicio sesion com mis credenciales usuario "<user>" pass "<pass>"
      Entonces valido mensaje de error

      Ejemplos:
        | user | pass     |
        | 2810 | test123. |





