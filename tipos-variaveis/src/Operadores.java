public class Operadores {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Operadores Aritméticos
        System.out.println("Soma: " + (a + b)); // 15
        System.out.println("Subtração: " + (a - b)); // 5
        System.out.println("Multiplicação: " + (a * b)); // 50
        System.out.println("Divisão: " + (a / b)); // 2
        System.out.println("Módulo: " + (a % b)); // 0

        // Operadores de Atribuição
        a += 5; // a = a + 5
        System.out.println("A após += 5: " + a); // 15

        a -= 3; // a = a - 3
        System.out.println("A após -= 3: " + a); // 12

        a *= 2; // a = a * 2
        System.out.println("A após *= 2: " + a); // 24

        a /= 4; // a = a / 4
        System.out.println("A após /= 4: " + a); // 6

        a %= 4; // a = a % 4
        System.out.println("A após %= 4: " + a); // 2

        // Operadores de Comparação
        System.out.println("A == B: " + (a == b)); // false
        System.out.println("A != B: " + (a != b)); // true
        System.out.println("A > B: " + (a > b)); // false
        System.out.println("A < B: " + (a < b)); // true
        System.out.println("A >= B: " + (a >= b)); // false
        System.out.println("A <= B: " + (a <= b)); // true
    }
    
}
