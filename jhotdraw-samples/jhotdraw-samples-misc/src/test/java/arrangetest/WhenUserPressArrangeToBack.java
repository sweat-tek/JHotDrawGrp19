package arrangetest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.action.SendToBackAction;
import org.jhotdraw.draw.figure.Figure;
import org.junit.Test;

import java.util.Collection;

public class WhenUserPressArrangeToBack extends Stage<WhenUserPressArrangeToBack> {

    @ExpectedScenarioState
    DefaultDrawingView drawingView;

    @ExpectedScenarioState
    DrawingView view;

    @ExpectedScenarioState
    Collection<Figure> SelectedFigures;


    @Test
    public WhenUserPressArrangeToBack arrangetoback() {
        return null;
    }
}
