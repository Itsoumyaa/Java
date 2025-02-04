import java.util.ArrayList;

public class Subsequence {
//    static ArrayList<String> getSSQ(String s){
//        ArrayList<String> ans=new ArrayList<>();
//        if(s.length()==0){
//            ans.add("");
//            return ans;
//        }
//        char curr = s.charAt(0);
//        ArrayList<String> smallAns= getSSQ(s.substring(1));
//        for(String ss: smallAns){
//            ans.add(ss);
//            ans.add(curr+ss);
//        } return ans;
//    }
    static void printSSQ(String s, String currAns){ // s="abc" and currAns=""
        if(s.length()==0){
            System.out.println(currAns);
            return;
        }
        char curr=s.charAt(0);
        String remaining=s.substring(1);
        printSSQ(remaining,currAns+curr); // add curr to currAns . currently currAns is " " so if we choose to add a to it then it becomes "a" and remaing is "bc"
        printSSQ(remaining,currAns); // do not add curr to currAns. if we don't choose to add a then currAns remains empty
    }
    public static void main(String[] args) {
//        ArrayList<String> ans= getSSQ("abc");
//        for(String ss: ans){
//            System.out.println(ss);
//        }
        printSSQ("abc","");
    }
}
