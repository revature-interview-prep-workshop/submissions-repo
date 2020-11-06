import org.example.objects.*;

public class Driver {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(1);
        binaryTree.insert(2);


        System.out.println(binaryTree.root.data);
        System.out.println(binaryTree.root.right.data);
        binaryTree.remove(1);
        System.out.println(binaryTree.root.data);
//        System.out.println(binaryTree.contains(2));
    }
}
