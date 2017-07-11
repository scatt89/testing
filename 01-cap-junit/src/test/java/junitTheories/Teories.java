package junitTheories;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class Teories {

    @DataPoint
    public static String rosa = "Rosa";
    @DataPoint
    public static String mike = "Mike";

    @DataPoints
    public static char[] chars = new char[]{'A','B','C'};

    @Theory
    public void dataPointTest(String firstName, String lastName){
        System.out.println(firstName + lastName);
    }

    @Theory
    public void dataPointsTest(char a, char b){
        System.out.println(a + " " + b);
    }

}
