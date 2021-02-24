import processing.core.PApplet;
public class FourBallChallenge extends PApplet{

    public static final int WIDTH = 750;
    public static final int HEIGHT = 500;

    Ball ball1 = new Ball(10, 1 / 5f, 1);
    Ball ball2 = new Ball(10, 2 / 5f, 2);
    Ball ball3 = new Ball(10, 3 / 5f, 3);
    Ball ball4 = new Ball(10, 4 / 5f, 4);

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
