# Automation-Challenge
 Automated testing of critical functionalities of the healthcare website.
 
*Introduction-

Healthcare websites play a crucial role in providing medical information, services, and support to users. 
However, ensuring the quality and reliability of these websites through manual testing alone 
can be time-consuming and error-prone. This automation testing project leverages Selenium and Python to 
automate the testing process, enabling efficient and consistent validation of the healthcare website's 
functionality.

*Features-

Automated testing of critical functionalities of the healthcare website.

*Installation-

 To set up the project locally, follow these steps:

 -Clone the repository:

-Download and install the chrome web driver for your browser. You can download the web driver from the following links:
  chrome= https://edgedl.me.gvt1.com/edgedl/chrome/chrome-for-testing/121.0.6167.85/win64/chrome-win64.zip
  chromedriver-https://edgedl.me.gvt1.com/edgedl/chrome/chrome-for-testing/121.0.6167.85/win64/chromedriver-win64.zip
   Chrome and Chromedriver (Chrome for testing is n new chrome flovor that specifically target web application testing
 and automation Test cases.CFT is dedicated version of chrome made specifically for testing purpose.)

*Repository overview

Provide an overview of the directory structure and files, for example:

├── TendableTestAutomationChallenge
├── src/test/java
├── PageObject
│   ├── BasePage
│   ├── ContactUs
│   └──HomePager
└── TestCase
    ├── ContactUsTestCase
    ├── HomePageTestCase
    └── RequestDemoTestCase
*Usage
 To run the automated tests, use the testng.
 This will execute the test suite, which includes tests for various functionalities of the healthcare website.
 Make sure to review the test results after execution.

*Description-
  I have analysis challange requirement.Create Maven Project,add the dependency like selenium-java,testng,webdrivermanager etc.
In FrameWork I follow Page Object Model as design pattern,every page in our application have corresponding page object class and this class contain page element and action method.
this will invock from test case.I used Testng to execute the test case.
