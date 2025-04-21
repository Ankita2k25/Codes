import java.util.*;
import java.util.stream.Collectors;


//Given a list of people, find the oldest person whose name starts with “J”.
class Ages{
    public int age;
    public String names;


    public Ages( String names,int age) {
        this.age = age;
        this.names = names;
    }

    public int getAge(){
        return age;
    }
    public String getNames(){
        return names;
    }

    @Override
    public String toString() {
        return "Ages{" +
                "age=" + age +
                ", names='" + names + '\'' +
                '}';
    }
}
public class OldestNameStartWithJ {
    public static void main(String[] args) {
        List<Ages> list= Arrays.asList(new Ages("Ankita",24), new Ages("Jiva",26),new Ages("Aditi",29),new Ages("Jaman",21),new Ages("Jagdish",29));
        Optional<Ages> oldest_People = list.stream()
                .filter(s -> s.getNames().startsWith("J"))
                .reduce((n1,n2)->n1.getAge()> n2.getAge()?n1:n2);
        System.out.println(oldest_People);
    }
}
