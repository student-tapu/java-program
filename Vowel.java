
import java.util.*;
class Vowel
{
    public static void main(String[] args) {
        String sentence = "Programming is fun and challenging";
        System.out.println("Number of words: ");
                int count = 0;
        
                for (int i = 0; i < sentence.length(); ++i) {
                    if (sentence.charAt(i) == ' ') {
                        count++;
                    }
                }
                
                System.out.println(count);
            }
        
            
        }
        
