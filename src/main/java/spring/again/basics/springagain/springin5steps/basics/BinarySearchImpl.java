package spring.again.basics.springagain.springin5steps.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Use PROTOTYPE to get two different beans when you call getbeans in the main program. By default the scope is SCOPE_SINGLETON
public class BinarySearchImpl {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm; // SortAlgorithm is a dependency for BinarySearchImpl

    /*public BinarySearchImpl(SortAlgorithm sortAlgorithm) { //Auto generate constructor, that takes SortAlgorithm as input
        super();                                          //We can also use setter instead of constructor.
        this.sortAlgorithm = sortAlgorithm;               //When the dependency is mandatory go for constructor, if the dependency is optional use setter.
    } */                                                    //But, with@Autowired you dont even need neither constructor nor setter.

    public int binarySearch(int [] numbers, int numberToSearchFor){ 
        //BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        //int[] sortedNumbers =  bubbleSortAlgorithm.sort(numbers);

        //QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
        //int [] quicksortedNumbers = quickSortAlgorithm.sort(numbers);

        int [] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }

    @PostConstruct   //This annotation along with the function is used to do certain things after the creation of the bean
    public void postConstruct(){
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("postConstruct");
    }
}
