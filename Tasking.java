/**
 * @author NickSun
 * QQ502938688
 * @date 2022/4/9
 */

public class Tasking {

    /**
     * 你是一名体育老师，在某次课距离下课还有五分钟时，你决定搞一个游戏。此时有N名学生在上 课。游戏的规则是:
     * 1.让所有学生排成一队，然后按顺序报数。
     * 2.学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz;如果所报数字是5的倍数，那么要说Buzz;如果所报数字是第7的倍数，那么要说Whizz。
     * 3.学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的 倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数， 那么要说FizzBuzzWhizz。
     * 4.学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要 报13的同学应该说Fizz。
     * 5.如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz 。
     * 6.如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz，其他case自己补齐。
     * 7.如果数字中包含了7，则忽略被5整除的判定，若同时还包含5，就忽略规则6中忽略被3整 除的判定，比如要报75的同学只报Fizz，其他case自己补齐。
     *
     *
     *  Tasking List
     *
     * - Given 需要打印的数字是2（不是3或者5或者7的倍数），When 打印，Then 打印`"2"`
     * - test result: input 2  output 2  pass
     *
     * - Given 需要打印的数字是6（3的倍数），When 打印，Then 打印`"Fizz"`
     * - test result: input 3, 6, 12, 18, 21, 99   output Fizz  pass
     *
     * - Given 需要打印的数字是10（5的倍数），When 打印，Then 打印`"Buzz"`
     * - test result: input 5, 25, 35, 55, 105   output Buzz  pass
     *
     * - Given 需要打印的数字是7（7的倍数），When 打印，Then 打印`"Whizz"`
     * - Given 需要打印的数字是15（同时是3和5的倍数），When 打印，Then 打印`"FizzBuzz"`
     * - Given 需要打印的数字是105（同时是3和5和7的倍数），When 打印，Then 打印`"FizzBuzzWhizz"`
     *
     *
     *
     *
     */



}
