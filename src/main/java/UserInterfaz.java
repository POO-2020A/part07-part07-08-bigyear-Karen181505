import java.util.ArrayList;
import java.util.Scanner;
public class UserInterfaz {
    private Scanner scan;
    private ArrayList<Birds> birds;
    
    
    public UserInterfaz(Scanner scan){
        this.scan = scan;
        this.birds = new ArrayList<>();
    }
    
    public void star(){
        String name;
        String latin;
        while (true) {
            System.out.print("? ");
            String answer = this.scan.nextLine();
            if (answer.equals("Quit")) {
                break;
            } else if (answer.equals("Add")) {
                System.out.print("Name: ");
                name = this.scan.nextLine();
                System.out.print("Name in latin: ");
                latin = this.scan.nextLine();
                birds.add(new Birds(name, latin));
            } else if (answer.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                for (Birds bird1 : birds) {
                    bird1.observation(bird);
                }
            } else if (answer.endsWith("All")) {
                for (Birds bird : birds) {
                    System.out.println(bird.toString());
                }
            } else if (answer.equals("One")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                for (Birds bird1 : birds) {
                    if (bird.equals(bird1.getBirdName())) {
                        System.out.println(bird1.toString());
                    }

                }
            }

        }
    }
}
