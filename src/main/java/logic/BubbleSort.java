package logic;

import java.util.ArrayList;
import java.util.List;

// 명세 -
// 여러가지 자료를 정렬할 수 있으면 좋겠다. 정렬할 수 있는 타입은 서로 비교 가능해야한다.
// 이를 위해서 Generic type을 사용, 그리고 비교를 위해 존재하는 인터페이스를 사용 Comparable
public class BubbleSort <T extends Comparable<T>> implements Sort<T>{

    @Override
    public List<T> sort(List<T> list) { // 입력리스트를 받아서 출력으로 정렬된 리스트를 내보내준다. 라는 느낌이다.

        List<T> output = new ArrayList<>(list);

        // bubble sort logic
        for(int i = output.size() - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j, output.get(j + 1));
                    output.set(j + 1, temp);
                }
            }
        }
        return output;
    }
}
