$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hotel-search.feature");
formatter.feature({
  "line": 2,
  "name": "Hotel Search Feature",
  "description": "",
  "id": "hotel-search-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@hotel-regression"
    },
    {
      "line": 1,
      "name": "@hotel-search"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "I am on hotel website homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "HotelsSD.iAmOnHotelHomePage()"
});
formatter.result({
  "duration": 294021389,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify deal of the day price amount",
  "description": "",
  "id": "hotel-search-feature;verify-deal-of-the-day-price-amount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@hotel-search-1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I enter destination as New",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I select destination as New York, New York, United",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select checking date as 1 and checkout date as 8",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on room",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select more options",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select room as 1",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I select adult as 2",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I select children as 2",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select child one as 2",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I select child two as 3",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I verify deal of the day hotel price is between 200 to 300",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "New",
      "offset": 23
    }
  ],
  "location": "HotelsSearchSD.enterDestination(String)"
});
formatter.result({
  "duration": 237846154,
  "error_message": "java.lang.NullPointerException\n\tat framework.BasePage.sendText(BasePage.java:32)\n\tat framework.web_pages.HotelLandingPage.enterDestination(HotelLandingPage.java:26)\n\tat stepdefinition.HotelsSearchSD.enterDestination(HotelsSearchSD.java:13)\n\tat ✽.When I enter destination as New(hotel-search.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "New York, New York, United",
      "offset": 24
    }
  ],
  "location": "HotelsSearchSD.chooseDestination(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 26
    },
    {
      "val": "8",
      "offset": 49
    }
  ],
  "location": "HotelsSearchSD.clickOnCalendar(int,int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelsSearchSD.clickOnRoom()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelsSearchSD.selectMoreOptions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    }
  ],
  "location": "HotelsSearchSD.selectRooms(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 18
    }
  ],
  "location": "HotelsSearchSD.selectAdult(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "HotelsSearchSD.selectChildren(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 22
    }
  ],
  "location": "HotelsSearchSD.selectChildOne(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 22
    }
  ],
  "location": "HotelsSearchSD.selectChildTwo(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelsSearchSD.clickOnSearchButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HotelsSearchSD.verifyDealPrice()"
});
formatter.result({
  "status": "skipped"
});
});