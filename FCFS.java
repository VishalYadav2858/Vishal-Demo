import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thr number of processes:-");
        int n=sc.nextInt();
        int ID[]=new int[n];
        int AT[]=new int[n];
        int BT[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the process ID, Arival Time & Burst Time:");
            ID[i]=sc.nextInt();
            AT[i]=sc.nextInt();
            BT[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
              if(AT[i]>AT[j]){
                int temp=AT[i];AT[i]=AT[j];AT[j]=temp;
                temp=BT[i];BT[i]=BT[j];BT[j]=temp;
                temp=ID[i];ID[i]=ID[j];ID[j]=temp;
              }
            } 
        
        }

        int CT[]=new int[n];
        int timestamp=0;
        for(int i=0;i<n;i++)
        {
            timestamp+=BT[i];
            CT[i]=timestamp;
        }
        int TAT[]=new int[n];
        for(int i=0;i<n;i++)
        {
            TAT[i]=CT[i]-AT[i];
        }
        int WT[]=new int[n];
        for(int i=0;i<n;i++)
        {
            WT[i]=TAT[i]-BT[i];
        }
        // Table 
        System.out.println("\nProcess ID\tAT\tBT\tCT\tTAT\tWT");
        for(int i=0;i<n;i++)
        {
            System.out.printf("\t%d\t%d\t%d\t%d\t%d\t%d\n",ID[i],AT[i],BT[i],CT[i],TAT[i],WT[i]);
        }
        sc.close();
    }
}