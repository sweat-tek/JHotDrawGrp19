
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.QuadTreeDrawing;
import org.jhotdraw.draw.figure.EllipseFigure;
import org.jhotdraw.draw.figure.Figure;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class SelectionToolUnitTest {

    public DefaultDrawingView defaultDrawingView;
    public Figure figure;

    @Before
    public void setUp() {
        defaultDrawingView = new DefaultDrawingView();
        defaultDrawingView.setDrawing(new QuadTreeDrawing());
        figure = new EllipseFigure();
        defaultDrawingView.getDrawing().add(figure);
    }

    @Test
    public void select() {
        defaultDrawingView.addToSelection(figure);
        assertThat(1).isEqualTo(defaultDrawingView.getSelectedFigures().size());
    }

}
