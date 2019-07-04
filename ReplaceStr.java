/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JARVIS
 */
import java.util.Scanner;
public class ReplaceStr {
    public static void main(String arg[])
    {
        String s1,s2,s3,s4;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence:");
        s1=sc.nextLine();
        System.out.println("Enter the string to be replaced");
        s2=sc.nextLine();
        System.out.println("Enter the string to be replaced with in the given sentence");
        s3=sc.nextLine();
        s4=s1.replace(s2,s3);
        System.out.println("String after replacing:"+s4);
    }
}
