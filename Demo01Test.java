package Demo01;

import java.util.Scanner;

public class Demo01Test {
    /*
    以下那个数据结构是适用于”数据必须以i相反的顺序存储然后检索“
    A.stack   B.Queue   C.List   D.Link List
    static  栈，先进后出
    Queue   队列， 先进先出
    List    集合，存储的顺序和取的顺序一致
    Link List 是List的子类，寸的顺序和取得顺序一致

    */
/*
1 .判断一个数是不是回文数

对于数字的末位，直接取余就可以了，对于数字的首位，我们可以这么算。
首先用一个变量记录数字的最高位，
比如 1232112321，可以标记 help 为 1000010000，
第一个末位为 11，第一个首位为 12321/10000=1，
接下来我们需要计算 232232 是否为回文，怎么计算呢？
我们需要去掉首位和末位。
可以采用 x % help / 10 的方式
12321%10000==2321 可以将最高位去掉，然后 2321/10==232 可以将最低为去掉。
最后不要忘记将 help/100。

 */
//public static void main(String[] args) {
//   Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//   boolean palindrome = isPalindrome(n);
//   if(palindrome == true){
//       System.out.println("是回文数");
//   }else{
//       System.out.println("不是");
//   }
//}
//    public static boolean isPalindrome(int x) {
//        if (x < 0) {
//            return false;
//        }
//        int help = 1;
//        int tmp = x;//121这里将数字help提高到和x一样的数量级  比如x==12321   help==1000；
//        while (tmp >= 10) {
//            help *= 10;//10
//            tmp /= 10;//12
//        }
//        while (x != 0) {
//            if (x % 10 != x / help) {//1     1    x的首位和末位进行比较是否相等
//                return false;
//            }
//            x = x % help / 10;//去掉首位和末尾  12321 % help剩余2321  2321 / 10剩余232
//            help /= 100;//help降级
//        }
//        return true;
//    }
//public static void main(String[] args) {
//    System.out.println("请输入一个整数");
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    boolean ret = isPalindrome(n);
//    if(ret == true){
//        System.out.println("是回文数");
//    }
//    else{
//        System.out.println("不是回文数");
//    }
//
//}
//public static boolean isPalindrome(int x){
//    if(x<0){
//        return false;
//    }
//    int help = 1;
//    int tmp = x;
//    while(tmp>=10){
//         help *= 10;
//         tmp/=10;
//    }
//    while(x!=0){
//        if(x % 10 != x / help){
//            return false;
//        }
//        x = x % help /10;
//        help /=100;
//    }
//    return true;
//}
    /* 1.青蛙跳台阶问题——变相的斐波那契函数（递归实现）*/
//public static void main(String[] args) {
//    System.out.println("请输入台阶数");
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    System.out.println("青蛙有"+jumpFlor(n)+"种跳法");
//}
//
//    public static int jumpFlor(int x){
//        if(x==1){
//            return 1;
//        }
//        if(x==2){
//            return 2;
//        }
//        return jumpFlor(x-1) + jumpFlor(x-2);
//    }
/*java中只有byte和boolen是一个字节，char是两个字节所以Java来说127不会超出范围输出328.但是在C语言中char是一个字符，127+1会发生溢出
按照计算-128  200-128=72*/
//    public static void main(String[] args) {
//    char chr = 127;
//    int sum = 200;
//    chr +=1;
//    sum +=chr;
//        System.out.println(sum);
//    }
//
/*给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
输入: 123         输入: -123    输入: 120
输出: 321         输出: -321    输出: 21
假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(intReversal(n));
    }
    public static int intReversal(int x){
        int res =0;
        if(x==0){
            return 0;
        }
//        if(x<-231||x>230){
//            return 0;
//        }
        else{
            while(x!=0){
                int t = x % 10;
                int newRes = res * 10 + t;
                if ((newRes - t) / 10 != res)
                    return 0;
                res = newRes;
                x = x / 10;
            }
            return res;
        }
    }

}
