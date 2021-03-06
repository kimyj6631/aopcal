package kr.hs.emirim.kimyj6631.aopcal.main;

import kr.hs.emirim.kimyj6631.aopcal.Calculator;
import kr.hs.emirim.kimyj6631.aopcal.ImpeCalculator;
import kr.hs.emirim.kimyj6631.aopcal.RecCalculator;

public class MainCall {
	public static void main(String[] args) {
		long num = 10000;
		long start1 = System.currentTimeMillis();
		Calculator cal1 = new ImpeCalculator();
		long f1 = cal1.factorial(num);
		long end1 = System.currentTimeMillis();
		System.out.printf("Imp factorial(%d); 실행시간 = %d", num, (end1-start1));
		
		System.out.println();
		
		long start2 = System.currentTimeMillis();
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(num);
		long end2 = System.currentTimeMillis();
		System.out.printf("Rec factorial(%d); 실행시간 = %d", num, (end2-start2));
		
		

	}
}
