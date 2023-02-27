Feature: Create New Task

#  @task
  Scenario: The user can add new task
    Given Open the app
    When Click Add new task
    And Enter task title
    And Enter task text
    And Click Save
    Then Task added successfully