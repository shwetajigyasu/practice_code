package prcticegit.practicegit;

import javax.sql.rowset.spi.SyncFactoryException;

public class ArrayProgramm {

	public static void main(String[] args) {
		
		     int temp;
		
		   int [] arr= {40,30,39,20,12,13};
		   
		     int lnt= arr.length;
		     
		     for(int i=0;i<lnt;i++) {
		    	 
		    	 for(int j=i+1;j<lnt;j++) {
		    		 
		    		 if(arr[i]>arr[j]) {
		    			temp=arr[i];
		    			arr[i]=arr[j];
		    			arr[j]=temp;
		    		 }
		    		 
		    	 }
		    	 
		     }
             
              System.out.println("array in ascending order");
              for(int i=0;i<lnt;i++) {
            	  System.out.print(arr[i]+" ");
              }
              System.out.println();
              System.out.println(arr[lnt-2]);
              
	}

}
