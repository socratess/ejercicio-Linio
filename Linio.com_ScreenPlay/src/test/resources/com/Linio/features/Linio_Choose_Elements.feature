#Author: socratespalaciosmoreno@gmail.com
@tag
Feature: Linio Page
  as a Web user
  I want to choose any element
  to buy it

  #@tag1
  #Scenario: Choose any element to add at the buy car
  #Given That socrat want to choose a element
  #When he choose the element with the "Celulares y Tablets" and "lenovo"
  #Then he should see the option "Tu producto se agregó al carrito" in the screen
  @tag2
  Scenario Outline: Choose any  product to add at the buy car
    Given That socrat want to choose a element
    When he choose the product with the category and product
      | category   | product   | numberindex    |quantity|filter|
      | <category> | <product> | <numberindex> |<quantity>|<filter>|
    Then he should see the option Tu producto se agrego al carrito in the screen

    Examples: 
      | category | product | numberindex | quantity|filter|
      | Moda  | pantalon |         1 |  1|Menor precio|
     # | Deportes | futbol  |           2 |
