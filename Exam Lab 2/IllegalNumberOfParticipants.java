
 
/**
 *
 * @author Lenovo
 */
public class IllegalNumberOfParticipants extends Exception {
    private int illegal_participants;
    private int max;
 
    public IllegalNumberOfParticipants(int given_num,int max) {
        this.illegal_participants = given_num;
        this.max = max;
    }
   
    @Override
    public String toString(){
        if(max > 0){
        return "IllegalNumberOfParticipantsException: " + this.illegal_participants + "/" + this.max+ " participants caught!";
        }
        return "IllegalNumberOfParticipantsException: " + "negative number";
        }
   
}