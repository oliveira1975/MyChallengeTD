@tag
Feature: I go to the homepage "https://www.getminimalist.com/"
  @tag1
  Scenario: I visit the web application "https://www.getminimalist.com/"
    Given I refresh the todo list, to erase old register
    When I click in the field Add to your list
    Then I can insert into the list "My task 01/03", "My task 02/03" and "My task 03/03"
    Then I can ckeck all tasks into the list
    Then I can finalize the test automation


