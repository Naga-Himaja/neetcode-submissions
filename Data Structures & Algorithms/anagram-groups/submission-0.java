class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();

        for(String str: strs) {
            String sortedStr = sortString(str);
            // System.out.println(sortedStr);
            if(map.containsKey(sortedStr)) {
                map.get(sortedStr).add(str);
            } else {
                map.put(sortedStr, new ArrayList<String>());
                map.get(sortedStr).add(str);
            }
            // System.out.println(map.get(sortedStr));
        }

        List<List<String>> ans = new ArrayList<List<String>>();
        for(List<String> ls:map.values()) {
            ans.add(ls);
        }
        return ans;
    }

    private String sortString(String str) {
        char ch[] = str.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
