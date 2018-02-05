import java.io.Console;
 
public class TreeStory {
    
    public static void main(String[] args) {
        Console console = System.console();
        /*  Some terms:
            noun - Person, place or thing
            verb - An action
            adjective - A description used to modify or describe a noun
            Enter your amazing code here!
        */
        // __Name__ is a __adjective__ __noun__. They are always __adverb__ __verb__.
        String ageAsString = console.readLine("How old are you?  ");
        
        // 字串轉整數，Integer.parseInt
        int age = Integer.parseInt(ageAsString);
      
        if (age < 13) {
          // insert exit code
          console.printf("Sorry, you must be at least 13 to use this program.\n");
          // 0 代表是故意要離開程式
          System.exit(0);
        }
      
        String name = console.readLine("Enter your name:  ");
        String adjective = console.readLine("Enter an adjective:  ");
      
        String noun;
        boolean isInvalidWord;
        // 先做第一次後再判斷是否重複做，do while
        do {
          noun = console.readLine("Enter your noun:  ");
          isInvalidWord = noun.equalsIgnoreCase("dork") ||
                                  noun.equalsIgnoreCase("jerk") ||
                                  noun.equalsIgnoreCase("nerd");
        
          // 字串是否相等，忽略大小寫，equalsIgnoreCase
          if (isInvalidWord) {
            console.printf("That language is not allowed. Try again.\n");
          }
        } while (isInvalidWord);
          
        String adverb = console.readLine("Enter an adverb:  ");
        String verb = console.readLine("Enter your verb ending in -ing:  ");
        
        console.printf("Your TreeStory:\n---------------\n");
        console.printf("%s is a %s %s.  ", name, adjective, noun);
        console.printf("They are always %s %s.\n", adverb, verb);
    }
    
}