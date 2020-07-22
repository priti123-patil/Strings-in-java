import java.util.*;
class string7
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String str=s.nextLine();
System.out.println("Enter charcter");
char ch=s.next().charAt(0);
int counter = 0;
for (int i = 0; i < str.length(); i++) {
if (str.charAt(i) == ch) {
counter++;
}
}
System.out.println(ch+ " occurs " +counter+ " times in " +str);
}
}

