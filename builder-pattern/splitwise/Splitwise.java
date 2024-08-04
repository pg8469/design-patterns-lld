public class Splitwise {
    public static void main(String[] args) {
        Group group1 = new Group("Group1");
        Group group2 = new Group("Group2");
        User user1 = new User("user1");
        User user2 = new User("user2");
        User user3 = new User("user3");
        User user4 = new User("user4");
        User user5 = new User("user5");

        addUserToGroup(user1, group1);
        addUserToGroup(user2, group1);
        addUserToGroup(user3, group1);
        addUserToGroup(user4, group1);
        addUserToGroup(user5, group1);

        addUserToGroup(user1, group2);
        addUserToGroup(user2, group2);
        addUserToGroup(user3, group2);

        Expense expense1 = new Expense.ExpenseBuilder()
        .addPaidBy(user1, 10)
        .addPaidBy(user2, 30)
        .addPaidBy(user3, 60)
        .addSplitBetween(user4)
        .addSplitBetween(user5)
        .build();
        expense1.printDetails();
        System.out.println("------------------------");

        Expense expense2 = new Expense.ExpenseBuilder()
        .addPaidBy(user1, 300)
        .addSplitBetween(user2)
        .addSplitBetween(user3)
        .build();
        expense2.printDetails();
        System.out.println("------------------------");

        group1.addExpense(expense1);
        group1.addExpense(expense2);
        group1.printSummary();

        Expense expense3 = new Expense.ExpenseBuilder()
        .addPaidBy(user2, 500)
        .addPaidBy(user3, 100)
        .addSplitBetween(user1)
        .build();

        System.out.println("------------------------");
        group2.addExpense(expense3);
        group2.printSummary();

        System.out.println("------------------------");
        user1.printSummary();
        user2.printSummary();
        user3.printSummary();

    }

    private static void addUserToGroup(User user, Group group){
        user.addGroup(group);
        group.addUser(user);
    }
}
