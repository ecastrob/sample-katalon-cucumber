#Author:Elian Castro

@Landing
Feature: Navigation - Menu - Links
 
  As a user I want navigation links that will eventually take me to these areas.
  Dashboard, 
  Appraisal Browser (View Appraisals in Work Queue), 
  Parcel Inquiry, 
  Property Browser (Parcel View), 
  Manual Comp Search,
  Public Server Admin,
  Logout

Use the text as tooltips for the navigation buttons.

   Background: 
     Given I am user of the system
     When I open URL to the main page 
   
    @Dashboard
  Scenario: As a user I want to see the "Dashboard" link on the Navigation Bar  
    Then: I see "Dashboard" link on the Navigation Bar

    @ParcelInquiry
  Scenario: As a user I want to see the "Parcel Inquiry" link on the Navigation Bar  
    Then: I see "Parcel Inquiry" link on the Navigation Bar
    
     @PropertyBrowser
  Scenario: As a user I want to see the "Property Browser" link on the Navigation Bar  
    Then: I see "Property Browser" link on the Navigation Bar
    
     @ManualCompSearch
  Scenario: As a user I want to see the "Manual Comp Search" link on the Navigation Bar  
    Then: I see "Manual Comp Search" link on the Navigation Bar
    
     @PublicServerAdmin
  Scenario: As a user I want to see the "Public Server Admin" link on the Navigation Bar  
    Then: I see "Public Server Admin" link on the Navigation Bar
    
     @LogOut
  Scenario: As a user I want to see the "Logout" link on the Navigation Bar  
    Then: I see "Logout" link on the Navigation Bar
    
 
    