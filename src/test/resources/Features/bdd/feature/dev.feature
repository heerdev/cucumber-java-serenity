Feature: Under development

  Background: 
    Given user is loggin as admin
    Then the home page is displayed

  Scenario: verify that user is able to delete customer
    Given user create customer account
    When user delete the customer
    Then the successful delete message is displayed
