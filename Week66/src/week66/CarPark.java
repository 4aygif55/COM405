/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week66;

/**
 *
 * @author 4aygif55
 */
public class CarPark 
{
    private Car[] space;
    
    public  CarPark()
    {
    space = new Car[15];
    }
   
    public boolean addCar(Car carIn)
   {
   for(int i=0; i<space.length; i++)
   {
   if(space[i] == null)
   {
    space[i] = carIn;
    return true;
   }
  }
  return false;
  }
   
    public boolean removeCar(String reg)
    {
    for(int i=0; i<space.length; i++)
   {
   if(space[i] != null)
   {
   if(space[i].getRegNo().equals(reg))
   {
   space[i] = null;
   return true;
   }
   }
   }
    return false;
    }
    
    public int getEmptySpace()
    {
        int tally = 0;
       for(int i=0; i<space.length; i++)
   {
   if(space[i] == null)
   {
   tally++;
   }
   }
       return tally;
    }





}
