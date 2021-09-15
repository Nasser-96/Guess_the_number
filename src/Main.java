import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int randomNum = (int)(Math.random() * 101);
        Scanner myObj = new Scanner(System.in);

        // System.out.println(randomNum);
        // System.out.println(x);
        for (int i =10;i>0;i--){
            System.out.println("you have only "+i);
            System.out.print("Enter The number between 0 and 100: ");
            int x = myObj.nextInt();
            if (x == randomNum){
                System.out.println("You Guessed Right ");
                break;
            }
            else if (x > randomNum) {
                System.out.println("Try with a smaller number ");
            }
            else if (x < randomNum){
                System.out.println("Try a bigger number");
            }
        }





    }
}
