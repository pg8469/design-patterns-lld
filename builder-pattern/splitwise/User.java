import java.util.LinkedList;
import java.util.List;

public class User{
    String username;
    List<Group> groups;

    public User(String username){
        this.username=username;
        this.groups=new LinkedList<>();
    }

    public String getUsername(){
        return this.username;
    }

    public void addGroup(Group group){
        this.groups.add(group);
    }

    public Double getTotalBalance(){
        return groups
        .stream()
        .map(group -> group.getUserContribution(this))
        .mapToDouble(Double::doubleValue).
        sum();
    }

    public void printSummary(){
        System.out.println("User: "+this.getUsername()+", expense: "+getTotalBalance());
    }
}