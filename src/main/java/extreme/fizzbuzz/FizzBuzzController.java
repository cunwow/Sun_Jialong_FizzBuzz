/**
 * @author NickSun
 * QQ502938688
 * @date 2022/4/10
 */

package extreme.fizzbuzz;

public class FizzBuzzController {


    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String say(String input) {

        int num = Integer.parseInt(input);

        if (isDividedBy3and5(num)){
            return FIZZ+BUZZ;
        }

        if (isDividedBy3(num)){
            return FIZZ;
        }

        if (isDividedBy5(num)){
            return BUZZ;
        }

        if (isDividedBy7(num)){
            return WHIZZ;
        }



        return input;
    }

    private boolean isDividedBy3and5(int num) {
        return isDividedBy3(num)&&isDividedBy5(num);
    }

    private boolean isDividedBy7(int num) {
        return num % 7 == 0;
    }

    private boolean isDividedBy5(int num) {
        return num % 5 == 0;
    }

    private boolean isDividedBy3(int num) {
        return num % 3 == 0;
    }


}
