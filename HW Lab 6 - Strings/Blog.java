/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
class Blog {
    private Post [] list_of_posts;
    private int curr_pos;
    Blog(){
    this.list_of_posts = new Post[10];
    this.curr_pos = 0;
    }
    
    void addPost(Post added_one){
        if(this.curr_pos < this.list_of_posts.length){
            this.list_of_posts[this.curr_pos] = added_one;
            this.curr_pos++;
        }
        else{
            System.out.println("Blog list is full!");
        }
    }
    
    void printTitles(String given_one){
        for(int i =0;i<this.curr_pos;i++){
            int curr_value = this.list_of_posts[i].existInText(given_one);
            this.list_of_posts[i].setValue(curr_value);
            
        }
        sortByValues();
        for(int i = 0;i<this.curr_pos;i++){
            System.out.println(this.list_of_posts[i].getTitle());
        }
    }
    
    void sortByValues(){
        for(int i = 0;i<this.curr_pos - 1;i++){
            for(int j = i + 1;j<this.curr_pos;j++){
                if(this.list_of_posts[i].getValue() < this.list_of_posts[j].getValue()){
                    Post curr = new Post();
                    curr = this.list_of_posts[i];
                    this.list_of_posts[i] = this.list_of_posts[j];
                    this.list_of_posts[j] = curr;
                }
            }
        }
    }
    
    
}
