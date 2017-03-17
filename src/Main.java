import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {

		XmlParser xp = new XmlParser();

		xp.setFilename("Lesson_10.xml");

		String line = xp.parseXml();

		System.out.println(line);

	}

}
