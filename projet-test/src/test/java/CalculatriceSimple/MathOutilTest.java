package CalculatriceSimple;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

@Nested
@DisplayName("des opérations")

class MathOutilTest {
	MathOutil mathoutil;
	
	@BeforeEach
	void initialisation() {
	mathoutil = new MathOutil();
	assumeTrue(true);
	}
	
	@AfterEach
	void nettoyage() {
	System.out.println("nettoyage........");
	}
	
	@Test
	@DisplayName("le test de l'addition")
		void test() {
		System.out.println("le test fonctionne");
		//MathOutil mathoutil = new MathOutil();//
		int expected = 4 ;
		int actuel = mathoutil.addition(3, 1);
		assertEquals(expected, actuel, "c'est l'opération d'addition");
	}
	
	@Test
	@DisplayName("le test du cercle")
	@Disabled
	void testCercle() {
		// MathOutil mathoutil = new MathOutil();// 
		assertEquals(314.1592653589793, mathoutil.Cercle(10),"compter la surface du cercle");
	}
	
	@Test
	@DisplayName("le test de la division")
	@Tag("math")
	@EnabledOnOs(OS.WINDOWS)
	@EnabledOnJre(JRE.JAVA_8)
	void testMaDivision() {
		assumeTrue(false);
		// MathOutil mathoutil = new MathOutil();//
		assertThrows(ArithmeticException.class, ()-> mathoutil.MaDivision(1,0));
		
	}
	
	@Test
	@DisplayName("le test de la multiplication")
	void testMultiplication() {	
		assertAll(()->assertEquals(4, mathoutil.MaMultiplication(2,2)),
				()->assertEquals(10, mathoutil.MaMultiplication(2,5)),
				()->assertEquals(6, mathoutil.MaMultiplication(2,3)));
	}
	
	@RepeatedTest(5)
	@DisplayName("le test de multiplication")
	@Tag("math")
	void testmulti() {
		assertAll(()->assertEquals(4, mathoutil.MaMultiplication(2,2)),
				()->assertEquals(10, mathoutil.MaMultiplication(2,5)),
				()->assertEquals(6, mathoutil.MaMultiplication(2,3)));
	}
}
	
	


