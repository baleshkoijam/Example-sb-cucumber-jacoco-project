Feature: test the getperson api


  Scenario: Booking a flight in cleartrip.com


    Given the url is up and running
    When i invoke the microservice
    Then i receive the response sucessfully