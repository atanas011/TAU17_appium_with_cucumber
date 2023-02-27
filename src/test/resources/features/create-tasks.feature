Feature: Create New Tasks

#  @tasks
  Scenario Outline: The user can add new tasks
    Given Open the app
    When Click Add new task
    And Enter "<TaskTitle>" and "<TaskText>"
    And Click Save
    Then Task added successfully

    Examples:
      | TaskTitle       | TaskText       |
      | Cucumber Task 1 | Task 1 Details |
      | Cucumber Task 2 | Task 2 Details |