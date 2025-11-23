import java.util.*;

class Solution {
    public String largestMultipleOfThree(int[] digits) {

        Arrays.sort(digits);
        
        int sum = 0;
        for(int n : digits)
        sum += n;
        int rem = sum%3;

        List<Integer> mod1 = new ArrayList<>();
        List<Integer> mod2 = new ArrayList<>();

        for(int n : digits){
            if(n%3 == 1)
            mod1.add(n);
            else if(n%3 == 2)
            mod2.add(n);    
        }

        if(rem == 1){
            if(!(mod1.isEmpty()))
            removeDigits(digits,mod1.get(0));
            else if(mod2.size() >= 2){
                removeDigits(digits,mod2.get(0));
                removeDigits(digits,mod2.get(1));
            }
            else return "";
        }

        if(rem == 2){
            if(!mod2.isEmpty())
            removeDigits(digits,mod2.get(0));
            else if(mod1.size() >= 2){
                removeDigits(digits,mod1.get(0));
                removeDigits(digits,mod1.get(1));
            }
            else return "";
        }

        StringBuilder sb = new StringBuilder();
        for(int n : digits)
            if(n != -1)
            sb.append(n);

            if(sb.length() ==0)
            return "";

            sb.reverse();

            if(sb.charAt(0) == '0')
            return "0";
        
        return sb.toString();
    }

        private void removeDigits(int[]arr , int val){
            for(int i =0; i<arr.length; i++){
                if(arr[i] == val){
                    arr[i]=-1;
                    return;
                
            }
        }

    }
}