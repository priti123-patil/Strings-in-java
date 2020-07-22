import java.util.*;
public class string6 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the string");
String str = s.nextLine();
int vcount = 0, ccount = 0;
for(int i = 0; i < str.length(); i++) { char ch = str.charAt(i); if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { vcount++; } else if((ch >= 'a'&& ch <= 'z')) {
                ccount++;
}
}
System.out.println("Number of Vowels: " + vcount);
System.out.println("Number of Consonants: " + ccount);
}
}