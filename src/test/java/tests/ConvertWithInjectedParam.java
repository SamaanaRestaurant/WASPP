package test.java.tests;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.java.pigs.PigLAtinConverter;

@RunWith(Parameterized.class)
public class ConvertWithInjectedParam {

	private static PigLAtinConverter pig;
	private String inp;
	private String expect;

	public ConvertWithInjectedParam(String in, String expec) {
		// TODO Auto-generated constructor stub
		inp = in;
		expect = expec;
	}

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

	@Parameters
	public void toto() {
		System.out.println("underTest for each input data in collection");
		String s = pig.convertWord(inp);
		assertEquals(expect, s);

	}

	@Test
	public static void main(String[] str) {

		ConvertWithInjectedParam con = new ConvertWithInjectedParam("donia", "oniaday");
		con.toto();

	}

}
