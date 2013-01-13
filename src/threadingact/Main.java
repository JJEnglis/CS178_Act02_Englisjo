/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threadingact;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Engis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Thread> Stack_threads = new ArrayList<Thread>();

        MyStack myStack = new MyStack(30);
System.out.print("Tracing: ");
        for( int i = 0; i < 15; i++ )
        {

               Runnable Stack_Push01 = new Pusher( myStack );
                Thread Push01 = new Thread( Stack_Push01 );

               Runnable Stack_Push02 = new Pusher( myStack );
                Thread Push02 = new Thread( Stack_Push02 );

               Runnable Stack_Pop = new Popper( myStack );
               Thread Pop = new Thread( Stack_Pop );
                    //push
                if(i < 10){Push01.start();Stack_threads.add(Push01);}
                else { Stack_threads.remove(Push01);}
                   //push
                if(i < 10){Push02.start();Stack_threads.add(Push02);                    
                } else { Stack_threads.remove(Push02); }

                //pop
                if( myStack.get_currIndex() > -1 ){Pop.start();Stack_threads.add(Pop);} 

        }

    }

}
