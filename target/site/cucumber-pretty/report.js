$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("mobile-login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#@mobile-regression @mobile-login @mobile"
    }
  ],
  "line": 2,
  "name": "Mobile Login Feature",
  "description": "",
  "id": "mobile-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "User should be able filter options",
  "description": "",
  "id": "mobile-login-feature;user-should-be-able-filter-options",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@mobile-filter"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "I am on a home page of the app",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "I click on filter button",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "I disable Angular option",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on All Reset Filer button",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "I verify all options are enabled",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileLoginSD.goToHomePage()"
});
formatter.result({
  "duration": 18299769002,
  "status": "passed"
});
formatter.match({
  "location": "MobileLoginSD.tapOnFilter()"
});
formatter.result({
  "duration": 2050814042,
  "status": "passed"
});
formatter.match({
  "location": "MobileLoginSD.disableAngular()"
});
formatter.result({
  "duration": 1294236046,
  "status": "passed"
});
formatter.match({
  "location": "MobileLoginSD.clickOnResetFilter()"
});
formatter.result({
  "duration": 1075148170,
  "status": "passed"
});
formatter.match({
  "location": "MobileLoginSD.verifyAllOptions()"
});
formatter.result({
  "duration": 759426955,
  "status": "passed"
});
});