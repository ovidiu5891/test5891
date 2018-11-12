$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("HomePage.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author:Ovidiu Badea"
    }
  ],
  "line": 3,
  "name": "HomePage",
  "description": "\r\nAs a QA Engineer\r\nI want to validate the functionality of the footer and related pages\r\nso the customer can use it like its supposed to.",
  "id": "homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@homepage"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Checks the main-categories for Pfelge",
  "description": "",
  "id": "homepage;checks-the-main-categories-for-pfelge",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@mainCategory"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I should be on the page \"home\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I hover over the 3 \"Pflege\" category",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see the main-categories \"\u003cPflege-main-category\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should be on the page \"\u003cpage\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "homepage;checks-the-main-categories-for-pfelge;",
  "rows": [
    {
      "cells": [
        "Pflege-main-category",
        "",
        "page"
      ],
      "line": 19,
      "id": "homepage;checks-the-main-categories-for-pfelge;;1"
    },
    {
      "cells": [
        "GESICHT",
        "",
        "gesichtspflege"
      ],
      "line": 20,
      "id": "homepage;checks-the-main-categories-for-pfelge;;2"
    },
    {
      "cells": [
        "KORPER",
        "",
        "koerperpflege"
      ],
      "line": 21,
      "id": "homepage;checks-the-main-categories-for-pfelge;;3"
    },
    {
      "cells": [
        "SONNEN",
        "",
        "sonnenpflege"
      ],
      "line": 22,
      "id": "homepage;checks-the-main-categories-for-pfelge;;4"
    },
    {
      "cells": [
        "FOR MEN",
        "",
        "herrenpflege"
      ],
      "line": 23,
      "id": "homepage;checks-the-main-categories-for-pfelge;;5"
    },
    {
      "cells": [
        "TOP MARKEN",
        "",
        "marken"
      ],
      "line": 24,
      "id": "homepage;checks-the-main-categories-for-pfelge;;6"
    },
    {
      "cells": [
        "SPECIALS",
        "",
        "specials"
      ],
      "line": 25,
      "id": "homepage;checks-the-main-categories-for-pfelge;;7"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5115944200,
  "status": "passed"
});
formatter.before({
  "duration": 4945471400,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Checks the main-categories for Pfelge",
  "description": "",
  "id": "homepage;checks-the-main-categories-for-pfelge;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@homepage"
    },
    {
      "line": 9,
      "name": "@mainCategory"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I should be on the page \"home\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I hover over the 3 \"Pflege\" category",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see the main-categories \"GESICHT\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should be on the page \"gesichtspflege\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "home",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "duration": 223279400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    },
    {
      "val": "Pflege",
      "offset": 20
    }
  ],
  "location": "HomePageStepDefinition.i_hover_over_menu(int,String)"
});
formatter.result({
  "duration": 605251200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "GESICHT",
      "offset": 34
    }
  ],
  "location": "HomePageStepDefinition.i_should_see_the_mainCategory(String)"
});
formatter.result({
  "duration": 52932400,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[]\u003e but was:\u003c[GESICHT]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat flaconi.shop.pageObject.HomePage.checkMainCategoryPflege(HomePage.java:117)\r\n\tat flaconi.shop.integration.cucumber.HomePageStepDefinition.i_should_see_the_mainCategory(HomePageStepDefinition.java:27)\r\n\tat ✽.Then I should see the main-categories \"GESICHT\"(HomePage.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "gesichtspflege",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4329600,
  "status": "passed"
});
formatter.before({
  "duration": 2213922100,
  "status": "passed"
});
formatter.before({
  "duration": 5837178400,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Checks the main-categories for Pfelge",
  "description": "",
  "id": "homepage;checks-the-main-categories-for-pfelge;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@homepage"
    },
    {
      "line": 9,
      "name": "@mainCategory"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I should be on the page \"home\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I hover over the 3 \"Pflege\" category",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see the main-categories \"KORPER\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should be on the page \"koerperpflege\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "home",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "duration": 13362700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    },
    {
      "val": "Pflege",
      "offset": 20
    }
  ],
  "location": "HomePageStepDefinition.i_hover_over_menu(int,String)"
});
formatter.result({
  "duration": 592831700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "KORPER",
      "offset": 34
    }
  ],
  "location": "HomePageStepDefinition.i_should_see_the_mainCategory(String)"
});
formatter.result({
  "duration": 328663200,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: {\"errorMessage\":\"Element is not currently visible and may not be manipulated\",\"request\":{\"headers\":{\"Accept-Encoding\":\"gzip\",\"Connection\":\"Keep-Alive\",\"Content-Length\":\"32\",\"Content-Type\":\"application/json; charset\u003dutf-8\",\"Host\":\"localhost:8777\",\"User-Agent\":\"selenium/3.14.0 (java windows)\"},\"httpVersion\":\"1.1\",\"method\":\"POST\",\"post\":\"{\\n  \\\"id\\\": \\\":wdc:1542039770184\\\"\\n}\",\"url\":\"/click\",\"urlParsed\":{\"anchor\":\"\",\"query\":\"\",\"file\":\"click\",\"directory\":\"/\",\"path\":\"/click\",\"relative\":\"/click\",\"port\":\"\",\"host\":\"\",\"password\":\"\",\"user\":\"\",\"userInfo\":\"\",\"authority\":\"\",\"protocol\":\"\",\"source\":\"/click\",\"queryKey\":{},\"chunks\":[\"click\"]},\"urlOriginal\":\"/session/2f4dacf0-e697-11e8-9c43-c3b00da4d9bb/element/:wdc:1542039770184/click\"}}\nCommand duration or timeout: 0 milliseconds\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSCommandExecutor.execute(PhantomJSCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat flaconi.shop.pageObject.HomePage.checkMainCategoryPflege(HomePage.java:122)\r\n\tat flaconi.shop.integration.cucumber.HomePageStepDefinition.i_should_see_the_mainCategory(HomePageStepDefinition.java:27)\r\n\tat ✽.Then I should see the main-categories \"KORPER\"(HomePage.feature:13)\r\nCaused by: org.openqa.selenium.remote.ScreenshotException: Screen shot has been taken\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:140)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSCommandExecutor.execute(PhantomJSCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat flaconi.shop.pageObject.HomePage.checkMainCategoryPflege(HomePage.java:122)\r\n\tat flaconi.shop.integration.cucumber.HomePageStepDefinition.i_should_see_the_mainCategory(HomePageStepDefinition.java:27)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:367)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:274)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:161)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:290)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:242)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\r\nCaused by: org.openqa.selenium.ElementNotVisibleException: {\"errorMessage\":\"Element is not currently visible and may not be manipulated\",\"request\":{\"headers\":{\"Accept-Encoding\":\"gzip\",\"Connection\":\"Keep-Alive\",\"Content-Length\":\"32\",\"Content-Type\":\"application/json; charset\u003dutf-8\",\"Host\":\"localhost:8777\",\"User-Agent\":\"selenium/3.14.0 (java windows)\"},\"httpVersion\":\"1.1\",\"method\":\"POST\",\"post\":\"{\\n  \\\"id\\\": \\\":wdc:1542039770184\\\"\\n}\",\"url\":\"/click\",\"urlParsed\":{\"anchor\":\"\",\"query\":\"\",\"file\":\"click\",\"directory\":\"/\",\"path\":\"/click\",\"relative\":\"/click\",\"port\":\"\",\"host\":\"\",\"password\":\"\",\"user\":\"\",\"userInfo\":\"\",\"authority\":\"\",\"protocol\":\"\",\"source\":\"/click\",\"queryKey\":{},\"chunks\":[\"click\"]},\"urlOriginal\":\"/session/2f4dacf0-e697-11e8-9c43-c3b00da4d9bb/element/:wdc:1542039770184/click\"}}\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027OVI\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: unknown\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "koerperpflege",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3957100,
  "status": "passed"
});
formatter.before({
  "duration": 2203691000,
  "status": "passed"
});
formatter.before({
  "duration": 6112752000,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Checks the main-categories for Pfelge",
  "description": "",
  "id": "homepage;checks-the-main-categories-for-pfelge;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@homepage"
    },
    {
      "line": 9,
      "name": "@mainCategory"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I should be on the page \"home\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I hover over the 3 \"Pflege\" category",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see the main-categories \"SONNEN\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should be on the page \"sonnenpflege\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "home",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "duration": 16351100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    },
    {
      "val": "Pflege",
      "offset": 20
    }
  ],
  "location": "HomePageStepDefinition.i_hover_over_menu(int,String)"
});
formatter.result({
  "duration": 582209900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SONNEN",
      "offset": 34
    }
  ],
  "location": "HomePageStepDefinition.i_should_see_the_mainCategory(String)"
});
formatter.result({
  "duration": 40646200,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat flaconi.shop.pageObject.HomePage.checkMainCategoryPflege(HomePage.java:125)\r\n\tat flaconi.shop.integration.cucumber.HomePageStepDefinition.i_should_see_the_mainCategory(HomePageStepDefinition.java:27)\r\n\tat ✽.Then I should see the main-categories \"SONNEN\"(HomePage.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "sonnenpflege",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4101500,
  "status": "passed"
});
formatter.before({
  "duration": 2195771400,
  "status": "passed"
});
formatter.before({
  "duration": 4693114800,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Checks the main-categories for Pfelge",
  "description": "",
  "id": "homepage;checks-the-main-categories-for-pfelge;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@homepage"
    },
    {
      "line": 9,
      "name": "@mainCategory"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I should be on the page \"home\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I hover over the 3 \"Pflege\" category",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see the main-categories \"FOR MEN\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should be on the page \"herrenpflege\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "home",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "duration": 13948100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    },
    {
      "val": "Pflege",
      "offset": 20
    }
  ],
  "location": "HomePageStepDefinition.i_hover_over_menu(int,String)"
});
formatter.result({
  "duration": 580852600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FOR MEN",
      "offset": 34
    }
  ],
  "location": "HomePageStepDefinition.i_should_see_the_mainCategory(String)"
});
formatter.result({
  "duration": 39319700,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat flaconi.shop.pageObject.HomePage.checkMainCategoryPflege(HomePage.java:129)\r\n\tat flaconi.shop.integration.cucumber.HomePageStepDefinition.i_should_see_the_mainCategory(HomePageStepDefinition.java:27)\r\n\tat ✽.Then I should see the main-categories \"FOR MEN\"(HomePage.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "herrenpflege",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 3736900,
  "status": "passed"
});
formatter.before({
  "duration": 2195798900,
  "status": "passed"
});
formatter.before({
  "duration": 5134465600,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Checks the main-categories for Pfelge",
  "description": "",
  "id": "homepage;checks-the-main-categories-for-pfelge;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@homepage"
    },
    {
      "line": 9,
      "name": "@mainCategory"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I should be on the page \"home\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I hover over the 3 \"Pflege\" category",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see the main-categories \"TOP MARKEN\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should be on the page \"marken\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "home",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "duration": 12847500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    },
    {
      "val": "Pflege",
      "offset": 20
    }
  ],
  "location": "HomePageStepDefinition.i_hover_over_menu(int,String)"
});
formatter.result({
  "duration": 580892300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TOP MARKEN",
      "offset": 34
    }
  ],
  "location": "HomePageStepDefinition.i_should_see_the_mainCategory(String)"
});
formatter.result({
  "duration": 38111700,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat flaconi.shop.pageObject.HomePage.checkMainCategoryPflege(HomePage.java:133)\r\n\tat flaconi.shop.integration.cucumber.HomePageStepDefinition.i_should_see_the_mainCategory(HomePageStepDefinition.java:27)\r\n\tat ✽.Then I should see the main-categories \"TOP MARKEN\"(HomePage.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "marken",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 5169400,
  "status": "passed"
});
formatter.before({
  "duration": 2206313700,
  "status": "passed"
});
formatter.before({
  "duration": 5668218900,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Checks the main-categories for Pfelge",
  "description": "",
  "id": "homepage;checks-the-main-categories-for-pfelge;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@homepage"
    },
    {
      "line": 9,
      "name": "@mainCategory"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I should be on the page \"home\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I hover over the 3 \"Pflege\" category",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "I should see the main-categories \"SPECIALS\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I should be on the page \"specials\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "home",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "duration": 15514600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    },
    {
      "val": "Pflege",
      "offset": 20
    }
  ],
  "location": "HomePageStepDefinition.i_hover_over_menu(int,String)"
});
formatter.result({
  "duration": 579265500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SPECIALS",
      "offset": 34
    }
  ],
  "location": "HomePageStepDefinition.i_should_see_the_mainCategory(String)"
});
formatter.result({
  "duration": 323971300,
  "error_message": "org.openqa.selenium.ElementNotVisibleException: {\"errorMessage\":\"Element is not currently visible and may not be manipulated\",\"request\":{\"headers\":{\"Accept-Encoding\":\"gzip\",\"Connection\":\"Keep-Alive\",\"Content-Length\":\"32\",\"Content-Type\":\"application/json; charset\u003dutf-8\",\"Host\":\"localhost:18831\",\"User-Agent\":\"selenium/3.14.0 (java windows)\"},\"httpVersion\":\"1.1\",\"method\":\"POST\",\"post\":\"{\\n  \\\"id\\\": \\\":wdc:1542039803507\\\"\\n}\",\"url\":\"/click\",\"urlParsed\":{\"anchor\":\"\",\"query\":\"\",\"file\":\"click\",\"directory\":\"/\",\"path\":\"/click\",\"relative\":\"/click\",\"port\":\"\",\"host\":\"\",\"password\":\"\",\"user\":\"\",\"userInfo\":\"\",\"authority\":\"\",\"protocol\":\"\",\"source\":\"/click\",\"queryKey\":{},\"chunks\":[\"click\"]},\"urlOriginal\":\"/session/4343b100-e697-11e8-8cc1-a79cac53c209/element/:wdc:1542039803507/click\"}}\nCommand duration or timeout: 0 milliseconds\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSCommandExecutor.execute(PhantomJSCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat flaconi.shop.pageObject.HomePage.checkMainCategoryPflege(HomePage.java:138)\r\n\tat flaconi.shop.integration.cucumber.HomePageStepDefinition.i_should_see_the_mainCategory(HomePageStepDefinition.java:27)\r\n\tat ✽.Then I should see the main-categories \"SPECIALS\"(HomePage.feature:13)\r\nCaused by: org.openqa.selenium.remote.ScreenshotException: Screen shot has been taken\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:140)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.phantomjs.PhantomJSCommandExecutor.execute(PhantomJSCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat flaconi.shop.pageObject.HomePage.checkMainCategoryPflege(HomePage.java:138)\r\n\tat flaconi.shop.integration.cucumber.HomePageStepDefinition.i_should_see_the_mainCategory(HomePageStepDefinition.java:27)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.execute(JUnit4Provider.java:367)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeWithRerun(JUnit4Provider.java:274)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.executeTestSet(JUnit4Provider.java:238)\r\n\tat org.apache.maven.surefire.junit4.JUnit4Provider.invoke(JUnit4Provider.java:161)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:290)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:242)\r\n\tat org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:121)\r\nCaused by: org.openqa.selenium.ElementNotVisibleException: {\"errorMessage\":\"Element is not currently visible and may not be manipulated\",\"request\":{\"headers\":{\"Accept-Encoding\":\"gzip\",\"Connection\":\"Keep-Alive\",\"Content-Length\":\"32\",\"Content-Type\":\"application/json; charset\u003dutf-8\",\"Host\":\"localhost:18831\",\"User-Agent\":\"selenium/3.14.0 (java windows)\"},\"httpVersion\":\"1.1\",\"method\":\"POST\",\"post\":\"{\\n  \\\"id\\\": \\\":wdc:1542039803507\\\"\\n}\",\"url\":\"/click\",\"urlParsed\":{\"anchor\":\"\",\"query\":\"\",\"file\":\"click\",\"directory\":\"/\",\"path\":\"/click\",\"relative\":\"/click\",\"port\":\"\",\"host\":\"\",\"password\":\"\",\"user\":\"\",\"userInfo\":\"\",\"authority\":\"\",\"protocol\":\"\",\"source\":\"/click\",\"queryKey\":{},\"chunks\":[\"click\"]},\"urlOriginal\":\"/session/4343b100-e697-11e8-8cc1-a79cac53c209/element/:wdc:1542039803507/click\"}}\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027OVI\u0027, ip: \u002710.0.75.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: unknown\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "specials",
      "offset": 25
    }
  ],
  "location": "HomePageStepDefinition.i_should_be_on_the_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 5736300,
  "status": "passed"
});
});