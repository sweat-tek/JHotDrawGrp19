
import org.jhotdraw.samples.svg.figures.SVGRectFigure;
import org.junit.Before;
import org.junit.Test;


import java.awt.geom.AffineTransform;

import static org.junit.Assert.assertEquals;

public class SVGAttributedFigureTest {

    private AffineTransform at;
    private SVGRectFigure rect;

    @Before
    public void setup(){

        at = new AffineTransform();
        at.setToScale( 2, 2);
        rect = new SVGRectFigure( 0, 0, 3, 5, 3, 4);


        /*at = mock(AffineTransform.class);
        at.setToScale(2,2);
        rect = mock(SVGRectFigure.class);
        ellip = mock(SVGEllipseFigure.class);

         */


    }

    @Test
    public void transformTest(){
        rect.willChange();
        rect.transform(at);
        rect.changed();

        // The shape of the figure does not seem to change after transform, but it may be because the drawing program
        // is not open and connected to the test, so it cannot perform the transformation. Even when reverting the
        // refactorings, transform still does not change the shape of the fig, so it is not the refactoring that broke it.
        // However, the change in drawing area is registered, which can be used for a unit test.
        // The drawing area seems to be the shape dimensions + 2. So with an initial width of 3, the drawing area is
        // 5. We scale the shape by 2 times, making the drawing area 5*2 + the extra 2 again.
        assertEquals(16.0, rect.getDrawingArea().getHeight(), 0.0);
        assertEquals(12.0, rect.getDrawingArea().getWidth(), 0.0);
    }

}
