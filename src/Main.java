import java.io.*;

public class Main {

	public static void main(String[] args) {

		XmlParser xp = new XmlParser();

		xp.setFilename("Lesson_10.xml");
		try {
			String line = xp.parseXml();
			System.out.println(line);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");

		} catch (IOException e) {
			System.out.println("IO error");
		}

	}

}
