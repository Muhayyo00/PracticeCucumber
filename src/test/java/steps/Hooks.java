package steps;

import org.apache.poi.ss.formula.functions.Code;
import utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class Hooks extends CommonMethods {
@Before
    public void start(){
    openBrowserAndLaunchApplication();
}
@After
    public void end(){
    closeBrowser();
}

}
