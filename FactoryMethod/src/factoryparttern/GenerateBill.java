package factoryparttern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
	public static void main(String args[]) throws IOException{
        GetPlanFactory planFactory = new GetPlanFactory();
 
        System.out.print("Nhap ten cua plan de tao hoa don: ");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        String planName = br.readLine();
        
        System.out.print("Nhap so luong don vi cho hoa don: ");
        int unit = Integer.parseInt(br.readLine());
 
        Plan p = planFactory.getPlan(planName);
 
        System.out.print("Hoa don " + planName + " cua  " + unit + " don vi la: ");
        p.getRate();
        p.calculateBill(unit);
    }

}
