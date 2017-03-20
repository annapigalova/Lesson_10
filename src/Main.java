
public class Main {

	public static void main(String[] args) {

		XmlParser xp = new XmlParser();

		xp.setFilename("Lesson_10.xml");

		String line = xp.parseXml();

		System.out.println(line);

	}

}
