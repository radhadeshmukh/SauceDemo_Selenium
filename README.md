# SauceDemo_Selenium Automation Test

This repository contains the code for automation test for SauceDemo_Selenium.

## Get the code

Git:

    git clone https://github.com/radhadeshmukh/SauceDemo_Selenium
    cd SauceDemo_Selenium


Or simply [download a zip](https://github.com/radhadeshmukh/SauceDemo_Selenium/archive/main.zip) file.

## Use Maven

Open a command window and run:

    mvn test

This runs Cucumber features using Cucumber's JUnit runner. 


## Using Junit to run the tests

- Import the code into an IDE like Eclipse or Netbeans.
- Right click on the project.
- Select "Run As" "Junit Test".
- The tests will start their execution.

## Overriding options

The Cucumber runtime parses command line options to know what features to run, where the glue code lives, what plugins to use etc.
When you use the JUnit runner, these options are generated from the `@CucumberOptions` annotation on your test.

Sometimes it can be useful to override these options without changing or recompiling the JUnit class. This can be done with the
`cucumber.options` system property. The general form is:

Using Maven:

    mvn -Dcucumber.features="..." -Dcucumber.glue="..." test


## What tests are being checked?

URL used for the test - https://www.saucedemo.com/

- Login to https://www.saucedemo.com/ using the "standard_user" account
- Sort the products by Price (high to low)
- Add the cheapest & the 2nd costliest products to your basket
- Open the basket
- Checkout
- Enter details and Finish the purchase
- Test chart page
- Test the Checkoutstepone page.
- Test product detail page.


## Where are the feature files?

There are in total six feature files located inside `src/test/java/features` directory. These feature files are being loaded in the runner class using `@CucumberOptions` annotation. 

```
@CucumberOptions(features = {
		"src/test/java/features" }, glue = "stepdefination", monochrome = true, tags = "@SeleniumTest",
				  plugin = {"pretty",
					        "json:target/cucumber_json_reports/home-page.json",
					        "html:target/home-page-html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

```
## Where are the Reports?
 - Report in html format located inside 'test-output/SparkReport/Index.html' directory.
 - Report in PDF format located inside 'test output/PdfReport/ExtentPdf.pdf' directory.

##  Approach to automate the service-

- Understand the API requirement and prepare the test data which helps to define the verification approach.
- Verify the response code equals to 200 or not to decide whether an API testing is passed or failed.
- Choose the suitable automation tool (tool which support the import API/Web service endpoints from Swagger this is optional) and create the automation framework.
- Choose the suitable verification methods
- Compare the whole response body content with the expected information
- Compare each attribute value of response
- Compare matching with regular expression
- Create positive and negative test and verify the expected output as specified in the requirement.

##  Which library would you preferred-

When using Java, REST-Assured is my first choice for API automation. In fact, it's the main tool I use for API testing. REST-Assured is a fluent Java library you can use to test HTTP-based REST services. It's designed with testing in mind, and it integrates with any existing Java-based automation framework.



##  What testcases would you cover?
- Verify correct HTTP status code. For example, finding the pet status should return 200 for successful operation and unpermitted requests should return 400 Invalid status, etc.
- Verify response payload. -Check valid JSON body and correct field id, category, and name  including in error responses with the selected status values.
- Verify response headers. -  HTTP server headers have implications on both security and performance.
- Verify basic performance sanity. - If an operation was completed successfully but took an unreasonable amount of time, the test fails
- Beyond functional testing we can also do some nonfunctional testing such as security and authorization, performance, Load test(positive), stress test (Negative), Usability tests

