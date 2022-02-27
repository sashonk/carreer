package ru.asocial.edu.career;

import org.junit.Assert;
import org.junit.Test;

public class Question6Test {
    @Test
    public void test1() {
        Question6 q = new Question6();
        String o = "aaacbbDDD";
        Assert.assertEquals("a3c1b2D3", q.compressed(o));
    }

    @Test
    public void test2() {
        Question6 q = new Question6();
        String o = "acbD";
        Assert.assertEquals("acbD", q.compressed(o));
    }
}
