public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<String,List<String>> map = new HashMap<>();

       for(String str : strs){
        int[] alphabets = new int[26];
        for(char ch : str.toCharArray()){
            alphabets[ch - 'a']++;
        }
        String key = Arrays.toString(alphabets);
        map.putIfAbsent(key,new ArrayList<>() {});
        map.get(key).add(str);
       }

       return new ArrayList<>(map.values());
    }  
}