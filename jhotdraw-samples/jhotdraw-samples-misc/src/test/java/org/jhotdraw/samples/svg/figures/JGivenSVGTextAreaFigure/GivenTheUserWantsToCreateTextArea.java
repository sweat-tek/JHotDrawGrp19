package org.jhotdraw.samples.svg.figures.JGivenSVGTextAreaFigure;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.BeforeScenario;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import org.jhotdraw.draw.DefaultDrawing;
import org.jhotdraw.draw.DefaultDrawingEditor;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.figure.TextHolderFigure;
import org.jhotdraw.samples.svg.figures.SVGTextAreaFigure;
import org.junit.Test;

public class GivenTheUserWantsToCreateTextArea extends Stage<GivenTheUserWantsToCreateTextArea> {

        @ProvidedScenarioState
        private DrawingEditor drawingEditor;

        @ProvidedScenarioState
        private DefaultDrawingView defaultDrawingView;

        @BeforeScenario
        void before() {
            drawingEditor = new DefaultDrawingEditor();
            defaultDrawingView = new DefaultDrawingView();

            defaultDrawingView.setDrawing(new DefaultDrawing());
            drawingEditor.setActiveView(defaultDrawingView);
        }

        @Test
        public GivenTheUserWantsToCreateTextArea the_user_wants_to_create_text_area() {
            TextHolderFigure textHolderFigure = new SVGTextAreaFigure();
            defaultDrawingView.getDrawing().add(textHolderFigure);
            defaultDrawingView.addToSelection(textHolderFigure);
            defaultDrawingView.selectAll();

            return self();
        }
}
