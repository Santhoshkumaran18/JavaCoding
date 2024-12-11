package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StreamExercise1 {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Santhosh");
		names.add("Aravindh");
		names.add("Arun");
		names.add("Ashok");
		names.add("Apil");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}

		}
		System.out.println(count);

		ArrayList<String> names1 = new ArrayList<String>();
		names1.add("Santhosh");
		names1.add("Aravindh");
		names1.add("Arun");
		names1.add("Ashok");
		names1.add("Apil");
		long c = names1.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(c);

	}
}
