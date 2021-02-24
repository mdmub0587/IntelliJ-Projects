import processing.core.PApplet;
public class FourBallChallenge extends PApplet{

    public static final int WIDTH = 750;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;

    public static final float heightFactorOfBall1 = 1 / 5f;
    private static final float heightFactorOfBall2 = 2 / 5f;
    private static final float heightFactorOfBall3 = 3 / 5f;
    private static final float heightFactorOfBall4 = 4 / 5f;

    public static final int speedFactorOfBall1 = 1;
    public static final int speedFactorOfBall2 = 2;
    public static final int speedFactorOfBall3 = 3;
    public static final int speedFactorOfBall4 = 4;

    int positionX = 0;

    public static void main(String[] args) {
        PApplet.main("FourBallChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawBall(speedFactorOfBall1, heightFactorOfBall1);
        drawBall(speedFactorOfBall2, heightFactorOfBall2);
        drawBall(speedFactorOfBall3, heightFactorOfBall3);
        drawBall(speedFactorOfBall4, heightFactorOfBall4);
        positionX += 1;
    }

    private void drawBall(int speedFactorOfBall, float heightOfBall) {
        ellipse(positionX * speedFactorOfBall, HEIGHT * heightOfBall, DIAMETER, DIAMETER);
    }
}
