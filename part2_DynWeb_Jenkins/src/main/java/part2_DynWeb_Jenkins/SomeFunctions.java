package part2_DynWeb_Jenkins;

public class SomeFunctions {
	
	public int function_1( int x )	
	{
		if ( x > 10 || x < 0  )
			return 300;
		else {
			return 100;
		}
	}
	
	public String function_2( int x )	
	{
		if ( x >= 300  )
			return "ABCDE";
		else {
			return "PQRST";
		}
	}
	public void main() {
		
		SomeFunctions obj1 = new SomeFunctions();
		
		System.out.println(  obj1.function_1(11)  );
	}
}
