package org.jhotdraw.draw.arrange;

import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.action.SendToBackAction;
import org.jhotdraw.draw.figure.EllipseFigure;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.RectangleFigure;
import org.junit.Test;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class SendToBackActionTest {
    @Test
    public void testSendToBackScenario() {
        // Given: I have two figures on my drawing
        DrawingEditor drawingeditor = new DefaultDrawingEditor();
        DrawingView drawingView = new DefaultDrawingView();
        Collection<Figure> figures = new ArrayList<>();
        figures.add(new RectangleFigure());
        figures.add(new EllipseFigure());

        // When: I arrange one of them "i press arrange to back"
        SendToBackAction action = new SendToBackAction(drawingeditor) {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        action.action(drawingView, figures);

        // Then: the figure would be behind the other figure
        List<Figure> viewFigures = (List<Figure>) drawingView.getDrawing();
        assertEquals(((ArrayList<Figure>) figures).get(1), viewFigures.get(0));
        assertEquals(((ArrayList<Figure>) figures).get(0), viewFigures.get(1));
    }
}
