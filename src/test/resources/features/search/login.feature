Feature: Login
#  Background:
#  As a registered user
#  actor want to log in to the system
#  So that {actor} can access features only available to logged-in users

  @login
  Scenario: Successful login
    Given the user TRANG is on the login page
    When the user enters the correct email:"rbcvpgbfou@eurokool.com" and password:"trang123"
    And the user clicks the login button
    Then the user should see the homepage



#  @login
#  Scenario: Failed login due to incorrect username or password
#    Given  the user on the login page
#    When the user enters an incorrect email:"rbcvpgbfou@eurokool.com" and password:"trang"
#    And  the user clicks the login button
#    Then the user shouldd see an error message "Mật khẩu không chính xác"
