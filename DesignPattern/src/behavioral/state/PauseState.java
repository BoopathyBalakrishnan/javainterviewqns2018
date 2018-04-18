package behavioral.state;

public class PauseState implements State {

	@Override
	public void doAction(Context context) {
		context.setState(this);

	}
	@Override
	public String displayAction() {
		return "This is pause state";
	}

}
