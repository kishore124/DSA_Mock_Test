package in.ineuron;

import java.util.HashMap;

public class First_Unique_Character_In_String {

	public static void main(String[] args) {

		String str = "loveleetcode";
		int res = firstUniqueCharacter(str);
		System.out.println("Result is " + res);
	}

	public static int firstUniqueCharacter(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
		}
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}

}
