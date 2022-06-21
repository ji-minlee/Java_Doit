package sec03;
//다양한 진법의 표현과 비트 연산자
public class BitwiseOperaotr {

	public static void main(String[] args) {
		//자바 메서드로 진법 변환
		int data = 13;
		System.out.println(Integer.toBinaryString(data));	//2진수 변환
		System.out.println(Integer.toOctalString(data));	//8진수 변환
		System.out.println(Integer.toHexString(data));	//16진수 변환
		System.out.println();
		
		System.out.println(Integer.parseInt("1101",2));		//2진수 > 10진수
		System.out.println(Integer.parseInt("15", 8));		//8진수	> 10진수
		System.out.println(Integer.parseInt("0D", 16));		//16진수	> 10진수
		System.out.println();
		
		
		//다양한 진법 표현
		System.out.println(13);
		System.out.println(0b1101);
		System.out.println(015);
		System.out.println(0x0D);
		System.out.println();
		
		
		//비트 연산자  AND
		System.out.println(3 & 10);
		System.out.println(0b0011 & 0b1010);
		System.out.println(0x03 & 0x0A);
		System.out.println();
		
		//비트 연산자 OR
		System.out.println(3 | 10);
		System.out.println(0b0011 | 0b1010);
		System.out.println(0x03 | 0x0A);
		System.out.println();
		
		//비트 연산자 XOR
		System.out.println(3 ^ 10);
		System.out.println(0b0011 ^ 0b1010);
		System.out.println(0x03 ^ 0x0A);
		System.out.println();
		
		//비트 연산자 NOT
		System.out.println(~3);
		System.out.println(~0b0011);
		System.out.println(~0x03);
		
		
	}

}
