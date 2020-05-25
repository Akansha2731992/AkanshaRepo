Feature: Login Functionality of an application

Scenario Outline: User login into the application
Given User is at the login page
When User login with username "<username>" and password "<password>"
Then verify the status code is 200

Examples:
|username|password|
|akansha|usertest|