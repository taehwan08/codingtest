class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        // n번째 이용한다면 원래 이용료의 n배 받기로 함..
        //     그럼 for i < count 까지 돌면서 합 합 합..
        //         money - 최종합 = -@면 return 해당값;
        // 아니면 0
        
        long total = 0;
        for(int i=1; i<=count; i++){
            total += (long)price * i;
        }
        if(money-total >= 0){
            return 0;
        }else {
            return total-money;
        }
    }
}