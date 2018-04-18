package behavioral.templates;

/*
 * 
 * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute 
 * its methods. Its subclasses can override the method implementation as per need 
 * but the invocation is to be in the same way as defined by an abstract class. 
 * This pattern comes under behavior pattern category.
 *
 */
public class TemplatesDemo {

	public static void main(String[] args) {
		Game cricket = new Cricket();
		cricket.play();
		Game footBall = new FootBall();
		footBall.play();

	}

}
