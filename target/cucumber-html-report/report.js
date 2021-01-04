$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SmokeTest.feature");
formatter.feature({
  "line": 1,
  "name": "Test smoke on Connectiverx",
  "description": "",
  "id": "test-smoke-on-connectiverx",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Smoke Test on Connectiverx",
  "description": "",
  "id": "test-smoke-on-connectiverx;smoke-test-on-connectiverx",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Type Connectiverx web address",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify learn more button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "verify the title of the page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "SmokeTest.i_open_Chrome_Browser()"
});
formatter.result({
  "duration": 9609374600,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.type_Connectiverx_web_address()"
});
formatter.result({
  "duration": 1594647800,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.verify_learn_more_button()"
});
formatter.result({
  "duration": 7299695900,
  "error_message": "java.lang.NullPointerException\r\n\tat stEpdEfination.SmokeTest.verify_learn_more_button(SmokeTest.java:40)\r\n\tat ✽.And verify learn more button(SmokeTest.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SmokeTest.verify_the_title_of_the_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SmokeTest.i_close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});