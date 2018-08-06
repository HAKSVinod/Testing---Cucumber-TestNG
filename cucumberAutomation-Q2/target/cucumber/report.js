$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/outline.feature");
formatter.feature({
  "line": 1,
  "name": "TestAnnotations",
  "description": "",
  "id": "testannotations",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test ikman.lk website",
  "description": "",
  "id": "testannotations;test-ikman.lk-website",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the firefox with ikman.lk url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Maximize the window",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Go to property",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Go to houses",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Sort houses in Colombo",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click price link",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Apply min as \"\u003c5000000\u003e\" and max as \"\u003c75000000\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click apply button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click beds link",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Select bed count as three",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Print the sorted add count",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Print prices of the found adds",
  "keyword": "And "
});
formatter.match({
  "location": "TestAnnotations.open_the_firefox_with_ikman_lk_url()"
});
formatter.result({
  "duration": 17989588202,
  "status": "passed"
});
formatter.match({
  "location": "TestAnnotations.maximize_the_window()"
});
formatter.result({
  "duration": 83632315,
  "status": "passed"
});
formatter.match({
  "location": "TestAnnotations.go_to_property()"
});
formatter.result({
  "duration": 7969451427,
  "status": "passed"
});
formatter.match({
  "location": "TestAnnotations.go_to_houses()"
});
formatter.result({
  "duration": 96450059,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to locate element: /html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[3]/div/ul/li/ul[1]/li/ul/li[2]/a/span\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-LHJ4G2I\u0027, ip: \u0027192.168.8.101\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 60.0.1, javascriptEnabled: true, moz:accessibilityChecks: false, moz:headless: false, moz:processID: 7056, moz:profile: C:\\Users\\Achini\\AppData\\Loc..., moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: XP, platformName: XP, platformVersion: 10.0, rotatable: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}}\nSession ID: f7de3958-d78c-43ab-9dd8-439aef0020bd\n*** Element info: {Using\u003dxpath, value\u003d/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[1]/div/div/form/div/div[3]/div/ul/li/ul[1]/li/ul/li[2]/a/span}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat stepDefinition.TestAnnotations.go_to_houses(TestAnnotations.java:48)\r\n\tat ✽.And Go to houses(src/test/resources/outline.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TestAnnotations.sort_houses_in_Colombo()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAnnotations.click_price_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003c5000000\u003e",
      "offset": 14
    },
    {
      "val": "\u003c75000000\u003e",
      "offset": 37
    }
  ],
  "location": "TestAnnotations.i_can_Select_min_as_and_max_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAnnotations.click_apply_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAnnotations.click_beds_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAnnotations.select_bed_count_as_three()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAnnotations.print_the_sorted_add_count()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TestAnnotations.print_prices_of_the_found_adds()"
});
formatter.result({
  "status": "skipped"
});
});