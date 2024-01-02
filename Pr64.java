import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Pr64 extends ConsoleProgram {
	public void run() {
		HashMap<String, ArrayList<String>> friendsList = new HashMap<String, ArrayList<String>>();
		while(true) {
			String line = readLine();
			if(line.equals("")) {
				break;
			}
			StringTokenizer tokenizer = new StringTokenizer(line);
			String person = tokenizer.nextToken();
			String friend = tokenizer.nextToken();
			friendsList.putIfAbsent(person, new ArrayList<String>());
			friendsList.get(person).add(friend);
		}
		for(String name : friendsList.keySet()) {
			println(name + " ");
			for(int i = 0; i < friendsList.get(name).size(); i++) {
				print(friendsList.get(name).get(i) + ", ");
			}
			
		}
//		for(String name : friendsList.keySet()) {
//			println(name + " " + friendsList.get(name).toString());
//		}
	}
}
