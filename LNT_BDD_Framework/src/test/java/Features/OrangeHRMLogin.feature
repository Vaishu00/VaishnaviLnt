Feature: Orange HRM Login Feature 



#Scenario: Testing Login feature of Orange HRM 

# Given User is on Login Page 

# When User enters username 

# And User enters password 

# And User clicks on Login Button 

# Then User should be logged in successfully 



#Scenario: Testing Login feature with passing data 

# Given User is on Login Page 

# When User enters username as "Admin" 

# And  User enters password as "admin123" 

# And User clicks on Login Button 

# Then User should be logged in successfully 



Scenario Outline: Testing Login feature with passing data 

Given User is on Login Page 

When User enters <username> and <password> 

And User clicks on Login Button 

Then User should be logged in successfully 

Examples: 

|username|password|
|Admin|admin123|
|test|test123|
|ajay|ajay123|