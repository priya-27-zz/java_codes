package com.example.priya.logic;
class Node{
    int key;
    Node left, right;
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
public class DfsTree {

    Node root;
    DfsTree()
    {
        root= null;

    }




    void printInorder(Node node)
    {
        if(node == null)
            return;

        printInorder(node.left);
        System.out.println(node.key+" ");
        printInorder(node.right);


    }
    void printPreorder(Node node)
    {
        if(node == null)
            return;

        System.out.println(node.key+" ");
        printPreorder(node.left);
        printPreorder(node.right);


    }
    void printPostorder(Node node)
    {
        if(node == null)
            return;

        printPostorder(node.left);
        printPostorder(node.right);
        System.out.println(node.key+" ");


    }


    public static void main(String[] args) {
        DfsTree dfsTree = new DfsTree();
        dfsTree.root =  new Node(1);
        dfsTree.root.left = new Node(2);
        dfsTree.root.right = new Node(3);
        dfsTree.root.left.left = new Node(4);
        dfsTree.root.left.right = new Node(5);

        System.out.println("Inorder Traversal ");;
        dfsTree.printInorder(dfsTree.root);


        System.out.println("Preorder Traversal ");;
        dfsTree.printPreorder(dfsTree.root);



        System.out.println("Postorder Traversal ");;
        dfsTree.printPostorder(dfsTree.root);

    }
}
