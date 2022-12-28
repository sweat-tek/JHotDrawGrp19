package org.jhotdraw.samples.svg.figures.JGivenSVGTextAreaFigure;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.TextHolderFigure;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ThenTheUserCanCreateATextArea extends Stage<ThenTheUserCanCreateATextArea> {

    @ExpectedScenarioState
    public DefaultDrawingView defaultDrawingView;

    @Test
    public ThenTheUserCanCreateATextArea the_user_can_create_a_text_area() {
        Figure textAreaFigure = defaultDrawingView.getSelectedFigures().iterator().next();
        assertNotNull(textAreaFigure);
        TextHolderFigure textHolderFigure = (TextHolderFigure) textAreaFigure;
        assertEquals("Set text", textHolderFigure.getText());

        return self();
    }
}
