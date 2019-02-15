package inclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BalanceSymbolChecker {

    public static String checkBalcnme(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner sc = new Scanner(f);
        LinkedList<String> stack = new LinkedList<>();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            StringTokenizer stk = new StringTokenizer(line, "{}()<>[]", true);
            while (stk.hasMoreTokens()) {
                String token = stk.nextToken();
                if (isSymbol(token)) {
                    if (isOpenSymbol(token)) {
                        System.out.println("push(" + token + ")");
                        stack.push(token);
                    } else {
                        System.out.println("pop() and check");
                        String top = stack.peek();
                        if(top == null) {
                            return "missing open Symbol";
                        }
                        if(getValue(top) != getValue(token)) {
                            return "unbalance symbol";
                        }
                        stack.pop();
                    }
                }
            }
        }
        return null;
    }

    private static boolean isSymbol(String symbol) {
        switch (symbol) {
            case "[":
            case "]":
            case "{":
            case "}":
            case "(":
            case ")":
            case "<":
            case ">":
                return true;
        }
        return false;
    }

    private static boolean isOpenSymbol(String symbol) {
        switch (symbol) {
            case "[":
            case "{":
            case "(":
            case "<":
                return true;
        }
        return false;
    }

    private static int getValue(String symbol) {
        switch (symbol) {
            case "[":
            case "]":
                return 1;
            case "{":
            case "}":
                return 2;
            case "(":
            case ")":
                return 4;
            case "<":
            case ">":
                return 8;
        }
        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(checkBalcnme("Datastructures.java"));
    }
}
