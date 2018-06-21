package kr.hs.emirim.kimyj6631.aopcal.main;

import kr.hs.emirim.kimyj6631.aopcal.ExeTimeCalculator;
import kr.hs.emirim.kimyj6631.aopcal.ImpeCalculator;
import kr.hs.emirim.kimyj6631.aopcal.RecCalculator;

public class MainProxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpeCalculator());
		/*System.out.println(ttCal1.factorial(num));*/
		
		ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
		/*System.out.println(ttCal2.factorial(num));*/

	}

}
