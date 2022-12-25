package org.jhotdraw.samples.svg.figures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import static org.junit.Assert.*;


public class SVGTextAreaFigureTest {

    private SVGTextAreaFigure textArea;

    @Before
    public void setUp() throws Exception {
        textArea = new SVGTextAreaFigure("Text area");
    }

    @After
    public void tearDown() throws Exception {
        textArea.requestRemove();
    }

    @Test
    public void getText() {
        assertEquals("Text area", textArea.getText());
    }

    @Test
    public void setText() {
        textArea.setText("Text area");
        assertEquals("Text area", textArea.getText());
    }

    @Test
    public void  creatingTabStops() {
        float tabWidth = 10;
        Rectangle2D.Double textRect = new Rectangle2D.Double(10, 10, 20, 5);
        float[] tabStops = textArea.creatingTabStops(tabWidth, textRect);
        int expectedLength = (int) (textRect.width / tabWidth);
        assertEquals(expectedLength, tabStops.length);
    }

    @Test
    public void setBounds() {
        Rectangle2D.Double beforeNewBounds = textArea.getBounds();
        Point2D.Double anchor = new Point2D.Double(1.93, 4.56);
        Point2D.Double lead = new Point2D.Double(6.54, 5.21);
        textArea.setBounds(anchor, lead);
        assertNotNull(textArea.getBounds());
        assertNotEquals(beforeNewBounds, textArea.getBounds());
        assertEquals(anchor.x, textArea.getBounds().x, 0.5);
        assertEquals(anchor.y, textArea.getBounds().y, 0.5);
    }

    @Test
    public void isEmpty() {
        assertFalse(textArea.isEmpty());
        textArea.setText(null);
        assertTrue(textArea.isEmpty());
    }
}