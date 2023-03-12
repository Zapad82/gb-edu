package isp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ConsoleUI ui = new ConsoleUI(new Scanner(System.in));
        DepositOperation op = new DepositOperation(ui);
        op.execute();
    }
}
