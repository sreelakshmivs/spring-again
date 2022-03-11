package spring.again.basics.springagain.springin5steps.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary //Best option to resolve multiple candidates of autowiring, second option is to use names of the algorithm in the main file where we create the instance of the dependency.
@Qualifier("bubble") //Third option is to use qualifier
public class BubbleSortAlgorithm implements SortAlgorithm{
    public int[] sort(int [] numbers){
        //logic of bubble sort
        return numbers;
    }
}
