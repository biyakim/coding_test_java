class array2 {
    public int[] array2(int[] numbers) {
        int[] answer = new int[numbers.length];

        for(int i=0;i<numbers.length;i++){
            answer[i] = numbers[i]*2;
        }

        return answer;
    }
}