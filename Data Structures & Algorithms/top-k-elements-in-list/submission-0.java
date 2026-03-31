class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            pq.add(entry.getKey());
            while(pq.size()>k) pq.poll();
        }
        int[] res = new int[k];
        int i=0;
        while(!pq.isEmpty()){
            res[i++] = pq.poll();
        }
        return res;
    }
}
