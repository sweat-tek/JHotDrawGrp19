package org.jhotdraw.draw.action;

import dk.sdu.mmmi.featuretracer.lib.FeatureEntryPoint;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.Figure;

import java.util.Collection;


public abstract class BringToFrontAction extends AbstractArrangeAction {
    private static final long serialVersionUID = 1L;
    public static final String ID = "edit.bringToFront";
    private SendToBackAction sendToBackAction;
    @Override
    String getID() {
        return ID;
    }
    public BringToFrontAction(DrawingEditor editor) {
        super(editor);
    }

    @FeatureEntryPoint(value = "ArrangeFront")

    @Override
    public void action(DrawingView view, Collection<Figure> figures) {
        assert view != null;
        assert figures != null;
        bringToFront(view, figures);
    }
    private void bringToFront(DrawingView view, Collection<Figure> figures) {
        assert view != null;
        assert figures != null;
        if (figures.isEmpty()) {
            return;
        }
    }
}