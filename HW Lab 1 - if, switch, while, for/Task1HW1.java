
public class Task1HW1 {
public static void difference(int bottom,int top){
   
    for(int i = 1000;i < top;i++){
        
            String curr = String.valueOf(i);
            String front = curr.substring(0, 1);
            String back = curr.substring(1,4);
            
            
            String second = back + front;
            
            
            int second_one = Integer.parseInt(second);
            if(second_one - i > 5000){
                System.out.println(i);
            }
           // int k = Integer.valueOf(String.valueOf(back) + String.valueOf(front));
            
        
    }
    
}
    public static void main(String[] args) {
        int bottom=10,top=5000;
        difference(bottom,top);
        
    }
    
}
