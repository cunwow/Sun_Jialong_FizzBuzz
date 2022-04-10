/**
 * @author NickSun
 * QQ502938688
 * @date 2022/4/10
 */

package extreme.fizzbuzz;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";
    public static final String FIZZ_BUZZ_WHIZZ = "FizzBuzzWhizz";
    public static final String FIZZ_BUZZ = "FizzBuzz";
    public static final String WHIZZ = "Whizz";
    public static final String BUZZ_WHIZZ = "BuzzWhizz";


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
        expected = FIZZ;

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void The_Buzz_should_be_returned_when_the_number_is_Divided_by_5(){
        FizzBuzzController fbz = new FizzBuzzController();

        //5 25 35 55 105
        input = "35";
        expected = BUZZ;

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }


    @Test
    void The_Whizz_should_be_returned_when_the_number_is_Divided_by_7(){
        FizzBuzzController fbz = new FizzBuzzController();

        //7 28 49
        input = "49";
        expected = WHIZZ;

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void The_FizzBuzz_should_be_returned_when_the_number_is_Divided_by_3_and_5(){
        FizzBuzzController fbz = new FizzBuzzController();

        //15 30 45
        input = "45";
        expected = FIZZ_BUZZ;

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void The_FizzBuzzWhizz_should_be_returned_when_the_number_is_Divided_by_3_and_5_and_7(){
        FizzBuzzController fbz = new FizzBuzzController();

        //105  210  840  945
        input = "945";
        expected = FIZZ_BUZZ_WHIZZ;

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void The_Fizz_should_be_returned_when_the_number_is_contain_by_3(){
        FizzBuzzController fbz = new FizzBuzzController();

        //13 23 113 11113
        input = "23";
        expected = FIZZ;

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void The_Buzz_should_be_returned_when_the_number_is_contain_by_5(){
        FizzBuzzController fbz = new FizzBuzzController();

        //51 252 151 11511
        input = "11511";
        expected = BUZZ;

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void The_Whizz_should_be_returned_when_the_number_is_contain_by_7(){
        FizzBuzzController fbz = new FizzBuzzController();

        //17 27 117 11117
        input = "11117";
        expected = WHIZZ;

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    @Test
    void The_Fizz_should_be_returned_when_the_number_is_contain_by_3_NO_FIZZBUZZ(){
        FizzBuzzController fbz = new FizzBuzzController();

        //30 35 330
        input = "30";
        expected = FIZZ;

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    //35 BuzzWhizz
    @Test
    void The_BuzzWhizz_should_be_returned_when_the_number_is_35(){
        FizzBuzzController fbz = new FizzBuzzController();

        //"35 150"
        input = "35";
        expected = BUZZ_WHIZZ;

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    //35 BuzzWhizz
    @Test
    void The_Fizz_should_be_returned_when_the_number_is_75(){
        FizzBuzzController fbz = new FizzBuzzController();

        //"75"
        input = "75";
        expected = FIZZ;

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }
    //157, "157",
    @Test
    void say_157_print_157(){
        FizzBuzzController fbz = new FizzBuzzController();

        //"75"
        input = "157";
        expected = "157";

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    //57, "Fizz",
    @Test
    void say_57_print_Fizz(){
        FizzBuzzController fbz = new FizzBuzzController();

        //"75"
        input = "57";
        expected = "Fizz";

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

    //275, "275",
    @Test
    void say_275_print_275(){
        FizzBuzzController fbz = new FizzBuzzController();

        input = "275";
        expected = "275";

        result = fbz.say(input);

        Assertions.assertEquals(expected,result);
    }

//574, "Whizz",
@Test
    void say_574_print_Whizz(){
    FizzBuzzController fbz = new FizzBuzzController();

    input = "275";
    expected = "275";

    result = fbz.say(input);

    Assertions.assertEquals(expected,result);
}

//75, "Fizz",
//567, "FizzWhizz",
//175, "Whizz",
//1575, "FizzWhizz",
//1357, "1357",
//537, "Fizz",
//1375, "1375",
//3157, "Whizz",
//375, "Fizz",
//357, "FizzWhizz",
//3745, "Whizz",
//735, "FizzWhizz"


}
