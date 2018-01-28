# Search Test
Please find the test cases for the goeuro site.It is a travel search engine which gives air, bus and train travel options together

## Manual Tests
1)Verify that your location is populated in the departure city on site load(eg Berlin when you search in Berlin)
2)Verify any random selected European city is present in the arrival city text box
3)Verify that HinReise is selected by default
4)Verify that todays date is populated by default
5)Verify that search button is active on initial page load and user is able to perform a search successfuly with prefilled data
6)Verify user is able to enter custom values for departure,arrival,date, no of persons field and make a search
7)Verify clicking on the search takes the user to results page 
8)Verify in the results page, the train options to travel is shown
9)Verify in the results page, the flight options to travel is shown
10)Verify in the results page, the bus options to travel is shown


## search test - Automation
The automation scripts is written for the manual test 9, 10.
Since this tests also have the steps from the previous test cases, the test case could be extended to include assertions 
for the previous manual test cases

It is a Selenium project using TestNG framework and Maven for build and dependency handling. 
Page Object model framework is used to create the pages that are used for test.

## Prerequisites:

This project currently has the capability to run only on OS X and in chrome browser 
The following things are needed 1)Mac OS X 2)Chrome browser to be present.

## Getting Started and installing:

This project can be imported directly as a Maven project All the dependency needed for the project are handled in the POM. 
However the chromedriver and firefoxdriver are kept in the resources folder rather and set to the system properties.
Importing this project and running on a Mac OS which has chrome browser will directly run the tests.

## Running the Tests and Test Reports:

The tests can be run as Maven tests which are run using the TestNG framework.
The test data are called out in the testng xml and the testng xml is called inside the POM.
The TestNG report will be present target folder. reporter-output present inside suite folder will show the logs generated.

## Tests:


