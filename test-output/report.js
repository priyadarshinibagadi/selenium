$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Hooks.feature');
formatter.feature({
  "line": 1,
  "name": "deals link feature",
  "description": "",
  "id": "deals-link-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "new deal link scenario",
  "description": "",
  "id": "deals-link-feature;new-deal-link-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of login page free crm",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user click login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user moves to the new deals",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters new deal details",
  "keyword": "Then "
});
formatter.match({
  "location": "HooksStepdefinition.user_already_in_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HooksStepdefinition.title_of_login_page_free_crm()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HooksStepdefinition.user_enters_username_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HooksStepdefinition.user_click_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HooksStepdefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HooksStepdefinition.user_moves_to_the_new_deals()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "HooksStepdefinition.user_enters_new_deal_details()"
});
formatter.result({
  "status": "skipped"
});
});