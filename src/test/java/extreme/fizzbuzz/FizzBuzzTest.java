/**
 * @author NickSun
 * QQ502938688
 * @date 2022/4/10
 */

package extreme.fizzbuzz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    public String input;
    public String result;
    private String expected;


    @Test
    void The_original_number_should_be_returned_when_the_number_is_not_divided_by_3_5_7_and_does_not_contain_3_5_7(){
        FizzBuzzController fbz = new FizzBuzzController();


        input = "2";
        expected = "2";

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void The_Fizz_should_be_returned_when_the_number_is_Divided_by_3(){
        FizzBuzzController fbz = new FizzBuzzController();


        input = "99";
        expected = "Fizz";

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void The_Fizz_should_be_returned_when_the_number_is_Divided_by_5(){
        FizzBuzzController fbz = new FizzBuzzController();

        //5 25 35 55 105
        input = "35";
        expected = "Buzz";

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }


}
