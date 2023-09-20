package prj_BounceBall_complicated;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	public static final int WIDTH = 600;
	public static final int HEIGHT = 500;
	private Label lbl = new Label("No Balls to remove left!");
	private ArrayList<ThreadBall> threadBalls = new ArrayList<ThreadBall>();
	static Pane root;
	private static final BackgroundFill backgroundFill = new BackgroundFill(Color.valueOf("000000"), new CornerRadii(0),
			new Insets(10));
	private static final Background background = new Background(backgroundFill);

	@Override
	public void start(Stage primaryStage) {
		
		lbl.setPrefSize(600, 50);
		lbl.setVisible(true);

		final Button more = new Button("Add a new Ball");
		more.setPrefSize(150, 25);
		more.setLayoutX(50);
		more.setLayoutY(425);

		final Button less = new Button("Remove one Ball");
		less.setPrefSize(150, 25);
		less.setLayoutX(400);
		less.setLayoutY(425);

		root = new Pane();
		root.getChildren().addAll(more, less, lbl);
		root.setBackground(background);

		Scene scene = new Scene(root, WIDTH, HEIGHT);
		scene.setFill(Color.valueOf("000000"));
		scene.getStylesheets().add("styles.css");

		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();

		more.setOnAction(e -> {
			addBall();
		});

		less.setOnAction(e -> {
			removeBall(threadBalls.size() - 1);
		});
	}

	public void addBall() {
		lbl.setVisible(false);
		Ball newBall = new Ball(ThreadLocalRandom.current().nextInt(10, 40), Ball.getRandomColor());
		ThreadBall threadBall = new ThreadBall(newBall, new Thread(newBall));
		threadBalls.add(threadBall);
		threadBalls.get(threadBalls.size() - 1).getThread().start();
		root.getChildren().add(threadBall.getBall());
		threadBall.getBall().toBack();
	}

	public void removeBall(int pIndex) {
		try {
			root.getChildren().remove(findBall(threadBalls.get(pIndex).getBall()));
			threadBalls.get(pIndex).getThread().interrupt();
			threadBalls.remove(pIndex);
		} catch (Exception e) {
			lbl.setVisible(true);			
		}
	}
	
	public int findBall(Ball pBall) {
		for (int i = 0; i < root.getChildren().size() - 1; i++) {
			if (root.getChildren().get(i).equals(pBall)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		launch(args);
	}
}