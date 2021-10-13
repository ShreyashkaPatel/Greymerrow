 package com.story;

import java.lang.Math;
import java.util.*;

 class Profession {
     //attributes
     String type;
     int HP;
     int Power;

     // Weapon attributes
     String weapon;
     int weaponAttack;

     Profession (char typeC) {
         switch (typeC) {
             case 'B' : {
                 type = "Barbarian";
                 HP = 600;
                 Power = 20;
                 break;
             }
             case 'A' : {
                 type = "Archer";
                 HP = 400;
                 Power = 30;
                 break;
             }
             case 'W' : {
                 type = "Wizard";
                 HP = 200;
                 Power = 40;
                 break;
             }
             default : System.out.println("Something went wrong.");
         }
     }

     void setWeapon(char Weapon)
     {
         switch (Weapon) {
             case 'S' : {
                 weapon = "Sword";
                 weaponAttack = 20;
                 break;
             }
             case 'K' : {
                 weapon = "Knuckles";
                 weaponAttack = 10;
                 break;
             }
             case 'C' : {
                 weapon = "Crossbow";
                 weaponAttack = 50;
                 break;
             }
             case 'P' : {
                 weapon = "Spear";
                 weaponAttack = 40;
                 break;
             }
             case 'F' : {
                 weapon = "FireBall";
                 weaponAttack = 90;
                 break;
             }
             case 'L' : {
                 weapon = "Lightning";
                 weaponAttack = 75;
                 break;
             }
             default : System.out.println("Something went wrong.");
         }
     }

     int attack(Scanner s){

         int monsterHP = Math.min(1000,(int)(100*Math.random()*100*Math.random()));
         int monsterAttack = 60;

         System.out.println("A monster with " + monsterHP +" HP appeared!!");
         while(monsterHP > 0)
         {
             System.out.println("------------------------------------");
             System.out.println("Do you want to Attack or try to Dodge?");
             System.out.println("------------------------------------");
             System.out.println(" A: Attack ");
             System.out.println(" D: Dodge ");
             System.out.println("------------------------------------");
             char choice;
             do {
                 choice = s.next().toUpperCase().charAt(0);
                 if(choice == 'A')
                 {
                     int damage = (this.Power*10 + this.weaponAttack*7)/(int)(10*Math.random()+1);
                     System.out.println("You attack for " + damage + " damage.");
                     monsterHP -= damage;
                     if(monsterHP<=0)
                         break;
                     else
                         System.out.println("The monster has " + monsterHP + " HP left.");

                     int hit = (int)(monsterAttack + 50*Math.random());
                     System.out.println("The monster hit you for " + hit + " damage.");
                     this.HP -= hit;
                     if(this.HP <= 0)
                         return -1;
                     else
                         System.out.println("You have " + this.HP + " HP left.");
                 }
                 else if(choice == 'D')
                 {
                     if(Math.random()>0.5)
                     {
                         int hit = (int)(monsterAttack + 50*Math.random());
                         System.out.println("The monster hit you for " + hit + " damage.");
                         this.HP -= hit;
                         if(this.HP <= 0)
                             return -1;
                         else
                             System.out.println("You have " + this.HP + " HP left.");
                     }
                     else {
                         System.out.println("The monster missed you!");
                     }
                 }
                 else{
                     System.out.println("Invalid Operation");
                 }
                 System.out.println();
             }while(choice != 'A' && choice !='D');
         }
         System.out.println("You have defeated the monster!\n");
         return 0;
     }
 }