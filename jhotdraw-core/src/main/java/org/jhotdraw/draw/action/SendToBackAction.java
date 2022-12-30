package org.jhotdraw.draw.action;

import dk.sdu.mmmi.featuretracer.lib.FeatureEntryPoint;
import org.jhotdraw.draw.DrawingEditor;
import org.jhotdraw.draw.DrawingView;
import org.jhotdraw.draw.Figure;

import java.util.Collection;



public abstract class SendToBackAction extends AbstractArrangeAction {

    private static final long serialVersionUID = 1L;
    public static final String ID = "edit.sendToBack";
    private BringToFrontAction bringToFrontAction;

    @Override
    String getID() {
        return ID;
    }

    public SendToBackAction(DrawingEditor editor) {
        super(editor);
    }

    @FeatureEntryPoint(value = "ArrangeBack")
    @Override
    public void action(DrawingView view, Collection<Figure> figures) {
        assert view != null;
        assert figures != null;
        sendToBack(view, figures);
    }

    private void sendToBack(DrawingView view, Collection<Figure> figures) {
        assert view != null;
        assert figures != null;
        if (figures.isEmpty()) {
            return;
        }
    }
}