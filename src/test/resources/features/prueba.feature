#language: en
  #Autor: Harold Altamiranda Solis

@HU
Feature: Inicio de Sesión
  Como usuario registrado
  Quiero poder iniciar sesión en la página web
  Para acceder a las funcionalidades protegidas

  Background:
    Given que estoy en la página de inicio de sesión

  @testcase01
  Scenario Outline: Iniciar sesión con credenciales válidas
    When ingreso mi nombre de usuario y contraseña
      |email|password|
      |<email>|<password>|
    Then debería ver la página de selección de productos <message>
    Examples:
      | email | password | message |
      | standard_user | secret_sauce | Products |

  @testcase02
  Scenario Outline: Iniciar sesión con credenciales inválidas
    When ingreso mi nombre de usuario y contraseña incorrecta
      |email|incorrectPassword|
      |<email>|<incorrectPassword>|
    Then debería ver un mensaje de error indicando credenciales incorrectas <message>
    Examples:
      | email | incorrectPassword | message |
      | standard_user | secret_saucee |Epic sadface: Username and password do not match any user in this service |

    @testcase03
    Scenario Outline: Agregar productos al carrito y ver los productos en el carrito
      When ingreso mi nombre de usuario y contraseña correctas
        |email|password|
        |<email>|<password>|
      And agrego productos al carrito
      When deberia ver los productos agregados en el carrito <product1>
      Examples:
        | email | password | product1 |
        | standard_user | secret_sauce |Sauce Labs Backpack|

  @testcase04
      Scenario Outline: Simular compra de productos
        And  ingreso mi nombre de usuario y contraseña de logueo
          |email|password|
          |<email>|<password>|
        And agrego algunos productos al carrito
        When miro el carrito de productos
        And realizo el proceso de pago
          |firstName|lastName|postCode|
          |<firstName>|<lastName>|<postCode>|
        Then deberia ver el mensaje de <message>
    Examples:
      | email | password | firstName | lastName | postCode | message |
      |standard_user|secret_sauce|Harold|Altamiranda|050016|Thank you for your order!|


