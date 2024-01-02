import java.util.HashMap;
import java.util.StringTokenizer;
import acm.program.ConsoleProgram;

public class Pr63 extends ConsoleProgram {
	public void run() {
		HashMap<String ,Integer> friendsNumber = new HashMap<String, Integer>();
		while(true) {
			String line = readLine();
			if(line.equals("")) {
				break;
			}
			StringTokenizer tokenizer = new StringTokenizer(line);
			String person = tokenizer.nextToken();
			friendsNumber.putIfAbsent(person, 0);
			friendsNumber.put(person, friendsNumber.get(person) + 1);
		}
		int max = 0;
		String result = "";
		for(String name : friendsNumber.keySet()) {
			if(friendsNumber.get(name) > max) {
				max = friendsNumber.get(name);
				result = name;
			}
		}
		println("Person with most friends is " + result);
	}
}
