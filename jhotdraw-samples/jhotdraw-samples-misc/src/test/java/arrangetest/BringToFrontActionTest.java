package arrangetest;


import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.Drawing;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.action.BringToFrontAction;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.RectangleFigure;
import org.junit.*;

import java.util.Iterator;
import static org.junit.Assert.*;

public class BringToFrontActionTest {
    public BringToFrontActionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void bringtofrontTest() {
        //creates a new drawing and two rectangle figures.
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

        BringToFrontAction.bringToFront(view, view.getSelectedFigures());

        Iterator<Figure> i = drawing.getFiguresFrontToBack().iterator();
        assertEquals(figure2, i.next());
        assertEquals(figure1, i.next());
    }
}
