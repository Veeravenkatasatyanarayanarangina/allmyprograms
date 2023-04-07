package assignment9;

@FunctionalInterface
public interface ClassA {
    public void add(int a,int b);
}

class Main
{
    public static void main(String[] args) {
        ClassA classA = new ClassA() {
            @Override
            public void add(int a, int b) {
                System.out.println(10);
            }
        };
    }
}

