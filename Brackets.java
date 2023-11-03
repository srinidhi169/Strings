
/*write the method BracketMatcher(str) take the str parameter being passed and return 1 if the brackets are correctly
matched and each one is accounted for. Otherwise return 0. For example: if str is "(hello (world))", 
then the output should be 1, but if str is "((hello (world))" the the output should be 0
because the brackets do not correctly match up. Only "(" and ")" will be used as brackets. 
If str contains no brackets return 1.*/
import java.util.Scanner;

public class Brackets {
  public static void main(String[] args) {
    Word l = new Word();
    l.isCorrect();
    if(b){
       System.out.println("is matched");
    }
  }
}

class Word {
  public boolean isCorrect(){
    int count=0;
    String matches="()";
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string");
    String str = sc.nextLine();
    for(int i=0;i<=str.length();i++){
      if(str.charAt(i)==matches){
        count++;
      }
    }
    if(count%2==0){
        return true;
      }
    if(count%2!=0){
        return false;
      }
  }
}