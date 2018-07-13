class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if(x==0) return 0;
        if(x<0){ neg = true; x = -x; }
        ArrayList<Integer> arr = new ArrayList<>();
        while(x>0){
            arr.add(x%10);
            x/=10;
        }
        int res = 0;
        for(int i=arr.size()-1;i>=0;i--){
            res += arr.get(i) * java.lang.Math.pow(10,arr.size()-1-i);
        }
        
        System.out.println(Integer.MIN_VALUE);
        
        res = neg?-res:res;
        if(res==Integer.MAX_VALUE) return 0;
        if(res==Integer.MIN_VALUE+1) return 0;
        return res;
    }
}
