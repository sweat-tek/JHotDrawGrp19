package org.jhotdraw.draw.action;



public abstract class AbstractArrangeAction extends AbstractDrawingViewAction {
    protected AbstractArrangeAction(DrawingEditor editor) {
        super(editor);
    }
    abstract String getID();
    public abstract void action(DrawingView view, Collection<Figure> figures);
    public abstract void redoAction(DrawingView view, LinkedList<Figure> figures);
    public abstract void undoAction(DrawingView view, LinkedList<Figure> figures);

    protected void fireUndoableEdit(final DrawingView view, final LinkedList<Figure> figures) {
        fireUndoableEditHappened(new AbstractUndoableEdit() {
            private static final long serialVersionUID = 1L;
            @Override
            public String getPresentationName() {
                ResourceBundleUtil labels = ResourceBundleUtil.getBundle("org.jhotdraw.draw.Labels");
                return labels.getTextProperty(getID());
            }
            @Override
            public void redo() throws CannotRedoException {
                super.redo();
                redoAction(view, figures);
            }
            @Override
            public void undo() throws CannotUndoException {
                super.undo();
                undoAction(view, figures);
            }
        });
    }
}