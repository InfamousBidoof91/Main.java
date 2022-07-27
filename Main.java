import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    JFrame canvas = new JFrame("Pixel Art");
    canvas.add(new PixelArt());
    canvas.setSize(500, 500);
    canvas.setVisible(true);
  }
}
