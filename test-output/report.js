$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successful Login with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Lounch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.user_Lounch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_open_URL(String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.stepDefination.LoginSteps.user_open_URL(LoginSteps.java:32)\r\n\tat ✽.User open URL \"https://admin-demo.nopcommerce.com/login\"(file:Features/Login.feature:6)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.click_on_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.page_Title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.user_click_on_logout_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Page title should be \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.page_title_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});