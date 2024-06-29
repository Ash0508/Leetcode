class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
//      int l=nums.length();   
//         for(int i=0;i<l;i++)
//         {
            
//         }
        
//          vector<vector<int>> res;
      
//       // size of the array nums
//       int total = nums.size(); 
      
//       // sort the numbers
//       sort(nums.begin(), nums.end());
      
//       // fix the first number of the triplet
//       for (int firstNumIdx = 0; firstNumIdx < total; ++firstNumIdx) {
//         int firstNum = nums[firstNumIdx];
//         // find pairs with sum = -firstNum in the right
//         int start = firstNumIdx + 1;
//         int end = total - 1;
//         while (start < end) {
//           // consider the current pair sum
//           int current = nums[start] + nums[end];
//           if (current < -firstNum) {
//             // shift the start pointer to the right
//             ++start;
//           } else if (current > -firstNum) {
//             // shift the end pointer to the left
//             --end;
//           } else {
//             // add to the result
//             res.push_back({firstNum, nums[start], nums[end]});
//             int oldStart = start;
//             int oldEnd = end;
//             // shift the start till it matches the old value
//             while (start < end && nums[start] == nums[oldStart]) {
//               ++start;
//             }
//             // shift the end till it matches the old value
//             while (end > start && nums[end] == nums[oldEnd]) {
//               --end;
//             }
//             // the above two while loops ensure that both start/end
//             // get shifted atleast once
//           }
//           // avoid duplicates
//           while (firstNumIdx + 1 < total 
//                  && nums[firstNumIdx + 1] == nums[firstNumIdx]) {
//             ++firstNumIdx;
//           }
//         }
//       }
      
//       return res;
        
        
         if (nums.length < 3)
      return new ArrayList<>();

    List<List<Integer>> ans = new ArrayList<>();

    Arrays.sort(nums);

    for (int i = 0; i + 2 < nums.length; ++i) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;
      // Choose nums[i] as the first num in the triplet,
      // and search the remaining nums in [i + 1, n - 1]
      int l = i + 1;
      int r = nums.length - 1;
      while (l < r) {
        final int sum = nums[i] + nums[l] + nums[r];
        if (sum == 0) {
          ans.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
          while (l < r && nums[l] == nums[l - 1])
            ++l;
          while (l < r && nums[r] == nums[r + 1])
            --r;
        } else if (sum < 0) {
          ++l;
        } else {
          --r;
        }
      }
    }

    return ans;

        
        
        
    }
}