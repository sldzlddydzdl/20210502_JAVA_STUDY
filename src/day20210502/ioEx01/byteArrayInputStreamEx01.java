package day20210502.ioEx01;

import java.io.ByteArrayInputStream;

public class byteArrayInputStreamEx01 {

	// 스프링 컨퍼런스 
	// stream i/o 관련 stream 

	// 데이터 싱크 스크림 : 데이터를 소스에서 읽거나 목적지에 기록
		// 입력 : inputstream , read();
	// 데이터 처리 스트림 : 들어오는 데이터를 가공하여 내보낸다
		// 출력 : outputstream , write();
	
	// 1byte -> 8bit 
	// int read() 내용반환 : 0001 0000 read() 안쓰면 256, read() 쓰면 1, 0 [ 읽을값이 없으면 -1 반환 ]
	// int read(byte[] buf) : 갯수반환 ex) 1000개인데 100개씩읽을수있다하면 반환값 100
	// int read(byte[] buf , int offset , int length ) : byte[] buf 가 크기가 10이면
	// int read(buf , 3 , 3) 은 3번째위치부터 3의 길이만큼 바이트를 반환
	
	// void write(int data) : 1 바이트 이하로만 쓸수있다. 
	// void write(byte[] buf) : buf[] 에 저장된 바이트들을 출력
	// void write(byte[] , int offset, int length) : buf 의 offset위치에 length 만큼의 바이트를 출력
	
	public static void main(String[] args) {
		// 데이타
		byte[] inByteData = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		// 메모리(배열)에서 데이터를 읽어오는 아이
		
		// 바이트 배열에서 데이터를 읽는 씽크스트림 변수 선언
		ByteArrayInputStream input = null;
		
		// 데이터와 씽크스트림을 연결하여 객체를 생선한다.
		input = new ByteArrayInputStream(inByteData);
		
//		for(int i = 0 ; i < inByteData.length; i++)
//			System.out.println("읽어온 내용 : " + input.read());
		// 데이터의 길이를 알수없는 상황이 무조건ㄴ생겨서 inByteData.length 를 쓰면 안된다
		
		int data = -1;
		// 변수선언해서 while문을 돌리는방법
//		while((data = input.read()) != -1) {
//			System.out.println("읽어 온 내용 : " + data);
//		}
		
		// available을 쓸수있다.
		while(input.available() > 0) {
			System.out.println("읽어온 내용 : " + input.read());
		}
		
		
		
	}
}
