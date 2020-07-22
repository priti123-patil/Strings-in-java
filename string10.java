import java.util.*;
class string10
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String s1=s.nextLine();
int length = s1.length();
boolean isPalindrome = true;  
for(int i = 0; i < length; i++)
{
if(s1.charAt(i) != s1.charAt(length-1-i)) {
System.out.println("String is not a palindrome.");
isPalindrome = false;
break;
}
}
if(isPalindrome) {
System.out.println("String is a palindrome.");
}
}
}