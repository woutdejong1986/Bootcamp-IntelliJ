package examples;

import org.testng.annotations.Test;

public class CallEnumExample {

    @Test
    public void printBootcampDays(){
        System.out.println(EnumExample.checkBootcampDaysInfo(EnumExample.BootCampDays.DAYFOUR));
    }
}
