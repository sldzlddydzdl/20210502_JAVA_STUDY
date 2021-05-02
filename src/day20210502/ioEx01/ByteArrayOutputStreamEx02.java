package day20210502.ioEx01;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayOutputStreamEx02 {
	public static void main(String[] args) {
		byte[] result;
		
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		
		byte[] bagagi = new byte[5];
		
		for (int i = 0; i < bagagi.length; i++) {
			bagagi[i] = (byte)i;	
		}
		//[0,1,2,3,4]
		
		bout.write(bagagi, 0, 5);
		
		for (int i = 0; i < bagagi.length; i++) {
			bagagi[i] += 5;	
		}
		//[5, 6, 7, 8,9]
		
		bout.write(bagagi, 0, 5);
		result = bout.toByteArray();
		System.out.println(Arrays.toString(result));
		// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
	}
}
