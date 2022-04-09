package edu.wku.validkeanemail;

public class ValidKeanEmail {
	public static int isValidKeanEmail(String address) {
		char[] text = new char[address.length()];
		text = address.toCharArray();
		boolean wrong = false;
		boolean kean = false;
		for (int i = text.length - 1; i >= 0; i--) {
			if (text[i] == '.') {
				if (text[i - 1] == '@') {
					wrong = true;
					break;
				}
			}
		}
		if (text.length < 16 || text.length > 32) {
			kean = false;
		} else {
			if (address.endsWith("@kean.edu")) {
				kean = true;
			} else {
				kean = false;
			}
		}
		int result = 0;
		if (wrong == true)
			result = -1;
		else if (wrong == false && kean == false)
			result = 1;
		else if (wrong == false && kean == true)
			result = 2;
		return result;
	}

}
