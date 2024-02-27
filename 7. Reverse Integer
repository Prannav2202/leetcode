class Solution {
    public int reverse(int x) {
        int temp=x,n=0;
        long rev=0;
        if(x<0){
            temp=-1*x;
            while(temp>0){
                n=temp%10;
                rev=(rev*10)+n;
                if(rev>=Integer.MAX_VALUE||rev<=Integer.MIN_VALUE){
                    return 0;
                }
                temp/=10;
            }
            return (int)(-1*rev);
        }
        else{
             while(temp>0){
                n=temp%10;
                rev=(rev*10)+n;
                if(rev>=Integer.MAX_VALUE||rev<=Integer.MIN_VALUE){
                    return 0;
                }
                temp/=10;
            }
            return (int)rev;
        }
    }
}
