package com.reminder.stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestWriter {

	public static void main(String[] args) {
		
		/* FileWriter */
		/* 1. flush() 사용 */
		FileWriter fileWriterA = null;
		try {
			fileWriterA = new FileWriter(new File("src/com/reminder/stream/testA.txt")); //덮어쓰기
//			fileWriter = new FileWriter(new File("src/com/reminder/stream/testA.txt"), true); //이어쓰기
			
			/* A. int 인자 */
			fileWriterA.write(97);
			fileWriterA.write(98);
			fileWriterA.write(99);
			/* B. char, char[] 인자 */
			fileWriterA.write('d');
			char[] carr = new char[] {'A', 'B', 'C', 'D'};
			fileWriterA.write(carr);
			/* C. String 인자 */
			fileWriterA.write("안녕하세요");
			
			/* 이처럼 write() 후 곧바로 run 하면 어떤 것도 내보내기 하지 않은 상황이 된다.
			 * FileWriter는 추상클래스이자 저보다 상위클래스인 Writer를 상속하고 있다.
			 * 따라서 Writer의 메소드 기능들을 그대로 사용할 수 있을뿐만 아니라
			 * 1 byte 단위가 아닌 문자(character, 2 byte 또는 3 byte) 단위로 출력한다는 특성까지 그대로 닮아있다.
			 * 여기서 문자는 출력 시에 버퍼에 모았다가 내보내게 되어있기에 flush() 또는 close() 메소드를 반드시 사용해야 한다.
			 * */
			fileWriterA.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fileWriterA.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		/* 2. close() 사용 */
		try(FileWriter fileWriterB = new FileWriter(new File("src/com/reminder/stream/testB.txt")/*, true*/)) {
			fileWriterB.write("반갑습니다");
			/* 이때는 flush() 또는 close() 메소드를 직접 작성하지 않았음에도 파일로 곧바로 출력된다. */
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
