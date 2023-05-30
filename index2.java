/*
 * a) 101 + 0) / 3
b) 3.0e-6 * 10000000.1
c) true && true
d) false && true
e) (false && false) || (true && true)
f) (false || false) && (true && true)
 */

public class index2 {
    public static void main(String[] args){
        System.out.println((101 + 0) / 3); // 33
        System.out.println(3.0e-6 * 10000000.1); // 30.0000003
        System.out.println(true && true); // true
        System.out.println(false && true);  // false
        System.out.println((false && false) || (true && true)); // true
        System.out.println((false || false) && (true && true)); // false

    }
}
