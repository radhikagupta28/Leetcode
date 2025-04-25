class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]>ans=new ArrayList<>();
        
        int i=0;
        int n=intervals.length;

        //add intervals into the list before starting point of new interval
        while(i<n && intervals[i][1]<newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }       

        //now interval comes--merge--ovverlap
        while(i<n && intervals[i][0]<=newInterval[1])
        {
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        } 
        ans.add(newInterval); 

        //remaining intervals
        while(i<n){
            ans.add(intervals[i]);
            i++;
        }


        return ans.toArray(new int[ans.size()-1][]);
    }
}