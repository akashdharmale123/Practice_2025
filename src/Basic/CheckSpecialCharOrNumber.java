package Basic;

public class CheckSpecialCharOrNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "asdf";

        boolean hasSpecialOrNumber = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is NOT a letter (a-z or A-Z)
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                hasSpecialOrNumber = true;
                break;
            }
        }

        if (hasSpecialOrNumber) {
            System.out.println("String contains special characters or numbers.");
        } else {
            System.out.println("String contains only alphabets.");
        }

	}

}
