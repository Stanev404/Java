/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lenovo
 */
public class JavaLabHW6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Post first = new Post("aava               sfasdasdTesta","asdsaddsa  sad s d ads sad text sadsadsds sssstests");
        Post second = new Post("abra","testtestteest");
        Post third = new Post("kababra","testtesttesttest");
//        if(test.existInTitle("Testa"))
//            System.out.println("Sudurja se");
//        else{
//            System.out.println("Ne se sudurja");
//        }
//        
//        System.out.println(test.existInText("text"));
        
        Blog test = new Blog();
        test.addPost(first);
        test.addPost(second);
        test.addPost(third);
        
        test.printTitles("test");
    }
    
}
