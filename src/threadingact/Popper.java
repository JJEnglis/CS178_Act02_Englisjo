/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threadingact;

/**
 *
 * @author student
 */
public class Popper implements Runnable {

    private MyStack pStack;

    Popper( MyStack Stack )
    {
         this.pStack = Stack;
    }

    public void run() {

        pStack.pop();
       System.out.print("\n(-)Popped:  Stack contains [" + pStack.get_currIndex() + "] elements");

    }

}
