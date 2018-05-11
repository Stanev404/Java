
public class Task1HW2 {
    
        
    

    public static void main(String[] args) {
    int N = 6; // тук задаваме размера
 
            int sz = N;
            for(int i = 0;i<N;i++){
                int k = i;
                while(k > 0) {
                    System.out.print(" ");
                    k--;
                }
                for(int j = i + 1;j <= sz;j++){
                System.out.print(j);
                }
               
                for(int j = N;j > 0 + i;j--){
                System.out.print(j);
                }
                System.out.println();
            }
            for(int i = 1;i < N;i++){
                int k = N - i - 1;
                while(k > 0){
                    System.out.print(" ");
                    k--;
                }
                for(int j = N - i;j <= N;j++){
                    System.out.print(j);
           
    }
                for(int j = N;j >= N - i;j--){
                    System.out.print(j);
                }
                System.out.println();
            }
    
   

    }
    
}
