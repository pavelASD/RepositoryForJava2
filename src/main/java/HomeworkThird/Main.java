package HomeworkThird;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("TASK 1");
        System.out.println("");
        arrayWords();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("TASK 2: ");
        System.out.println("");
        telephoneDirectory();
    }

    public static void arrayWords(){
        String[] words = new String[]{"Texas", "New Mexico", "New York", "Texas", "Colorado", "California", "Washington", "Idaho", "New York", "Florida", "Florida", "Pennsylvania"};
        Set<String> setWords = new TreeSet<>(Arrays.asList(words));
        Map<String, Integer> mapWords = new TreeMap<>();

        System.out.println("");
        System.out.println("output of unique words: ");

        for (String word : setWords){
            System.out.println(word);
        }



        for (int i=0; i<words.length; i++){
            if (mapWords.containsKey(words[i])){
                mapWords.put(words[i], mapWords.get(words[i])+1);
            }
            else{
                mapWords.put(words[i], 1);
            }
        }
        System.out.println("");
        System.out.println("count for words: ");
        System.out.println("");
        for (Map.Entry<String, Integer> entry : mapWords.entrySet()){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }

    public static void telephoneDirectory(){
        Directory directory = new Directory();
        directory.add("Adamson", "1-1243949");
        directory.add("Evans", "1-1232949");
        directory.add("Adamson", "1-12434839");
        directory.add("Wilson", "1-1243249");
        directory.add("Brown", "1-1473349");
        directory.add("Walker", "1-1747949");

        System.out.println(directory.get("Adamson"));
        System.out.println(directory.get("Walker"));
    }
}



