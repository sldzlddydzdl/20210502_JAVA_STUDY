package day20210502.ioEx01;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class ByteArrayInputStreamEx02 {
	// read(buf, offset, length)
	
	public static void main(String[] args) {
		
		byte[] ori = {0, 1,2 ,3 ,4,5,6,7,8, 9};
		
		ByteArrayInputStream bin = new ByteArrayInputStream(ori);
		
		//바가지 역할을 하는 배열 생성
		byte[] bagagi = new byte[5];
		
		int n = bin.read(bagagi , 0 ,5);
		System.out.println(Arrays.toString(bagagi));
		System.out.println("읽은 byte 길이 : " + n);
		
		n = bin.read(bagagi , 0 ,5);
		System.out.println(Arrays.toString(bagagi));
		System.out.println("읽은 byte 길이 : " + n);
		
		n = bin.read(bagagi , 0 ,5); // -> 이상황은 안읽혀서나온거 
		System.out.println(Arrays.toString(bagagi));
		System.out.println("읽은 byte 길이 : " + n);
		
	}	
}
