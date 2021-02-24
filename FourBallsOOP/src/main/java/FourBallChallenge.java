import processing.core.PApplet;
public class FourBallChallenge extends PApplet{

    public static final int WIDTH = 750;
    public static final int HEIGHT = 500;
    public static final int DIAMETER = 10;
    public static final float COMMON_HEIGHT_FACTOR = 1 / 5f;
    public static final int COMMON_SPEED_FACTOR = 1;

    Ball ball1 = new Ball(DIAMETER, 1 * COMMON_HEIGHT_FACTOR, 1 * COMMON_SPEED_FACTOR);
    Ball ball2 = new Ball(DIAMETER, 2 * COMMON_HEIGHT_FACTOR, 2 * COMMON_SPEED_FACTOR);
    Ball ball3 = new Ball(DIAMETER, 3 * COMMON_HEIGHT_FACTOR, 3 * COMMON_SPEED_FACTOR);
    Ball ball4 = new Ball(DIAMETER, 4 * COMMON_HEIGHT_FACTOR, 4 * COMMON_SPEED_FACTOR);

    int positionX = 0;

    public static void main(String[] args) {
        PApplet.main("FourBallChallenge",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        drawBall(ball1);
        drawBall(ball2);
        drawBall(ball3);
        drawBall(ball4);
        positionX += 1;
    }

    private void drawBall(Ball ball) {
        ellipse(positionX * ball.speedFactor, HEIGHT * ball.heightFactor, ball.diameter, ball.diameter);
    }
}
