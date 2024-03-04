class Solution {
    public boolean backspaceCompare(String s, String t) {
        return analyze(s).equals(analyze(t)) ;
        
    }

    private String analyze(String s) {
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(cur != '#') {
                res.append(cur);
            } else {
                if (res.length() > 0){
                    res.deleteCharAt(res.length()-1);
                }
                
            }
        }

        return res.toString();

    }
}