//문제
//시골에 있는 태양이의 삼촌 댁에는 커다란 참외밭이 있다. 문득 태양이는 이 밭에서 자라는
// 참외가 도대체 몇 개나 되는지 궁금해졌다. 어떻게 알아낼 수 있는지 골똘히 생각하다가 드디어 좋은 아이디어가 떠올랐다.
// 유레카! 1m2의 넓이에 자라는 참외 개수를 헤아린 다음, 참외밭의 넓이를 구하면 비례식을 이용하여 참외의 총개수를 구할 수 있다.
//
//1m2의 넓이에 자라는 참외의 개수는 헤아렸고, 이제 참외밭의 넓이만 구하면 된다.
// 참외밭은 ㄱ-자 모양이거나 ㄱ-자를 90도, 180도, 270도 회전한 모양(┏, ┗, ┛ 모양)의 육각형이다.
// 다행히도 밭의 경계(육각형의 변)는 모두 동서 방향이거나 남북 방향이었다. 밭의 한 모퉁이에서 출발하여
// 밭의 둘레를 돌면서 밭경계 길이를 모두 측정하였다.
//
//
//
//예를 들어 참외밭이 위 그림과 같은 모양이라고 하자. 그림에서 오른쪽은 동쪽,
// 왼쪽은 서쪽, 아래쪽은 남쪽, 위쪽은 북쪽이다. 이 그림의 왼쪽위 꼭짓점에서 출발하여,
// 반시계방향으로 남쪽으로 30m, 동쪽으로 60m, 남쪽으로 20m, 동쪽으로 100m, 북쪽으로 50m,
// 서쪽으로 160m 이동하면 다시 출발점으로 되돌아가게 된다.
//
//위 그림의 참외밭  면적은 6800m2이다. 만약 1m2의 넓이에 자라는 참외의 개수가 7이라면,
// 이 밭에서 자라는 참외의 개수는 47600으로 계산된다.
//
//1m2의 넓이에 자라는 참외의 개수와, 참외밭을 이루는 육각형의 임의의 한 꼭짓점에서 출발하여
// 반시계방향으로 둘레를 돌면서 지나는 변의 방향과 길이가 순서대로 주어진다. 이 참외밭에서
// 자라는 참외의 수를 구하는 프로그램을 작성하시오.
//
//입력
//첫 번째 줄에 1m2의 넓이에 자라는 참외의 개수를 나타내는 양의 정수 K (1 ≤ K ≤ 20)가 주어진다.
// 참외밭을 나타내는 육각형의 임의의 한 꼭짓점에서 출발하여 반시계방향으로 둘레를 돌면서 지나는 변의
// 방향과 길이 (1 이상 500 이하의 정수) 가 둘째 줄부터 일곱 번째 줄까지 한 줄에 하나씩 순서대로 주어진다.
// 변의 방향에서 동쪽은 1, 서쪽은 2, 남쪽은 3, 북쪽은 4로 나타낸다.
//
//출력
//첫째 줄에 입력으로 주어진 밭에서 자라는 참외의 수를 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Q2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] DM = null;

        Map<Integer, Integer> direction = new HashMap<Integer, Integer>();

        int d; int m;
        int xCnt = 0, yCnt=0;
        int[] recordX = new int[3];
        int[] recordY = new int[3];
        int n = Integer.parseInt(br.readLine());

        for (int i=0;i<6;i++){
            DM = br.readLine().split(" ");
            d = Integer.parseInt(DM[0]);
            m = Integer.parseInt(DM[1]);

            switch (d){
                case 1:
                    recordX[xCnt] = -m;
                    xCnt++;
                    break;
                case 2:
                    recordX[xCnt] = m;
                    xCnt++;
                    break;
                case 3:
                    recordY[yCnt] = -m;
                    yCnt++;
                    break;
                case 4:
                    recordY[yCnt] = m;
                    yCnt++;
                    break;
            }
        }


    }
}
