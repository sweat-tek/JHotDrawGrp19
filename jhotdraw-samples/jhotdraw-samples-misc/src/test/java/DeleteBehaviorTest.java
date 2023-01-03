import com.tngtech.jgiven.junit.ScenarioTest;
import org.junit.Test;

public class DeleteBehaviorTest extends ScenarioTest<GivenLineInClipboard, WhenLinePasted, ThenLinePasted> {

    @Test
    public void deleteSelection() {
        given().aDefaultDrawingView().and().aDrawnLine();

        when().lineSelected().and().deleted();

        then().lineIsDeleted();
    }
}