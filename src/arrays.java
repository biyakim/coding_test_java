import java.util.Arrays;

public class arrays {

    //binarySearch -> 선정렬 해야함
    public static void main(String[] args) {
        int[] arr = {3,2,0,1,4};
        String[] name = {"과일","음식","간식","오늘","아침"};
        int idx = Arrays.binarySearch(arr,2);


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int idx2 = Arrays.binarySearch(arr,2);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
    }
}
