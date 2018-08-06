Feature: TestAnnotations


    Scenario: Test ikman.lk website
      Given Open the firefox with ikman.lk url
      And Maximize the window
      When Go to property
      And Go to houses
      And Sort houses in Colombo
      And Click price link
      And Apply min as "<5000000>" and max as "<75000000>"
      And Click apply button
      And Click beds link
      And Select bed count as three
      Then Print the sorted add count
      And Print prices of the found adds






