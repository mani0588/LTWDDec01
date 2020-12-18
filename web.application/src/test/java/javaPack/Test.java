package javaPack;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Test {

	public static void main(String[] args) {

		File file = new File("");
		System.out.println(file.getAbsolutePath() + "\\src\\test\\resources\\pom.xml");

		TimeZone.setDefault(TimeZone.getTimeZone("EST"));
		System.out.println(new Date());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy");
		System.out.println(sdf.format(new Date()));

	}
}
