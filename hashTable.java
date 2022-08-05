import java.util.HashMap;
public class hashTable {

	public static void main(String[] args) {
		
		String s = "to be or not to be";
		
		HashMap<String,Integer> map = new HashMap<>();
		
		String st[] = s.split(" ");
		
		for (int i = 0; i < st.length; i++) {
			if (map.containsKey(st[i])) {
				map.put(st[i], map.get(st[i])+1);
				
			} else {
				map.put(st[i], 1);

			}
			System.out.println(map);
		}

	}
}

