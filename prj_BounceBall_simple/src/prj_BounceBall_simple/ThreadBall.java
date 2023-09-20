package prj_BounceBall_simple;

public class ThreadBall {
	private Thread thread;
	private Ball ball;

	public ThreadBall(Ball pBall, Thread pThread) {
		this.ball = pBall;
		this.thread = pThread;
	}

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public Ball getBall() {
		return ball;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}

}
