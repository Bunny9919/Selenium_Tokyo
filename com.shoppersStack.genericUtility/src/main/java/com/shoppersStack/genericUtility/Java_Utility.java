package com.shoppersStack.genericUtility;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

public class Java_Utility {
	
	public int randomnumber() {
		Random r = new Random();
		int Value = r.nextInt();
		return Value;
		
	}
	public String localDate() {
		return LocalDate.now().toString().replace("-","");
	}

	public String localDateTime() {
		return LocalDateTime.now().toString().replace("-", "").replace(":", "").replace(".", "");
		
		
	}
}
