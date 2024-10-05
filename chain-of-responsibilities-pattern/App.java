public class App {
    public static void main(String[] args) {
        Dispenser dollar5Dispenser = new Dollar5Dispenser();
        Dispenser dollar3Dispenser = new Dollar3Dispenser();
        Dispenser dollar1Dispenser = new Dollar1Dispenser();
        dollar5Dispenser.setNext(dollar3Dispenser);
        dollar3Dispenser.setNext(dollar1Dispenser);

        dollar5Dispenser.dispense(new Currency(19)); // All 3 notes
        System.out.println("----------------------------------");
        dollar5Dispenser.dispense(new Currency(6)); // 3 Dollar notes will be 0
        System.out.println("----------------------------------");
        dollar5Dispenser.dispense(new Currency(5)); // Will not call next in chain since taken care by first
    }
}
