package sec03;

public class Main {

	public static void main(String[] args) {
		//논리 시프트를 이용해 각 비트 위치에서의 값 알아 내기
		int flags = 0b10110110;
		System.out.println(flags >>> 0 & 1);	//0: 0번째 비트 값
		System.out.println(flags >>> 1 & 1);	//1: 1번째 비트 값	
		System.out.println(flags >>> 2 & 1);	//1: 2번째 비트 값
		System.out.println(flags >>> 3 & 1);	//0: 3번째 비트 값
		System.out.println(flags >>> 4 & 1);	//1: 4번째 비트 값
		System.out.println(flags >>> 5 & 1);	//1: 5번째 비트 값
		System.out.println(flags >>> 6 & 1);	//0: 6번째 비트 값
		System.out.println(flags >>> 7 & 1);	//1: 7번째 비트 값
		
	}

}
