/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import Data.Node;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static <T> void main(String[] args) {
        System.out.println(new App().getGreeting());

        BineryTree tree = new BineryTree();
        tree.setRoot(new Node<T>(2));
        tree.getRoot().setLeft(new Node<T>(7));
        tree.getRoot().setRight(new Node<T>(5));
        tree.getRoot().getLeft().setRight(new Node<T>(6));
        tree.getRoot().getLeft().getRight().setLeft( new Node<T>(1));
        tree.getRoot().getLeft().getRight().setRight(new Node<T>(11));
        tree.getRoot().getRight().setRight(new Node<T>(9));
        tree.getRoot().getRight().getRight().setLeft(new Node<T>(4));


        System.out.println("Maximum element is "+ tree.breadthFirst(tree));

//        BinerySearchTree binerySearchTree= new BinerySearchTree();
//
//        binerySearchTree.add(2);
//        binerySearchTree.add(3);
//        binerySearchTree.add(4);
//        binerySearchTree.add(5);
//        System.out.println("contains !!"+ binerySearchTree.contains(10));
//
//        BineryTree bineryTree= new BineryTree();
//
//        bineryTree.setRoot(new Node(1));
//        bineryTree.getRoot().setLeft(new Node(2));
//        bineryTree.getRoot().setRight(new Node(3));
//        bineryTree.getRoot().getLeft().setLeft(new Node(4));
//        bineryTree.getRoot().getLeft().setRight(new Node(5));
//        bineryTree.inOrder(bineryTree.getRoot());

//        System.out.println(duckDuckGoose(Arrays.asList("A", "B", "C", "D", "E"), 3));

    }
//    public static String duckDuckGoose(List<String> ducklist, int k) {
//        System.out.println(ducklist);
//        int count = ducklist.size();
//        int current = 0;
//        while (count > 1) {
//            for (int i = 0; i < k; i++) {
//                if ((ducklist.get(current).equals("_"))) {
//                    i--;
//                }
//                else if (!(ducklist.get(current).equals("_")) && ((i == k - 1))) {
//                    ducklist.set(current, "_");
//                    count--;
//                }
//                current++;
//                if (current == ducklist.size()) {
//                    current = 0;
//                }
//            }
//            System.out.println(ducklist);
//        }
//        return "";
//    }
}
