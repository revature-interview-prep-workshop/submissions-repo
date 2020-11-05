class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree<Integer> bt = new BinaryTree<Integer>();
        bt.insertNode(5);
        bt.insertNode(7);
        System.out.println(bt.contains(6));
        bt.insertNode(6);
        System.out.println(bt.contains(6));
        bt.removeNode(6);
        System.out.println(bt.contains(6));
        bt.insertNode(7);
        bt.insertNode(9);
        bt.insertNode(1);
        bt.insertNode(2);
        System.out.println(bt.contains(1));
    }
}