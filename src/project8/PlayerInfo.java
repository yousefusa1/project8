/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project8;

/**
 *
 * @author Yousef
 */
public class PlayerInfo {
    public String firstName;
    public String lastName;
    public int swipeCardNum ;
    
    public PlayerInfo(){
            firstName=null;
            lastName =null;
        }
    
        public PlayerInfo(String fn , String ln){
        
            firstName = fn;
            lastName = ln;
        
        }
        
        public String getFirstname(){
            return firstName;
        }
        
        public String getLastName(){
            return lastName;
        }
        
        public void setSwipeCard( int num){
                swipeCardNum=num;
        }
        
        
        public int getSwipeCard( ){
                return swipeCardNum;
        }
                
                
        
        
        
}
