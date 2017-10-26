package test.java.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

import main.java.pigs.PigLAtinConverter;

@RunWith(Parameterized.class)
public class ConvertWithParameterized {

	private static PigLAtinConverter pig;

	@Parameter // first data value (0) is default
	public /* NOT private */ String fInput;

	@Parameter(1)
	public /* NOT private */ String fExpected;

	@Parameterized.Parameters
	public static Collection<Object[]> Inputdata() {
		return Arrays.asList(new Object[][] { { "donia", "oniaday" }, { "sami", "amisay" }, { "som", "omsay" } });
	}

	/*
	 * public ConvertWithParameterized(String a, String b) { // TODO Auto-generated
	 * constructor stub
	 * 
	 * fInput = a; fExpected = b; }
	 */

	@BeforeClass
	public static void setUpClass() {
		System.out.println("@Before setUp class -one time");
		pig = new PigLAtinConverter();
	}

	@AfterClass
	public static void tearDownClass() throws IOException {
		System.out.println("@After tear class -one time");
		pig = null;
	}

	@Before
	public void setUp() {
		System.out.println("@Before setUp");

	}

	@After
	public void tearDown() throws IOException {
		System.out.println("@After tearDown");

	}

	@Test
	public void toto() {
		System.out.println("underTest for each input data in collection");
		String s = pig.convertWord(fInput);
		assertEquals(fExpected, s);

	}

}
