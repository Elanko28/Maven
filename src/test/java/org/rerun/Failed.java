package org.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Failed implements IRetryAnalyzer {
	
	int min=0, max=3;
	
	public boolean retry(ITestResult result) {
		
		if (min<max) {
			min++;
			return true;
			
		}
		return false;
	}

}
