public class RemoveOccurences {
    static String remove(String str,char c){
        if(str.length()==0){
            return "";
        }
        String smallAns=remove(str.substring(1),c);
        if(str.charAt(0)!=c){
            return str.charAt(0)+smallAns;
        }
        return smallAns;
    }

    public static void main(String[] args) {
        String s="abbaba";
        char c='a';
        System.out.println(remove(s,c));
    }
}
