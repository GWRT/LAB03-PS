package parametrizadas;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.Before;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
class PrimeNumberCheckerTest {

	private Integer inputNumber;
	 private Boolean expectedResult;
	 private PrimeNumberChecker primeNumberChecker;
	 @Before
	 public void initialize() {
	 primeNumberChecker = new PrimeNumberChecker();
	 }
	 // Cada par�metro debe colocarse como argumento aqu�.
	 // Cada vez que el trigger se dispara, pasar� los argumentos a partir
	 // de los par�metros que definimos en el m�todo primeNumbers ()
	 public PrimeNumberCheckerTest(Integer inputNumber, Boolean expectedResult) {
		 this.inputNumber = inputNumber;
		 this.expectedResult = expectedResult;
		 }
		 @Parameterized.Parameters
		 public static Collection primeNumbers() {
		 return Arrays.asList(new Object[][] {
		 { 2, true },
		 { 6, false },
		 { 19, true },
		 { 22, false },
		 { 23, true }
		 });
		 }
		 // Esta prueba se ejecutar� 4 veces ya que tenemos 5 par�metros definidos
		 @Test
		 public void testPrimeNumberChecker() {
		 System.out.println("Parameterized Number is : " + inputNumber);
		 assertEquals(expectedResult,
		 primeNumberChecker.validate(inputNumber));
		 }

}
