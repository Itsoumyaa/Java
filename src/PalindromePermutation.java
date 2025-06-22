public class PalindromePermutation {
    public static boolean palin(String s){
        int[] freq= new int[26]; // a-z=26 (size)
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') { // Ignore spaces and non-alphabetic characters
                freq[c - 'a']++;
            }
        }
        int oddCount=0; // NAMAN so here the size is 5 i.e. odd and if u notice then odd sized palindrome words will have n/2 duplicates
                        // so here 5/2=2 approx and there are 2 duplicates and there will always be 1 letter with no duplicate, so we created odd count.
        for(int count: freq){
            if(count%2!=0){
                oddCount++;
            } if(oddCount>1){
                return false;
            }
        } return true;
    }
    public static void main(String[] args) {
        String s="taco cat";
        if(palin(s)){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
}
