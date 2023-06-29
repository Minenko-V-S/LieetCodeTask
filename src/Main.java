/*
Задача: напиcать класс с одним методом, принимающим строку и подстроку,
        и возвращающим кол-во вхождений этой подстроки в переданную строку.
        При реализации необходимо использоваьб метод String.indexOf
Пример 1: для строки "Оцифровка, цифровизация и цифровая трансформация" и подстроки "цифр" результат должен быть 3
Пример 2: для строки "Ромашка ООО" и подстроки "ОО" результат должен быть 2
*/




public class Main {
    public static void main(String[] args) {

         String text = "Оцифровка, цифровизация и цифровая трансформация";
         String str = "цифр";
         int count = countString(text, str);
        System.out.println(count);
            }
        public static int countString(String text, String str){
            int index = 0, count = 0;
            while (true){
                index = text.indexOf(str, index);
                if (index != -1){
                    count++;
                    index += str.length();
                }
                else break;
            }
            return count;
        }

}