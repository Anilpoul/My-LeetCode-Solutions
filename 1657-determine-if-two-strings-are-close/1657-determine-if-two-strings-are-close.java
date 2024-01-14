class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        
        // creating frequency maps for both the strings.
        Map<Character, Integer> freq1 = new HashMap<>();
        Map<Character, Integer> freq2 = new HashMap<>();
        
        //Populating the frequency maps 
        for(char c : word1.toCharArray()){
            freq1.put(c, freq1.getOrDefault(c,0) + 1);
        }
        
         
        for(char c : word2.toCharArray()){
            freq2.put(c, freq2.getOrDefault(c,0) + 1);
        }
        
         // chaeck if the set of characters are equal or not
        if(!freq1.keySet().equals(freq2.keySet())) return false;
        
        //check if the frequency of character id same or not
        List<Integer> count1 = new ArrayList<>(freq1.values());
        List<Integer> count2 = new ArrayList<>(freq2.values());

        Collections.sort(count1);
        Collections.sort(count2);

        return count1.equals(count2);   
        
    }
}