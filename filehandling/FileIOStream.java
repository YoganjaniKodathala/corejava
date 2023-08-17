package filehandling;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("D:/WritableFile");
		String s ="Java is fun";
		byte b[]=s.getBytes();
		fos.write(b);
		System.out.println("Content written...");

	}

}
