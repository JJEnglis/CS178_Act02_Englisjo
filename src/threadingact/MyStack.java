/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threadingact;

/**
 *
 * @author student
 */
public class MyStack {
    
    private int maxSize;
    private int curr_indx;
    private String ref_Stack[];

    MyStack( int size )
    {
        this.maxSize = size;
        curr_indx = 0;
        ref_Stack = new String[maxSize];
    }

    public int get_currIndex()
    {
        return curr_indx;
    }

    public int get_maxSize()
    {
        return maxSize;
    }

    public synchronized void pop()
    {
        curr_indx = curr_indx - 1;
    }

    public synchronized void push( String x )
    {
        ref_Stack[curr_indx] = x;
        curr_indx++;
    }

}
