import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.QuadTreeDrawing;
import org.jhotdraw.draw.figure.EllipseFigure;
import org.jhotdraw.draw.figure.Figure;

public class GivenFigureToSelect extends Stage<GivenFigureToSelect> {

    @ProvidedScenarioState
    public DefaultDrawingView defaultDrawingView;

    @ProvidedScenarioState
    public Figure figure;


    public GivenFigureToSelect a_default_drawing_view() {
        defaultDrawingView = new DefaultDrawingView();
        defaultDrawingView.setDrawing(new QuadTreeDrawing());

        return self();
    }

    public GivenFigureToSelect an_ellipse() {
        figure = new EllipseFigure();
        defaultDrawingView.getDrawing().add(figure);

        return self();
    }
}