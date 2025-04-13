package com.company.leavetracking;
import com.company.leavetracking.model.*;
import com.company.leavetracking.service.LeaveManager;
import java.util.Scanner;

public class Main{
 public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    LeaveManager manager = new LeaveManager();
    manager.LoadFromFile();
    while(true){
        System.out.println("\n====Leave Management System ===");
        System.out.println("1. Apply for Leave");
        System.out.println("2. View All Leave Requests");
        System.out.println("3. Save & Exit");
        System.out.print("Choose an option: ");
        int choice = s1.nextInt();

        if(choice==1){
            System.out.println("Enter EmployId : ");
            int empId = s1.nextInt();

            System.out.println("Enter leave type : (sick/causal/paid)");
            String type = s1.next();

            Leaverequest request;
            int requestId = (int)(Math.random()*1000);

            switch(type.toLowerCase()){
                case "sick":
                    request = new SickLeave(requestId,empId);
                    break;
                case "causal":
                    request = new CausalLeave(requestId,empId);
                    break;
                case "paid":
                    request = new PaidLeave(requestId,empId);
                    break;
                default:
                    System.out.println("Invalid option");
                    continue;
            }
            manager.addRequest(request);
        } else if(choice ==2){
            manager.displayAllRequest();
        }else if(choice ==3){
            manager.saveToFile();
            System.out.println("Data saved.");
            break;
        }else {
            System.out.println("Invalid option try again");
        }
    }
    s1.close();

}
}