public class IsUnique {
    public static boolean isUnique(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    return false;
                }
            }
        } return true;
    }
    public static void main(String[] args) {
        String s= "soumya";
        System.out.println(isUnique(s));
    }
}
