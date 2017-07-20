package examples;

import org.testng.annotations.Test;

/**
 * Created by Selenium on 19-7-2017.
 */
public class AboutMethods {

    @Test
    public void printProduct(){

        System.out.println(multiply(5, 6));

    }

    private int multiply(int var1, int var2){

        return var1 * var2;

    }
}
