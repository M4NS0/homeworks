package com.formcpfvalidator.apps;

public class Validators {


	public static boolean onlyDigits(String number, int n) {
		// Traverse the string from
		// start to end
		for (int i = 0; i < n; i++) {

			// Check if character is
			// digit from 0-9
			// then return true
			// else false
			if (number.charAt(i) >= '0' && number.charAt(i) <= '9') {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}

	public static boolean dontHaveLetters(String str) {
		return ((!str.equals("")) && (str != null) && (str.matches("\\d+")));
	}
	public static boolean checkMonetaryDigits(String str) {
		return ((!str.equals("")) && (str != null) && (str.matches("^([0-9]+[\\,]|[\\.])?([0-9]+[\\.,])+([0-9]{2})+")));
	}
	

}