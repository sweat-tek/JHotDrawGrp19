package arrangetest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.figure.CompositeFigure;
import org.jhotdraw.draw.figure.Figure;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class ThenFigureBehindOtherFigure extends Stage<ThenFigureBehindOtherFigure> {


    @ExpectedScenarioState
    DefaultDrawingView drawingView;
    @ExpectedScenarioState
    DrawingView view;
    @ExpectedScenarioState
    private Figure figure1;
    @ExpectedScenarioState
    private Figure figure2;

    @ExpectedScenarioState
    private CompositeFigure compositeFigure;

    @Test
    public ThenFigureBehindOtherFigure figurebehindotherfigure() {
        // get the list of figures in the composite figure
        List<Figure> figures = compositeFigure.getChildren();
        // verify that the figures are in the correct order
        assertEquals(figure2, figures.get(0));
        assertEquals(figure1, figures.get(1));
        return self();
    }
}
