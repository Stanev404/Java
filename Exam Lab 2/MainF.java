
/**
 *
 * @author Lenovo
 */
public class MainF {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DanceClub galaxy = new DanceClub("Galaxy",10,20,true);
        DanceClub club33 = new DanceClub("Club 33",10,20,true);
        try{
            //galaxy.setNumberOfParticipants(-1);
            galaxy.setNumberOfParticipants(50); // task 1
        }
        catch(IllegalNumberOfParticipants e){
            System.out.println(e);
        }
       
        galaxy.writeDanceClubName("club_names.txt");
        club33.writeDanceClubName("club_names.txt"); // task 2
       
        System.out.println(galaxy.areSymbolsNeighbours('a', 'G')); // task 3
       
       
    }
   
}