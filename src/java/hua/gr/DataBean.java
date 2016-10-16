/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hua.gr;

import java.io.Serializable;




public class DataBean implements Serializable  {
    private String[] answerArray=new String[12]; 
    public String getA(Integer index){
        return answerArray[index];
    }
    public void setA(String input,Integer index){
        this.answerArray[index]=input;
    }
    private int ID=0;
    public int getID(){
        return ID;
    }   
    public void setID(Integer id){
        this.ID=id;
    }
    
    
}
