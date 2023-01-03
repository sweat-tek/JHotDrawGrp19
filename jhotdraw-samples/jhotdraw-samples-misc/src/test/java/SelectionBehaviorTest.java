import com.tngtech.jgiven.impl.Scenario;
import org.junit.Test;

public class SelectionBehaviorTest extends Scenario<GivenFigureToSelect, WhenFigureSelected, ThenFigureSelected> {

    @Test
    public void select_figure(){
        given().a_default_drawing_view().and().an_ellipse();
        when().figure_is_selected().and().selected();
        then().figure_is_selected();
    }
}
