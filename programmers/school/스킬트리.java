/**
 * 
 * skill문자열 순서대로 skill_trees의 각각 원소들의 문자 순서가 되어있는지 체크하는 문제
 * 
 *  ** 현재 소스를 다른사람들 풀이와 비교해볼 것 **
 */

public class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String skilltree : skill_trees){
            answer += getSkillResult(skilltree, skill);
        }
        return answer;
    }
    
    private int getSkillResult(String skilltree, String skill){
        int result = 1;
        int check = skilltree.indexOf(skill.charAt(0));
        int tmp = 0;
        for(int i = 1 ; i < skill.length(); i++){
            tmp = skilltree.indexOf(skill.charAt(i));
            if( (check == -1 && tmp == -1) || (check > -1 && (tmp > check || tmp == -1) )){
                check = tmp;
                continue;
            }
            result = 0;
            break;
        }
        return result;
    }
}
