package behavioral.state;

/*
 * In State pattern a class behavior changes based on its state. 
 * This type of design pattern comes under behavior pattern.

In State pattern, we create objects which represent various states and 
a context object whose behavior varies as its state object changes.
 */
public class StateDemo {

	public static void main(String[] args) {

		Context context = new Context();
		PlayState play = new PlayState();
		play.doAction(context);

		System.out.println(context.getState().displayAction());

		PauseState pause = new PauseState();
		pause.doAction(context);

		System.out.println(context.getState().displayAction());

	}

}
