package service;

import logic.JavaSort;
import logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) { // 생성자를 주입함. 그래서 List에 있는 생성자 코드가 필요없어짐.
        this.sort = sort;
        System.out.println("구현체 : " + sort.getClass().getName());
    }

    public List<String> doSrot(List<String> list) {
        return sort.sort(list);
    }
}
