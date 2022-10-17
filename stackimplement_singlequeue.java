import java.util.*;

public class stackimplement_singlequeue
{
    public static void main(String[] args) {
        System.out.println("hi");
        Stack s=new Stack();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println(s.top());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.top());
        System.out.println(s.size());
        
    }
}
class Stack{
    Queue<Integer> q=new LinkedList()<Integer>();
    void push(int x)
    {
        q.add(x);
        for(int i=0;i<q.size()-1;i++)
        {
            q.add(q.remove());
        }
    }
    int pop()
    {
        return q.remove();
    }
    int top()
    {
        return q.peek();
    }
    int size()
    {
        return q.size();
    }

}