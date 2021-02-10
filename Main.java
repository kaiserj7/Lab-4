/*
Lab 4
Partenrs: Jacob Hartman and Jacob Kaiser
Date: 2/9/21
*/

import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random r = new Random ();
    int randomNum = r.nextInt (51);
    System.out.println("The Random Number Is:" + randomNum);

    while (randomNum > -1){
      System.out.println("" + randomNum);
      randomNum = randomNum - 1;
    }


    if (randomNum <=15){
      System.out.println("Ahoy mateys!");
    } else if (20 <= randomNum && randomNum <42){
      System.out.println("Cannonball!");
    } else if (15 < randomNum && randomNum < 20){
      System.out.println("Look a sea shanty!");
    } else if (42 <= randomNum){
      System.out.println("Look a sea shanty!");
    }
  }
}