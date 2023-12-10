import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import acm.program.ConsoleProgram;

public class Problem52 extends ConsoleProgram {
	
	public void run() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Problem52.java"));
			while(true) {
			if(reader.readLine() == null) {
				break;
			} else {
				String newLine = reader.readLine();
				println(newLine);
			}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
