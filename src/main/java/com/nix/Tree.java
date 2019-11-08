package com.nix;

public class Tree {

    public int findMaxDepth(TreeNode rootNode) {
        return goDeep(rootNode, 0);
    }

    private int goDeep(TreeNode node, int beforeNodes) {
        if (node != null) {
            beforeNodes++;
            return Math.max(goDeep(node.left, beforeNodes), goDeep(node.right, beforeNodes));
        } else {
            return beforeNodes;
        }
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
