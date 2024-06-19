Feature: Signup Function

Scenario Outline: Signup Functionality using the data from customers

	Given signup with Name "<Name>" and Mailid "<email>"

	When Enter account information

	And Address Informations

	Then Create the account successfully 
	
	
Examples: 

					|Name||email|
					|vijay||Vijay@gmail.com|
					|karan||karan@gmail.com|
					|praveen||praveen@gmail.com|