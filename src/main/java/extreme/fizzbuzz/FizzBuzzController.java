/**
 * @author NickSun
 * QQ502938688
 * @date 2022/4/10
 */

package extreme.fizzbuzz;

public class FizzBuzzController {


    public static final String FIZZ = "Fizz";

    public String say(String input) {

        int num = Integer.parseInt(input);

        if (isaBoolean(num)){
            return FIZZ;
        }


        return input;
    }

    private boolean isaBoolean(int num) {
        return num % 3 == 0;
    }
}
