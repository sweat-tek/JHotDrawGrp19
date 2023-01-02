package org.jhotdraw.samples.svg.figures;
import com.tngtech.jgiven.junit.ScenarioTest;
import org.jhotdraw.samples.svg.figures.JGivenSVGTextAreaFigure.GivenTheUserWantsToCreateTextArea;
import org.jhotdraw.samples.svg.figures.JGivenSVGTextAreaFigure.ThenTheUserCanCreateATextArea;
import org.jhotdraw.samples.svg.figures.JGivenSVGTextAreaFigure.WhenTheButtonIsClicked;
import org.junit.Test;

public class SVGTextAreaFigureGivenTest extends ScenarioTest<GivenTheUserWantsToCreateTextArea, WhenTheButtonIsClicked, ThenTheUserCanCreateATextArea> {

    @Test
    public void text_area () {
        given().the_user_wants_to_create_text_area();
        when().the_button_is_clicked();
        then().the_user_can_create_a_text_area();
    }
}