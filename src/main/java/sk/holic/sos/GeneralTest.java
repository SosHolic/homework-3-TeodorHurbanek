package sk.holic.sos;

public class GeneralTest {

    public int getCount() {return 1;}
}
class Test1 extends GeneralTest {
    public int getCount() {return 10;}
    public static void main(String[] args) {
        Test1 test = new Test1();
        int count = test.getCount();
        GeneralTest generalTest = new Test1();
        count += generalTest.getCount();
        generalTest = new GeneralTest();
        count += generalTest.getCount();
        System.out.println(count);
    }
// Task3: Vypise hodnotu 21
// Task: 3 krat zavola metodu getCount
}
