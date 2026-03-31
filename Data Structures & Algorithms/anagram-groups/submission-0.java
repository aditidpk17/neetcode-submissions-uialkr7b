class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<Integer>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] strArr = strs[i].toCharArray();
            Arrays.sort(strArr);
            String sorted = new String(strArr);
            System.out.println(sorted);
            if(map.containsKey(sorted))
                map.get(sorted).add(i);
            else{
                List<Integer> indices = new ArrayList<>();
                indices.add(i);
                map.put(sorted, indices);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<Integer>> entry: map.entrySet()){
            List<Integer> indices = entry.getValue();
            List<String> group = new ArrayList<>();
            for(int i: indices){
                group.add(strs[i]);
            }
            result.add(group);
        }
        return result;
    }
}
