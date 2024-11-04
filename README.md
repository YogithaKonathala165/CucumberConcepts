# CucumberConcepts
Cucumber Project covering the main concepts
Cucumber:
Cucumber is a testing tool that supports Behavior Driven Development (BDD). It offers a way to write tests that anybody can understand, regardless of their technical knowledge.
Cucumber can be defined as a testing framework, driven by plain English text. It serves as documentation, automated tests, and a development aid – all in one.

Gherkin:
The language, in which this executable feature files is written, is known as Gherkin. Gherkin is a plain English text language, which helps the tool - Cucumber to interpret and execute the test scripts.
Gherkin keywords: Given, When, Then , But, And, Background, Feature,*

In Cucumber BDD, whatever you write must go into Given-When-Then steps. Lets consider the same example above in BDD
 
Feature:
A Feature can be defined as a standalone unit or functionality of a project.
A feature usually contains a list of scenarios to be tested for that feature. A file in which we store features, description about the features and scenarios to be tested is known as Feature File. 
Example for Feature:
  Feature − Login functionality for a social networking site.
  The user should be able to login into the social networking site if the username and the password are correct.
  The user should be shown the error message if the username and the password are incorrect.
  The user should be navigated to home page, if the username and password are correct.

Steps Definitions:
Steps definition file stores the mapping between each step of the scenario defined in the feature file with a code of function to be executed.
So, now when Cucumber executes a step of the scenario mentioned in the feature file, it scans the step definition file and figures out which function is to be called.

What is a Scenario?
A scenario is a sequence of steps that represents a behavior of the application as expected by the user. Scenarios are written using the "Scenario" keyword followed by a descriptive title. Steps for the test case are provided using Given, When, and Then steps (or And/But for additional steps). The Scenario is not parameterized, meaning it uses fixed values for input and checks against predefined expected outcomes.

What is a Scenario Outline?
Scenario Outline is used when the same test is performed multiple times with a different combination of values. It uses the "Scenario Outline" keyword and includes placeholders (usually enclosed in angled brackets "<>") in the steps where data varies. The actual data sets are provided in a data table using the "Examples" keyword, and each row of the data table represents a separate test instance. Scenario Outlines are particularly useful for data-driven testing, allowing you to run the same scenario with different inputs to ensure the application behaves correctly under various conditions.
 
Difference between Scenario and Scenario Outline?
In Summary, "Scenario" is used for individual, non-parameterized test cases, while "Scenario Outline" is used for parameterized test cases where the same steps are executed with different sets of input data. "Scenario Outline" is a powerful feature in Cucumber for handling data-driven testing scenarios. 





