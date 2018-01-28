# search test - goeuro
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


