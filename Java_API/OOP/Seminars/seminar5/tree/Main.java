package tree;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode (
            'D',
            new TreeNode ('B',
                new TreeNode ('A', null, null),
                new TreeNode ('C', null, null)),
            new TreeNode ('E', null, null));
        root.print ();
    }
}
