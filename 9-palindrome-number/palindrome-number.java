class Solution {
    public boolean isPalindrome(int x) 
    {
        if(x<0 || (x%10==0 && x!=0))
        {
            return false;
        }
        int reversedhalf=0;
        while(x>reversedhalf)
        {
            int lastdigit=x%10;
            reversedhalf=reversedhalf*10+lastdigit; // naye number mein digit chipkane k liye
            x=x/10; //original number se digit hatane k liye
            
        }
        if(reversedhalf==x  || reversedhalf/10==x)
        {
               return true;
        }

        return false;
    }
}