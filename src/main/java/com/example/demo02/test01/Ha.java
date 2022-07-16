package com.example.demo02.test01;

import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
@Data
public class Ha {
    private  List<String> list;


    @Test
    public void test_(){
        Ha ha = new Ha();
        List<String> list1 = ha.getList();
        list1 = new ArrayList<>();
        list1.add("hah");
        System.out.println(list1);
    }
}
