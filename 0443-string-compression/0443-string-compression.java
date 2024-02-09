// class Solution {
//     public int compress(char[] chars) {
//      String str=new String(chars);
     
//         int n=str.length();
//         int cnt=1;
//         int singh=0;
//         String ans=""+str.charAt(0);
        
//         for(int i=1;i<n;i++)
//         {
//             char curr=str.charAt(i);
//             char prev=str.charAt(i-1);
//             if(curr==prev) cnt++;
//             else{
//                 if(cnt>1)
//                 {
//                     ans+=cnt;
//                     cnt=1;
//                     ans+=curr;
//                 }
//             }
    
//         }
//                 if(cnt>1)
//               {
//                   ans+=cnt;
//               }
//     }
// }


// class Solution {
//     public int compress(char[] chars) { 
//  int indAns = 0, ind = 0;
//         while(ind < chars.length){
//             char currChar = chars[ind];
//             int count = 0;
//             while(ind < chars.length && chars[ind] == currChar){
//                 ind++;
//                 count++;
//             }
//             chars[indAns++] = currChar;
//             if(count != 1)
//                 for(char c : Integer.toString(count).toCharArray()) 
//                     chars[indAns++] = c;
//         }
//         return indAns;
//     }
// }



class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        
        int i=1;
        int count=1;
        sb.append(chars[0]);
        
        while(i<chars.length)
        {
            if(chars[i] == chars[i-1])
            {
                count++;
            }
            else{
                if(count>1)
                {
                    sb.append(count);
                }
                sb.append(chars[i]);
                count =1;
            }
        
                i++;
        }
         
    
    if(count>1)
    {
        sb.append(count);
    }
   for(int j=0;j<sb.length();j++)
       chars[j]=sb.charAt(j);
       
        return sb.length();
    }
}

