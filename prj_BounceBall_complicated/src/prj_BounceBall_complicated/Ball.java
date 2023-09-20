package prj_BounceBall_complicated;

import java.util.Random;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class Ball extends Circle implements Runnable {
	private double speed = getRandomNumber(1, 7);
	private Timeline timeline;
	private double dx = speed;
	private double dy = speed;

	int myId = 0;

	public int getMyId() {
		return myId;
	}

	public void setId(int id) {
		this.myId = id;
	}

	public Ball() {
		super(getRandomNumber(15, 40), getRandomColor());
		this.setLayoutX(getRandomNumber(getRadius(), Main.WIDTH - getRadius()));
		this.setLayoutY(getRandomNumber(getRadius(), Main.HEIGHT - getRadius()));
	}

	public Ball(Color pColor) {
		super(getRandomNumber(15, 40), pColor);
		this.setLayoutX(getRandomNumber(getRadius(), Main.WIDTH - getRadius()));
		this.setLayoutY(getRandomNumber(getRadius(), Main.HEIGHT - getRadius()));
	}

	public Ball(int pRadius, Color pColor) {
		super(pRadius, pColor);
		this.setLayoutX(getRandomNumber(getRadius(), Main.WIDTH - getRadius()));
		this.setLayoutY(getRandomNumber(getRadius(), Main.HEIGHT - getRadius()));
	}

	public static Color getRandomColor() {
		Random rand = new Random();
		double r = rand.nextDouble();
		double g = rand.nextDouble();
		double b = rand.nextDouble();
		Color color = new Color(r, g, b, 1);
		return color;
	}

	public static int getRandomNumber(double min, double max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

	public void calculatePosition() {
		setLayoutX(getLayoutX() + getDx());
		setLayoutY(getLayoutY() + getDy());

		if (getLayoutX() <= getRadius() || getLayoutX() >= Main.WIDTH - getRadius()) {
			setDx(-getDx());
		}
		if (getLayoutY() <= getRadius() || getLayoutY() >= Main.HEIGHT - getRadius()) {
			setDy(-getDy());
		}
	}

	public void interrupt() {
		timeline.stop();
	}

	@Override
	public void run() {
		timeline = new Timeline(new KeyFrame(Duration.millis(20), e -> {
			calculatePosition();
		}));
		timeline.setCycleCount(Animation.INDEFINITE);
		timeline.play();
	}

	public double getDx() {
		return dx;
	}

	public void setDx(double dx) {
		this.dx = dx;
	}

	public double getDy() {
		return dy;
	}

	public void setDy(double dy) {
		this.dy = dy;
	}
}