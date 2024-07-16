Feature: Leaftaps Createlead feature

Scenario: Createlead with positive credentials

Given launch the browser and load the url
And Enter the username as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
When Click on the login button
Then verify the login is successfull
When Click on the crmsfa
And Click on the Lead tab
And Click on the CreateLead link
Given enter the company name
And Enter the firstname
And Enter the lastname
When click on the create lead button
Then verify the createLead is successfull
Given Close the browser
