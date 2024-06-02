
Feature: Order
#  As an online shopper,
#  the user want to place an order
#  So that the user can purchase the products I desire.

#  Background:
#    Given the user has logged into their account
#    And the user has selected products and added them to the cart
#      | productName   | quantity |
#      | Mat na sam    | 2        |
#
#  @order
#  Scenario: Successfully place an order from the checkout page
#    Given the user has navigated to the checkout page
#    When the user fills in the buyer's information and address as follows:
#      | HO_TEN | SDT       | GMAIL                            | GHI_CHU | TP_DROPDOW | HUYEN_DROPDOW | XA_DROPDOW |
#      | chang  | 0901501199| hoangkimtrang11062002@gmail.com  | xom1    | Hung Yen   | khoai chau    | da trach    |
#
#    And the user chooses the payment method
#    And the user checks the total payment "100,000 VND"
#    And the user confirms the payment policy
#    And the user confirms the order
#    Then the user should see the order success page
#
#  @order
#  Scenario: Unable to place order due to incorrect information
#
#    Given the user has navigated to the payment page
#    When the user fills in the buyer information incorrectly
#      | HO_TEN | SDT       | GMAIL                            | GHI_CHU | TP_DROPDOW | HUYEN_DROPDOW | XA_DROPDOW |
#      |        | 0901501199| hoangkimtrang11062002@gmail.com  | xom1    | Hung Yen   | khoai chau    | da trach    |
#
#    And the user tries to confirm the order
#    Then the user will then see the error message "Họ tên không được để trống."
