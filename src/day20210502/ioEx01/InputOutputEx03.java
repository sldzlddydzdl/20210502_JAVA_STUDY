package day20210502.ioEx01;

import java.util.List;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class InputOutputEx03 {
	public static void main(String[] args) {
	/*
		byte[] ori = {0,1,2,3,4,5,6,7,8,9};
		byte[] bagagi = new byte[3];
		
		byte[] copy;
		
		// 결과 copy[0,1, 2, 3, 4, 5, 6, 7, 8, 9] 이렇게 나오도록!
		
		ByteArrayInputStream in = new ByteArrayInputStream(ori);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		int perlast = ori.length%bagagi.length; 
		int divnum = ori.length/bagagi.length;
		
		int k = 0;
		while(in.available() > 0) {
			if(k == divnum ) {
				in.read(bagagi, 0 , perlast);
				out.write(bagagi, 0 , perlast);
			}
			else {
				in.read(bagagi , 0 , 3);// 6 7 8 -> 9 7 8 이된다.
				out.write(bagagi, 0 ,3);
			}
			k++;
		}
		
		copy = out.toByteArray();
		
		System.out.println(Arrays.toString(copy));
*/		
		// ori 와 bagagi의 배열길이가 딱떨어지지않을때 
		byte[] ori = {0,1,2,3,4,5,6,7,8,9};
		byte[] bagagi = new byte[3];
		
		byte[] copy;
		
		// 결과 copy[0,1, 2, 3, 4, 5, 6, 7, 8, 9] 이렇게 나오도록!
		
		ByteArrayInputStream in = new ByteArrayInputStream(ori);
		ByteArrayOutputStream out = new ByteArrayOutputStream();
	
		while(in.available() > 0) {
			out.write(bagagi, 0 , in.read(bagagi, 0 ,3));
		}
		
		int n = -1;
		while((n=in.read(bagagi,0,3)) != -1) {
			out.write(bagagi, 0 ,n);
		}
		
		copy = out.toByteArray();
		
		System.out.println(Arrays.toString(copy));

	}
}

		




