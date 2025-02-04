public class ReverseStringUsingRecursion {
    static String reverse(String s,int idx){
        if(idx==s.length()){
            return "";
        }
        String smallAns=reverse(s,idx+1);
        return smallAns + s.charAt(idx);
    }
    static boolean isPalindrome(String s, int idx){
        String rev=reverse(s,idx);
        if(rev.equals(s)){
            return true;
        } else{
            return false;
        }
    }
    static boolean palin(String s, int l, int r){
        if(l>=r){
            return true;
        }
        return (s.charAt(l)==s.charAt(r) && palin(s,l+1,r-1));

    }

    public static void main(String[] args) {
        String s="aba";
        int r=s.length()-1;
        System.out.println("reverse is: "+ reverse(s,0));
        System.out.println(palin(s,0,r));
    }
}
