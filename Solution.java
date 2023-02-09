class Solution {
    public boolean isAnagram(String s, String t) {
        //if they arent the same length, they must not be anagrams.
        if(s.length() != t.length()){return false;}
        //Sort chars in strings.
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        //If the strings are equal, then we know they are anagrams.
        for(int i = 0; i < s1.length; i++){
            if(s1[i] != s2[i]){return false;}
        }
        return true;
    }
}
