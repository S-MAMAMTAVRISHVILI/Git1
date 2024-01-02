import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Pr66 extends ConsoleProgram {
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
		boolean commonFriend = false;
		boolean endTask = false;
		for(String person1 : friendsList.keySet()) {
			for(String person2 : friendsList.keySet()) {
				if(person1.equals(person2)) {
					continue;
				}
				ArrayList<String> a = friendsList.get(person1);
				ArrayList<String> b = friendsList.get(person2);
				for(int i = 0 ; i < a.size(); i++) {
					if(b.contains(a.get(i))) {
						commonFriend = true;
						break;
					}
				}
				if(!commonFriend) {
					println(person1 + " and " + person2);
					endTask = true;
					break;
				}
				commonFriend = false;
			}
			if(endTask) {
				break;
			}
		}
	}
}
