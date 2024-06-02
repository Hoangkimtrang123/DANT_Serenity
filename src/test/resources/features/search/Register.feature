

Feature: User Registration
#  Background:
#  As a new user,
#  the user want to register an account
#  So that the user can access features available to registered users
#
#  @registration
#  Scenario: Successful registration
#    Given the user is on the registration page
#    When the user enters the following registration details:
#      | Field            | Value                  |
#      | HO_TEN           | CHANG123               |
#      | SDT              | 0901501199             |
#      | GMAIL            | changchang@gmail.com   |
#      | PASSWORD         | chang123               |
#      | CONFIRM PASSWORD | chang123               |
#    And the user clicks the register button
#    Then the user should the see the home page
#
#  @registration
#  Scenario: Unsuccessful registration due to missing details  //đk với gmail đã đc đk trc đó
#    Given the user is on the registration page
#    When the user enters the following registration details:
#      | Field            | Value                  |
#      | HO_TEN           | hoang trang            |
#      | SDT              | 0901501199             |
#      | GMAIL            | changchang@gmail.com   |
#      | PASSWORD         | chang123               |
#      | CONFIRM PASSWORD | chang123               |
#    And the user clicks the register button
#    Then the user should see an error message "Email đã tồn tại"
