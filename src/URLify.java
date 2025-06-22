public class URLify {
    public static void urlify(String s){
        StringBuilder sb= new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==' '){
                sb.append("%20");
            } else{
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String s= "my name is soumya";
        urlify(s);
    }
}
