HashMap<Character, Integer> map = new HashMap<>();

for(char c : s.toCharArray()){
    map.put(c, map.getOrDefault(c, 0) + 1);
}
#hashmaps sucks i'm not getting this from 2 days
