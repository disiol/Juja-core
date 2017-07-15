package ua.com.juja.core.LABA18.Parser;

/**
 * Created by Denis Oleynyk on 15.07.17.
 * mail: deoniisii@gmail.com
 */
public class Parser2 {
    public static void main(String[] args) {
        System.out.println(eval("123"));
        System.out.println(eval("2*3"));
        System.out.println(eval("(1+3)*2"));
        System.out.println(eval("((13/6)*2-5)+1"));
    }

    public static int eval(String expr) {
        return eval(expr, 0, expr.length());
    }

    private static int eval(String expr, int from, int to) {
        if (expr.charAt(from) == '(') {
            return eval(expr, from + 1, to - 1);
        } else {
            int pos = from;
            while (pos < to) {
                if (Character.isDigit(expr.charAt(pos))) {
                    pos++;
                } else {
                    int leftOperand = Integer.valueOf(expr.substring(from - 1, pos +1));
                    char operation = expr.charAt(pos);
                    int rightOperand = eval(expr, pos , to);
                    switch (operation) {
                        case '+':
                            return leftOperand + rightOperand;
                        case '-':
                            return leftOperand - rightOperand;
                        case '*':
                            return leftOperand * rightOperand;
                        case '/':
                            return leftOperand / rightOperand;
                    }
                }
            }
            return Integer.valueOf(expr.substring(from, to));
        }
    }
}