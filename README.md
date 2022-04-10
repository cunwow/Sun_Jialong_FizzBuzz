# TDD @FizzBuzz

## 开发环境
 - JDK11+
 
## 业务目标

### FizzBuzz
-1.让所有学生排成一队，然后按顺序报数。
-2.学生报数时，如果所报数字是3的倍数，那么不能说该数字，而要说Fizz;如果所报数字是5的倍数，那么要说Buzz;如果所报数字是第7的倍数，那么要说Whizz。
-3.学生报数时，如果所报数字同时是两个特殊数的倍数情况下，也要特殊处理，比如3和5的 倍数，那么不能说该数字，而是要说FizzBuzz, 以此类推。如果同时是三个特殊数的倍数， 那么要说FizzBuzzWhizz。
-4.学生报数时，如果所报数字包含了3，那么也不能说该数字，而是要说相应的单词，比如要 报13的同学应该说Fizz。
-5.如果数字中包含了3，那么忽略规则2和规则3，比如要报30的同学只报Fizz，不报FizzBuzz 。
-6.如果数字中包含了5，那么忽略规则4和规则5，并且忽略被3整除的判定，比如要报35的同学不报Fizz，报BuzzWhizz，其他case自己补齐。
-7.如果数字中包含了7，则忽略被5整除的判定，若同时还包含5，就忽略规则6中忽略被3整 除的判定，比如要报75的同学只报Fizz，其他case自己补齐。

## Tasking

| Task | Input | Output |
|:---|:---|:---|
| 1 | 15, 30, 45, 60, 75, 90 |  `"FizzBuzz"` |
| 2 | 3, 6, 12, 18, 21, 99 |  `"Fizz"` |
| 3 | 5, 10, 20, 85, 95, 100 |  `"Buzz"` |
| 4 | 1, 2, 4, 94, 97, 98 |  `"1"`, `"2"`, `"4"`, `"94"`, `"97"`, `"98"` |
| 5 | 0, 101 |  `IllegalArgumentException` |


## 编码路线
`master`分支一共有5个tag（`Task1`，`Task2`，`Task3`，`Task4`，`Task5`），它们分别对应5个Task。Clone下代码库之后，`checkout`到最开始的提交，一步一步往后面`checkout`即可查看所有步骤，`Task4`与`Task5`之间有1次Refactor的`commit`。


## 参考资料
- [JUnit 5用户指南](https://gitee.com/liushide/junit5_cn_doc/blob/master/junit5UserGuide_zh_cn.md#https://gitee.com/link?target=https%3A%2F%2Fgithub.com%2Fjunit-team%2Fjunit5-samples%2Ftree%2Fr5.0.2%2Fjunit5-gradle-consumer)
- [Gradle 用户指南](https://docs.gradle.org/current/userguide/userguide.html)