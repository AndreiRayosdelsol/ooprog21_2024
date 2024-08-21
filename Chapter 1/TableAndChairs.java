public class TableAndChairs {

    public static void main(String[] args) {
     
        TableAndChairs tableAndChairs = new TableAndChairs();

       
        tableAndChairs.printPattern();
    }

    
    public void printPattern() {
       
        System.out.println("X");
        System.out.println("XXXXXXXXXX");
        System.out.println("X");

        
        for (int i = 0; i < 4; i++) {
            System.out.print("XXXXXX ");
            for (int j = 0; j < i; j++) {
                System.out.print("X");
            }
            System.out.println(" XXXXX");
        }

        
        System.out.println("X X");
        System.out.println("X");
        System.out.println("X X X");
        System.out.println("XX");
        System.out.println("X");
        System.out.println("X X X");
    }
}
