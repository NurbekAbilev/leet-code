class Solution {
    public String intToRoman(int num) {
        String[] roman = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int[] digits= { 1,  4,   5,  9,   10, 40,  50, 90, 100, 400,500,900,1000};
        StringBuilder res = new StringBuilder("");
        while(num>0){
            for(int i=digits.length-1;i>=0;i--){
                if(digits[i]<=num){
                    num-=digits[i];
                    res.append(roman[i]);
                    break;
                }
            }
        }
        return res.toString();
    }
}
