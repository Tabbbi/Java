package prj_BounceBall_simple;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	public static final int WIDTH = 600;
	public static final int HEIGHT = 500;
	private ArrayList<ThreadBall> threadBalls = new ArrayList<ThreadBall>();
	static Pane root;

	@Override
	public void start(Stage primaryStage) {
		final Button more = new Button("Add a new Ball");

		final Button less = new Button("Remove one Ball");
		less.setLayoutY(25);

		root = new Pane();
		root.getChildren().addAll(more, less);

		Scene scene = new Scene(root, WIDTH, HEIGHT);

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
		Ball newBall = new Ball();
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
			System.out.println("No Ball left.");
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
