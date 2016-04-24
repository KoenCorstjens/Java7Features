package eu.corstjens.java7;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by koencorstjens on 24/04/16.
 */
public class SwitchExamples {
    //In the JDK 7 release, you can use a String object in the expression of a switch statement:

    @Test
    public void testSwitchDayISWeekend(){
        Assert.assertTrue(dayIsWeekend("sat"));
        Assert.assertFalse(dayIsWeekend("mon"));
    }

    private Boolean dayIsWeekend(String day){
        switch (day){

            case "sat":case "sun": return true;

            default: return false;

        }
    }


}
