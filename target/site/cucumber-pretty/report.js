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
  "line": 18,
  "name": "Verify user should be able to slide right on tutorial pages",
  "description": "",
  "id": "mobile-login-feature;verify-user-should-be-able-to-slide-right-on-tutorial-pages",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@mobile-slide"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I am on Splash screen of the ionic conference app",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I swipe right 3 times on tutorials slides",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "I verify Continue button is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MobileLoginSD.goToSplashScreen()"
});
formatter.result({
  "duration": 17074464567,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "MobileLoginSD.swipeRight(int)"
});
formatter.result({
  "duration": 15065070100,
  "status": "passed"
});
formatter.match({
  "location": "MobileLoginSD.verifyContinueButton()"
});
formatter.result({
  "duration": 680949023,
  "status": "passed"
});
});