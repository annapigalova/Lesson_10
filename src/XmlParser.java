import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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

	public String parseXml() {

		String line = "";
		File file = new File(filename);
		StringBuilder sb = new StringBuilder();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			while ((line = br.readLine()) != null) {
				sb.append(line.trim());

			}

			line = sb.toString();

		} catch (Exception e) {

			e.printStackTrace();

		}

		final String regex = "<([^<>]+)>([^<>]+)</\\1>";
		final Pattern pattern = Pattern.compile(regex);
		final Matcher matcher = pattern.matcher(line);
		StringBuilder xmlSb = new StringBuilder();

		while (matcher.find()) {
			for (int i = 1; i <= matcher.groupCount(); i++) {
				xmlSb.append(matcher.group(i));
			}
		}

		String xmlString = xmlSb.toString();

		return xmlString;

	}

}
