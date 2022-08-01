package exerciseSolved;

import org.junit.Test;
import static org.junit.Assert.*;
public class TestAssertions {
 @Test
public void testAssertions() {
	//test data
	String str1 = new String ("abc");
	String str2 = new String ("abc");
	String str3 = null;
	String str4 = "abc";
	String str5 = "abc";
	int val1 = 5;
	int val2 = 6;
	String[] expectedArray = {"one", "two", "three"};
	String[] resultArray = {"one", "two", "three"};
	
	//Verifica si dos objetos son iguales
	assertEquals(str1, str2);
	//Verifica si la condicion es verdadera
	assertTrue (val1 < val2);
	//Verifica si la condicion es falsa
	assertFalse(val1 > val2);
	//Verifica que el objeto no sea null
	assertNotNull(str1);
	//Check that an object is null
	assertNull(str3);
	//Verifica si dos referencias a un objeto son iguales
	assertSame(str4,str5);
	// Verifica si dos referencias a un objeto no son iguales
	assertNotSame(str1,str3);
	// Verifica si dos array son iguales
	assertArrayEquals(expectedArray, resultArray);
	}
}
