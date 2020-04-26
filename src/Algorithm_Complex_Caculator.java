import java.util.Scanner;

public class Algorithm_Complex_Caculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String myString = scan.nextLine();
        int myArray[] = new int[255];
        for(int i=0; i< myString.length(); i++){
            int ascii = (int) myString.charAt(i);
            myArray[ascii] ++;
        }
        int max = myArray[0];
        char charactor = (char) 255;
        for(int i=0; i< 255; i++){
            if(myArray[i] > max){
                max = myArray[i];
                charactor = (char) i;
            }
        }
        System.out.println("The most appearing letter is '" + charactor + "' with a frequency of " + max + " times");
    }
}
