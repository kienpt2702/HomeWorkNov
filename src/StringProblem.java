import java.util.HashMap;
import java.util.Stack;

public class StringProblem {
    public boolean checkPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        s = s.toLowerCase();
        while(start <= end){
            if(s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
    public boolean checkPalindromeUsingStack(String s){
        // abcba
        Stack<Character> stack = new Stack<>();
        for(int i=0; i < s.length()/2; i++){
            stack.push(s.charAt(i));

        }
        return true;
    }

    public boolean checkAnagrams(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        fillMap(map1,s1);
        fillMap(map2,s2);
        for(char c: map1.keySet()){
            if(!map1.get(c).equals(map2.get(c))) return false;
        }
        return true;
    }
    private void fillMap(HashMap<Character, Integer> map, String s){
        Integer count = null;
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            count = map.get(c);
            if(count != null) map.put(c, count+1);
            else map.put(c,1);
        }
    }
    public String reverseStringNormal(String s){
        String[] words  = s.split("\\s+");
        StringBuilder ans = new StringBuilder();
        for(int i= words.length-1; i >= 0; i--){
            if(i > 0) ans.append(words[i] += " ");
            else ans.append(words[i]);
        }
        System.out.println(ans);
        return ans.toString();
    }
    // leetcode test
    public String reverseString(String s){
        String word = "";
        if(s.length() == 1) return s;
        if(s.charAt(0) != ' ') word += s.charAt(0);
        Stack<String> words = new Stack<>();
        for (int i= 1; i< s.length(); i++){
            if(s.charAt(i) == ' '){
                if(s.charAt(i-1) != ' ') {
                    words.push(word);
                    word = "";
                }
            }
            else {
                word += s.charAt(i);
                if(i == s.length()-1) words.push(word);
            }
        }
        StringBuilder ans = new StringBuilder();
        while (!words.isEmpty()) {
            if(words.size() >1) ans.append(words.pop() + " ");
            else ans.append(words.pop());
        }
        System.out.println(ans);
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(new String1().checkPalindrome("abba"));
        new String1().checkAnagrams("AABCCDDEEFF", "AABCCDDEEFF");
        new String1().reverseStringNormal("a sky is blue");
    }
}
