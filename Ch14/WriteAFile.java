import java.io.*;

public class WriteAFile {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Foo.txt");
			fw.write("Hello foo!");
			fw.close();
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
