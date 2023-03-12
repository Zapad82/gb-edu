package tree;

class TreeNode {
    private char data;
    private TreeNode left;  // null
    private TreeNode right;  // null

    public TreeNode(char data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void print () {
        System.out.println(data);
        if (left != null)
            left.print ();
        if (right != null)
            right.print ();
    }
}
