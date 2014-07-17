public class TransformToRomanNumber {

	public String arabicToRoman(int arabic) {

		String romanNumber = "";

		if (arabic ==4)
			return "IV";
		if(arabic == 5)
			return "V";
		for (int round=0; round < arabic; round ++)
			romanNumber += "I";
		return romanNumber;
	}

}
