@tag
Feature: Voting App Features

  @Title
  Scenario: Voting App Tittle page
    Given User is in Voting App Page
    When User get the Title of Page
    Then The Page tittle should be "Azure Voting App"
    
  @Vote_cat
  Scenario: Voting App vote in Cats
    Given User is in Voting App Page
    When Cats button should be displayed
    Then User click on Cats button
    
     @Vote_dog
  Scenario: Voting App vote in Dogs
    Given User is in Voting App Page
    When Dogs button should be displayed
    Then User click on Dogs button
    
     @click_reset
  Scenario: Voting App vote in Dogs
    Given User is in Voting App Page
    When Reset button should be displayed
    Then User click on Reset button

   
