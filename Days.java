/* wajp to print day name of weekend using switch statement.
*/

import java.io.*;
class Days{
public static void main(String args[]){
Console c=System.console();
while(true){
int day=Integer.parseInt(c.readLine("Enter the no :"));
switch(day){
case 1:	      System.out.println("Monday");		      break;
case 2:	      System.out.println("Tuesday");		    break;
case 3:	      System.out.println("Wednesday");	    break;
case 4:	      System.out.println("Thursday");	      break;
case 5:  	    System.out.println("Friday");		      break;
case 6: 	    System.out.println("Saturday");		    break;
case 7:	      System.out.println("Sunday");		      break;
default:	    System.out.println("Invalid No...");
}
}
}
}
