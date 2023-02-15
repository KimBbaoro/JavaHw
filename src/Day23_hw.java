//자바 과제 전용 파일
import java.util.Optional;
import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


enum Gender {
    남, 여
}

public class Day23_hw {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연홍부", "김선달", "황진이");
        List<Integer> ages = List.of(25,20,29,28,32,18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

        Stream<Integer> si = ages.stream();
        Optional<Integer> sum = ages.stream().reduce((x,y) -> x+y);
        System.out.println(sum.orElse(0));
        System.out.println(ages.stream().max(Integer::compareTo).get());
        IntStream a = ages.stream().mapToInt(x -> x.intValue());
        System.out.println(a.average().getAsDouble());
    }
}
