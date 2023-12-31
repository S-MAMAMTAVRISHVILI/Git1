import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Pr62 extends ConsoleProgram {
	public void run() {
		HashMap<String, Integer> nameBase = new HashMap<String, Integer>();
		while(true) {
			String name = readLine("Enter name: ");
			if(name.equals("")) {
				break;
			}
			if(!nameBase.containsKey(name)) {
				nameBase.put(name, 1);
			} else {
				int x = nameBase.get(name);
				nameBase.put(name, x + 1);
			}
		}
		for(String name: nameBase.keySet()) {
			println(name + " " + nameBase.get(name));
		}
	}
}
