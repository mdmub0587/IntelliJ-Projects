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
        ellipse(positionX * ball1.speedFactor, HEIGHT * ball1.heightFactor, ball1.diameter, ball1.diameter);
        ellipse(positionX * ball2.speedFactor, HEIGHT * ball2.heightFactor, ball2.diameter, ball2.diameter);
        ellipse(positionX * ball3.speedFactor, HEIGHT * ball3.heightFactor, ball3.diameter, ball3.diameter);
        ellipse(positionX * ball4.speedFactor, HEIGHT * ball4.heightFactor, ball4.diameter, ball4.diameter);
        positionX += 1;
    }
}
