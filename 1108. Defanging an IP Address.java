class Solution {
    public String defangIPaddr(String address) {
        StringBuilder a=new StringBuilder();
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(ch=='.'){
                a.append("[.]");
            }
            else{
                a.append(ch);
            }
        }
        return a.toString();
    }
} 

//another solution for this code

class Solution {
    public String defangIPaddr(String address) {
        address=address.replace(".", "[.]");
        return address;
    }
}
