package localRapo;

public class Area {
   public static void main(String[] args) {
        double length = 4.0;
        double radius = 5.0;
        double area = length * length;         
        double a1 = Math.PI * radius * radius;
        System.out.println("The area of a square with side " + length + " is: " + area);
        System.out.println("The area of a circle with radius " + radius + " is: " + a1);
    } 
}
