class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> memory = new HashMap<>(); 
        for(char c: s.toCharArray()){
            if(memory.get(c) == null){
                memory.put(c, 1);
            }
            else{
                memory.put(c, memory.get(c) + 1);
            }
        }

        for(char c: t.toCharArray()){
            if(memory.get(c) == null){
                return false;
            }
            else if(memory.get(c) > 0){
                memory.put(c, memory.get(c) - 1);
            }
        }

        for(char c: s.toCharArray()){
            if(memory.get(c) > 0){
                return false;
            }
        }

        return true;
    }
}
