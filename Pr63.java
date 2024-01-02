import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Pr63 extends ConsoleProgram {
	public void run() {
		HashMap<String, ArrayList<String>> friendsList = new HashMap<String, ArrayList<String>>();
		HashMap<String ,Integer> friendsNumber = new HashMap<String, Integer>();
		while(true) {
			String line = readLine();
			if(line.equals("")) {
				break;
			}
			StringTokenizer tokenizer = new StringTokenizer(line);
			String person = tokenizer.nextToken();
			String newFriend = tokenizer.nextToken();
			friendsList.putIfAbsent(person, new ArrayList<String>());
			friendsList.get(person).add(newFriend);
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
