$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/Testcase.feature");
formatter.feature({
  "line": 2,
  "name": "Practice Automation Testing Website",
  "description": "",
  "id": "practice-automation-testing-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@PracticeAutomation"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Register and Login in Practice Automation Testing Website",
  "description": "",
  "id": "practice-automation-testing-website;register-and-login-in-practice-automation-testing-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@TC-01RegisterandLogin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "The user Launch the Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "The user Opens the Practice Automation Testing Website",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "The user Click My Account link",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Enter email id and password in Register",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click on the Register button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "The user navigates back and again clicks my account link",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "The user type the registered email id and password in Login Click on the Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "PAP_RegisterandLogin_Steps.the_user_Launch_the_Chrome_Browser()"
});
formatter.result({
  "duration": 6549610921,
  "status": "passed"
});
formatter.match({
  "location": "PAP_RegisterandLogin_Steps.the_user_Opens_the_Practice_Automation_Testing_Website()"
});
formatter.result({
  "duration": 6957576748,
  "status": "passed"
});
formatter.match({
  "location": "PAP_RegisterandLogin_Steps.the_user_Click_My_Account_link()"
});
formatter.result({
  "duration": 26056447778,
  "status": "passed"
});
formatter.match({
  "location": "PAP_RegisterandLogin_Steps.enter_email_id_and_password_in_Register()"
});
formatter.result({
  "duration": 669179494,
  "status": "passed"
});
formatter.match({
  "location": "PAP_RegisterandLogin_Steps.click_on_the_Register_button()"
});
formatter.result({
  "duration": 2107722875,
  "status": "passed"
});
formatter.match({
  "location": "PAP_RegisterandLogin_Steps.the_user_navigates_back_and_again_clicks_my_account_link()"
});
formatter.result({
  "duration": 10876647585,
  "status": "passed"
});
formatter.match({
  "location": "PAP_RegisterandLogin_Steps.the_user_type_the_registered_email_id_and_password_in_Login_Click_on_the_Login_button()"
});
formatter.result({
  "duration": 24816695857,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#username\"}\n  (Session info: chrome\u003d80.0.3987.132)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:25:53\u0027\nSystem info: host: \u0027BLT1216\u0027, ip: \u0027192.168.1.216\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.132, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\BLTUSE~1.BLT\\AppDa...}, goog:chromeOptions: {debuggerAddress: localhost:59197}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: c3b5ba61b4f1ffbe4485110058de5ab6\n*** Element info: {Using\u003did, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.Pages.PAP_RegisterAndLogin.loginemailandpass(PAP_RegisterAndLogin.java:83)\r\n\tat com.Stepdefinition.PAP_RegisterandLogin_Steps.the_user_type_the_registered_email_id_and_password_in_Login_Click_on_the_Login_button(PAP_RegisterandLogin_Steps.java:59)\r\n\tat ✽.Then The user type the registered email id and password in Login Click on the Login button(src/main/resources/Features/Testcase.feature:12)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 15,
  "name": "Shop the Product in Practice Automation Project Testing Website",
  "description": "",
  "id": "practice-automation-testing-website;shop-the-product-in-practice-automation-project-testing-website",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@TC-02Shoptheproduct"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "Click Shop Link",
  "keyword": "Given "
});
formatter.step({
  "line": 17,
  "name": "Select sort by newness from sorting",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "Click Functional Programming js book and click add to basket",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click HTML web app development book and click add to basket",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click add to cart link",
  "keyword": "Then "
});
formatter.match({
  "location": "PAP_ShoptheProduct_Steps.click_Shop_Link()"
});
formatter.result({
  "duration": 3826319,
  "error_message": "java.lang.NullPointerException\r\n\tat com.Pages.PAP_ShoptheProduct.shop(PAP_ShoptheProduct.java:30)\r\n\tat com.Stepdefinition.PAP_ShoptheProduct_Steps.click_Shop_Link(PAP_ShoptheProduct_Steps.java:18)\r\n\tat ✽.Given Click Shop Link(src/main/resources/Features/Testcase.feature:16)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PAP_ShoptheProduct_Steps.select_sort_by_newness_from_sorting()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PAP_ShoptheProduct_Steps.click_Functional_Programming_js_book_and_click_add_to_basket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PAP_ShoptheProduct_Steps.click_HTML_web_app_development_book_and_click_add_to_basket()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PAP_ShoptheProduct_Steps.click_add_to_cart_link()"
});
formatter.result({
  "status": "skipped"
});
});