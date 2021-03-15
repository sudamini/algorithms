import apple.laf.JRSUIUtils;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

public class BinaryTreeFromString {

    //Definition for a binary tree node.
    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

    public static void main( String args[] ) {
        String s = "4(2(3)(1))(6(5))";
        System.out.println(str2tree(s));

    }
    public static TreeNode str2tree(String s) {
        if( s.length() == 0 || s.isEmpty() ) {
            return null;
        }
        // s = "4(2(3)(1))(6(5))"
        int rootBegin = 0;
        int rootEnd = 1;
        while( rootEnd < s.length() && Character.isDigit(s.charAt(rootEnd ))) {
            ++rootEnd;
        }
        TreeNode root = new TreeNode( Integer.valueOf( s.substring(rootBegin, rootEnd ) ));
        int leftBegin = rootEnd + 1;
        int leftEnd = leftBegin;

        if( leftEnd < s.length() ) {
            int openBraceCount = 1;
            int closeBraceCount = 0;
            while( openBraceCount != closeBraceCount ) {
                if( s.charAt(leftEnd) == '(') {
                    ++openBraceCount;
                }
                if( s.charAt(leftEnd) == ')') {
                    ++closeBraceCount;
                }
                leftEnd++;
            }
            root.left = str2tree(s.substring(leftBegin, leftEnd - 1));
            if( leftEnd < s.length() ) {
                root.right = str2tree(s.substring( leftEnd + 1, s.length() -1 ));
            }
        }
        return root;
    }
}
