/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathes;

/**
 *
 * @author Win-7
 */
public class Comman {

    int first_value;
    int second_value;
    int first_pow_value;
    int second_pow_value;
    String ADD = "+";
    String SUB = "-";
    int first_ab_value;
    int second_ab_value;
    int result;
    public int twopower(String a_value, String pow_a_value, String b_value, String pow_b_value,String oparation) {
//    a2 – b2 = (a – b)(a + b)

        first_value = Integer.valueOf(a_value);
        second_value = Integer.valueOf(b_value);
        first_pow_value = Integer.valueOf(pow_a_value);
        second_pow_value = Integer.valueOf(pow_b_value);
        
        if(SUB.equals(oparation) && first_pow_value == 2 && second_pow_value == 2){
            first_ab_value = first_value - second_value;
            second_ab_value = first_value + second_value ;
            result = first_ab_value * second_ab_value;
        }
        return result;
        
    }
}
