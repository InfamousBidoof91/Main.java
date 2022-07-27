import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.TextLayout;
import javax.swing.*;
import java.awt.geom.*;
/**
*2D Flappy Bird Pixel Art
*
* @author InfamousBidoof91
*
*/
 
public class PixelArt extends JPanel {
  Image img;
  int w, h;
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2 = (Graphics2D) g;
    Point2D.Double point1 = new Point2D.Double(5, 5);
    Point2D.Double point2 = new Point2D.Double(40, 40);
    GradientPaint coolSky = new GradientPaint(point1, new Color(135, 206, 235), point2, new Color(173, 216, 230), true);
    g2.setPaint(coolSky);
    g2.fillRect(0, 0, 500, 500);
  
    // 1st pipe
    GradientPaint pipeColor1 = new GradientPaint(54, 0, new Color(178, 255, 102), 55, 0, new Color(157, 193, 131));
    g2.setPaint(pipeColor1);
    g2.fillRect(50, 0, 55, 150);
    g2.setPaint(Color.BLACK);
    g2.drawRect(50, 0, 55, 150);

    g2.setPaint(pipeColor1);
    g2.fillRoundRect(40, 150, 75, 40, 10, 10);
    g2.setPaint(Color.BLACK);
    g2.drawRoundRect(40, 150, 75, 40, 10, 10);
    
    // 2nd pipe (down)
    g2.setPaint(pipeColor1);
    g2.fillRect(50, 350, 55, 500);
    g2.setPaint(Color.BLACK);
    g2.drawRect(50, 350, 55, 500);

    g2.setPaint(pipeColor1);
    g2.fillRoundRect(40, 350, 75, 40, 10, 10);
    g2.setPaint(Color.BLACK);
    g2.drawRoundRect(40, 350, 75, 40, 10, 10);

    // 3rd pipe
    GradientPaint pipeColor2 = new GradientPaint(204, 0, new Color(178, 255, 102), 205, 0, new Color(157, 193, 131));
    g2.setPaint(pipeColor2);
    g2.fillRect(200, 0, 55, 200);
    g2.setPaint(Color.BLACK);
    g2.drawRect(200, 0, 55, 200);

    g2.setPaint(pipeColor2);
    g2.fillRoundRect(190, 200, 75, 40, 10, 10);
    g2.setPaint(Color.BLACK);
    g2.drawRoundRect(190, 200, 75, 40, 10, 10);

    // 4th pipe (down) 
    g2.setPaint(pipeColor2);
    g2.fillRect(200, 400, 55, 100);
    g2.setPaint(Color.BLACK);
    g2.drawRect(200, 400, 55, 100);

    g2.setPaint(pipeColor2);
    g2.fillRoundRect(190, 400, 75, 40, 10, 10);
    g2.setPaint(Color.BLACK);
    g2.drawRoundRect(190, 400, 75, 40, 10, 10);

    // 5th pipe
    GradientPaint pipeColor3 = new GradientPaint(354, 0, new Color(178, 255, 102), 355, 0, new Color(157, 193, 131));
    g2.setPaint(pipeColor3);
    g2.fillRect(350, 0, 55, 100);
    g2.setPaint(Color.BLACK);
    g2.drawRect(350, 0, 55, 100);

    g2.setPaint(pipeColor3);
    g2.fillRoundRect(340, 100, 75, 40, 10, 10);
    g2.setPaint(Color.BLACK);
    g2.drawRoundRect(340, 100, 75, 40, 10, 10);

    // 6th pipe (down)
    g2.setPaint(pipeColor3);
    g2.fillRect(350, 300, 55, 200);
    g2.setPaint(Color.BLACK);
    g2.drawRect(350, 300, 55, 200);

    g2.setPaint(pipeColor3);
    g2.fillRoundRect(340, 300, 75, 40, 10, 10);
    g2.setPaint(Color.BLACK);
    g2.drawRoundRect(340, 300, 75, 40, 10, 10);

    //g2D.drawImage(image, 50, 250, this); 
    
    // Draw bird
    g2.setPaint(new Color(255, 255, 153));
    g2.fillOval(50, 275, 50, 50);
    g2.setPaint(Color.BLACK);
    g2.drawOval(50, 275, 50, 50);
    g2.setPaint(Color.WHITE);
    g2.fillOval(69, 280, 30, 30);
    g2.setPaint(Color.BLACK);
    g2.drawOval(69, 280, 30, 30);
    g2.setPaint(new Color(255, 51, 51)); // red
    g2.fillOval(72, 305, 30, 15);
    g2.setPaint(Color.BLACK);
    g2.drawOval(72, 305, 30, 15);
    CubicCurve2D c = new CubicCurve2D.Double();
    c.setCurve(73, 312, 83, 313, 93, 311, 103, 314);
    g2.setStroke(new BasicStroke(2));
    g2.draw(c);
    g2.setStroke(new BasicStroke(1));
    g2.setPaint(new Color(255, 255, 204));
    g2.fillOval(42, 290, 27, 17);
    g2.setPaint(Color.BLACK);
    g2.drawOval(42, 290, 27, 17);
    g2.setPaint(Color.BLACK);
    g2.setStroke(new BasicStroke(3));
    g2.draw(new Line2D.Double(90, 287, 90, 292));
    // Flappy Bird Text
    w = getSize().width;
    h = getSize().height;                        
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
    g2.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    FontRenderContext frc = g2.getFontRenderContext();
    Font f = new Font("Arial", 1, w / 10);
    String s = new String("FLAPPY BIRD");
    TextLayout textTl = new TextLayout(s, f, frc);
    AffineTransform transform = new AffineTransform();
    Shape outline = textTl.getOutline(null);
    Rectangle r = outline.getBounds();
    transform = g2.getTransform();
    transform.translate(w / 2 - (r.width / 2), h / 2 + (r.height / 2));
    g2.transform(transform);
    g2.setColor(Color.blue);
    g2.draw(outline);
    g2.setClip(outline);
    g2.drawImage(img, r.x, r.y, r.width, r.height, this);
    }
}
