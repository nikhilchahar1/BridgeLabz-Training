import java.util.*;

class HNode {
    HNode left;
    HNode right;
    int data;
    
    HNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class HeightOfBinaryTree {

	public static int height(HNode root) {
        if(root==null) return -1;
        int leftSubTree=height(root.left);
        int rightSubTree=height(root.right);
        return 1+Math.max(leftSubTree,rightSubTree);
    }

	public static HNode insert(HNode root, int data) {
        if(root == null) {
            return new HNode(data);
        } else {
            HNode cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        HNode root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }	
}