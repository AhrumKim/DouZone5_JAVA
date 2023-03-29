import java.util.Scanner;

class Solution {
    static int AnswerN;
    static int N = 10; // 초기값으로 10을 지정하고, 입력받은 N으로 덮어씌우기 위해

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int test_case = 1; test_case <= T; test_case++) {
            AnswerN = 0; // 각 테스트 케이스마다 AnswerN 초기화
            
            N = sc.nextInt(); // 바둑판 크기 N 입력 받기
            String[][] Badook = new String[N][N];
            
            for(int i = 0 ; i < N ; i++) {
                for(int j = 0 ; j < N ; j++) {
                    Badook[i][j] = sc.next();
                }
            }
            
            
            
            
            
            
            
            
            for(int i = 0 ; i < N ; i++) {
                for(int j = 0 ; j < N ; j++) {
                    if(Badook[i][j].equals("X")) { // X 포인 경우
                        for(int k = i+1 ; k < N ; k++) { // 아래쪽 방향 검사
                            if(Badook[k][j].equals("L")) {
                                continue; // 빈칸인 경우 건너뜀
                            } else if(Badook[k][j].equals("Y")) {
                                break; // 다른 포인 경우
                            } else { // H인 경우
                                AnswerN++; // 알 먹음
                                break;
                            }
                        }
                        for(int k = i-1 ; k >= 0 ; k--) { // 위쪽 방향 검사
                            if(Badook[k][j].equals("L")) {
                                continue; // 빈칸인 경우 건너뜀
                            } else if(Badook[k][j].equals("Y")) {
                                break; // 다른 포인 경우
                            } else { // H인 경우
                                AnswerN++; // 알 먹음
                                break;
                            }
                        }
                        for(int k = j+1 ; k < N ; k++) { // 오른쪽 방향 검사
                            if(Badook[i][k].equals("L")) {
                                continue; // 빈칸인 경우 건너뜀
                            } else if(Badook[i][k].equals("Y")) {
                                break; // 다른 포인 경우
                            } else { // H인 경우
                                AnswerN++; // 알 먹음
                                break;
                            }
                        }
                        for(int k = j-1 ; k >= 0 ; k--) { // 왼쪽 방향 검사
                            if(Badook[i][k].equals("L")) {
                                continue; // 빈칸인 경우 건너뜀
                            } else if(Badook[i][k].equals("Y")) {
                                break; // 다른 포인 경우
                            } else { // H인 경우
                                AnswerN++; // 알 먹음
                                break;
                            }
                        }
                    }
                }
            }
            System.out.println("#" + test_case + " " + AnswerN);
        }
    }
}