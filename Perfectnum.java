import java.io.*;
import java.util.*;

import javax.swing.JOptionPane;
public class basic {
	public static boolean isperfectnum(double n){
		double sum= 0;
		for(double i= 1;i < n;i++){
			if(n % i == 0){
				sum+= i;
			}
		}
		return sum == n;
	}
	public static void main(String[]args){
		
		
		String numberofperfectnums = JOptionPane.showInputDialog("Please enter the amount of perfect numbers to calculate. \n WARNING: The digits in perfect numbers increases rapidly.");
		int pfnums = Integer.parseInt(numberofperfectnums);//pfnums is the number of perfectnms to calculate
		JOptionPane.showMessageDialog(null,"The program will now calculate the perfect numbers up to the specified amount. \n For large values, please be patient as it will take a while.");
		ArrayList perfectnums = new ArrayList();
	int perfectnumberlist=0;//counter for number of perfectnums
		double count=1;
		while(perfectnumberlist<pfnums){
			if(isperfectnum(count)==true){// if its a perfect number return true and add it to perfectnums arraylist
				perfectnums.add(count);
				perfectnumberlist++;
			}
			count++;
			
		}
		
		JOptionPane.showMessageDialog(null,"Here are your perfect numbers! : "+perfectnums);
	}
}
