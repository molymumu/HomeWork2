package homeWork2;
import java.util.Scanner;
public class Container {
public static void main(String[] args) {
			//input by me.Array size 5
//			int[]number=new int[5];
//			number[0]=9;
//			number[1]=8;
//		    number[2]=7;
//			number[3]=6;
//			int len=number.length;
//			System.out.println("Array size =" +len);
//			int sum=number[0]+number[1]+number[2]+number[3];
//			System.out.println("Total of array = " +sum);
//			System.out.print(number[0]);
			//import Scanner class
			Scanner sc =new Scanner(System.in);
			System.out.print("Please enter any integers :");
			int[]numbers=new int[10];
			for(int i=0; i<10;i++) {
		    numbers[i]=sc.nextInt();
			}
		    System.out.println(numbers[1]);
		    System.out.println(numbers[2]);
		    System.out.println(numbers[6]);
		    sc.close();	
			}		
	    }
