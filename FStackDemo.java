public class FStackDemo {
    public static void main(String[] args) {
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i=0;i<5;i++) myStack1.put(i*2);
        for (int i=0;i<8;i++) myStack2.put(i+2);

        System.out.println("Стек в myStack_1:");
        for (int i=0;i<5;i++) System.out.print(myStack1.pop()+" ");

        System.out.println("\nСтек в myStack_2:");
        for (int i=0;i<8;i++) System.out.print(myStack2.pop()+" ");
    }
}
