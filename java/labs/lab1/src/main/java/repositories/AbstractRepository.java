package repositories;
import sorters.BubbleSorter;
import sorters.Sorter;
import java.lang.reflect.Array;
import java.util.Arrays;

public abstract class AbstractRepository<T> implements Repository<T> {
    private int numberOfElements = 0;
    private T[] repo;

    /**
     * Constructor
     * @param elementType type of elements to store in repo
     * @param initialLength initial length of repo
     */
    public AbstractRepository(Class<T> elementType, int initialLength) {
        T[] tempRepo = (T[]) Array.newInstance(elementType, initialLength);
        this.repo = tempRepo;
    }

    /**
     * Constructor with initial length = 16
     * @param elementType type of elements to store in repo
     */
    public AbstractRepository(Class<T> elementType) {
        this(elementType, 16);
    }

    public void add(T element) {
        if (this.numberOfElements == this.repo.length)
            this.expand();
        this.repo[numberOfElements] = element;
        this.numberOfElements += 1;
    }

    public void delete(int index) {
        if (index < this.repo.length) {
            System.arraycopy(this.repo, index + 1, this.repo, index, this.repo.length - 1 - index);
            this.repo[this.repo.length - 1] = null;
            this.numberOfElements--;
        }
        else {
            System.out.println("index is outside of repository length"); // TODO: use logger
        }
    }

    public T get(int index) {
        if (index < this.repo.length) {
            return (T) this.repo[index];
            // return this.repo[index]; // TODO: try this line
        } else {
            System.out.println("This index bigger than repository capacity");
            return null;
        }
    }

    /** // TODO: move to actual classes and del from here
     * uses comparators
     */
    // public void sort() {
    //     Sorter<T> bubbleSorter = new BubbleSorter<T>(); // TODO: read from application.properties
    //
    //     // sorter
    //     // comparator
    // }


    /** // TODO: move to actual classes and del from here
     * uses checkers
     */
    // public void search() {
    //
    // }

    private void expand() {
        this.repo = Arrays.copyOf(this.repo, this.repo.length * 2);
    }

}
