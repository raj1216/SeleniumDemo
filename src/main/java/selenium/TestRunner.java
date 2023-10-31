
  package selenium;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
  
  @CucumberOptions( features ="D:/selenium/selenium/src/main/resources/luanchBrowser.feature"
  ,glue={"D:/selenium/selenium/src/test/java/selenium/launchBrowserSteps.java"}
  )

  public class TestRunner {
  
  }
 