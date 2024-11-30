package alexander.sergeev.leetcode.tasks;

// 389. Find the Difference
public class a389 {

    /*
    String t is generated by random shuffling string s and then add one more letter at a random position.
    Return the letter that was added to t.
     */

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "aa";
        System.out.println(findTheDifference(s1,s2));
    }

    // BEATS 100%
    public static char findTheDifference(String s, String t) {
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            if (--arr[ch - 'a'] < 0) return ch;
        }
        return ' ';
    }
}