Feature:

  Background:
    Given url baseUrl;
    
    
  @name=simple
  Scenario: simple call to API
  Given path '/hello'
  When method get
  Then status 200
