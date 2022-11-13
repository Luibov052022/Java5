import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class trees {

  public static void main(String[] args) {
    List<Integer> root = new ArrayList<Integer>();
    root.add(1);
    List<Integer> n1 = new ArrayList<Integer>();
    n1.add(2);
    n1.add(3);
    n1.add(4);
    List<Integer> n2 = new ArrayList<Integer>();
    n2.add(5);
    n2.add(6);
    n2.add(7);
    List<Integer> n3 = new ArrayList<Integer>();
    n3.add(8);
    n3.add(9);
    n3.add(10);
    List<Integer> n4 = new ArrayList<Integer>();
    n4.add(11);
    n4.add(12);
    n4.add(13);
    List<Integer> n5 = new ArrayList<Integer>();
    n5.add(14);
    n5.add(15);
    n5.add(16);
    Map<Integer, List<Integer>> tree = new HashMap<>();
    tree.put(root.get(0), n1);
    tree.put(n1.get(0), n2);
    tree.put(n1.get(1), n3);
    tree.put(n3.get(0), n4);
    tree.put(n3.get(1), n5);
    String temp = "";
    for (Integer key : tree.keySet()) {
      System.out.println(key + temp + tree.get(key) + '\n');
      temp = temp + " ";
    }

    System.out.println(Collections.singletonList(tree));
  }
}
