class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        System.out.println(paragraph);
        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
        paragraph = paragraph.replaceAll(match, " ");
        paragraph = paragraph.replaceAll(" ", " ");
        System.out.println(paragraph);
        String[] words = paragraph.split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        ArrayList<String> bannedList = new ArrayList<>(Arrays.asList(banned));
        Map<String, Integer> map = new HashMap<>();
        wordsList.removeAll(bannedList);
        for (int idx = 0; idx < wordsList.size(); idx++) {
            System.out.println(wordsList.get(idx));
            map.put(wordsList.get(idx), map.getOrDefault(wordsList.get(idx), 0) + 1);
        }
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
// Runtime: 28 ms Memory Usage: 39.8 MB