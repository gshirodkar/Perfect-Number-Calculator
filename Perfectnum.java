//This program calculates perfect numbers using bigintegers
import java.util.*;
import java.math.*;

import javax.swing.JOptionPane;
public class basic {
	
	public static boolean isperfectnum(BigInteger n){
		BigInteger ZERO=new BigInteger("0");
		BigInteger ONE=new BigInteger("1");
		BigInteger sum= new BigInteger("0");
		
		for(BigInteger i= BigInteger.valueOf(1);i.compareTo(n) < 0;i.add(ONE)){
			if(n.remainder(i) == ZERO){
				sum=sum.add(i);
			}
		}
		return sum == n;
	}
	public static void main(String[]args){
		BigInteger ONE=new BigInteger("1");

		
		String numberofperfectnums = JOptionPane.showInputDialog("Please enter the amount of perfect numbers to calculate. \n WARNING: The digits in perfect numbers increases rapidly.");
		int pfnums = Integer.parseInt(numberofperfectnums);//pfnums is the number of perfectnms to calculate
		JOptionPane.showMessageDialog(null,"The program will now calculate the perfect numbers up to the specified amount. \n For large values, please be patient as it will take a while.");
		ArrayList perfectnums = new ArrayList();
	int perfectnumberlist=0;//counter for number of perfectnums
		BigInteger count= new BigInteger("1");
		while(perfectnumberlist<pfnums){
			if(isperfectnum(count)==true){// if its a perfect number return true and add it to perfectnums arraylist
				perfectnums.add(count);
				perfectnumberlist++;
			}
			count.add(ONE);
			
		}
		
		JOptionPane.showMessageDialog(null,"Here are your perfect numbers! : "+perfectnums);
	}
}
