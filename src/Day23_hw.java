//자바 과제 전용 파일
import java.util.Optional;
import java.util.*;

public class Day23_hw {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연홍부", "김선달", "황진이");
        names.stream().filter(name -> name.compareTo("이") < 0).forEach(name -> System.out.print(name+ " "));
        System.out.println();
        names.stream().sorted().forEach(name -> System.out.print(name+ " "));
        System.out.println();
        Optional<String> fNname = names.stream().findFirst();
        System.out.println(fNname);
        System.out.println(fNname.orElse("not"));

        System.out.println(names.stream().count());
    }
}
