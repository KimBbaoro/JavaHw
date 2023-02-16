//자바 과제 전용 파일
import java.util.Optional;
import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;


enum Gender {
    남, 여
}

class Member {
    String name;
    Gender gender;
    int age;

    public Member(String name, Gender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {return name;}

    public Gender getGender() {return gender;}

    public int getAge() {return age;}

    @Override
    public String toString() {
        return String.format("Member(%s, %s, %d)", name, gender, age);
    }
}

public class Day23_hw {
    public static void main(String[] args) {
        

    }
}
