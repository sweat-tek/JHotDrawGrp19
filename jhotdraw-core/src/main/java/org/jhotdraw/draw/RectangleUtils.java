package org.jhotdraw.draw;


import org.jhotdraw.draw.figure.Figure;

import java.awt.geom.Rectangle2D;

import static org.jhotdraw.draw.AttributeKeys.TRANSFORM;

public class RectangleUtils {

   public void setBounds(Figure owner, Rectangle2D.Double bounds) {
      if (owner.get(TRANSFORM) == null) {
         return;
      }
      Rectangle2D r = owner.get(TRANSFORM).createTransformedShape(bounds).getBounds2D();
      bounds.x = r.getX();
      bounds.y = r.getY();
      bounds.width = r.getWidth();
      bounds.height = r.getHeight();

   }

}
