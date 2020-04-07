public class DStackDemo {
    public static void main(String[] args) {

        DynStack myDStack1 = new DynStack(5);
        for (int i = 0; i< 10; i++) myDStack1.put(i);

        System.out.println("Содержимое myDStack1:");
        for (int i = 0; i< 10; i++) System.out.print(myDStack1.pop()+" ");
    }
}
