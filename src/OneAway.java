public class OneAway {
    public static boolean isOneAway(String s1, String s2){
        int l1= s1.length();
        int l2= s2.length();
        if(Math.abs(l1-l2)>1){
            return false;
        }
        if(l1==l2){
            return oneReplace(s1,s2);
        }
        if(l1+1==l2){
            return oneInsert(s1,s2);
        }
        if(l1-1==l2){
            return oneInsert(s2,s1);
        } return false;
    }
    private static  boolean oneReplace(String s1, String s2){
        boolean diff= false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(diff){
                    return false;
                }diff = true;
            }
        } return true;
    }
    private static boolean oneInsert(String s1, String s2){
        int i=0,j=0;
        boolean diff=false;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)!=s2.charAt(j)){
                if(diff){
                    return false;
                }diff = true;
                j++;
            }
            else{
                i++;
                j++;
            }
        }return true;
    }
    public static void main(String[] args) {
        System.out.println(isOneAway("pale", "ple"));  // true (remove 'a')
        System.out.println(isOneAway("pales", "pale")); // true (remove 's')
        System.out.println(isOneAway("pale", "bale"));  // true (replace 'p' with 'b')
        System.out.println(isOneAway("pale", "bake"));  // false (2 edits: 'p'→'b', 'l'→'k')
    }
}
