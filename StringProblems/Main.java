// import java.util.Scanner;

import Solutions.CustomRotationOfString;
// import Solutions.CountChars;
// import Solutions.RotatedString;

public class Main{
    public static void main(String[] args) {
        
        // String str = "pankaj anand from ranchi";

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter String1 : ");
        // String str1 = sc.nextLine();
        // System.out.println("Enter String2 : ");
        // String str2 = sc.nextLine();
        // sc.close();

        String str1 = "sauravanand";
        // String str2 = "japank";
        int times = 2;
        // CountChars objCountChars = new CountChars();
        // int lenOfStr = objCountChars.getStringLength(str);
        // System.out.println(lenOfStr);

        // RotatedString objRotatedString = new RotatedString();
        // boolean response = objRotatedString.isStringRotated(str1, str2);
        // System.out.println("Is Strinng2 is rotated form of String1 : " + response);

        CustomRotationOfString objCustomRotatedStr = new CustomRotationOfString();
        String rotatedStr = objCustomRotatedStr.getCustomRotatedString(str1, times);
        System.out.println("The Rotated form of String after " + times + " is " + rotatedStr);

    }
}