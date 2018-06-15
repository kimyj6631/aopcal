package kr.hs.emirim.kimyj6631.aopcal.main;

import kr.hs.emirim.kimyj6631.aopcal.Calculator;
import kr.hs.emirim.kimyj6631.aopcal.ImpeCalculator;
import kr.hs.emirim.kimyj6631.aopcal.RecCalculator;

public class MainStart {
	public MainStart() {
		// TODO Auto-generated constructor stub
		Calculator call = new ImpeCalculator();
		long f1 = call.factorial(4);
		System.out.println("Imp 4: "+f1);
		
		Calculator cal2 = new RecCalculator();
		long f2 = cal2.factorial(4);
		System.out.println("Rec4 : "+f2);
	}
}
