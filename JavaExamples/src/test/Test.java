package test;

public class Test {
	
	static int total =10;
	

	public static void main(String[] args) {
		
          new Test();
          int x = 0, y=10;
          
          
	}
	
	public Test()
	{
		System.out.println("test");
		System.out.println(this);
		int temp = this.total;
		temp = 20;
		if(temp>5)
		{
			System.out.println(temp);
			System.out.println(total);
		}
	}

}
