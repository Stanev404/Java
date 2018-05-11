/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class InsufficientQuatityOfGoodsException extends Exception{
    private int quantity;
    InsufficientQuatityOfGoodsException(String message,int number){
        super(message);
        this.quantity=number;
    }
    int get_quantity(){
        return this.quantity;
    }
    @Override
    public String toString(){
        return super.getMessage() + this.quantity;
    }
}
