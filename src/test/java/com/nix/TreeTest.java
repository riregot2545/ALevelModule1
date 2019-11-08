package com.nix;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeTest {

    Tree tree = new Tree();

    @Test
    public void findMaxDepthNormal() {
        Tree.TreeNode rootNode = new Tree.TreeNode(1);
        Tree.TreeNode left1Node = new Tree.TreeNode(2);
        Tree.TreeNode left11Node = new Tree.TreeNode(3);
        Tree.TreeNode left12Node = new Tree.TreeNode(4);
        Tree.TreeNode right1Node = new Tree.TreeNode(5);
        Tree.TreeNode right11Node = new Tree.TreeNode(6);
        Tree.TreeNode right12Node = new Tree.TreeNode(7);
        Tree.TreeNode right121Node = new Tree.TreeNode(8);

        left1Node.left = left11Node;
        left1Node.right = left12Node;

        right1Node.left = right11Node;
        right1Node.right = right12Node;

        right12Node.left = right121Node;

        rootNode.left = left1Node;
        rootNode.right = right1Node;

        assertEquals(4, tree.findMaxDepth(rootNode));

    }

    @Test
    public void findMaxDepthOfEmpty() {
        Tree.TreeNode rootNode = new Tree.TreeNode(1);
        assertEquals(1, tree.findMaxDepth(rootNode));

    }

    @Test
    public void findMaxDepthOfNull() {
        Tree.TreeNode rootNode = null;
        assertEquals(0, tree.findMaxDepth(rootNode));

    }
}