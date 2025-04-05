class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map=new TreeMap<>();

        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        PriorityQueue<Character>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char ch=pq.poll();
            int cnt=map.get(ch);
            for(int i=0;i<cnt;i++){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}