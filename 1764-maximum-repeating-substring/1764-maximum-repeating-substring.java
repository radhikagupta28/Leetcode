class Solution {
    public int maxRepeating(String sequence, String word) {
        String s=word;
        int cnt=0;
        while(sequence.contains(s))
        {
            cnt++;
            s+=word;
        }
        return cnt;
    }
}