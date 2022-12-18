package com.grocerymarket;



import java.util.ArrayList;

public class Grocerylist {

    private   ArrayList<String>grocerylist=new ArrayList<String>();



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

  public void modif_item(String currentitem,String newitem){
        int position=findItem(currentitem);
        if(position>=0)
        {
            modify_item(position,newitem);
        }
  }

    private void modify_item(int position,String newitem){
        grocerylist.set(position,newitem);
        System.out.println("Grocery Item "+(position+1)+" has been modified");


    }
    public void remove_Grocery(String newitem){
        int position=findItem(newitem);
        if(position>=0)
        {
            removeGrocery(position);
        }
    }

   private void removeGrocery(int position)
    {
        String theItem=grocerylist.get(position);
        grocerylist.remove(position);
    }

   private int findItem(String searchItem) {
        //boolean exists =grocerylist.contains(searchItem);
        return grocerylist.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position =findItem(searchItem);
        if (position>=0){
            return true;
        }
        return false;
    }


}
