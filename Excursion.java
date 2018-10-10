/*В училището на Слончето Лони организират екскурзия до екзотична планина. По пътя има множество препятствия, 
които ограничават височината и широчината на превозното средство, което преминава по избрания маршрут. Училищното 
ръководство наело автобус, широк w и висок h метра. Известно е, че по маршрута има n препятствия и за всяко се знае 
максималната допустима широчина и височина, които може да има превозно средство, за да премине през него. 
Слончето и съучениците му искат да знаят дали ще успеят да посетят всички обекти в маршрута или ще трябва да 
спрат пред някое от препятствията. Напишете програма excursion, която по дадени размери на автобуса и информация за 
препятствията, определя резултата от екскурзията.

Вход
На първия ред от стандартния вход се въвеждат две цели числа w и h, съответно широчината и височината на автобуса. 
На втория ред на стандартния вход се задава цяло число n – броя на препятствията. 
На следващите n реда се въвеждат по две числа a и b, разделени с интервали – първото е максимално допустимата ширина, 
а второто – максимално допустимата височина за преминаване през поредното препятствие. Препядствията са номерирани 
последователни числа от 1 до N.

Изход
На един ред на стандартния изход програмата трябва да изведе номера на първото препятствие, през което автобусът 
не може да мине, или No crash, ако автобусът преминава успешно през всички препятствия.*/

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int busWidth = console.nextInt();
        int busHeight = console.nextInt();
        int n = console.nextInt();
        int a = 0;


        for (int i = 1; i <= n; i++) {
            int width = console.nextInt();
            int height = console.nextInt();

            if (busWidth > width || busHeight > height){
                a = 1;
                System.out.println(i);
                break;
            }
        }
        if (a == 0) {
            System.out.println("No crash");
        }
    }
}
