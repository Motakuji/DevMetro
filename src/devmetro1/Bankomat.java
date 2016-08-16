/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devmetro1;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.lang.NullPointerException;


/**
 *
 * @author User
 */
public class Bankomat {
    int sum;
    
    
    Bankomat(int sum) {
       this.sum = sum;
    }
    
    public Map Check(List keyList,List valueList){
        Map<Integer,Integer> map = new HashMap<>();
        int n = valueList.size(), sum2 = sum;
        
       
        for(int i =0; i < n; i++){
            int max = (int) keyList.get(0),imax = 0;
            for(int j =0; j < valueList.size(); j++){
                if(max < (int) keyList.get(j)){
                    imax = j;
                    max = (int) keyList.get(j); 
                }
            }
            if((int) valueList.get(imax) <= sum/max){
                map.put(max, (int) valueList.get(imax));
                sum2 -= (int) valueList.get(imax) * max;
                sum =sum%max+ max * (sum/max - (int) valueList.get(imax));
                
            }
            else{
                map.put(max, sum/max);
                sum2 -= sum/max * max;
                sum =sum%max;
                 
            }
            
           
            keyList.remove(imax);
            valueList.remove(imax);
           
        }
         if(sum2 == 0)
             return map; 
         else
             return null;
        
    }
    
    public void Display(Map map){        
        if(map == null){
            throw new NullPointerException();
        }
        else{
            map.entrySet().stream().forEach((entry) -> {
                System.out.println(entry);
             });    
        }
       
    }

}
