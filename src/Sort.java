import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        String[] str = {"a","1","가","A","3","나"};

        for(String s : str){ // 정렬 전 출력
            System.out.println(s+" ");
        }
        System.out.println();

        Arrays.sort(str, Collections.reverseOrder()); //<-내림차순
        for(String s : str){
            System.out.println(s + " ");
        }
    }
}
