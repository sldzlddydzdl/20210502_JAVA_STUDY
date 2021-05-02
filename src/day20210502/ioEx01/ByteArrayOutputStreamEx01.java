package day20210502.ioEx01;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayOutputStreamEx01 {
	public static void main(String[] args) {
		// 결과를 담을 배열
		byte[] result;
		
		// 아읏풋 스트림을 생성
		ByteArrayOutputStream out = new ByteArrayOutputStream();
														//   대상이 들어간다 얼래 Outputstream은
														// 	ByteArrayOutputStream 은 자기자신한테 저장하는거라 () 안에 아무것도 안쓴다
		
		// 스트림자체에 write를 한다
		out.write(0); // 0을 스트림에 저장
		out.write(1);
		out.write(2);
		out.write(3);
		out.write(4);
		out.write(256); // 256은 1바이트로 표현할수 없어서 0을 읽게된다
						// 0000 0001 / 0000 0000, 마지막 8비트만 들어가기 때문에 0으로 들어감
	
		// 스트림안에있는 내용을 바이트배열로 반환
		result = out.toByteArray();
		
		System.out.println(Arrays.toString(result));
		
		
	}
}
