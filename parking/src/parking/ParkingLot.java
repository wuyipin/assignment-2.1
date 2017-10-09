package parking;
import java.util.ArrayList;
import java.util.Scanner;
public class ParkingLot {
	
	int exit;//smallin 1,smallout 2,normalin 3,normalout 4,largein 5,largeout 6
	int i=0;int car=0;int bus=0;int bike=0;int vehicle=0;
	int spaceconquer;
		ArrayList<ParkingSpace> numofvehicle = new ArrayList<ParkingSpace>();
		ArrayList<ParkingSpace> numofcar = new ArrayList<ParkingSpace>();
		ArrayList<ParkingSpace> numofbus = new ArrayList<ParkingSpace>();
		ArrayList<ParkingSpace> numofbike = new ArrayList<ParkingSpace>();
		
	public void addadress(String a,int num) {
		switch(a) { 
			case "car":
				car++;
				vehicle++;
				ParkingSpace acar=new ParkingSpace(num); 
				numofcar.add(acar);
				for(i=0;i<numofcar.size();i++)
				{
					if(numofcar.get(i)==null)
					{
						numofcar.add(i, acar);
						break;
					}
					
					
				}
				
				acar.free=false;
				numofvehicle.add(acar);
				System.out.println(101-car+" ParkingLots is left of your types ");
				System.out.println("Your exit gate is 1 ");
				System.out.println("Your Parking address is 0 floor "+numofcar.indexOf(acar));
				break;
			case "bus":
				bus++;
				vehicle++;
				ParkingSpace abus=new ParkingSpace(num); 
				numofbus.add(abus);
				for(i=0;i<numofbus.size();i++)
				{
					if(numofbus.get(i)==null)
					{
						numofbus.add(i, abus);
						break;
					}
					
					
				}
				
				abus.free=false;
				numofvehicle.add(abus);
				System.out.println(101-bus+" ParkingLots is left of your types ");
				System.out.println("Your exit gate is 2 ");
				System.out.println("Your Parking address is 1 floor "+numofbus.indexOf(abus));
				break;
			case "bike":
				bike++;
				vehicle++;
				ParkingSpace abike=new ParkingSpace(num); 
				numofbike.add(abike);
				for(i=0;i<numofbike.size();i++)
				{
					if(numofbike.get(i)==null)
					{
						numofbike.add(i, abike);
						break;
					}
					
					
				}
				
				abike.free=false;
				numofvehicle.add(abike);
				System.out.println(101-bike+" ParkingLots is left of your types ");
				System.out.println("Your exit gate is 3 ");
				System.out.println("Your Parking address is 2 floor "+numofbike.indexOf(abike));
				break;
		
		}
		if(numofcar.size()>100||numofbus.size()>100||numofbike.size()>100) 
		{
			System.out.println("Sorry,our parking lot is full");
		}
		else {
			System.out.println("Welcome");
		}
		//spaceconquer=numofvehicle.size();
	}
	public void removeadress(String a,int num) {
		switch(a) { 
		case "car":
			car--;
			vehicle--;
			for(int j=0;j<numofcar.size();j++)
			{
				if(numofcar.get(j).num==num)
				{	
					numofcar.add(j, null);
					break;
				}
				
				
			}
			System.out.println("Your exit gate is 4 ");
			
			break;
		case "bus":
			bus--;
			vehicle--;
			for(int j=0;j<numofbus.size();j++)
			{
				if(numofbus.get(j).num==num)
				{	
					numofbus.add(j, null);
					break;
				}
				
				
			}
			System.out.println("Your exit gate is 5 ");
			//System.out.println("See you next time");
			break;
		case "bike":
			bike--;
			vehicle--;
			for(int j=0;j<numofbike.size();j++)
			{
				if(numofbike.get(j).num==num)
				{	
					numofbike.add(j, null);
					break;
				}
				
				
			}
			System.out.println("Your exit gate is 6 ");
			//System.out.println("See you next time");
			break;
		}
	}
	//ÊÕÇ®
	public float putMoney(String types,int licence,float entertime, float outtime){
        float money = 0;
        if(types.equals("suv")){
            suv b=new suv();
            money = (outtime - entertime)*b.price;
        }
        else if(types.equals("pickup")){
            pickup c=new pickup();
            money = (outtime - entertime)*c.price;
        }
        else if(types.equals("electric")){
        	electric cc=new electric();
            money = (outtime - entertime)*cc.price;
        }
        else if(types.equals("normalbus")){
        	normalbus cd=new normalbus();
            money = (float) ((outtime - entertime)*cd.price);
        }
        else if(types.equals("coach")){
        	coach cds=new coach();
            money = (float) ((outtime - entertime)*cds.price);
        }
        else if(types.equals("van")){
        	coach ds=new coach();
            money = (float) ((outtime - entertime)*ds.price);
        }
        else if(types.equals("motorbike")){
        	motorbike dsa=new motorbike();
            money = (float) ((outtime - entertime)*dsa.price);
        }
        else {
            cycle da=new cycle();
            money = (float) ((outtime - entertime)*da.price);
        }
        return money;
        
    }    
	//main function
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ParkingLot a=new ParkingLot();
        while(true){
        	 System.out.println("Please input enter/out");
        	 if(scan.next().equals("enter"))
        	 {	
        		 Vehicle avehicle=new Vehicle();
        		 System.out.println("types(car,bus,bike),licence,entertime(The entry time is rounded down),weight£º");//In general,we get these data from sensor
        		 String aa= scan.next();
        		 avehicle.license = scan.nextInt();
                 avehicle.entertime=scan.nextFloat();
                 avehicle.weight=scan.nextFloat();
                 System.out.println(a.vehicle+" vehicles in our ParkingLot ");  
                 a.addadress(aa,avehicle.license);
        		 
        	 }
        	
        	 else {
        		 Vehicle avehicle=new Vehicle();
        		 System.out.println("types(car,bus,bike),licence,outtime(The out time is rounded up)£º");
        		 String aa= scan.next();
        		 avehicle.license=scan.nextInt();
        		 avehicle.outtime=scan.nextFloat();
        		 a.removeadress(aa, avehicle.license);
        		 switch(aa)
        		 {
        			 case "car":
        				 System.out.println("detailtypes(suv,pickup,electric)");
        				 String typecar=scan.next();
        				              
        				 float amoney = a.putMoney(typecar,avehicle.license,avehicle.entertime, avehicle.outtime);
        				 System.out.println("your must pay£º");
                         System.out.println(amoney + "euro");
                         System.out.println("See you next time");
                         break;
        			 case "bus":
        				 System.out.println("detailtypes(normalbus,coach,van)");
        				 String typebus=scan.next();
        				// System.out.println(a.vehicle+" vehicles in our ParkingLot ");                
        				 float bmoney = a.putMoney(typebus,avehicle.license,avehicle.entertime, avehicle.outtime);
        				 System.out.println("your must pay£º");
                         System.out.println(bmoney + "euro");
                         System.out.println("See you next time");
                         break;
        			 case "bike":
        				 System.out.println("detailtypes(motorbike,cycle)");
        				 String typebike=scan.next();
        				// System.out.println(a.vehicle+" vehicles in our ParkingLot ");                
        				 float cmoney = a.putMoney(typebike,avehicle.license,avehicle.entertime, avehicle.outtime);     			 
        				 System.out.println("your must pay£º");
                         System.out.println(cmoney + "euro");
                         System.out.println("See you next time");
                         break;
        		 }
                 
        		
        		
        		
        	 }
        	
        }
	 
	}
	
	
	
}