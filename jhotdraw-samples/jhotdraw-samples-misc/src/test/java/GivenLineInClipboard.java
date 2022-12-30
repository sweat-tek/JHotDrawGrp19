import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.*;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.samples.svg.figures.SVGEllipseFigure;

public class GivenLineInClipboard extends Stage<GivenLineInClipboard>{

    @ProvidedScenarioState
    public DefaultDrawingView defaultDrawingView;

    @ProvidedScenarioState
    public Figure f1;


    public GivenLineInClipboard aDefaultDrawingView() {
        defaultDrawingView = new DefaultDrawingView();
        defaultDrawingView.setDrawing(new QuadTreeDrawing());

        return self();
    }

    public GivenLineInClipboard aDrawnLine() {
        f1 = new SVGEllipseFigure(0, 0, 100, 100);
        defaultDrawingView.getDrawing().add(f1);

        return self();
    }

}