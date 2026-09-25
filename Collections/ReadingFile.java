package Collections;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReadingFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//String file="C:\\Users\\pushp\\testing-training-workspace\\JavaBasicsTraining\\src\\com\\pushpa\\learn\\java\\HelloWorld.java";
String file="C:/Users/pushp/Desktop/notes.txt";
		FileReader fileread=new FileReader(file);


BufferedReader br=new BufferedReader(fileread);

String s1;

while((s1=br.readLine())!=null)
{
	System.out.println(s1);
}
br.close();
fileread.close();
	}

}
