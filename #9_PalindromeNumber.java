class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while(x>0){
            arr.add(x%10);
            x/=10;
        }
        for(int i=0;i<arr.size()/2;i++){
            if(arr.get(i)!=arr.get(arr.size()-1-i)){
                return false;
            }
        }
        
        return true;
    }
}
