import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlParser {

	private String filename;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String parseXml() throws FileNotFoundException, IOException {

		String line = "";
		File file = new File(filename);
		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new FileReader(file));

		while ((line = br.readLine()) != null) {
			sb.append(line.trim());

		}

		line = sb.toString();
		sb.setLength(0);

		final String regex = "<([^<>]+)>([^<>]+)</\\1>";
		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(line);
		
		while (matcher.find()) {

			for (int i = 1; i <= matcher.groupCount(); i++) {

				sb.append(matcher.group(i).trim());
				sb.append(System.lineSeparator());

			}
		}

		String xmlString = sb.toString();

		return xmlString;

	}

}
