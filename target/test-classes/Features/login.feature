Feature:	Home Page Adactin
  Scenario Outline: Credential validation in Adactin
    Given user in Adactin Home Page
    
    When User Enter the "<userName>" and "<password>" 
 
    
    Then User Click the LoginButton
    
    And user select "<loc>" , "<hotel>" , "<type>" , "<no_room>" , "<in_date>" , "<out_date>" , "<adult>" 
    
    Then user click the search button
    
    And user clicks the select radio button and click continue
    
    And user type "<fName>" , "<lName>" , "<Add>" , "<card_no>" , "<card_type>" , "<month>" , "<year>" , "<cvv>"    
     Examples:
    |userName|password|loc|hotel|type|no_room|in_date|out_date|adult|fName|lName|Add|card_no|card_type|month|year|cvv|
    |mohamed123|0G33IA|London|Hotel Creek|Deluxe|6 - Six|02/02/2020|04/02/2020|2 - Two|mohamed|fazil|chennai|1234567812345678|VISA|May|2022|123|
     
     

   

  