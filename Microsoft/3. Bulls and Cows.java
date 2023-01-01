//One pass solution
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        
        int arr[] = new int[10];
        
        for(int i = 0; i < secret.length(); i++) {
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            
            if(s == g) {
                bulls++;
            } else {
                if(arr[s]++ < 0) cows++;
                if(arr[g]-- > 0) cows++;
            }
        }
        return bulls + "A" + cows + "B";
    }
}


//Two Pass Solution
// class Solution {
//     public String getHint(String secret, String guess) {
             
//         int bulls = 0;
//         int cows = 0;
//         HashMap<Character, Integer> map = new HashMap<>();
        
//         for(int i = 0; i < secret.length(); i++) {
//             if(secret.charAt(i) != guess.charAt(i))
//                 map.put(secret.charAt(i), map.getOrDefault(secret.charAt(i), 0) + 1);
//             else
//                 bulls++;
//         }
      
//         for(int i = 0; i < guess.length(); i++) {
//             if(secret.charAt(i) != guess.charAt(i)) {
//                 if(map.containsKey(guess.charAt(i))) {
//                     cows++;
//                     map.put(guess.charAt(i), map.get(guess.charAt(i)) - 1);
//                     if(map.get(guess.charAt(i)) == 0) map.remove(guess.charAt(i));
//                 } 
//             }
//         }
        
//         String res = bulls + "A" + cows + "B";
//         return res;
//     }
// }