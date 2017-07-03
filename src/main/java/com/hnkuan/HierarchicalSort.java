package com.hnkuan;

import com.hnkuan.model.Page;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HierarchicalSort {

  public static void main(String[] args) {

    Page root = new Page("root", 350, "");
    Page b = new Page("b", 250, root.getComparisonKey());
    Page b1 = new Page("b.1", 1, b.getComparisonKey());
    Page b3 = new Page("b.3", 99, b.getComparisonKey());
    Page b2 = new Page("b.2", 150, b.getComparisonKey());

    Page b31 = new Page("b.31", 49, b3.getComparisonKey());
    Page b32 = new Page("b.32", 50, b3.getComparisonKey());

    Page a = new Page("a", 100, root.getComparisonKey());
    Page a2 = new Page("a.2", 20, a.getComparisonKey());
    Page a1 = new Page("a.1", 80, a.getComparisonKey());

    List<Page> pages = Arrays.asList(root, a, a1, a2, b, b1, b2, b3, b31, b32);
    System.out.println(pages);

    Collections.shuffle(pages);
    System.out.println(pages);

    pages.sort(Comparator.comparing(Page::getComparisonKey));
    System.out.println(pages);
  }
}

