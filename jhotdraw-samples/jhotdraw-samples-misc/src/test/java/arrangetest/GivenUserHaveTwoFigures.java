package arrangetest;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.RectangleFigure;
import org.junit.Test;

public class GivenUserHaveTwoFigures extends Stage<GivenUserHaveTwoFigures> {

    @ProvidedScenarioState
    DefaultDrawingView drawingView;

    @ProvidedScenarioState
    DrawingView view;



   @Test
   public GivenUserHaveTwoFigures userhavetwofigures() {
       // create a drawing with two figures
       Drawing drawing = new DefaultDrawing();
       Figure figure1 = new RectangleFigure(0, 0, 10, 10);
       Figure figure2 = new RectangleFigure(10, 10, 10, 10);
       drawing.add(figure1);
       drawing.add(figure2);

       // create a drawing view with the drawing
       DrawingView view = new DefaultDrawingView();
       view.setDrawing(drawing);

       // select both figures
       view.addToSelection(figure1);
       view.addToSelection(figure2);
       return self();
   }

}
