public class BinaryTree {
    Node root;

    public  BinaryTree(){
        this.root=null;
    }

    public void insert(int value){
        root = insertRec(root, value);

        System.out.println(value);
    }

    private Node insertRec(Node root, int value){
        if (root==null){
            return  new Node(value);
        }

        if (value< root.value){
            root.left = insertRec(root.left, value);
        } else {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    public void inorder(){
        inorderRec(root);
        System.out.println();

    }


    public void inorderRec(Node root){
        if (root !=null){

            inorderRec(root.left);
            System.out.println(root.value + " ");
            inorderRec(root.right);

        }
    }

}
