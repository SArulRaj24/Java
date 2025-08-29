// Input: s = "cbaebabacd", p = "abc"
// Output: [0,6]
// Explanation:
// The substring with start index = 0 is "cba", which is an anagram of "abc".
// The substring with start index = 6 is "bac", which is an anagram of "abc".

// Input: s = "abab", p = "ab"
// Output: [0,1,2]
// Explanation:
// The substring with start index = 0 is "ab", which is an anagram of "ab".
// The substring with start index = 1 is "ba", which is an anagram of "ab".
// The substring with start index = 2 is "ab", which is an anagram of "ab".


package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class All_Anagram_in_String {
    public static void main(String[] args) {
        String s1="cbaebabacd";
        char[] ch1=s1.toCharArray();
        String s2="abc";
        char[] ch2=s2.toCharArray();
        List<Integer> ls=new ArrayList<>();
        
        int[] map1=new int[26];
        int[] map2=new int[26];

       for(int i=0;i<s2.length();i++){
        map2[ch2[i]-'a']++;
       }

       for(int i=0;i<s1.length();i++){
            map1[ch1[i]-'a']++;
            if(i>=s2.length()){
                map1[ch1[i-s2.length()]-'a']--;
            }

            if(Arrays.equals(map1, map2)){
                ls.add(i-s2.length()+1);
            }
       }

       System.out.println(ls);

    }

}