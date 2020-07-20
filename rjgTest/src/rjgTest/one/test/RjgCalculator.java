package rjgTest.one.test;

public class RjgCalculator {

	public String positiveIntegerCalculator(int inputNum) {
		
		int startNum = 1;
		
		int tempNum = startNum;
		int resultNum = 0;
		
		for (int i = 0; i < inputNum; i++) {
			resultNum = resultNum + tempNum;
			tempNum++;
		}
		
		String resultStrStart = "~";
		String resultStrEnd = " 사이의 정수: ";
		String resultMessage = startNum + resultStrStart + inputNum + resultStrEnd + resultNum;
		
		return resultMessage;
	}
	
}
