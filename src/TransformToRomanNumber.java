public class TransformToRomanNumber {

	public String arabicToRoman(int arabic) {

		String romanNumber = "";

		if (arabic == 4)
			romanNumber = "IV";
		else if (arabic == 5)
			romanNumber = "V";
		else {
			for (int round = 0; round < arabic; round++) {
				romanNumber += "I";
			}
		}
		return romanNumber;
	}

}
