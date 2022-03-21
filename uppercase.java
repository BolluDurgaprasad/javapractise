// Java program to display the alphabets (a to z) using while loop
public class uppercase {
    public static void main(String[] args) {
        char character;
        System.out.println("Upper case Alphabets Displayed \n");
        for (character = 'A';character <= 'z' ; ++ character)
            System.out.print(character + " ");
        System.out.println("\n\n");
        System.out.print("Lower case Alphabets Display \n");
        for (character = 'a'; character <= 'z'; ++character)
            System.out.println(character + " ");
        
    }
}