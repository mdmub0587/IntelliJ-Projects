import processing.core.PApplet;
public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 100;
    int x = 0;

    public static void main(String[] args) { PApplet.main("TryProcessing", args); }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
//        drawCircle(WIDTH / 2, HEIGHT / 2, 100);
    }

    @Override
    public void draw() {
        paintWhite();
//        ellipse(WIDTH/2, HEIGHT / 2, 100, 100);
//        ellipse(mouseX, HEIGHT / 2, 100, 100);
        drawCircle(DIAMETER);
    }

    private void drawCircle(int diameter) {
        ellipse(x, HEIGHT/2, diameter, diameter);
        x++;
    }

    private void paintWhite() {
        background(255);
    }
}
