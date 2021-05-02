package day20210502.ioEx01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.Arrays;

public class InputOutputEx02 {
	public static void main(String[] args) {
		
		byte[] ori = new byte[100];
		byte[] bagagi = new byte[10];
		byte[] copy;
		for(int i = 0 ; i < 100; i++) {
			ori[i] = (byte)i;
		}
				
		ByteArrayInputStream in = new ByteArrayInputStream(ori);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		while(in.available() > 0) {
			in.read(bagagi, 0 ,10); // bagagi에 데이타 10개 담김
			out.write(bagagi, 0 ,10); // 아웃풋에 bagagi에 있는 0~9 까지를 씀
		}
		
//		while(in.read(bagagi,0,10) != -1) {
//			out.write(bagagi, 0 ,10);
//		}
		
		copy = out.toByteArray();
		System.out.println("copy : " + Arrays.toString(copy));
		
	}
}
