/*
    @author = Mohammed Shahid
    Lab 2 pgm - Develop a stack class to hold a maximum of 10 integers with suitable methods. Develop a JAVA main
               method to illustrate Stack operations.
 */

package MyFirstProject.Java_lab_pgms;
import java.util.*;

public class LabTwo { 
    static void push(int top[], int item, int a[])
    {
        if(top[0]==9)
        {
            System.out.println("Stack overflow");
            return;
        }
        top[0] += 1;
        a[top[0]] = item; 
        return;
    }

    static int pop(int top[], int a[])
    {
        int item;
        if(top[0]==-1)
        {
            return -1;
        }
        item = a[top[0]];
        top[0] -= 1;
        return item;
    }

    static void display(int top[], int a[])
    {
        int i;
        if(top[0]==-1)
        {
            System.out.println("Stack is empty");
            return;
        }
        for(i=0;i<=top[0];i++)
        {
            System.out.println(a[i]);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, item, y;
        int arr[] = new int[10];
        int top[] = {-1};   
        //I have used an array for 'top' because by default they are pass by reference, and in java you cannot use primitive datatypes for pass by reference.
        
        for(;;)
        {
        System.out.print("Enter 1.Push 2.Pop 3.Display and 4.Exit: ");
        int choice = sc.nextInt();
        switch (choice) 
            {
                case 1: System.out.println("Enter the item: ");
                        item = sc.nextInt();
                        push(top,item,arr);
                        break;

                case 2: y = pop(top,arr);
                        if(y==-1)
                        {
                            System.out.println("Stack underflow");
                            break;
                        }
                        else
                        {
                            System.out.println("Item deleted: " + y);
                        }
                        break;

                case 3:display(top,arr);
                    break;

                default: System.exit(0);
                         break;
            }
        }

    }
}
