package com.grocerymarket;



import java.util.ArrayList;

public class Grocerylist {

    private ArrayList<String>grocerylist=new ArrayList<String>();



    public void addgroceryitem(String item){
        grocerylist.add(item);

    }


    public void Printgrocerylist(){

        System.out.println("you have"+grocerylist.size()+"items in grocry list");
        for(int i=0;i<grocerylist.size();i++)
        {
            System.out.println((i+1)+". "+grocerylist.get(i));

        }

    }



    public void modif_item(int position,String newitem){

        grocerylist.set(position,newitem);
        System.out.println("Grocery Item "+(position+1)+" has been modified");
    }

    public void removeGrocery(int position)
    {
        String theItem=grocerylist.get(position);
        grocerylist.remove(position);
    }

    public String findItem(String searchItem){
        //boolean exists =grocerylist.contains(searchItem);
        int position=grocerylist.indexOf(searchItem);
        if(position>=0){
            return grocerylist.get(position);
        }

        return null;
    }


}
