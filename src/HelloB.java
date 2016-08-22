public class HelloB extends HelloA {
	public HelloB()	{}
	{
     System.out.println("I¡¯m B class");
	}
	static
	{
     System.out.println("static B");
	}
 
}
	class HelloA
	{
		public HelloA()
		{
		}
		{
			System.out.println("I¡¯m A class");
		}
		static
		{
			System.out.println("static A");
		}
}
