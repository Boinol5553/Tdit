package java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(88);
//        list.add(43);
//        list.add(33);
//        list.add(27);

//        for (Integer integer: list){ if(integer>20){
//            System.out.println(integer);}}
//
//        Stream<Integer> emptyStream = Stream.empty();
//        emptyStream.forEach(System.out::println);
//
//        Stream<Integer> s = Stream.of(10,20,30,40,50,60,70,90,100);
//        s.filter(num -> num >20).forEach(System.out::println);

      // Stream<String> names = Stream.of("Zyan","Vish","AKSHAY","Aksah","Amar","Neeraj","Raj","Prasad");
       // names.filter(name-> name.startsWith("A")).forEach(System.out::println);
       // names.sorted().forEach(System.out::println);
       // Optional<String> options = names.findFirst(); if (options.isPresent()) System.out.println(options.get());
       // names.distinct().forEach(System.out::println);
       // names.limit(5).forEach(System.out::println);
       // names.skip(6).forEach(System.out::println);
       // boolean result = names.anyMatch(name -> name.length() > 4);
       // Set<String> s = names.collect(Collectors.toSet());
       // System.out.println(s);

        //List<String> namesStartWith = names.filter(name -> name.startsWith("A")).collect(Collectors.toList()); namesStartWith.forEach(System.out::println);

        List<String> names = new ArrayList<>();

        names.add("David");

        names.add("Johnson");

        names.add("Samontika");

        names.add("Brijesh");

        names.add("John");
        names.add("John");

       // names.stream().filter((String name)-> name.length() < 5).forEach(System.out::println);
        names.stream().distinct().forEach(System.out::println);
        System.out.println("========================");
        names.stream().sorted().forEach(System.out::println);
        System.out.println("========================");
        names.stream().skip(4).forEach(System.out::println);
        System.out.println("========================");
        names.stream().limit(2).forEach(System.out::println);
        System.out.println("========================");
        names.stream().map(String::length).forEach(System.out::println);
        System.out.println("========================");
        
    }

}
