class Solution {
    public int mySqrt(int x) {
        double t=0,sqrt=0;
        if(x==0||x==1){
            return x;
        }
        sqrt=x/2;
        do{
            t=sqrt;
            sqrt=(t+(x/t))/2;
        }
        while(t-sqrt!=0);
        return (int)sqrt;
    }
}
