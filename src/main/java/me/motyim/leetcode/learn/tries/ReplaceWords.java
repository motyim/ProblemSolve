package me.motyim.leetcode.learn.tries;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/replace-words/
 */

public class ReplaceWords {

    TrieNode root;


    class TrieNode {
        Map<Character, TrieNode> childern = new HashMap<>();
        boolean isRoot;
        String value;
    }

    public ReplaceWords() {
        root = new TrieNode();
    }

    public String replaceWords(List<String> dictionary, String sentence) {

        //build tries
        dictionary.forEach(this::insert);

        List<String> words = Arrays.stream(sentence.split(" "))
                .map(this::replaceWithRootIfExist)
                .collect(Collectors.toList());

        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }

    private String replaceWithRootIfExist(String word) {
        TrieNode current = root;

        for (char c : word.toCharArray()) {
            if (current.isRoot) return current.value;
            if(!current.childern.containsKey(c)) return word;
            current = current.childern.get(c);
        }
        return word;
    }

    public void insert(String key) {
        TrieNode current = root;
        for (char c : key.toCharArray()) {
             current.childern.putIfAbsent(c, new TrieNode());
             current = current.childern.get(c);
        }
        current.isRoot = true;
        current.value = key;
    }


}
