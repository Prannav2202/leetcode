class Solution {
    public static boolean isHappy(int n) {
        if(n==1||n==7){
            return true;
        }
        else if(n>=2&&n<=9){
            return false;
        }
        else{
            int temp=n,mul=0,sum=0;
            while(temp>0){
                int b=temp%10;
                mul=(int)Math.pow(b,2);
                sum+=mul;
                temp=temp/10;
            }
            if(sum==1){
                return true;
            }
            else{
                return isHappy(sum);
            }
        }
    }
}
