class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<=Math.sqrt(n)+1;i++){
            if(Math.pow(2,i)==n){
                return true;
            }
        }
        return false;
    }
}

//Another solution to find if the number is power of two

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
