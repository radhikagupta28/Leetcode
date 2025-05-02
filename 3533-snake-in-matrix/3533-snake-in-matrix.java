class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int l=commands.size();
        
        int x=0;
        int y=0;
        for(int i=0;i<l;i++){
            String s=commands.get(i);
            if(s.equals("RIGHT")){
                y++;
            }
            else if(s.equals("LEFT")){
                y--;
            }
            else if(s.equals("UP")){
                x--;
            }
            else{
                x++;
            }
        }

        return (n*x)+y;
    }
}