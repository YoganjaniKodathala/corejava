package java8;

import java.util.Arrays;
import java.util.List;

public class LambdaVarEx {

	public static void main(String[] args) {
		List<Integer> intSeq = Arrays.asList(1,2,3);
		intSeq.forEach(x -> {
		int y = x * 2;
		System.out.println(y);
	});
	}

}

