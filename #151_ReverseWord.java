public class Solution {
    public String reverseWords(String s) {
          java.util.Scanner sc = new Scanner(s);
        ArrayList<String> words = new ArrayList<>();
        boolean d = false;
        while(sc.hasNext()){
            words.add(sc.next());
            d = true;
        }
        String sent = "";
        for(int i=words.size()-1;i>=0;i--){
            sent+=words.get(i)+" ";
        }
        if(d)
        return sent.substring(0,sent.length()-1);
        else return "";
        
    } 
}
