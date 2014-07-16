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
}
