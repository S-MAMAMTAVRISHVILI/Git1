import java.util.HashMap;
import java.util.StringTokenizer;
import acm.program.ConsoleProgram;

public class Pr65 extends ConsoleProgram {
	public void run() {
		HashMap<String ,Integer> followersNumber = new HashMap<String, Integer>();
		while(true) {
			String line = readLine();
			if(line.equals("")) {
				break;
			}
			StringTokenizer tokenizer = new StringTokenizer(line);
			String friend = tokenizer.nextToken();
			String person = tokenizer.nextToken();
			followersNumber.putIfAbsent(person, 0);
			followersNumber.put(person, followersNumber.get(person) + 1);
		}
		int max = 0;
		String result = "";
		for(String name : followersNumber.keySet()) {
			if(followersNumber.get(name) > max) {
				max = followersNumber.get(name);
				result = name;
			}
		}
		println("Person with most followers is " + result);
	}
}