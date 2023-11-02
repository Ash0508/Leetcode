class Solution {
public:
   int removeDuplicates(vector<int>& nums) {
    int ans=1,prev=nums[0],maxc=1,slow=1;
    for(int i=1;i<nums.size();i++){
        if(nums[i]==prev){maxc++;}
        else{maxc=1;}
        if(maxc<3){
            ans++;
            nums[slow++]=nums[i];
        }
        prev=nums[i];
    }
    return ans;
}
};