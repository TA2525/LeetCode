class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> convert = new HashMap<>();
        
        convert.put("I", 1);
        convert.put("V", 5);
        convert.put("X", 10);
        convert.put("L", 50);
        convert.put("C", 100);
        convert.put("D", 500);
        convert.put("M", 1000);
        
        int prev = 9999;
        int output = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int rn = convert.get(String.valueOf(s.charAt(i)));
            output += rn;
            
            if (prev < rn) {
                output -= 2*prev;
            }
            
            prev = rn;
        }
        
        return output;
    }
}