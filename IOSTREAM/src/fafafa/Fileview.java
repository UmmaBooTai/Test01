package fafafa;

import java.io.FileInputStream;
import java.io.IOException;

public class Fileview {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(args[0]);
				int data = 0;
				
				while((data=fis.read())!=-1) {//1바이트씩 읽고 char형으로 바꿈
					char c = (char)data;
					System.out.print(c);
				}
	}

}
