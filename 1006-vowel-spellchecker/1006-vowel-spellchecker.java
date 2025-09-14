class Solution {

    // Helper: check if character is a vowel
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    // Helper: given a lowercase word, replace all vowels with '*'
    private static String devowel(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                sb.append('*');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    public String[] spellchecker(String[] wordlist, String[] queries) {
         Set<String> exactSet = new HashSet<>(Arrays.asList(wordlist));

        // 2. lowercase map: lowercase word → first occurrence original
        Map<String, String> lowercaseMap = new HashMap<>();

        // 3. devowel map: devowel pattern → first occurrence original
        Map<String, String> devowelMap = new HashMap<>();

        for (String w : wordlist) {
            String wLower = w.toLowerCase();

            // fill lowercase map if not yet present
            lowercaseMap.putIfAbsent(wLower, w);

            // compute devowel pattern
            String pattern = devowel(wLower);
            devowelMap.putIfAbsent(pattern, w);
        }

        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];

            if (exactSet.contains(q)) {
                // rule 1: exact
                result[i] = q;
            } else {
                String qLower = q.toLowerCase();
                if (lowercaseMap.containsKey(qLower)) {
                    // rule 2: case-insensitive
                    result[i] = lowercaseMap.get(qLower);
                } else {
                    // rule 3: vowel-error
                    String pattern = devowel(qLower);
                    if (devowelMap.containsKey(pattern)) {
                        result[i] = devowelMap.get(pattern);
                    } else {
                        result[i] = "";
                    }
                }
            }
        }

        return result;
    }
}