import java.util.*;
class string9
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the string:");
String s1=s.nextLine();
int n=s1.length();

string9 obj=new string9();
obj.permute(s1,0,n-1);
}
public void permute(String s1,int i,int j)
{
if(i==j)
{
System.out.println(s1);
}
else
{
for(int k=i;k<=j;k++)
{
s1=swap(s1,i,k);
permute(s1,i+1,j);
s1=swap(s1,i,k);
}
}
}
public String swap(String a, int m, int n) 
{ 
char temp; 
char[] charArray = a.toCharArray(); 
temp = charArray[m] ; 
charArray[m] = charArray[n]; 
charArray[n] = temp; 
return String.valueOf(charArray); 
} 
}
  