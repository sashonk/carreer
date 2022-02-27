package ru.asocial.edu.career;

import org.junit.Assert;
import org.junit.Test;

public class Question5Test {

    @Test
    public void test1() {
        Question5 q = new Question5();
        String src = "pale";
        String test = "ple";
        Assert.assertTrue(q.isSingleModification(src, test));
    }

    @Test
    public void test2() {
        Question5 q = new Question5();
        String src = "pales";
        String test = "pale";
        Assert.assertTrue(q.isSingleModification(src, test));
    }

    @Test
    public void test3() {
        Question5 q = new Question5();
        String src = "pale";
        String test = "bale";
        Assert.assertTrue(q.isSingleModification(src, test));
    }

    @Test
    public void test4() {
        Question5 q = new Question5();
        String src = "pale";
        String test = "bake";
        Assert.assertFalse(q.isSingleModification(src, test));
    }

    @Test
    public void test5() {
        Question5 q = new Question5();
        String src = "";
        String test = "a";
        Assert.assertTrue(q.isSingleModification(src, test));
    }

    @Test
    public void test6() {
        Question5 q = new Question5();
        String src = "b";
        String test = "";
        Assert.assertTrue(q.isSingleModification(src, test));
    }

    @Test
    public void test7() {
        Question5 q = new Question5();
        String src = "";
        String test = "";
        Assert.assertTrue(q.isSingleModification(src, test));
    }

    @Test
    public void test8() {
        Question5 q = new Question5();
        String src = "spale";
        String test = "pale";
        Assert.assertTrue(q.isSingleModification(src, test));
    }
}
