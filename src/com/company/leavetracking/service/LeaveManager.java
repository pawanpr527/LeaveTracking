package com.company.leavetracking.service;
import java.util.List;
import com.company.leavetracking.model.Leaverequest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LeaveManager {
    private List<Leaverequest> leaveRequests = new ArrayList<>();
    private final String filename = "leave_data.dat";

    public void addRequest(Leaverequest request){
        leaveRequests.add(request);
        System.out.println("Leave request added");
    }

    public void displayAllRequest(){
        if (leaveRequests.isEmpty()){
            System.out.println("No leave request found");
        } else{
            for (Leaverequest lr : leaveRequests){
                lr.displayRequest();
            }
        }
    }

    public void saveToFile(){
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))){
            out.writeObject(leaveRequests);
            System.out.println("SuccessFully saved data");
        }catch(IOException a){
            a.printStackTrace();
          
        }
    }
    public void LoadFromFile(){
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
          leaveRequests = (ArrayList<Leaverequest>) in.readObject();
          System.out.println("Leave request Loaded from file");
        }catch(IOException | ClassNotFoundException e){
            System.out.println("Unable to load data");

        }

    }

    
}
