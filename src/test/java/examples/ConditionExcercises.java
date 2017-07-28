package examples;

import org.testng.annotations.Test;

/**
 * Created by Selenium on 20-7-2017.
 */
public class ConditionExcercises {

    public void bootcampAgeChecker(int age) {

        if (age > 21 && age < 65) {
            System.out.println("Deelnemer toegelaten");
        }
        else if(age >= 65) {
            System.out.println("Te oud, praat met manager");
        }
        else {
            System.out.println("Te jong");
        }
    }

    @Test
    public void testMember() {
        bootcampAgeChecker(12);
        bootcampAgeChecker(21);
        bootcampAgeChecker(64);
        bootcampAgeChecker(65);
    }
}
