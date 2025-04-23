class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length==0)
        {
            return new int[0][];
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]>ans=new ArrayList<>();
        ans.add(intervals[0]);

        for(int i=1;i<intervals.length;i++)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];

            int[] lastIntervals=ans.get(ans.size()-1);

            if(lastIntervals[1]<start)
            {
                ans.add(new int[]{start,end});
            }
            else
            {
                lastIntervals[1]=Math.max(end,lastIntervals[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}