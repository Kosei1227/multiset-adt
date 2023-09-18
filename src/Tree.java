import java.util.ArrayList;
import java.util.List;


public class Tree<T> {

    // The item stored at this tree's root, or null if the tree is empty.
    private T root;

    // The list of all subtrees of this tree.
    private List<Tree<T>> subtrees;

    /**
     * Initialize a new Tree with the given root value and subtrees.
     * If root is null, the tree is empty.
     * Precondition: if root is null, then subtrees is empty or null.
     *
     * @param root the root value
     * @param subtrees the list of subtrees, can be null
     */
    public Tree(T root, List<Tree<T>> subtrees) {
        this.root = root;
        if (subtrees == null || root == null) {
            this.subtrees = new ArrayList<>();
        } else {
            this.subtrees = new ArrayList<>(subtrees);
        }
    }
}

