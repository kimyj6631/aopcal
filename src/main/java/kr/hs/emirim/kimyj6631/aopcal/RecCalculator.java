package kr.hs.emirim.kimyj6631.aopcal;

public class RecCalculator implements Calculator {
	@Override
	public long factorial(long num) {
		if (num == 0)
			return 1;
		else
			return num * factorial(num - 1);
	}

}
