public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] payments = {1000, 3000, 2000, 4000, 5000};
        int sum = 0;
        for (int i : payments) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача 2");
        int minPayment = 10000;
        for (int payment : payments) {
            if (payment < minPayment) {
                minPayment = payment;
            }
        }
        int maxPayment = 1;
        for (int payment : payments) {
            if (payment > maxPayment) {
                maxPayment = payment;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayment + " рублей. Максимальная сумма трат за неделю составила " + maxPayment + " рублей");

        System.out.println("Задача 3");
        double averageSum = 1000d;
        for (int i = 0; i < payments.length; i++) {
            averageSum = (double) sum / payments.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            temp = reverseFullName[reverseFullName.length - i - 1];
            reverseFullName[reverseFullName.length - i - 1] = reverseFullName[i];
            reverseFullName[i] = temp;
        }
        System.out.print(reverseFullName);
        System.out.println();
    }
}