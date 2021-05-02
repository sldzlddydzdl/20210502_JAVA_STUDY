package day20210502.ioEx01;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class InputOutputEx01 {
	
	
	public static void main(String[] args) {
		byte[] ori = new byte[128];
		byte[] copy;
		ByteArrayInputStream in; 
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		
		for(int i = 0; i <= 127 ; i++) {
			ori[i] = (byte)(127-i); 
		}
		
		in =  new ByteArrayInputStream(ori);
		
		while(in.available() > 0) {
			out.write(in.read());
		}
		
		copy = out.toByteArray(); 
		
		System.out.println("copy : " + Arrays.toString(copy));
		
	}
}
