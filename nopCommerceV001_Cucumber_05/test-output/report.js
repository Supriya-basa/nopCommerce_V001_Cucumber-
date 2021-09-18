$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Customers.feature");
formatter.feature({
  "line": 1,
  "name": "Customers",
  "description": "",
  "id": "customers",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7479504700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Add a new Customer",
  "description": "",
  "id": "customers;add-a-new-customer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "click on Add new button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User can view Add new customer page",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User enter customer info",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "click on save button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User can view confirmation message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepsLogin.user_Launch_Chrome_Browser()"
});
formatter.result({
  "duration": 1821421900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "StepsLogin.user_opens_url(String)"
});
formatter.result({
  "duration": 1752306600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "StepsLogin.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 269831200,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.click_on_Login()"
});
formatter.result({
  "duration": 6777690300,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 13931800,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.user_click_on_customers_Menu()"
});
formatter.result({
  "duration": 2075674800,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.click_on_customers_Menu_Item()"
});
formatter.result({
  "duration": 4336351700,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.click_on_Add_new_button()"
});
formatter.result({
  "duration": 6065550000,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.user_can_view_Add_new_customer_page()"
});
formatter.result({
  "duration": 10403100,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.user_enter_customer_info()"
});
formatter.result({
  "duration": 13076805000,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.click_on_save_button()"
});
formatter.result({
  "duration": 3995420000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "The new customer has been added successfully.",
      "offset": 36
    }
  ],
  "location": "StepsLogin.user_can_view_confirmation_message(String)"
});
formatter.result({
  "duration": 1027332300,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.close_browser()"
});
formatter.result({
  "duration": 94426300,
  "status": "passed"
});
formatter.before({
  "duration": 2276650600,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Search customer by EmailID",
  "description": "",
  "id": "customers;search-customer-by-emailid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "User opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User can view Dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "User click on customers Menu",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "click on customers Menu Item",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Enter customer Email",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Click on search button",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "User should found Email in the search table",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepsLogin.user_Launch_Chrome_Browser()"
});
formatter.result({
  "duration": 938100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "StepsLogin.user_opens_url(String)"
});
formatter.result({
  "duration": 3219671600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "StepsLogin.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 215394800,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.click_on_Login()"
});
formatter.result({
  "duration": 11258638500,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.user_can_view_Dashboard()"
});
formatter.result({
  "duration": 9808700,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.user_click_on_customers_Menu()"
});
formatter.result({
  "duration": 2091879200,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.click_on_customers_Menu_Item()"
});
formatter.result({
  "duration": 3371013600,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.enter_customer_Email()"
});
formatter.result({
  "duration": 256943600,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.click_on_search_button()"
});
formatter.result({
  "duration": 3149247000,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.user_should_found_Email_in_the_search_table()"
});
formatter.result({
  "duration": 49972600,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.close_browser()"
});
formatter.result({
  "duration": 84457900,
  "status": "passed"
});
formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3854170900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Login with Valid credentials",
  "description": "",
  "id": "login;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click on Logout link",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepsLogin.user_Launch_Chrome_Browser()"
});
formatter.result({
  "duration": 923400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "StepsLogin.user_opens_url(String)"
});
formatter.result({
  "duration": 2440982600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "StepsLogin.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 180867100,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.click_on_Login()"
});
formatter.result({
  "duration": 7478199800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "StepsLogin.page_Title_should_be(String)"
});
formatter.result({
  "duration": 71947800,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.user_click_on_Logout_link()"
});
formatter.result({
  "duration": 1518165500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "StepsLogin.page_Title_should_be(String)"
});
formatter.result({
  "duration": 32648700,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.close_browser()"
});
formatter.result({
  "duration": 1385353700,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 15,
  "name": "Login Data Driven",
  "description": "",
  "id": "login;login-data-driven",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters Email as \"\u003cemail\u003e\" and Password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User click on Logout link",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "login;login-data-driven;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 26,
      "id": "login;login-data-driven;;1"
    },
    {
      "cells": [
        "admin@yourstore.com",
        "admin"
      ],
      "line": 27,
      "id": "login;login-data-driven;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2219065100,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Login Data Driven",
  "description": "",
  "id": "login;login-data-driven;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 14,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "User Launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "User opens url \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User click on Logout link",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Page Title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepsLogin.user_Launch_Chrome_Browser()"
});
formatter.result({
  "duration": 3287700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://admin-demo.nopcommerce.com/login",
      "offset": 16
    }
  ],
  "location": "StepsLogin.user_opens_url(String)"
});
formatter.result({
  "duration": 2893466000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin@yourstore.com",
      "offset": 22
    },
    {
      "val": "admin",
      "offset": 60
    }
  ],
  "location": "StepsLogin.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "duration": 186582700,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.click_on_Login()"
});
formatter.result({
  "duration": 6818912900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dashboard / nopCommerce administration",
      "offset": 22
    }
  ],
  "location": "StepsLogin.page_Title_should_be(String)"
});
formatter.result({
  "duration": 35150100,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.user_click_on_Logout_link()"
});
formatter.result({
  "duration": 4760377000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Your store. Login",
      "offset": 22
    }
  ],
  "location": "StepsLogin.page_Title_should_be(String)"
});
formatter.result({
  "duration": 34755500,
  "status": "passed"
});
formatter.match({
  "location": "StepsLogin.close_browser()"
});
formatter.result({
  "duration": 98858400,
  "status": "passed"
});
});