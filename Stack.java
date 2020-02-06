public class Stack {
       privateint maxSize;
       privateint[] stackArray;
       privateint pointer;
       public Stack(int s) {
              maxSize = s;
              stackArray = newint[maxSize];
              pointer = -1;
       }
       public void push(int j) {
              stackArray[++pointer] = j;
       }
       public int pop() {
              return stackArray[pointer--];
       }
       public int peek() {
              return stackArray[pointer];
       }
       publicboolean isEmpty() {
              return (pointer == -1);
       }
       public boolean isFull() {
              return (pointer == maxSize - 1);
       }
       public static void main(String[] args) {
              Stack stack = new Stack(1000);
              for(int ;i<1000;i++)
              {
                     stack.push(i);
              }
              for(int ;i<1000;i++)
              {
                     int element = stack.pop();
                     System.out.println("Poped element is "+ element);
              }
       }
}
