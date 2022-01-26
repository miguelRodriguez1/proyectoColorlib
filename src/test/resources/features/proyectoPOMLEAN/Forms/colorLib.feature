#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Regresion
Feature: Busqueda en tabla
  El usuario debe poder ingresar al apartado de tablas.
  y debe buscar un dato en la tabla por medio del buscador

  @CasoExitoso
  Scenario Outline: 
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad de Tables
    When ingresar el dato en el buscador de la tabla
      | busqueda   |
      | <busqueda> |
    Then Verificar busqueda exitosa

    Examples: 
      | busqueda |
      | Gecko    |
      |      1.8 |

  @CasoAlterno
  Scenario Outline: 
    Given Autentico en colorlib con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad de Tables
    When ingresar el dato en el buscador de la tabla
      | busqueda   |
      | <busqueda> |
    Then Verifico que se presente alerta

    Examples: 
      | busqueda |
      | Geckoooo |
      |     -1.8 |
