package UserInput;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        int[] userInputDigits = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < userInputDigits.length; i++) {
            System.out.println("Enter digit number " + (i + 1) + ":");
            int x = scanner.nextInt();
            userInputDigits[i] = x;

        }
        Arrays.sort(userInputDigits);
        System.out.println(Arrays.toString(userInputDigits));
      int even = 0;
      int odd = 0;
      int zero = 0;

        for (int i = 0; i < userInputDigits.length; i++){
            if (userInputDigits[i] %2==0){
                even++;
            }

        }
        System.out.println("The number of even digits is: " + even);
        for (int i = 0; i <userInputDigits.length; i++){
            if ((userInputDigits[i] %2) !=0 ){
                odd++;
            }
        }
        System.out.println("The number of odd digits is: " + odd);
        for (int i =0; i< userInputDigits.length;i++){
            if (userInputDigits[i]==0){
                zero++;
            }
        }
        System.out.println("The number of zeros is: " + zero);

    }


}

