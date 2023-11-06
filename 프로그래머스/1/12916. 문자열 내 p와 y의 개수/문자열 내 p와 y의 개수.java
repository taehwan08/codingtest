class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        char[] ca = s.toCharArray();
        
        for(int i = 0; i < ca.length ; i++){
            if(ca[i] == 'p' || ca[i] == 'P'){
                p++;
            }else if(ca[i] == 'y' || ca[i] == 'Y'){
                y++;
            }
        }
        if(p!=y){
            return false;
        }
        return true;
    }
}