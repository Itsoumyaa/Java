public class Compressed {
    public static String compress(String s){
        int n=s.length();
        int count=1;
        StringBuilder com= new StringBuilder();
        for(int i=0;i<n;i++){
            if(i+1<n && s.charAt(i)==s.charAt(i+1)){
                count++;
            } else{
                com.append(s.charAt(i)).append(count);
                count=1;
            }
        } if(com.length()<n){
            return com.toString();
        } return s;
    }
    public static void main(String[] args) {
        String s="aaaabbbcccdd";
        System.out.println(compress(s));
    }
}
