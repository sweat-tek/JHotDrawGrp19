import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.figure.Figure;

public class WhenFigureSelected extends Stage<WhenFigureSelected> {

    @ExpectedScenarioState
    DefaultDrawingView defaultDrawingView;

    @ExpectedScenarioState
    Figure figure;


    public WhenFigureSelected figure_is_selected() {
        defaultDrawingView.addToSelection(figure);
        return self();
    }
    public WhenFigureSelected selected() {
        defaultDrawingView.addToSelection(figure);

        return self();
    }

}