package fileHandling;
import java.io.*;
public class WriteReadTextFile {

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("Desktop://myfile.txt");
		fw.write("Hello My first file!!!");
		System.out.println("File created...");
		fw.close();
		
		//read a text file
		
		FileReader fr = new FileReader("Desktop://myfile.txt");
		//ASCII code :-- American code of informetion interchange
		//A=65 B=66 a=97, b=98
		
		int i;
		while((i=fr.read())!=-1)   //-1 End Of The File
		{
			System.out.println((char)i);   //converts the integer to charactor
		}
		
		
		
		
		
		
	}

}
