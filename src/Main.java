import java.util.Scanner;
import java.util.Objects;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Er det en nødsituation (True / False) ");
        boolean emergency = scan.nextBoolean();

        System.out.print("Er det dag, aften eller nat?");
        String tod = scan.next();

        System.out.print("Der meget traffik? (True eller False)");
        boolean trafic = scan.nextBoolean();

        System.out.print("Hvilket område befinder du dig i? (bolig, erhverv, blandet) ");
        String area = scan.next();


        if (emergency) {
            System.out.println("Grønt lys");
        } else if (Objects.equals(tod,"dag") && !trafic) {
            System.out.println("Grønt lys");
            if (Objects.equals(area,"erhverv") || Objects.equals(area,"blandet") && !trafic) {
 ;               System.out.print("Adgang tilladt");
            }
            if (Objects.equals(area,"bolig") && Objects.equals(tod,"nat")){
                System.out.print("adgang forbudt");
            }
        } else if (Objects.equals(tod,"aften") || Objects.equals(tod,"nat") && !trafic) {
            System.out.println("Gult lys");

            if (Objects.equals(area,"erhverv") || Objects.equals(area,"blandet") && !trafic) {
                System.out.print("Adgang tilladt");
            }
            if (Objects.equals(area,"bolig") && Objects.equals(tod,"nat")){
                System.out.print("adgang forbudt");
            }
        } else if (Objects.equals(tod,"nat") && trafic || Objects.equals(area, "bolig") && trafic) {
            System.out.println("Rødt lys");

            if (Objects.equals(area,"erhverv") || Objects.equals(area,"blandet") && !trafic) {
                System.out.print("Adgang tilladt");
            }
            if (Objects.equals(area,"bolig") && Objects.equals(tod,"nat")){
                System.out.print("adgang forbudt");
            }

        }
            
    }

}