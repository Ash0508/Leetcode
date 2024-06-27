class Solution {
    public int findDuplicate(int[] n) {
        int slow=n[0];
        int fast=n[0];

        while(true)
        {
            slow=n[slow];
            fast=n[n[fast]];

            if(slow==fast){
                break;
            }
        }

            int slow2=n[0];

            while(slow!=slow2)
            {
                slow=n[slow];
                slow2=n[slow2];
            }
                return slow;
       
    }
}