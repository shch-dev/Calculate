public class RomeToArab { //клас для преобразования римских цифр в арабские

    public static int converterRomeToArab(String a1, String d1, String c1) throws Exception {

        int firstRomeNum; //переменная для хранения 1го введеного числа
        switch (a1.toUpperCase()) { //делаем римские символы заглавными, переводим в арабские
            case "I" -> firstRomeNum = 1;
            case "II" -> firstRomeNum = 2;
            case "III" -> firstRomeNum = 3;
            case "IV" -> firstRomeNum = 4;
            case "V" -> firstRomeNum = 5;
            case "VI" -> firstRomeNum = 6;
            case "VII" -> firstRomeNum = 7;
            case "VIII" -> firstRomeNum = 8;
            case "IX" -> firstRomeNum = 9;
            case "X" -> firstRomeNum = 10;
            default -> throw new Exception("Введено некорректное римсоке число(первое)");
        }

        int secondRomeNum; //переменная для хранения 2го введеного числа
        switch (c1.toUpperCase()) { //делаем римские символы заглавными, переводим в арабские
            case "I" -> secondRomeNum = 1;
            case "II" -> secondRomeNum = 2;
            case "III" -> secondRomeNum = 3;
            case "IV" -> secondRomeNum = 4;
            case "V" -> secondRomeNum = 5;
            case "VI" -> secondRomeNum = 6;
            case "VII" -> secondRomeNum = 7;
            case "VIII" -> secondRomeNum = 8;
            case "IX" -> secondRomeNum = 9;
            case "X" -> secondRomeNum = 10;
            default -> throw new Exception("Введено некорректное римсоке число(второе)");
        }

        int resultRomeNum; //переменная для хранения результата
        switch (d1) { //производим операцию над арабскими числами
            case "-" -> resultRomeNum = firstRomeNum - secondRomeNum;
            case "+" -> resultRomeNum = firstRomeNum + secondRomeNum;
            case "*" -> resultRomeNum = firstRomeNum * secondRomeNum;
            case "/" -> resultRomeNum = firstRomeNum / secondRomeNum;
            default -> throw new Exception("Не верный знак операции");
        }
        return resultRomeNum; //возращаем результат
    }
}
