package sec02;

public class TypeCasting {

	public static void main(String[] args) {
		//캐스팅 방법1 : 자료형
		//(자료형) 삽입으로 타입 변환
		int value1 = (int)5.3;	//값이 5로 변경됨
		long value2 = (long)10;
		float value3 = (float)5.8;
		double value4 = (double)16;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		
		//캐스팅 방법2 : L,F
		//long형 타입으로 변환
		long value5 = 10L;
		long value6 = 10l;
		//float형 타입으로 변환
		float value7 = 5.8F;
		float value8 = 5.8f;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);

	}

}
