import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.QuadTreeDrawing;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.samples.svg.figures.SVGEllipseFigure;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DuplicateUnitTest {

    public DefaultDrawingView defaultDrawingView;
    public Figure f1;

    @Before
    public void setUp() {
        defaultDrawingView = new DefaultDrawingView();
        defaultDrawingView.setDrawing(new QuadTreeDrawing());
        f1 = new SVGEllipseFigure(0, 0, 100, 100);
        defaultDrawingView.getDrawing().add(f1);
    }

    @Test
    public void duplicate() {
        defaultDrawingView.addToSelection(f1);
        defaultDrawingView.duplicate();
        assertThat(2).isEqualTo(defaultDrawingView.getDrawing().getChildCount());

    }

}
