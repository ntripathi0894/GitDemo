Feature: Application Login

Scenario Outline: Home page default login
Given Initialize browser with chrome 
And Navigate to "https://facebook.com" site
When User enters <username> and <password> and logs in
Then Verify that user is successfully logged in
And close the browsers

Examples:
|username                          | password    |
|ntripathi0894@gmail.com           | grandmasti  |
|ntripathi0894@gmail.com           | grandmasti  |
