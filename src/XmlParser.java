import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
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
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			StringBuilder sb = new StringBuilder();

			while ((line = br.readLine()) != null) {
				sb.append(line.trim());
				System.out.println(line);
			}
			System.out.println(line);

		} catch (Exception e) {

			e.printStackTrace();

		}

		return line;

	}

}
