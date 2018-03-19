package MixedQuestions;
import java.util.*;

/**
 * Created by kunal on 3/19/18.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();

        int len = strs.length;
        if (len == 0) return res;
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < len; i++) {
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String s = new String(tempArray);
            if (map.containsKey(s)) {
                List<String> lst = map.get(s);
                lst.add(strs[i]);
                map.put(s, lst);
            } else {
                ArrayList<String> tmp = new ArrayList<>();
                tmp.add(strs[i]);
                map.put(s, tmp);
            }
        }

        for (List m : map.values()) {
            res.add(m);
        }

        return res;

    }

    public static void main(String[] args) {
        GroupAnagrams g = new GroupAnagrams();
        g.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
    }


}
