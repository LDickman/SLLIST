import bridges.connect.Bridges;
import bridges.base.SLelement;

public class sllist {
    public static void main(String[] args) throws Exception {
        // create the Bridges object
        Bridges bridges = new Bridges(0, "LDICKMAN", "353700408687");

        // create two linked list elements (nodes)
        SLelement sle0 = new SLelement("Hello", "");
        SLelement sle1 = new SLelement("World", "");

        // edit some visual properties of the SLList elements
        sle0.getVisualizer().setColor("red");
        sle0.getVisualizer().setOpacity(0.5f);
        sle1.getVisualizer().setColor("green");

        // create a linked list -- set sle0's "next" link to sle1
        sle0.setNext(sle1);

        // add more nodes, make them black, label them 2 thru 10
        SLelement curr = sle1;
        for (int i = 2; i <= 10; i++) {
            curr.setNext(
                    new SLelement(Integer.toString(i), ""));
            curr = curr.getNext();
            curr.getVisualizer().setColor("black");
        }

        // tell Bridges that sle0 is the head of your data structure
        bridges.setDataStructure(sle0);

        // visualize the data structure
        bridges.visualize();
    }
}

