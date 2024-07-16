Feature: Salesforce feature

Scenario: Login to salesforce website with positive credentials

Given Lanuch the browser load the url
And Enter username as 'dilip@testleaf.com'
And Enter password as 'testleaf@2024'
When Click on login
When Click on toggle menu
When Click on viewAll 
When Click on sales
When Click on Accounts tab
When Click on new button
And Enter account name
And Select Ownership as public
When Click save button
Then Verify account name