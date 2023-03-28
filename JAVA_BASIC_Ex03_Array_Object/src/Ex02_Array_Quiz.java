public class Ex02_Array_Quiz {

    public static void main(String[] args) {
        // 국문과 학생들의 기말고사 시험점수입니다
        int[] score = new int[] {79,88,97,54,56,95};
        int max = score[0];
        int min = score[0];
        int[] numbers = new int[10];// 10개이 방의 값을 1~10 까지로 최기화하고 출력
        int sum =0;
        float avg = 0f;
        int[] jumsu = {100,55,90,60,78};
       
        // 어느 학새의 기말고사 시험점수 (5과목)

        for (int i = 1; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
            }

            if (score[i] < min) {
                min = score[i];
            }
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        
        for (int i2 = 1; i2 < numbers.length; i2++) {
        	System.out.printf("[%d]=%d\n",i2, numbers[i2]);
            }
        
        for(int i3=1; i3<jumsu.length; i3++) {

        	sum+=jumsu[i3];
        	if(i3==jumsu.length -1) {
        	avg= sum / (float)jumsu.length;       	
        }
        System.out.printf("총과목의 수: %d\n", jumsu.length );
    	System.out.printf("과목의 합: [%d]\n",sum);
    	System.out.printf("과목의 평균: [%f]\n",avg);
    }
}
}
