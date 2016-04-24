package eu.corstjens.java7;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by koencorstjens on 24/04/16.
 */
public class NummericLiterals {

    //Numeric literals can include underscores

    @Test
    public void test() {
        int y =10000;
        int x =1_0000;
        Assert.assertEquals(x,y);

    }
}
