class Solution {
    public long countOfSubstrings(String word, int k) {
        return solve(word,k)-solve(word,k-1);
    }

    public long solve(String word,int k){
        HashMap<Character,Integer>map=new HashMap<>();
        int cons=0;
        int l=0;
        long ans=0;

        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else
            {
                cons++;
            }

            while(map.size()==5 && cons>k)
            {
                char c=word.charAt(l);
                if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
                {
                    map.put(c, map.get(c) - 1);
                    if(map.get(c)==0) map.remove(c);
                }
                else
                {
                    cons--;
                }
                l++;
            }

            ans+=(i-l+1);
        }
        return ans;
    }
}