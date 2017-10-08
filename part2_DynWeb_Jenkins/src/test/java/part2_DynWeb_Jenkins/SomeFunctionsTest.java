package part2_DynWeb_Jenkins;


import junit.framework.TestCase;

public class SomeFunctionsTest extends TestCase {

	private SomeFunctions obj;
	
	protected void setUp() throws Exception {
		
		obj = new SomeFunctions();
	}

	protected void tearDown() throws Exception {
		
		obj = null;
	}

	public void testFunction_1()   {
		assertEquals( 300, obj.function_1(445)   );
	}

	public void testFunction_2() {
		assertEquals( "ABCDE", obj.function_2(445)   );
	}

}
