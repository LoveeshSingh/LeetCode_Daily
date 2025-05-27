class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=n*(n+1)/2;
        int divm=m*(n/m)*((n/m)+1)/2;
        System.out.println(divm);
        return sum-2*divm;
    }
}
