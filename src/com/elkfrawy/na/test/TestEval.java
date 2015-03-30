package com.elkfrawy.na.test;

import com.elkfrawy.na.util.Utility;
import org.junit.Test;

/**
 * Created by Ayman on 3/30/2015.
 */
public class TestEval {

    @Test
    public void testAdd() {
        assert Utility.eval("15+35") == 50;
        assert Utility.eval("35+15+0") == 50;
        assert Utility.eval("35+15+10") == 60;
    }

    @Test
    public void testSub() {
        assert Utility.eval("35-15") == 20;
        assert Utility.eval("35-15-0") == 20;
        assert Utility.eval("30-40") == -10;
        assert Utility.eval("-30-40") == -70;
    }

    @Test
    public void testAddSub() {
        assert Utility.eval("35+15-10") == 40;
        assert Utility.eval("35-15+10") == 30;
        assert Utility.eval("-30+40") == 10;
        assert Utility.eval("-30+40-15") == -5;
    }

    @Test
    public void testMult() {
        assert Utility.eval("4*6") == 24;
        assert Utility.eval("4*6*10") == 240;
        assert Utility.eval("4*6*0") == 0;
    }

    @Test
    public void testDivid() {
        assert Utility.eval("8/2") == 4;
        assert Utility.eval("8/2/2") == 2;
        assert Utility.eval("8/8") == 1;
        assert Utility.eval("0/8") == 0;
        assert Utility.eval("1/2") == 0.5;
    }

    @Test
    public void testMultDivid() {
        assert Utility.eval("8*2/2") == 8;
        assert Utility.eval("8/2*2") == 8;
    }

    @Test
    public void testAll() {
        assert Utility.eval("6*5-10/2+8*3/6+5/2") == 31.5;
    }

}
