public class Triangle {

    public static void main(String[] args) {
       
        Triangle triangle = new Triangle();

       
        triangle.printPattern();
    }

   
    public void printPattern() {
        
        System.out.println("T");

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("T");
            }
            System.out.println();
        }

       
        for (int i = 0; i < 5; i++) {
            System.out.print("T");
        }
        System.out.println();
    }
}
