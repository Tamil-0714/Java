public class Main {
    public static void main(String[] args) {
        Tree t = new Tree( 1)        ;
        t.insert(10);
        t.insert(5);
        t.insert(4);
        t.insert(20);
        t.insert(50);
        t.insert(12);
        System.out.println();
        t.inOrderTraversal();
        System.out.println();
        t.testLvl();    
        System.out.println();
        
    }
    /* 
 
          30
        /   \
       /     \
      10      40
      / \     / \
     5  20   38  50
                        
         30                            40                      
        /   \                         /   \      
       /     \                       /     \      
      20      40                    10      50          
      /      / \                    / \    /          
     5     38  50                  5  20  38              
                        
         38                     
        /   \
       /     \
      10      40
      / \       \
     5  20       50

     

    Tree t1 = new Tree(30);
        t1.insert(10);
        t1.insert(20);
        t1.insert(40);
        t1.insert(50);
        t1.insert(5);
        t1.insert(38);
        t1.levelOrderTraversal();
        t1.deleteNode(30);
        System.out.println();
        t1.levelOrderTraversal();

     */
}



/* 


    10,20,30,40,50
    ta tree : 1 4 5 10 12 20 50 
    ta tree height : 3

    tb tree : 1 4 5 10 12 20 50 
    tb tree height : 2

    tx tree : 1 2 4 6 8 10 
    tx tree height : 5

    ty tree : 1 2 4 6 8 10 
    ty tree height : 2

            Tree ta = new Tree(1);
        ta.insert(10);
        ta.insert(5);
        ta.insert(4);
        ta.insert(20);
        ta.insert(50);
        ta.insert(12);
        System.out.print("ta lvl : ");
        ta.levelOrderTraversal();
        // System.out.print("ta tree : ");
        // ta.display();
        // System.out.println("\nta tree height : " + ta.getHeight());

        // System.out.println();
        // --------------------------------------------------

        Tree tb = new Tree(10);
        tb.insert(4);
        tb.insert(1);
        tb.insert(5);
        tb.insert(20);
        tb.insert(12);
        tb.insert(50);
        // System.out.print("tb tree : ");
        // tb.display();
        // System.out.println("\ntb tree height : " + tb.getHeight());

        // System.out.println();
        // --------------------------------------------------

        Tree tx = new Tree(10);
        tx.insert(8);
        tx.insert(6);
        tx.insert(4);
        tx.insert(2);
        tx.insert(1);
        // System.out.print("tx tree : ");
        // tx.display();
        // System.out.println("\ntx tree height : " + tx.getHeight());

        // System.out.println();
        // --------------------------------------------------

        Tree ty = new Tree(6);
        ty.insert(10);
        ty.insert(8);
        ty.insert(2);
        ty.insert(4);
        ty.insert(1);
        // System.out.print("ty tree : ");
        // ty.display();
        // System.out.println("\nty tree height : " + ty.getHeight());

        // System.out.println();
        // --------------------------------------------------

        // System.out.print("ta tree : ");
        // ta.displayX();
        // System.out.println();
        // System.out.print("tb tree : ");
        // tb.displayX();
        // System.out.println();
        // System.out.print("tx tree : ");
        // tx.displayX();
        // System.out.println();
        // System.out.print("ty tree : ");
        // ty.displayX();

 */




/*
 * 
 * 
 * 
 * Tree t1 = new Tree(5);
 * t1.insert(2);
 * t1.insert(12);
 * t1.insert(1);
 * t1.insert(3);
 * t1.insert(10);
 * t1.insert(77);
 * // t1.display();
 * System.out.println();
 * // t1.levelOrderTraversal();
 * System.out.println(t1.getHeight());
 */