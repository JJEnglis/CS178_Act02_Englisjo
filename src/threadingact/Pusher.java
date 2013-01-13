/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threadingact;

/**
 *
 * @author student
 */
public class Pusher implements Runnable {

    private MyStack ref_Stack;
    
    Pusher(MyStack Stack)
    {
        this.ref_Stack = Stack;
    }
    
    public void run() {

        if(ref_Stack.get_currIndex() < ref_Stack.get_maxSize())
        {
               
                ref_Stack.push("elem");
                 System.out.print("\n (+) Push: Stack containes [" + ref_Stack.get_currIndex() + "]  elements .");
        }
    }


}
