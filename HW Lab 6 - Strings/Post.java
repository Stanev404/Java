/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 
*/

class Post {
    private static int number;
    private int current_number;
    private String header_title;
    private String text;
    public int value;
    
    Post(){};
    Post(String header_title,String text){
        this.header_title = header_title;
        this.text = text;
        Post.number++;
        this.current_number = Post.number;
        value = 0;
    }
    
    String getTitle(){
        return this.header_title;
    }
    
    void setValue(int val){
        this.value = val;
    }
    
    int getValue(){
        return value;
    }
    
    boolean existInTitle(String given_one){
        int given_one_sz = given_one.length();
        for(int i = 0;i<=this.header_title.length() - given_one_sz;i++) {// testa test
            String curr = this.header_title.substring(i, i+given_one_sz);
            if(curr.equals(given_one)){
                return true;
            }
        }
        return false;
}
    int existInText(String given_one){
        int res = 0;
        int given_one_sz = given_one.length();
        for(int i = 0;i<=this.text.length() - given_one_sz;i++) { // testa test
            String curr = this.text.substring(i, i+given_one_sz);
            if(curr.equals(given_one)){
                res++;
            }
           
    }
        return res;
}
}
