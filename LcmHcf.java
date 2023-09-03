import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class LcmHcf{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int number1;
        int number2;
        int lcm=1;
        int hcf=1;

        System.out.println("Please write one of numbers which you want to learn their Lcm(Lower Common Multiple)- Hcf(Higher Common Factor): ");
        number1=input.nextInt();
        System.out.println("And write other one: ");
        number2=input.nextInt();

        if(number1 == number2) {

            lcm = number1;
            hcf= number1;
            System.out.println("Lcm and Hcf of two numbers are the same and equal to two numbers: "+number1);
            
        }

        int leastnumber=1;
        int largestnumber=1;

        if(number1>number2){
            leastnumber=number2;
            largestnumber=number1;
        } else{
            leastnumber=number1;
            largestnumber=number2;
        }
        
        for(int i=1; i<= leastnumber; i++){
            if(number1%i==0 && number2%i==0){
             hcf=i;
            }
            
        }
        


        for(int k=10000; k>=largestnumber; k--){
            if(k%number1==0 && k%number2==0){
                lcm=k;
                

            }

        }



        System.out.println("Hcf of two numbers are: "+hcf);
        System.out.println("Lcm of two numbers are: "+lcm);
        





    }
}