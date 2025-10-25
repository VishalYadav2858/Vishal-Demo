import java.util.Scanner;

// patient details
class Patient {
    String name;
    String bloodGroup;
    int priority;     
    int serviceTime;    
    int waitingTime;
    int turnaroundTime;
    int completionTime;

    Patient(String name, String bloodGroup, int priority, int serviceTime) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.priority = priority;
        this.serviceTime = serviceTime;
    }
}

// Main class
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Patient[] patients = new Patient[n];

        // --- Input details for all patients ---
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Patient " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Blood Group: ");
            String bloodGroup = sc.nextLine();
            System.out.print("Priority (1 = Emergency, 2 = Urgent, 3 = Normal): ");
            int priority = sc.nextInt();
            System.out.print("Service Time (in minutes): ");
            int serviceTime = sc.nextInt();
            sc.nextLine(); 

            patients[i] = new Patient(name, bloodGroup, priority, serviceTime);
        }

        // --- Sort by priority (lower number = higher priority) ---
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (patients[i].priority > patients[j].priority) {
                    Patient temp = patients[i];
                    patients[i] = patients[j];
                    patients[j] = temp;
                }
            }
        }

        // --- Calculate Waiting, Turnaround, and Completion Times ---
        int currentTime = 0;
        for (int i = 0; i < n; i++) {
            patients[i].waitingTime = currentTime;
            patients[i].completionTime = currentTime + patients[i].serviceTime;
            patients[i].turnaroundTime = patients[i].completionTime;
            currentTime += patients[i].serviceTime;
        }

        // --- Display results ---
        System.out.println("\n=== Blood Bank Service Summary (Priority Scheduling) ===");
        System.out.printf("%-10s %-8s %-9s %-13s %-13s %-16s %-15s\n",
                "Name", "B.Group", "Priority", "Service Time", "Waiting Time",
                "Turnaround Time", "Completion Time");
        System.out.println("---------------------------------------------------------------------------------------------");

        double totalWT = 0, totalTAT = 0;

        for (Patient p : patients) {
            System.out.printf("%-10s %-8s %-9d %-13d %-13d %-16d %-15d\n",
                    p.name, p.bloodGroup, p.priority, p.serviceTime,
                    p.waitingTime, p.turnaroundTime, p.completionTime);

            totalWT += p.waitingTime;
            totalTAT += p.turnaroundTime;
        }

        // --- Display averages ---
        System.out.println("\nAverage Waiting Time: " + (totalWT / n));
        System.out.println("Average Turnaround Time: " + (totalTAT / n));

        sc.close();
    }
}