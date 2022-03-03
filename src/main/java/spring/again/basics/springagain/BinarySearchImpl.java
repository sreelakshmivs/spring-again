package spring.again.basics.springagain;

public class BinarySearchImpl {
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) { //Auto generated constructor, that takes SortAlgorithm as input
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int [] numbers, int numberToSearchFor){
        //BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
        //int[] sortedNumbers =  bubbleSortAlgorithm.sort(numbers);

        //QuickSortAlgorithm quickSortAlgorithm = new QuickSortAlgorithm();
        //int [] quicksortedNumbers = quickSortAlgorithm.sort(numbers);

        int [] sortedNumbers = sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 3;
    }
}
