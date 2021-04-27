import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseBallTests {

	/**
	 * 1. 게임의 시작
	 * 1) 난수를 생성한다.
	 */
	@Test
	public void makeGenerateTest() {
		
		BaseBall bb = new BaseBall();
		bb.start("123", "456");
		
		String cpuNum = bb.cpuNum;
		
		/* 난수가 생성되었는지 검증 (S) */
		Assertions.assertNotNull(cpuNum);
		/* 난수가 생성되었는지 검증 (E) */
		
		/* 생성된 난수가 매번 다른 값을 지니는지 검증 (S) */
		BaseBall bb2 = new BaseBall();
		bb2.start("123", "456");
		
		String cpuNum2 = bb2.cpuNum;
		
		Assertions.assertNotEquals(cpuNum, cpuNum2);
		/* 생성된 난수가 매번 다른 값을 지니는지 검증 (E) */
		
		/* 난수의 중복여부 검증 (S) */
		List<String> list = Arrays.asList(cpuNum.split(""));
		
		for (int i = 0; i < list.size(); i++) {
			
			String tmp = list.get(i);
			list.set(i, "");
			
			Assertions.assertTrue(!list.contains(tmp));
			
		}
		/* 난수의 중복여부 검증 (E) */
		
	}
	
	/**
	 * 2. 사용자 숫자입력
	 * 1) 숫자를 입력받는다.
	 */
	@Test
	public void initPlayerNumTest() {
		
		BaseBall bb = new BaseBall();
		bb.start("123", "456");
		
		/* 숫자를 입력받았는지 검증 (S) */
		Assertions.assertNotNull(bb.initNum);
		/* 숫자를 입력받았는지 검증 (E) */
		
	}
	
	/**
	 * 2. 사용자 숫자입력
	 * 2) 입력값의 유효성을 검증한다.
	 */
	@Test
	public void validPlayerNumTest() {
		
		BaseBall bb = new BaseBall();
		bb.start("123", "456");
		
		/* 입력값이 유효한지 검증 (S) */
		Assertions.assertTrue(!bb.isError);
		/* 입력값이 유효한지 검증 (E) */
		
	}
	
	
	
}
