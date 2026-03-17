class Solution {
    public boolean isAnagram(String s, String t) {

        // Step 1: Length check
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 2: Count characters in s
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 3: Reduce using t
        for(char c : t.toCharArray()){

            if(!map.containsKey(c)){
                return false;
            }

            map.put(c, map.get(c) - 1);

            if(map.get(c) < 0){
                return false;
            }
        }

        return true;
    }
}
