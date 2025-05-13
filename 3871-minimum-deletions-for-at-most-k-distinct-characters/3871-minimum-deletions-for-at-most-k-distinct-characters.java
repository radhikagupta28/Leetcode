class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character,Integer>map=new HashMap<>();

        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        if(map.size()<=k)
        {
            return 0;
        }
        int cnt=0;
        int extra=map.size()-k;

        List<Integer>fq=new ArrayList<>(map.values());

        Collections.sort(fq);

        for(int i=0;i<extra;i++)
        {
            cnt+=fq.get(i);
        }

        return cnt;
    }
}