
 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
 
/**
 *
 * @author Lenovo
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
/**
 *
 * @author Kostadinova
 */
public class DanceClub {
 
    private String name;
    private int numberOfParticipants;
    private int maxNumberOfParticipants;
    private boolean isForAdults;
 
    public DanceClub() {
    }
 
    public DanceClub(String name, int numberOfParticipants, int maxNumberOfParticipants, boolean isForAdults) {
        this.name = name;
        this.numberOfParticipants = numberOfParticipants;
        this.maxNumberOfParticipants = maxNumberOfParticipants;
        this.isForAdults = isForAdults;
    }
 
    public String getName() {
        return name;
    }
 
    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }
 
    public int getMaxNumberOfParticipants() {
        return maxNumberOfParticipants;
    }
 
    public boolean isIsForAdults() {
        return isForAdults;
    }
 
    @Override
    public String toString() {
        return "DanceClub{" + "name=" + name + ", numberOfParticipants=" + numberOfParticipants + ", maxNumberOfParticipants=" + maxNumberOfParticipants + ", isForAdults=" + isForAdults + '}';
    }
   
    void setNumberOfParticipants(int given_num) throws IllegalNumberOfParticipants{
        if(given_num < 0)
        {
            throw new IllegalNumberOfParticipants(given_num,-1);
        }
        if(given_num > this.maxNumberOfParticipants){
            throw new IllegalNumberOfParticipants(given_num,this.maxNumberOfParticipants);
        }
        this.numberOfParticipants = given_num;
    }
   
    void writeDanceClubName(String path){
        try(FileWriter fw = new FileWriter(path, true);
    BufferedWriter bw = new BufferedWriter(fw);
    PrintWriter out = new PrintWriter(bw))
{
    out.print(this.name + "-");
    }
 catch (IOException e) {
            System.out.println("IOEception is caught!");
}
    }
   
    boolean areSymbolsNeighbours(char first,char last){
        String searched = new StringBuilder().append(first).append(last).toString();
        for (int i = 0; i < this.name.length() - 1; i++) {
            char curr1 = this.name.charAt(i);
            char curr2 = this.name.charAt(i+1);
           
            String ver1 = new StringBuilder().append(curr1).append(curr2).toString();
            if(ver1.equals(searched)){
                return true;
            }
            String ver2 = new StringBuilder().append(curr2).append(curr1).toString();
            if(ver2.equals(searched)){
                return true;
            }
        }
        return false;
    }
 
}