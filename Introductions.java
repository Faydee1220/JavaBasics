import java.io.Console;
// io 代表 input, output
 
public class Introductions {
  
    public static void main(String[] args) {
        Console console = System.console();
        // Welcome to the Introductions program!  Your code goes below here
      
        // String firstName = "Faydee";
        // String firstName = "Lily";
      
        // readLine 可以回傳輸入的值
        String firstName = console.readLine("What is your Name?  ");
          
        // printf 的 f 代表 fromatted text
        // %s 的 s 代表 String
        console.printf("Hello, my name is %s.\n", firstName);
        console.printf("%s is learning how to write java.\n", firstName);
  }
}