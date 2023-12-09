Feature: Data tables

Scenario Outline: test data tables
Given username "<user name>"
Given password "<password>"
Given email "<email>"
Given mobile "<mobile>"
When collect the data
Examples: 
|user name|password|email|mobile|
|siva|123qwe|sss@sss.com|2342424|
|ravi|123qwe|sss@sss.com|2342424|
|krishna|123qwe|sss@sss.com|2342424|