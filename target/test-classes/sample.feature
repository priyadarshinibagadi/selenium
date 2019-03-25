Feature: crmpro login feature
Scenario Outline: crmpro login test
Given user already in login page
When title of login page free crm
Then user enters "<username>" and "<password>"    
Then user click login button
Then user is on home page
Then user moves to  new contact
Then user enters new contact details "<firstname>" and "<lastname>" 
Then user click save button new contact added
Then close the browser
Examples:
| username         | password | firstname | lastname          |  
| naveenautomation | test@123 | priya     | automation tester |
| naveenautomation | test@123 | krish     | david             |
