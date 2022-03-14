package spring.again.basics.springagain.springin5steps.testfile;

public class MyMath {
    public int sum(int[] numbers){
        int sum = 0;
        for (int i:numbers){
            sum += i;
        }
        return sum;
    }
}
