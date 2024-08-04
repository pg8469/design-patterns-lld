import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Expense {
    Map<User, Double> eachUserContribution;

    private Expense(Map<User, Double> eachUserContribution){
        this.eachUserContribution=eachUserContribution;
    }

    public void printDetails(){
        eachUserContribution.forEach((user, contri) -> System.out.println("User: "+user.getUsername()+", expense: "+contri));
    }

    public Set<User> getUsers(){
        return this.eachUserContribution.keySet();
    }

    public Double getContributionFor(User user){
        if(!this.eachUserContribution.containsKey(user)) return 0.0;
        return this.eachUserContribution.get(user);
    }

    public static class ExpenseBuilder{
        Map<User, Double> paidByMap;
        Set<User> allUsers;

        public ExpenseBuilder(){
            paidByMap=new HashMap<>();
            allUsers=new HashSet<>();
        }

        public ExpenseBuilder addPaidBy(User user, double amount){
            this.allUsers.add(user);
            this.paidByMap.put(user, amount);
            return this;
        }

        public ExpenseBuilder addSplitBetween(User user){
            this.allUsers.add(user);
            return this;
        }

        public Expense build(){
            Double totalAmount = paidByMap.values()
            .stream()
            .mapToDouble(Double::doubleValue)
            .sum();

            Map<User, Double> eachUserContribution= allUsers
            .stream()
            .collect(Collectors.toMap(user -> user, user -> (paidByMap.containsKey(user)?paidByMap.get(user):0)- totalAmount/allUsers.size()));

            return new Expense(eachUserContribution);
        }
    }
}

