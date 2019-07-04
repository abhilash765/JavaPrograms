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
public class HarmonicSeries {
  public static void main (String args[])
	{
	int num;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Harmonic value:");
	num= sc.nextInt();
	double r=0.0;
	while (num>0)
		{
		r=r+(double)1/num;
		num--;
		}
	System.out.println("The Harmonic value is:"+ r);
	}  
}
