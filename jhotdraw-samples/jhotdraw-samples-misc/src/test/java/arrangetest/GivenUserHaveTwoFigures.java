package arrangetest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.figure.CompositeFigure;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.RectangleFigure;
import org.junit.Test;

public class GivenUserHaveTwoFigures extends Stage<GivenUserHaveTwoFigures> {

    @ProvidedScenarioState
    DefaultDrawingView drawingView;

    @ProvidedScenarioState
    DrawingView view;

    @ProvidedScenarioState
    private Figure figure1;
    @ProvidedScenarioState
    private Figure figure2;
    @ProvidedScenarioState
    private CompositeFigure compositeFigure;




    @Test
    public GivenUserHaveTwoFigures userhavetwofigures() {

        // create two figures and add them to the composite figure
        figure1 = new RectangleFigure(0, 0, 10, 10);
        figure2 = new RectangleFigure(10, 10, 10, 10);
        compositeFigure.add(figure1);
        compositeFigure.add(figure2);

        // create a drawing with the composite figure as the root figure
        Drawing drawing = new DefaultDrawing();
        drawing.add(compositeFigure);

        // create a drawing view with the drawing
        view = new DefaultDrawingView();
        view.setDrawing(drawing);

        // select both figures
        view.addToSelection(figure1);
        view.addToSelection(figure2);
        return self();
    }

    public DrawingView getView() {
        return view;
    }

}
