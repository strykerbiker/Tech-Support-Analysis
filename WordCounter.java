import java.util.HashMap;
import java.util.HashSet;

/**
 * Keep a record of how many times each word was entered by users.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 7.0
 */
public class WordCounter
{
    // Associate each word with a count.
    private final HashMap<String, Integer> wordCounts;

    /**
     * Create a WordCounter
     */
    public WordCounter()
    {
        wordCounts = new HashMap<>();
    }
    
    /**
     * Update the usage count of all words in input.
     * @param input A set of words entered by the user.
     */
    public void addWords(HashSet<String> input)
    {
        for(String word : input) {
            int counter = wordCounts.getOrDefault(word, 0);
            wordCounts.put(word, counter + 1);
        }
    }
    
    public void usageCount() {
        System.out.println("Word usage count:");
        for (String word : wordCounts.keySet()){
            System.out.println(word + " :" + wordCounts.get(word));
        }
    }
}