Feature: deals link feature
Scenario: new deal link scenario
Given user already in login page
When title of login page free crm
Then user enters username and password  
 | username         | password | 
 | naveenautomation | test@123 |
Then user click login button
Then user is on home page
Then user moves to the new deals
Then user enters new deal details
 | title | amount | probability | commission |
 | test  | 1000   | 50          | 20         |
Then close the browser
