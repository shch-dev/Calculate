import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculate {

    public static void run() {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //объект для считывания символов
            System.out.println("Калькулятор. \nРаботает как с римскими(I,II,III...), так и с арабскими числами(1,2,3...)\n"
                    + "Работает в пределах: 1 - 10(арабские), I - X(римские)");
            System.out.println("Input: ");
            String word = reader.readLine(); //считываем строку пользователя
            String[] num = word.split(" ", 3); //кладём введённые значения в массив num[1][2][3]

            if (isDigit(num[0]) && isDigit(num[2])) {    //проверяем методом "isDigit" оба числа арабские
                System.out.println("Output: \n" + calculate(num[0], num[1], num[2]));
            } else if (!isDigit(num[0]) && !isDigit(num[2])) {    //проверяем методом "isDigit" оба числа римские
                int x = RomeToArab.converterRomeToArab(num[0], num[1], num[2]); //переводим римские в арабские, вычисляем и записываем в int x;

                if (x <= 0)
                    System.out.println("Не существует отрицательных римских чисел и числа 0."); //если из класса "romanToArabic" возратилось отрицательное чисто
                else
                    System.out.println("Output: \n" + ArabToRome.converterArabToRome(x)); //переводим арабское в римское обратно и выводим на экран
            } else
                throw new NumberFormatException("Ввести можно только 2 арабских или 2 римских числа.");
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    //проверка числа: арабское(1,2,3,4...) или римское(I,II,III...)
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    //действия с арабскими (1,2,3,4...) цифрами
    private static int calculate(String a1, String d1, String c1) throws Exception {
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(c1);
        if (a < 1 || a > 10 || b < 1 || b > 10) throw new IllegalArgumentException("Числа должны быть от 1 до 10");
        int result;
        switch (d1) {
            case "-" -> result = a - b;
            case "+" -> result = a + b;
            case "*" -> result = a * b;
            case "/" -> result = a / b;
            default -> throw new Exception("Не верный знак операции");
        }
        return result;
    }
}
