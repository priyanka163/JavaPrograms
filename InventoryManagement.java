package com.wish.priya;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class InventoryManagement {


    String nameofinventory;
    Long weightofinventory;
    Long priceofinventory;
    public static void main(String args[]) throws ParseException, FileNotFoundException, IOException, org.json.simple.parser.ParseException
    {
    	try{
   JSONParser parser =new JSONParser();
   JSONArray array= (JSONArray) parser.parse(new FileReader("JSON.json"));
   
   Iterator<JSONObject> iterator = array.iterator();
   Iterator<JSONObject> iterator1=array.iterator();
   //displaying inventory details
   System.out.println("details of inventory management");
   System.out.println("weight name price total");
   
   while (iterator.hasNext()) {
JSONObject obj= (JSONObject)iterator.next();
InventoryManagement im = new InventoryManagement();
  im.weightofinventory=(Long) obj.get("weight(kg)");
  System.out.print(im.weightofinventory + "           ");

  im.nameofinventory=(String) obj.get("name");
  System.out.print(im.nameofinventory + "           ");
  
  im.priceofinventory=(Long) obj.get("price/kg");
  System.out.print(im.priceofinventory + "           ");

  System.out.println(im.weightofinventory * im.priceofinventory);    //give total price
  System.out.println();
} 
   System.out.println("json objects");
   while (iterator1.hasNext()) {
	   
	   JSONObject obj=  (JSONObject)iterator1.next();
	   System.out.println(obj.toString());
   }
	
	
}
    
    catch(FileNotFoundException e)
    {
    	e.printStackTrace();
    	
    
    }
    catch(IOException e)
    {
    	e.printStackTrace();
    }
    }
	 public String toString() {
 return "weight:" +  this.weightofinventory+ "name:" + this.weightofinventory + "price/kg" + this.priceofinventory;

		
	} 


	
    }
   
   
   



