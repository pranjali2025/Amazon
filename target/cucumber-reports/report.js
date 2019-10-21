$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/amazon.feature");
formatter.feature({
  "line": 1,
  "name": "Launch Amazon Browser",
  "description": "",
  "id": "launch-amazon-browser",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To Launch Browser and navigate to Amazon",
  "description": "",
  "id": "launch-amazon-browser;to-launch-browser-and-navigate-to-amazon",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": ": User launches Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": ": User navigates to amazon url",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": ": Amazon Website is launched",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": ": User is able to see the Amazon site",
  "keyword": "And "
});
formatter.match({
  "location": "Amazon.user_launches_Chrome_Browser()"
});
formatter.result({
  "duration": 4920671205,
  "status": "passed"
});
formatter.match({
  "location": "Amazon.user_navigates_to_amazon_url()"
});
formatter.result({
  "duration": 4950838855,
  "status": "passed"
});
formatter.match({
  "location": "Amazon.amazon_Website_is_launched()"
});
formatter.result({
  "duration": 1465588520,
  "status": "passed"
});
formatter.match({
  "location": "Amazon.user_is_able_to_see_the_Amazon_site()"
});
formatter.result({
  "duration": 2339620448,
  "status": "passed"
});
});