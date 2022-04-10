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
    public static final String THREE = "3";
    private static final CharSequence FIVE = "5";
    private static final CharSequence SEVEN = "7";

    public String say(String input) {

        int num = Integer.parseInt(input);
        //规则7
        if (isContainBy7(input)){
            //是否包含5 逻辑一样.
//            if (isContainBy5(input)){
//                if (isDividedBy3and7(num)) {
//                    return FIZZ + WHIZZ;
//                }
//                else if (isDividedBy3(num)) {
//                    return FIZZ;
//                }
//                else if (isDividedBy7(num)) {
//                    return WHIZZ;
//                }
//            }
            //忽略被5整除的判定
            //规则3
            if (isDividedBy3and7(num)) {
                return FIZZ + WHIZZ;
            }
            //规则3 end
            //规则2
            if (isDividedBy3(num)) {
                return FIZZ;
            }

            if (isDividedBy7(num)) {
                return WHIZZ;
            }
        }
        //规则7 end


        //规则6
        if (isContainBy5(input)) {

            if (isDividedBy5(num) && isDividedBy7(num)) {
                return BUZZ + WHIZZ;
            }
            else if (isDividedBy5(num)) {
                return BUZZ;
            }
            else if (isDividedBy7(num)) {
                return WHIZZ;
            }

        }
        //规则6 end

        //规则4 and 5
        if (isContainBy3(input)) {
            return FIZZ;
        }
        //规则4 and 5 end


        //规则3
        if (isDividedBy3and5and7(num)) {
            return FIZZ + BUZZ + WHIZZ;
        }

        if (isDividedBy3and5(num)) {
            return FIZZ + BUZZ;
        }
        if (isDividedBy5and7(num)) {
            return BUZZ + WHIZZ;
        }

        if (isDividedBy3and7(num)) {
            return FIZZ + WHIZZ;
        }

        //规则3 end

        //规则2
        if (isDividedBy3(num)) {
            return FIZZ;
        }

        if (isDividedBy5(num)) {
            return BUZZ;
        }

        if (isDividedBy7(num)) {
            return WHIZZ;
        }
        //规则2 end

        //规则1
        return input;
        //规则1 end
    }

    private boolean isDividedBy3and7(int num) {
        return isDividedBy3(num) && isDividedBy7(num);
    }

    private boolean isDividedBy5and7(int num) {
        return isDividedBy5(num) && isDividedBy7(num);
    }

    private boolean isContainBy7(String num) {
        return num.contains(SEVEN);
    }

    private boolean isContainBy5(String num) {
        return num.contains(FIVE);
    }

    private boolean isContainBy3(String num) {
        return num.contains(THREE);
    }

    private boolean isDividedBy3and5and7(int num) {
        return isDividedBy3(num) && isDividedBy5(num) && isDividedBy7(num);
    }

    private boolean isDividedBy3and5(int num) {
        return isDividedBy3(num) && isDividedBy5(num);
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
