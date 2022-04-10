/**
 * @author NickSun
 * QQ502938688
 * @date 2022/4/10
 */

package extreme.fizzbuzz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FuzzBuzzTest {
    public String input;
    public String result;
    private String expected;


    @Test
    void The_original_number_should_be_returned_when_the_number_is_not_divided_by_3_5_7_and_does_not_contain_3_5_7(){
        FuzzBuzzController fbz = new FuzzBuzzController();


        input = "2";
        expected = "2";

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

}
