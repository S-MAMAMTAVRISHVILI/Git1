import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Pr63 extends ConsoleProgram {
	public void run() {
		HashMap<String, String> followersList = new HashMap<String, String>();
		while(true) {
			String newFollower = readLine();
			if(newFollower.equals("")) {
				break;
			}
			String person = readLine();
			if(person.equals("")) {
				break;
			}
			followersList.put(person, newFollower);
		}
		
	}
}
