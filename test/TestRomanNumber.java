import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestRomanNumber {

	@Test
	public void in_1_out_I () {
		TransformToRomanNumber transform = new TransformToRomanNumber();
		assertEquals("I",transform.arabicToRoman(1));
	}
}
