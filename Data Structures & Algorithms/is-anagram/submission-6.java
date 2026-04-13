class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] mem = new int[26]; 
        for(char c: s.toCharArray()){
            mem[c - 97] += 1;
        }

        for(char c: t.toCharArray()){
            mem[c - 97] -= 1;
        }

        for(int cnt: mem){
            if(cnt > 0){
                return false;
            }
        }

        return true;
    }
}
