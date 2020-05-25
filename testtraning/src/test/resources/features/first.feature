
Feature: Addition feature
  I want to add two numbers

  Scenario Outline: Add two numbers <Numberone> , <Numbertwo> and Result <sum>
    Given I have two number <Numberone> and <Numbertwo>.
    When I add them
    Then Result should be <sum>

    Examples: 
      | Numberone | Numbertwo | sum |
      |         5 |         8 |  13 |
      |         8 |         8 |  16 |
      |         9 |         8 |  17 |
      |         5 |        80 |  85 |
      |        51 |        81 | 132 |


#Datatable are basically for particular steps under scenario
  #Scenario: Datatable example
    #Given I have  datatable of two words
      #| aman | garg |
    #When I join them
    #Then It should match the following value
      #| amangarg |


  #Scenario: Datatable  With headers as maps example
    #Given I have  datatable of two words for maps
      #| firstname | lastname | thirdname |
      #| aman      | garg     | testers   |
    #When I join them
    #Then It should match the following value
      #| amangarg |
      
    #Scenario: Multiple statements with same logic
    #Given We have three word which are completely different.
      #| firstname | lastname | thirdname |
      #| aman      | garg     | testers   |
    #When I join them
    #Then It should match the following value
      #| amangarg |
