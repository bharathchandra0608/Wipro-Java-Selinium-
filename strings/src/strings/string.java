package strings;

public class string {

	public static void main(String[] args) {
		String name = "bharath chandra";
		// 🔹 1. Basic Methods
		//str.length();
		//str.charAt(int index);
		//str.substring(int beginIndex);
		//str.substring(int beginIndex, int endIndex);
		//str.concat(String str);
		System.out.println(name.length());
		System.out.println(name.charAt(14));
		System.out.println(name.substring(6));
		System.out.println(name.substring(4, 13));
		System.out.println(name.concat(" bathula"));
		System.out.println(name.equals("chandra"));
		System.out.println(name.equalsIgnoreCase("bharath chandra"));
		System.out.println(name.compareTo("patel"));
		System.out.println(name.compareToIgnoreCase("bharath Chandra"));
		System.out.println(name.indexOf("a"));
		System.out.println(name.indexOf("b"));
		System.out.println(name.lastIndexOf("r"));
		System.out.println(name.contains("ch"));
		System.out.println(name.startsWith("d"));
		System.out.println(name.endsWith("a"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim());
		/*🔹 1. Basic Methods
str.length();
str.charAt(int index);
str.substring(int beginIndex);
str.substring(int beginIndex, int endIndex);
str.concat(String str);
 
// 🔹 2. Comparison Methods
str.equals(Object another);
str.equalsIgnoreCase(String another);
str.compareTo(String another);
str.compareToIgnoreCase(String str);
 
// 🔹 3. Searching Methods
str.indexOf(int ch);
str.indexOf(String str);
str.lastIndexOf(String str);
str.contains(CharSequence s);
str.startsWith(String prefix);
str.endsWith(String suffix);
 
// 🔹 4. Case Conversion
str.toLowerCase();
str.toUpperCase();
 
// 🔹 5. Trimming and Replacing
str.trim();
str.replace(char oldChar, char newChar);
str.replace(CharSequence target, CharSequence replacement);
str.replaceAll(String regex, String replacement);
str.replaceFirst(String regex, String replacement);
 
// 🔹 6. Conversion
str.toCharArray();
String.valueOf(int value);  // static method
str.getBytes();
 
// 🔹 7. Split and Join
str.split(String regex);
str.split(String regex, int limit);
String.join(CharSequence delimiter, CharSequence... elements); // static method
 
// 🔹 8. Pattern Matching
str.matches(String regex);
 
// 🔹 9. Interning and Emptiness
str.intern();
str.isEmpty();
str.isBlank(); // Java 11+
		
		
		 
		
		*/
		// TODO Auto-generated method stub

	}

}
