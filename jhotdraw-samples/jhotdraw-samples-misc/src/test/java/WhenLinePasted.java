import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.figure.Figure;


public class WhenLinePasted extends Stage<WhenLinePasted> {

    @ExpectedScenarioState
    DefaultDrawingView defaultDrawingView;

    @ExpectedScenarioState
    Figure f1;


    public WhenLinePasted lineSelected() {
        defaultDrawingView.addToSelection(f1);
        return self();
    }
    public WhenLinePasted deleted() {
        defaultDrawingView.delete();

        return self();
    }

}