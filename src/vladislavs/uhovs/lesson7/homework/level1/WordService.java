package vladislavs.uhovs.lesson7.homework.level1;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordService {
    public String findMostFrequentWord(String text) {
        if (text == null || text.isEmpty()){
            return "";
        }
        String lowerText = normalizeText(text);
        String[] splitText = splitToWords(lowerText);
        if (splitText.length == 0) {
            return "";
        }
        Map<String, Integer> wordCount = countWordFrequencies(splitText);

        return pickMostFrequentWord(wordCount);
    }

    private String normalizeText(String text){
        String lower = text.toLowerCase();
        return lower.replaceAll("[^a-z ]" , " ");
    }

    private String[] splitToWords(String cleanText){
        String trimmed = cleanText.trim();
        if (trimmed.isEmpty()){
            return new String[0];
        }
        return trimmed.split("\\s+");
    }

    private Map<String, Integer> countWordFrequencies(String[] words) {
        Map<String, Integer> wordCounts = new LinkedHashMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        return wordCounts;
    }

    private String pickMostFrequentWord(Map<String, Integer> wordCounts) {
        String mostFrequentWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()){
            String word = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;
            }
        }
        return mostFrequentWord;
    }
}
