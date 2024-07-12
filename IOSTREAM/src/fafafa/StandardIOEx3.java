package fafafa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintStream ps = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("test.txt");
			ps=new PrintStream(fos);
		System.setOut(ps); //System.out으ㅟ 출력대상을 test.txt파일로 변경
		}catch(FileNotFoundException e) {
			System.err.println("File nor found.");
		}
		System.out.println("Hello by System.out");
		System.out.println("Hello by System.err");
	}

}
