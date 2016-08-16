/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devmetro1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



/**
 *
 * @author User
 */
public class DevMetro1 {
     public static final int M = 3468;
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       Map<Integer,Integer> list = new HashMap<>();
       
      
       list.put(5,100);
       list.put(10,48);
       list.put(50, 60);
             
       List keyList = new ArrayList(list.keySet());
       List valueList = new ArrayList(list.values());
       
       Bankomat b = new Bankomat(M);
       Map map = b.Check(keyList,valueList);
       try{
           b.Display(map);
       }
       catch(NullPointerException e){
           System.out.println("Unable to withdraw!");
       }
       
    }
    
}
