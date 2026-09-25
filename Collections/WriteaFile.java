package Collections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteaFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String s1="C:/Users/pushp/Desktop/notes.txt";
String s2="C:/Users/pushp/Desktop/notes.txt";
FileWriter filewrite=new FileWriter(s1,true);
BufferedWriter br=new BufferedWriter(filewrite);
br.write("this content heere writen through Eclipse" );
br.newLine();
br.write("Hello everyone...");
System.out.println("I am done");
//br.close();
FileReader fr=new FileReader(s2);
BufferedReader  br1=new BufferedReader(fr);
String s3=br1.readLine();
System.out.println("Line readed from Notes Text file:"+s3);
br.close();//only if close operation ,bufferreader write data to file.
br1.close();
filewrite.close();
fr.close();

	}

}
