class Solution {
    public int bitwiseComplement(int n) {
        int l=Integer.toBinaryString(n).length();

        int mask=(1<<l)-1;
        return mask^n;
    }
}