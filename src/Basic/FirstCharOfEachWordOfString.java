package Basic;

public class FirstCharOfEachWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String sentence = "java is programing lang ";

        // Convert to char array
        char[] chars = sentence.toCharArray();

        // Print the first character of the string if it's not a space
        if (chars.length > 0 && chars[0] != ' ') {
            System.out.print(chars[0] + "");
        }

        // Loop through the array
        for (int i = 1; i < chars.length; i++) {
            // If current char is space and next is not space, print next char
            if (chars[i] == ' ' && chars[i + 1] != ' ') {
                System.out.print(chars[i + 1]);
            }
        }


	}

}
