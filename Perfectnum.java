import java.io.*;
import java.util.*;
import java.math.*;

import javax.swing.JOptionPane;
public class basic {
	static BigInteger zerovalue=new BigInteger("0");
	static BigInteger onevalue=new BigInteger("1");
	public static boolean isperfectnum(BigInteger n){
		
		BigInteger sum=new BigInteger("0");
		BigInteger i=new BigInteger("1");
		while(n.compareTo(i)>0){
			if(n.mod(i).equals(zerovalue)){
			sum=sum.add(i);	
			}
		}
		return sum==n;
		
		
		//for( i= 1;i < n;i++){
			//if(n % i == 0){
				//sum+= i;
			//}
	//	}
		//return sum == n;
	}
	public static void main(String[]args){
		
		
		String numberofperfectnums = JOptionPane.showInputDialog("Enter the amount of perfect numbers to calculate. \n WARNING: The digits in perfect numbers increases rapidly.");
		int pfnums = Integer.parseInt(numberofperfectnums);//pfnums is the number of perfectnms to calculate
		JOptionPane.showMessageDialog(null,"The program will now calculate the perfect numbers up to the specified amount. \n For large numbers, please be patient as it will take a while.");
		ArrayList<BigInteger> perfectnums = new ArrayList<BigInteger>();
	int perfectnumberlist=0;//counter for number of perfectnums
		BigInteger count=new BigInteger("0");
		while(perfectnumberlist<pfnums){
			if(isperfectnum(count)==true){// if its a perfect number return true and add it to perfectnums arraylist
				perfectnums.add(count);
				perfectnumberlist++;
			}
			count=count.add(onevalue);
			
		}
		
		JOptionPane.showMessageDialog(null,perfectnums);
	}
}
