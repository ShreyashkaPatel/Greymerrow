package com.story;

import java.util.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // variables
        char ProChoice,
                WeaponChoice, choice;
        boolean flag;

        System.out.println("-----====== A Magical World ======-----");
        System.out.println();
        System.out.println();
        // Introduction
        System.out.println("It's windy. Almost chilling.\n"
                +
                "You wake up gingerly, surveying your surroundings.\n"
                +
                "You have hands, and your torso is fine. Well, that's a good start.\n"
                +
                "You're lying in a field of tall grass. The ground is soft underfoot, which is strange\n"
                +
                "since it's so dry. There are trees on either side of the path you took\n"
                +
                "when you woke up, but they're too far away to see any details.\n"
                +
                "They just look like dark silhouettes on the horizon.\n"
                +
                "\"Ahoy adventurer!\"");
        // The strange old man
        System.out.println("\nYou whip back at the sound. Your head throbs with the speed you'd turned.\n"
                +
                "making it hard to focus on anything.\n"
                +
                "\"Where are we?!\" you demand. \"How did we get here?\" \n"
                +
                "You take a couple of deep breaths. Okay, that was easier than expected.\n"
                +
                "Now you feel slightly more calm and alert.\n"
                +
                "Your rescuer, who seems to be an old man,  appears next to you in a swirl of smoke,\n"
                +
                "looking rather pleased with himself. He has wild red hair and bright green eyes.\n"
                +
                "\"We should go on an adventure, young one! What do you say?\n"
                +
                "We'll have fun while we wait for spring.\"\n"
                +
                "\"What, now?!\"\n"
                +
                "The man raises his hand. \"What profession are you, my dear child?\"\n");

        // Choosing a profession
        System.out.println("\nYou pause, trying to remember...");
        System.out.println("------------------------------------");
        System.out.println(" You are a : ");
        System.out.println(" B : Barbarain ");
        System.out.println(" W : Wizard ");
        System.out.println(" A : Archer ");
        System.out.println("------------------------------------");

        // Instantization of the profession
        do{
            // User input for Profession
            ProChoice = s.next().toUpperCase().charAt(0);
            switch (ProChoice) {
                case 'B' : {
                    System.out.println("\"I think I am a Barbarian...\"");
                    flag = false;
                    break;
                }
                case 'W' : {
                    System.out.println("\"I think I am a Wizard...\"");
                    flag = false;
                    break;
                }
                case 'A' : {
                    System.out.println("\"I think I am an Archer...\"");
                    flag = false;
                    break;
                }
                default : {
                    System.out.println("\tNot a valid Profession.");
                    flag = true;
                    break;
                }
            }
        }while(flag);

        Profession Player1 = new Profession(ProChoice);

        System.out.println("\"A " + Player1.type +  ", huh? Where is your weapon?\" ");

        System.out.println("You think to yourself. It seems you don't have one on you. \n" +
                "\"Don't sweat it, kid!\" ");

        // reset flag for a different use
        flag = true;
        // Instantization of the weapon
        do{
            if(ProChoice == 'B')
            {
                System.out.println("------------------------------------");
                System.out.println("Choose a Weapon type: ");
                System.out.println("------------------------------------");
                System.out.println(" S: Sword ");
                System.out.println(" K: Knuckles ");
                System.out.println("------------------------------------");
                // User input for weapon
                WeaponChoice = s.next().toUpperCase().charAt(0);

                switch (WeaponChoice) {
                    case 'S' : {
                        System.out.println("\"I'll select a Sword\"");
                        flag = false;
                        break;
                    }
                    case 'K' : {
                        System.out.println("\"I'll select a pair of Knuckles \"");
                        flag = false;
                        break;
                    }
                    default : System.out.println("\tNot a valid Weapon.");
                }
            }

            else if(ProChoice == 'W')
            {
                System.out.println("------------------------------------");
                System.out.println("Choose a spell type: ");
                System.out.println("------------------------------------");
                System.out.println(" F: FireBall ");
                System.out.println(" L: Lightning ");
                System.out.println("------------------------------------");
                // User input for weapon
                WeaponChoice = s.next().toUpperCase().charAt(0);

                switch (WeaponChoice) {
                    case 'F' : {
                        System.out.println("\"I'll select a FireBall spell\"");
                        flag = false;
                        break;
                    }
                    case 'L' : {
                        System.out.println("\"I'll select a Lightning spell\"");
                        flag = false;
                        break;
                    }
                    default : System.out.println("\tNot a valid Weapon.");
                }
            }

            else {
                System.out.println("------------------------------------");
                System.out.println("Choose a Weapon type: ");
                System.out.println("------------------------------------");
                System.out.println(" C: CrossBow ");
                System.out.println(" P: Spear ");
                System.out.println("------------------------------------");
                // User input for weapon
                WeaponChoice = s.next().toUpperCase().charAt(0);

                switch (WeaponChoice) {
                    case 'C' : {
                        System.out.println("\"I'll select a CrossBow \"");
                        flag = false;
                        break;
                    }
                    case 'P' : {
                        System.out.println("\"I'll select a Spear \"");
                        flag = false;
                        break;
                    }
                    default : System.out.println("\tNot a valid Weapon.");
                }
            }

        }while(flag);
        // Player chooses weapon.
        Player1.setWeapon(WeaponChoice);

        // Now story starts ...

        System.out.println("\nYou inspect your tool, admiring the craft. You turn around and test it out.");
        System.out.println(" \"What now?\", you ask the old man, but he is nowhere to be seen.\n"
                +
                "That can't be right. You didn't even feel him move.\n"
                +
                "How did he just disappear from behind you?\n"
                +
                "You look all around. Where did he go? You're not seeing him anywhere.\n");
        System.out.println("You walk forward slowly. This is a little creepy.\n\n"
                +
                "You pause before another tree on this road. You step forward.\n"
                +
                "Then you realize something else...\n");
        System.out.println("\nThere's a fork in the Road. Where will you go?");
        System.out.println("------------------------------------");
        System.out.println("L: Left\n" +
                "R: Right");
        System.out.println("------------------------------------");

        // Fork in the road ...
        do{
            choice = s.next().toUpperCase().charAt(0);
            if(choice == 'L')
            {
                System.out.println("You consider going left.\n"
                        +
                        "You might have to make a sharp turn, though.\n"
                        +
                        "That might cause some problems.\n");
                System.out.println("You reach a riverbed. You decide that would be the best choice.\n"
                        +
                        "There could be monsters there if you were wrong. And besides, you've been\nthrough worse...\n"
                        +
                        "You cross it. It's shallow enough not to need to worry about slipping on.\n"
                        +
                        "The forest is thick, with low branches everywhere. A few birds fly overhead.\n");
                System.out.println("\nYou hear some monsters ahead. Do you engage?");
                System.out.println("\n...\nAs if you get a chance.\n");
                int alive = Player1.attack(s);
                if(alive == -1)
                {
                    System.out.println("You gasp, as death looms over you. You thought this would be easy.\n" +
                            "As you take your last breaths, you wonder what went wrong.");
                }
                else
                {
                    System.out.println("After Defeating the monster, you move on.");
                    System.out.println("You reach a field. You can see a town in the distance.");
                    System.out.println("After walking for a while, you reach the town.");
                    System.out.println("\nThe town seemed eerily quiet.");
                }
            }
            else if(choice == 'R')
            {
                System.out.println("But something still feels off.\n"
                        +
                        "Like there's something missing or wrong.\n"
                        +
                        "Something about this whole situation doesn't make sense.\n"
                        +
                        "You continue down the road. This place is weird. You don't know where to go.\n"
                        +
                        "You don't want to go to town, because towns seem creepy and unfamiliar.\n"
                        +
                        "Also, why is your chest tightening?\n");
                System.out.println("Something tells you you don't belong here.\n"
                        +
                        "Maybe the air feels different. Or maybe it's just that\n"
                        +
                        "you've never experienced a place like this before.\n"
                        +
                        "Either way, it feels strange. As if you've been here before, yet haven't.\n"
                        +
                        "As you keep walking, you hear faint rustling noises coming from the forest.\n"
                        +
                        "You keep walking. You can see the shadow of a building in the distance.\n"
                        +
                        "It appears to be a castle, possibly built to protect the area.\n"
                        +
                        "You wonder if it is a good idea to enter the castle.\n");
                System.out.println("Enter the Castle?");
                System.out.println("------------------------------------");
                System.out.println("C: Yes\n" +
                        "N: No, this is too dangerous.");
                System.out.println("------------------------------------");

                char choice2;

                do{
                    choice2 = s.next().toUpperCase().charAt(0);
                    if(choice2 == 'C')
                    {
                        int alive = Player1.attack(s);
                        if(alive == -1)
                        {
                            System.out.println("You gasp, as death looms over you. You thought this would be easy.\n" +
                                    "As you take your last breaths, you wonder what went wrong.");
                        }
                        else
                        {
                            System.out.println("After Defeating the monster, you move on.");
                            System.out.println("You reach a field. You can see a town in the distance.");
                            System.out.println("After walking for a while, you reach the town.");
                            System.out.println("\nThe town seemed eerily quiet.");
                        }
                        break;
                    }
                    else if(choice2 == 'N')
                    {
                        System.out.println("You leave the castle be.");
                        System.out.println("You move on, and approach a town.");
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid Input");
                    }
                }while(choice2 != 'C' && choice2 != 'N');

            }
        }while(choice != 'R' && choice != 'L');

        System.out.println("-------------------------------------------------------");
        System.out.println("The story ends here, stay tuned for the full version!!!");
    }
}
