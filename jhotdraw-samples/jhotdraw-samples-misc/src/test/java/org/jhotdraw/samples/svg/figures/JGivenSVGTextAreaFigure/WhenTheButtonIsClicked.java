package org.jhotdraw.samples.svg.figures.JGivenSVGTextAreaFigure;

import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import org.jhotdraw.draw.DefaultDrawingView;
import org.jhotdraw.draw.figure.Figure;
import org.jhotdraw.draw.figure.TextHolderFigure;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class WhenTheButtonIsClicked extends Stage<WhenTheButtonIsClicked> {

    @ExpectedScenarioState
    private DefaultDrawingView defaultDrawingView;

    @Test
    public WhenTheButtonIsClicked the_button_is_clicked() {
        Figure textAreaFigure = defaultDrawingView.getSelectedFigures().iterator().next();
        assertNotNull(textAreaFigure);
        TextHolderFigure textHolderFigure = (TextHolderFigure) textAreaFigure;
        textHolderFigure.setText("Set text");

        return self();
    }
}
