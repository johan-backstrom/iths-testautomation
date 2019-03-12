Feature: Navigating seleniumhq.org

  Background:
    Given I am at the Selenium hq web page

  Scenario: WebDriver is the first project
    When I go to the projects tab
    Then WebDriver is the first project