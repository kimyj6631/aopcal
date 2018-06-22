package kr.hs.emirim.kimyj6631.aopcal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import kr.hs.emirim.kimyj6631.aopcal.Calculator;
import kr.hs.emirim.kimyj6631.aopcal.ImpeCalculator;
import kr.hs.emirim.kimyj6631.aopcal.RecCalculator;
import kr.hs.emirim.kimyj6631.aopcal.aspect.ExeTimeAspect2;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
	
	@Bean
	public ExeTimeAspect2 exeTimeAspect() {
		return new ExeTimeAspect2();
	}
	@Bean
	public Calculator impCal() {
		return new ImpeCalculator();
	}
	@Bean
	public Calculator recCal() {
		return new RecCalculator();
	}
}
