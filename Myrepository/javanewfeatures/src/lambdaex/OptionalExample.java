package lambdaex;

import java.util.Optional;

public class OptionalExample
{
    public static void main(String[] args) {
        int[] a = new int[10];
        a[3] = 40;

        Optional<Integer> empty = Optional.empty();
        System.out.println(empty);
        Optional<Integer> value = Optional.of(a[3]);
        System.out.println("filtered value "+value.filter(s->s.equals(90)));
        System.out.println("filtered value 2 "+value.filter(s->s.equals(40)));
        System.out.println("value is "+value.get());
        System.out.println("hashcode "+value.hashCode());
        System.out.println("present  "+value.isPresent());
        System.out.println("nullable : "+Optional.ofNullable(a[3]));
        System.out.println("or else "+value.orElse(30));
        System.out.println("orelse : "+value.orElse(40));




    }
}
