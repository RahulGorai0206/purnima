/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int X=0,count=0;
	    Scanner scan = new Scanner(System.in);
	    count=scan.nextInt();
	    for (int i=0; i<count; i++){
		X=scan.nextInt();
		if(X>100){
		System.out.println(X-10);
		}else{
		    System.out.println(X);
	    }
	    }
	}
}
