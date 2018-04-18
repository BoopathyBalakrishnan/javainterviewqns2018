package behavioral.strategy;

/*
 * In Strategy pattern, a class behavior or its algorithm can be changed at run time. 
 * This type of design pattern comes under behavior pattern.

In Strategy pattern, we create objects which represent various strategies 
and a context object whose behavior varies as per its strategy object. 
The strategy object changes the executing algorithm of the context object.
 */
public class StrategyDemo {

	public static void main(String[] args) {

		Context context = new Context(new Add());
		System.out.println("output is " + context.executeStrategy(20, 10));
		Context context1 = new Context(new Substract());
		System.out.println("output is " + context1.executeStrategy(20, 10));

	}

}
