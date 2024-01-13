class Solution {
    public int minSteps(String s, String t) {
        int charfreq[] = new int[26];
        
        for(int i=0; i<s.length();i++){
            charfreq[s.charAt(i)- 'a']++;
        }
        
        int minstep = 0;
        
        for(int i=0; i<t.length(); i++){
            if(--charfreq[t.charAt(i)-'a'] < 0){
                minstep++;
            }
        }
        return minstep;
    }
}