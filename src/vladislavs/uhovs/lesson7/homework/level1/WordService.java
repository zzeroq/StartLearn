package vladislavs.uhovs.lesson7.homework.level1;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordService {
    public String findMostFrequentWord(String text) {
        if (text == null || text.isEmpty()){
            return "";
        }
        String lowerText = cleanWords(text);
        String[] splitText = splitWords(lowerText);
        if (splitText.length == 0) {
            return "";
        }
        Map<String, Integer> wordCount = countWords(splitText);

        return findMaxWord(wordCount);
    }

    private String cleanWords(String text){
        String lower = text.toLowerCase();
        return lower.replaceAll("[^a-z ]" , " ");
    }

    private String[] splitWords(String cleanText){
        String trimmed = cleanText.trim();
        if (trimmed.isEmpty()){
            return new String[0];
        }
        return trimmed.split("\\s+");
    }

    private Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCounts = new LinkedHashMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        return wordCounts;
    }

    private String findMaxWord(Map<String, Integer> wordCounts) {
        String maxWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()){
            String word = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                maxWord = word;
            }
        }
        return maxWord;
    }
}
