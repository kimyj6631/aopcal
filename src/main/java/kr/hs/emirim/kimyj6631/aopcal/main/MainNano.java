package kr.hs.emirim.kimyj6631.aopcal.main;

import kr.hs.emirim.kimyj6631.aopcal.Calculator;
import kr.hs.emirim.kimyj6631.aopcal.ImpeCalculator;
import kr.hs.emirim.kimyj6631.aopcal.RecCalculator;

public class MainNano {
	public static void main(String[] args) {
		long num = 10;
		
		long start1 = System.nanoTime();
		Calculator cal1 = new ImpeCalculator();
		long f1 = cal1.factorial(num);
		long end1 = System.nanoTime();
		System.out.printf("Imp factorial(%d); 실행시간 = %d", num, (end1-start1));
		
		System.out.println();
		
		long start2 = System.nanoTime();
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(num);
		long end2 = System.nanoTime();
		System.out.printf("Rec factorial(%d); 실행시간 = %d", num, (end2-start2));
		
		

	}
}
