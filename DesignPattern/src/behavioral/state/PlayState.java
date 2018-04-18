package behavioral.state;

public class PlayState implements State {

	@Override
	public void doAction(Context context) {

		context.setState(this);

	}
    
	@Override
	public String displayAction() {
		return "This is play state";
	}

}
