import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestRomanNumber {
	TransformToRomanNumber transform = new TransformToRomanNumber();

	@Test
	public void in_1_out_I () {
		assertEquals("I",transform.arabicToRoman(1));
	}
	@Test
	public void in_2_out_II () {
		assertEquals("II",transform.arabicToRoman(2));
	}
	@Test
	public void in_3_out_III () {
		assertEquals("III",transform.arabicToRoman(3));
	}
	@Test
	public void in_4_out_IV () {
		assertEquals("IV",transform.arabicToRoman(4));
	}

	@Test
	public void in_5_out_V () {
		assertEquals("V",transform.arabicToRoman(5));
	}
}
