package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return list ->{
            List<Integer> result = new ArrayList<>();
            for (Integer i : list){
                int x = i/divider;
                result.add(x);
            }
            return result;
        };
    }
}
