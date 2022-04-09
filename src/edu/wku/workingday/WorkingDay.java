package edu.wku.workingday;

public class WorkingDay {
	public static String isWorkingDay(int initDayOfWeek, int dayNum) {
		String result = "";
		int day = dayNum % 7;
		initDayOfWeek = initDayOfWeek + day - 1;
		if (initDayOfWeek > 6) {
			result = "Incorrect Initial Day Of Week";
		} else if (dayNum > 30) {
			result = "Incorrect Initial Day Of Month";
		} else if (initDayOfWeek == 0 || initDayOfWeek == 6) {
			result = "Non-working Day";
		} else {
			result = "Working Day";
		}
		return result;
	}

}
