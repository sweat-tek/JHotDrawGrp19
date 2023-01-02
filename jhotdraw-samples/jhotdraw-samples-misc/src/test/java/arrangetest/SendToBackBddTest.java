package arrangetest;

import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;


public class SendToBackBddTest extends ScenarioTest<GivenUserHaveTwoFigures, WhenUserPressArrangeToBack, ThenFigureBehindOtherFigure>{
    @Test
    public void sendback() {
        given().userhavetwofigures();
        when().arrangetoback(given().getView());
        then().figurebehindotherfigure();
    }
    }

