package sec03;

public class LogicalOerator {

	public static void main(String[] args) {
		//논리 연산자 AND &&
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(true && (5 < 3));
		System.out.println((5 <= 5) && (7 > 2));
		System.out.println();
		
		
		//논리 연산자 OR ||
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || (5 < 3));
		System.out.println((5 <= 5) || (7 > 2));
		System.out.println();
		
		
		//논리 연산자 XOR ^
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ (5 < 3));
		System.out.println((5 <= 5) ^ (7 > 2));
		System.out.println();
		
		
		//논리 연산자 NOT !
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false || !(5 < 3));
		System.out.println((5 <= 5) || !(7 > 2));
		System.out.println();

		//비트 연산자로 논리 연산 수행
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(true | (5 < 3));
		System.out.println((5 <= 5) | (7 > 2));
		System.out.println();
		
		
		//쇼트 서킷 사용 여부 (논리 연산자 o, 비트 연산자 x)
		int value1 = 3;
		System.out.println(false && ++value1 > 6); 	//수행하지 않음
		System.out.println(value1);
		
		int value2 = 3;
		System.out.println(false & ++value2 > 6); 	//수행함
		System.out.println(value2);
		
		int value3 = 3;
		System.out.println(true || ++value3 > 6);	//수행하지 않음
		System.out.println(value3);
		
		int value4 = 3;
		System.out.println(true | ++value3 > 6);	//수행함
		System.out.println(value4);
	}

}
