import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Group transactions by type and sum their amounts.
class transaction{
    public  int amount;
    public String type;

    public transaction(int amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "transaction{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}
public class TransactionAndSum {
    public static void main(String[] args) {
        List<transaction>list= Arrays.asList(
                new transaction(3000,"Rent"),
                new transaction(2000,"Food"),
                new transaction(2000,"Rent"),
                new transaction(450,"Food"),
                new transaction(455,"Bill"));
        Map<String,Integer> map=list.stream().collect(Collectors.groupingBy(transaction::getType,Collectors.summingInt(transaction::getAmount)));
        System.out.println(map);
    }
}
