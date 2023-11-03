
//write a java program to reverse each word at its place in a string                                                           Sample input: Learning made easy at bitLabs
//Expected output: gninraeL edam ysae ta sbaLtib
//input: welcome to java

//output:Avaj Ot Emoclew
import java.util.Scanner;

class Reverse {
  public void string(String str) {
    String en = "";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      en = ch + en;
    }
    String s1=en.substring(0,1).toUpperCase();
     String s2=en.substring(1);
     String res=s1+s2;
    System.out.println("output:" + res);
  }
}

public class ReverseString {
  public static void main(String[] args) {
    String str;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    str = sc.nextLine();
    Reverse call = new Reverse();
    call.string(str);
  }
}