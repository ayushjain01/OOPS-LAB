package Q10;
import java.util.Scanner;
import Q10.ISE.ISE_Department;
import Q10.Faculty;
public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of Faculty Entries :");
        int n = sc.nextInt();
        Faculty[] f = new Faculty[n];
        ISE_Department ise = new ISE_Department();
        for (int i = 0; i < n; i++) {
            f[i] = new Faculty();
            ise.readData(f[i]);
        }
        System.out.println("Displaying Faculty Details whose Years of Experience is Greater than Equal to 20 Years.");
        for (int i = 0; i < n; i++) {
            if (f[i].yearsOfExperience>=20)
            {
                ise.printData(f[i]);
                ise.printNumberOfDesignations(f[i]);
                ise.printNumberOfResearchConsultancyProjs(f[i]);
            }
        }
    }
}
