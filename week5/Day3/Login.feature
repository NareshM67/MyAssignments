Feature: Leaftaps login feature

Scenario: Login Leaftaps application with positive credentials

#Given launch the browser and load the url
And Enter the username as 'Demosalesmanager'
And Enter the Password as 'crmsfa'
When Click on the login button
Then verify the login is successfull 
#Given Close the browser



Scenario: Login Leaftaps application with negative credentials

#Given launch the browser and load the url
And Enter the username as 'Demo'
And Enter the Password as 'asd'
When Click on the login button
But verify the login is successfull 
#Given Close the browser