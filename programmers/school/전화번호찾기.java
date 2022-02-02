/**
 * 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인
 * 
 * 현재버전 : 정확성 테스트 완료
 *          효율성 테스트 2개 실패
 * 
 * 두번째 버전 : 정확성, 효율성 통과
 *          Arrays.sort()를 통해 앞이 비슷한 부분끼리 정렬 후 for문을 한번만 사용하여 문제를 푼게 포인트였다.
 *          indexOf 대신 startsWith를 사용해도 된다.
 */
import java.util.Arrays;

public class 전화번호찾기 {

    // public boolean solution(String[] phone_book) {
    //     for(int i = 0 ; i < phone_book.length ; i++){
    //         for(int j = 0 ; j < phone_book.length ; j++){
    //             if(i == j){
    //                 continue;
    //             }
    //             if(phone_book[j].indexOf(phone_book[i]) == 0){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);

       for(int i = 0 ; i < phone_book.length-1 ; i++){
           if(phone_book[i+1].indexOf(phone_book[i]) == 0){
               return false;
           }
       }
       return true;
   }
    
}
