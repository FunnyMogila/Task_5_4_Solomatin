package vsu.cs.soshich;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        // Заполнение дерева вручную (вставляем узлы в дерево):
        tree.insertNode(6);
        tree.insertNode(8);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(2);
        tree.insertNode(9);
        tree.insertNode(7);
        tree.insertNode(4);
        tree.insertNode(10);
        tree.insertNode(3);
        tree.insertNode(1);
        ArrayList<Integer> sums = new ArrayList<>();
        sums = tree.printSums();
        int max = 0;
        for (int i = 0; i < sums.size(); i++)
        {
            if (sums.get(i) > max)
            {
                max = sums.get(i);
            }
        }
        System.out.println("Максимальная сумма элементов уровня = " + max);
        // отображение дерева:
        tree.printTree();

    }
}
