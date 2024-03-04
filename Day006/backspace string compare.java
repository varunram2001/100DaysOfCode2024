class Solution {
    public boolean backspaceCompare(String s, String t) {
        int hash=0;
        String s1="",t1="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)!='#' && hash==0)
            {
                s1=s.charAt(i)+s1;
            }
            else if(s.charAt(i)=='#')
            {
                hash++;
            }
            else if(s.charAt(i)!='#' && hash!=0)
            {
                hash--;
            }
        }
        hash=0;
        for(int i=t.length()-1;i>=0;i--)
        {
            if(t.charAt(i)!='#' && hash==0)
            {
                t1=t.charAt(i)+t1;
            }
            else if(t.charAt(i)=='#')
            {
                hash++;
            }
            else if(t.charAt(i)!='#' && hash!=0)
            {
                hash--;
            }
        }
        if(s1.equals(t1))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}