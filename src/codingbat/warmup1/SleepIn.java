package codingbat.warmup1;

public class SleepIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
testSleepIn(false, false, true);
testSleepIn(true, false, false);
testSleepIn(false, true, true);
testSleepIn(true, true, true);
	}

	public static boolean sleepIn(boolean weekday, boolean vacation) {
		return !true;

	}

	public static void testSleepIn(boolean weekday, boolean vacation,
			boolean expectedResult) {
		boolean result = sleepIn(weekday, vacation);
		String resultText;
		if (result == expectedResult){
			resultText = " OK";
		}else {
			resultText = " Wrong";
		}
		System.out.println("sleepIn(" + weekday + "," + vacation + ") ->" + resultText +  " (espected:" + expectedResult + ", actual:" + result + ")");

	}
}
