class Solution {
    public int findComplement(int num) {
        int len=Integer.toBinaryString(num).length();

        int mask=(1<<len)-1;
        return (mask^num);
    }
}