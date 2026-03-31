class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] strArr = strs[i].toCharArray();
            Arrays.sort(strArr);
            String sorted = new String(strArr);
            if(map.containsKey(sorted))
                map.get(sorted).add(strs[i]);
            else{
                List<String> anagrams = new ArrayList<>();
                anagrams.add(strs[i]);
                map.put(sorted, anagrams);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: map.entrySet()){
            List<String> anagrams = entry.getValue();
            result.add(anagrams);
        }
        return result;
    }
}
