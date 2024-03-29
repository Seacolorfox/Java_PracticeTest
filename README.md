# Java_PracticeTest

    【程序1】FindDaffodilNumber.java
　　题目：水仙花数是指一个 n 位数（n≥3 ），它的每个位上的数字的 n 次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153；1^4+6^4+3^4+4^4=1634）。要求编写程序，输入一个正整数n（3≤n≤7），按递增顺序输出所有n位水仙花数，每个数字占一行。
　　

   1.程序分析：利用for循环，分解出数的每一位。
　　
    
    【程序2】 TestRabbit.java
　　题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少?
　　
    
   1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....，即斐波那契数列。斐波那契数列（Fibonacci sequence），又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，故又称为“兔子数列”，指的是这样一个数列：1、1、2、3、5、8、13、21、34、……在数学上，斐波纳契数列以如下被以递归的方法定义：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=2，n∈N*）在现代物理、准晶体结构、化学等领域，斐波纳契数列都有直接的应用。
　　
    
    【程序3】 FindPrimeNumber.java
　　题目：判断101-200之间有多少个素数，并输出所有素数。
　　

   1.程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除，
　　则表明此数不是素数，反之是素数。素数被利用在密码学上，所谓的公钥就是将想要传递的信息在编码时加入素数，编码之后传送给收信人，任何人收到此信息后，若没有此收信人所拥有的密钥，则解密的过程中（实为寻找素数的过程），将会因为找素数的过程（分解质因数）过久，使即使取得信息也会无意义。
　　
    
    【程序4】FenJie.java
　　题目：将一个正整数分解质因数。例如：输入90,打印出90=2 * 3 * 3 * 5。
　　

   程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
　　(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
　　(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
　　(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
    
    【程序5】 TestAdd.java
　　题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。要求输入a的值和加数的个数n，例如：a=2，n=5，此时s=2+22+222+2222+22222，输入s的值。
　　
 
　　
    
    【程序6】 WanShu.java
   题目：一个数如果恰好等于它的因子之和，这个数就称为“完数”或“完全数”。例如6=1+2+3。编程找出1000以内的所有完数。
    
    
   
    【程序7】百鸡百钱问题
   题目：百钱买百鸡的问题算是一套非常经典的不定方程的问题，题目很简单：公鸡5文钱一只，母鸡3文钱一只，小鸡3只一文钱，用100文钱买一百只鸡,其中公鸡，母鸡，小鸡都必须要有，问公鸡，母鸡，小鸡要买多少只刚好凑足100文钱。试编程求解。
    
    【程序8】动物声音“模拟器”
   题目：设计一个动物声音“模拟器”，希望模拟器可以模拟许多动物的叫声，要求如下。
   编写接口Animal，该接口有两个抽象方法cry()和getAnimalName()，即要求实现该接口的各种具体的动物类给出自己的叫声和种类名称。
   编写模拟器类Simulator，该类有一个playSound(Animal animal)方法，该方法的参数是Animal类型，即参数animal可以调用实现Animal接口类重写的cry()方法播放具体动物的声音，调用重写的getAnimalName()方法显示动物种类的名称。
   编写实现Animal接口的Dog类和Cat类 定义一个动物抽象类Animal，该类有一个抽象方法cry()；定义一个小猫类Cat，该类继承了Animal类并实现了cry()方法，当调用cry()方法时打印“小猫喵喵叫”，定义一个小狗类Dog，该类也继承了Animal类并实现了cry()方法，当调用cry()方法时打印“小狗汪汪叫”，编写测试类输出实验结果。
    
    【程序9】多线程的应用
   题目：如下图所示，请利用多线程完成火车站窗口售票例程，要求不要出现一票多卖或者卖出负数票的情形出现。
    
   ![09_Pic](https://raw.githubusercontent.com/Seacolorfox/Java_PracticeTest/master/img-folder/09_Pic.png)

    【程序10】完成简单“记事本”应用程序的开发。
   要求：如下图所示，记事本具有新建、打开文本、保存更新、关闭等功能。
    
   ![10_Pic](https://raw.githubusercontent.com/Seacolorfox/Java_PracticeTest/master/img-folder/10_Pic.jpg)

