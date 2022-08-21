import java.util.Stack;

class 크레인인형뽑기 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        for(int move : moves){
            
            int codeMove = move - 1;
            int getVal = 0;
            
            // 크레인이 하나의 값을 뽑는다.
            for(int i = 0 ; i < board.length ; i++){

                if(board[i][codeMove] > 0){
                    getVal = board[i][codeMove];
                    board[i][codeMove] = 0;
                    break;
                }
            }
            
            // 바구니에 집어 넣는다.
            if(getVal != 0){
                // 동일한 인형이 있으면 사라진다.
                if(!st.isEmpty() && st.peek() == getVal){
                    st.pop();
                    answer++;
                }else{
                    st.push(getVal);
                }   
            }
        }
        
        // 위에서 계산한 사라진 값은 쌍의 개수이므로 마지막에 '* 2'를 해준다.
        return answer * 2;
    }
    
}
