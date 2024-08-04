import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Group {
    String groupName;
    List<User> users; // TODO: Not using it, can it be removed
    List<Expense> expenses;

    public Group(String name){
        this.groupName=name;
        users=new LinkedList<>();
        expenses = new LinkedList<>();
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void addExpense(Expense expense){
        this.expenses.add(expense);
    }

    public Double getUserContribution(User user){
        return expenses.stream()
        .map(expense -> expense.getContributionFor(user))
        .mapToDouble(Double::doubleValue)
        .sum();
    }

    // Summary for user
    public void printSummary(User user){
        System.out.println("User: "+user.getUsername()+", expense: "+getUserContribution(user));
    }

    // Summary for all users
    public void printSummary(){
        expenses
        .stream()
        .map(Expense::getUsers)
        .flatMap(Set::stream)
        .collect(Collectors.toSet())
        .forEach(this::printSummary);
    }
}
