Feature: Login


Scenario: Successful Login with valid credentials
    Given User Lounch chrome browser
    When User open URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on logout link
    Then Page title should be "Your store. Login"
    And close browser
    
    
    
Scenario Outline: Login Data driven
    Given User Lounch chrome browser
    When User open URL "https://admin-demo.nopcommerce.com/login"
    And User enters Email as "<email>" and Password as "<password>"
    And Click on Login
    Then Page Title should be "Dashboard / nopCommerce administration"
    When User click on logout link
    Then Page title should be "Your store. Login"
    And close browser
    
    Examples:
           | email | password |
           | admin@yourstore.com | admin |
           | admin@yourstore.com | admin123 |
    
    
    
    
    
    
    