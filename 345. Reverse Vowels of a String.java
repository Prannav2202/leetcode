class Solution {
    public static int[] reverse(int[] pk) {
		int a=0;
		int[] rev=new int[pk.length];
		for(int i=pk.length-1;i>=0;i--) {
			rev[a]=pk[i]; //0=3 1=2 2=1 3=0
			a++;
		}
		return rev;
	}
    public String reverseVowels(String str) {
        int a=0;
		List<Integer> pk=new ArrayList<Integer>();
		char[] rev=str.toCharArray();
		int[] r=new int[str.length()];
		for(int i=0;i<str.length();i++){
            if(rev[i]=='A'||rev[i]=='a'||
            rev[i]=='E'||rev[i]=='e'||
            rev[i]=='I'||rev[i]=='i'||
            rev[i]=='O'||rev[i]=='o'||
            rev[i]=='U'||rev[i]=='u') {
            	pk.add(i);
            	r[a]=i;
            	a++;
            }
        }
//		pk.toArray();
		int[] org=new int[pk.size()];
		for(int i=0;i<pk.size();i++) {
			org[i]=pk.get(i);
		}
		int[] revv=reverse(org);
        char[] var=new char[revv.length];
        for(int i=0;i<var.length;i++){
            var[i]=rev[revv[i]];
        }
        for(int i=0;i<var.length;i++){
            System.out.print(var[i]+" ");
        }
        // for()
		for(int i=0;i<org.length;i++) {
			//1 2 5 7 7 5 2 1
			rev[org[i]]=var[i];
		}
        StringBuilder op=new StringBuilder();
        op.append(rev);
//		System.out.println(Arrays.toString(rev));
		return op.toString();
    }
}
