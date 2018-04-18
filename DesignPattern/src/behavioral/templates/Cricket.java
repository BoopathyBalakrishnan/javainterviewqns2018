package behavioral.templates;

public class Cricket extends Game {

	@Override
	public void initialize() {
		System.out.println("Cricket game is initialized");

	}

	@Override
	public void startPlay() {
		System.out.println("Cricket game is started");

	}

	@Override
	public void endPlay() {
		System.out.println("Cricket game is ended");

	}

}
