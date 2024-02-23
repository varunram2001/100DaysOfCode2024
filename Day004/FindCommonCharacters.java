class Solution {
    public List<String> commonChars(String[] words) {
        List<String> common_chars= new ArrayList<>();
        int[] min_frequency = new int[26];
        Arrays.fill(min_frequency,Integer.MAX_VALUE);

        for(String current_string: words)
        {
            int [] char_frequency = new int[26]; 

            for(char c: current_string.toCharArray())
            {
                   char_frequency[c-'a']++;
            }
            for(int i=0;i<26;i++)
            {
                min_frequency[i]=Math.min(min_frequency[i],char_frequency[i]);
            }
        }
      for(int i=0;i<26;i++)
      {
          while(min_frequency[i]>0)
          {
              common_chars.add(""+(char)(i+'a'));
              min_frequency[i]--;
          }
      }
      return common_chars;
    }
}