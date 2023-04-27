import java.util.Scanner;

public class Main {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = in.nextInt();
        stack = new int[N];

        for (int i = 0; i < N; i++) {

            String str = in.next();

            switch (str) {
                case "push":
                    push(in.nextInt());
                    break;

                case "pop":
                    sb.append(pop()).append("\n");
                    break;

                case "top":
                    sb.append(top()).append("\n");
                    break;

                case "empty":
                    sb.append(empty()).append("\n");
                    break;

                case "size":
                    sb.append(size()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }

    public static void push(int next) {
        stack[size] = next;
        size++;
    }

    public static int pop() {
        if (size == 0) {
            return -1;
        }

        int res = stack[size - 1];
        size--;
        return res;
    }

    public static int size() {
        return size;
    }

    public static int top() {
        if (size == 0) {
            return -1;
        }
        return stack[size - 1];
    }

    public static int empty() {
        if (size == 0) {
            return 1;
        }
        return 0;
    }
}