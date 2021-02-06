import java.util.*;
public class ValkyriaKingdom {
    
    // declaring variables
    public static String userName;
    public static String computerName;
    public static String userElement;
    public static String computerElement;
    public static int turnNumber = 0;
    public static double userHP = 100;
    public static double computerHP = 100;
    public static double userMP = 50;             
    public static double computerMP = 50;     
    public static int userShield = 0;       
    public static int computerShield = 0;   
    
    public static void welcomeMenu() {
        clearScreen();
        System.out.println("________________________________________________");
        System.out.println("|                                               |");
        System.out.println("|         WELCOME TO VALKYRIA KINGDOM           |");
        System.out.println("|         A Text-Based Fighting Game            |");
        System.out.println("|_______________________________________________|");
        System.out.println("|                                               |");
        System.out.println("|      To get started, type in the number       |");
        System.out.println("|             below and press enter.            |");
        System.out.println("|                                               |");
        System.out.println("|      1) Start new game                        |");
        System.out.println("|      2) About game                            |");
        System.out.println("|      3) Exit                                  |");
        System.out.println("|_______________________________________________|");
        
        Scanner numIn = new Scanner(System.in);
        double input = numIn.nextDouble();
        clearScreen(); 
        
        if (input == 1) {
            openingDialogue();
        } else if (input == 2) {
            aboutGame();
        } else if (input == 3) {
            System.exit(0);
        } 
        
        
    }
    public static void clearScreen() {
        for (double i = 0; i < 50; i++) {
            System.out.println();
        }
    }
    public static void aboutGame() {
        System.out.println("________________________________________________");
        System.out.println("|                                               |");
        System.out.println("|   GOAL                                        |");
        System.out.println("|      - Reduce foe's HP to 0 before you lose   |");
        System.out.println("|      all your HP                              |");
        System.out.println("|   STRATEGY                                    |");
        System.out.println("|      - Utilize the offensive and defensive    |");
        System.out.println("|      spells depending on the situation        |");
        System.out.println("|      - Take note that fire has advantage on   |");
        System.out.println("|      nature, water on fire, and nature on     |");
        System.out.println("|      water                                    |");
        System.out.println("|      - Mages generate 10 MP per turn          |");
        System.out.println("|_______________________________________________|");
        System.out.println("|                                               |");
        System.out.println("|           Enter the number of choice          |");
        System.out.println("|             below and press enter.            |");
        System.out.println("|                                               |");
        System.out.println("|      1) Start new game                        |");
        System.out.println("|      2) Exit                                  |");
        System.out.println("|_______________________________________________|");
        
        Scanner numIn = new Scanner(System.in);
        double input = numIn.nextDouble();
        
        if (input == 1) {
            openingDialogue();
        } else if (input == 2) {
            System.exit(0);
        }  
    }
    public static void openingDialogue() {
        Scanner numIn = new Scanner(System.in);
        Scanner wordIn = new Scanner(System.in);
                
        clearScreen();
        System.out.println("________________________________________________");
        System.out.println();
        System.out.println("In the Valkyria Kingdom, few individuals are born");
        System.out.println("with the power of magic. With a few time remaining");
        System.out.println("before the elves try to conquest your land, you ");
        System.out.println("are tasked to master how to utilize the full ");
        System.out.println("potential of your spells.");
        System.out.println();
        System.out.println("Press \"ENTER\" to continue...");
        System.out.println("_______________________________________________");
        wordIn.nextLine();

        // Sets user elemental attribute
        clearScreen();
        System.out.println("________________________________________________");
        System.out.println();
        System.out.println("Queen Erystrazsa commanded every mage in the ");
        System.out.println("kingdom to specialize with a single element to ");
        System.out.println("maximize the full potential of their magic. What ");
        System.out.println("is your elemental attribute?");
        System.out.println();
        System.out.println("Type the number of choice and press \"ENTER\"...");
        System.out.println();
        System.out.println("1) Fire");
        System.out.println("2) Water");
        System.out.println("3) Nature");
        System.out.println();
        System.out.println("_______________________________________________");
        double elementInput = numIn.nextDouble();       

        if (elementInput == 1) {
            userElement = "fire";
        } else if (elementInput == 2) {
            userElement = "water";
        } else if (elementInput == 3) {
            userElement = "nature";
        }
        
        // Sets user name       
        clearScreen();
        System.out.println("________________________________________________");
        System.out.println();
        System.out.println("The " + userElement + " spirit is glad to be ");
        System.out.println("chosen as your elemental guardian. How do you ");
        System.out.println("want everyone to call you?");
        System.out.println();
        System.out.println("Type your response and press \"ENTER\"...");
        System.out.println("_______________________________________________");
        userName = wordIn.nextLine();
        
        // Sets computer name, elemental attribute      
        clearScreen();
        System.out.println("________________________________________________");
        System.out.println();
        System.out.println("You have a nice name, " + userName + ".");
        System.out.println("You will spar with another elemental mage.");
        System.out.println("How rough do you want your training to be?");
        System.out.println();
        System.out.println("Type the number of choice and press \"ENTER\"...");
        System.out.println();
        System.out.println("1) Easy");
        System.out.println("2) Difficult");
        System.out.println();
        System.out.println("_______________________________________________");
        double difficultyInput = numIn.nextDouble();
        
        if (difficultyInput == 1) {
            if (elementInput == 1) {
            computerElement = "nature";
            computerName = "Gandharva";
            } else if (elementInput == 2) {
            computerElement = "fire";
            computerName = "Agni";
            } else if (elementInput == 3) {
            computerElement = "water";
            computerName = "Varuna";
            }
        } else if (difficultyInput == 2) {
            if (elementInput == 1) {
            computerElement = "water";
            computerName = "Varuna";
            } else if (elementInput == 2) {
            computerElement = "nature";
            computerName = "Gandharva";
            } else if (elementInput == 3) {
            computerElement = "fire";
            computerName = "Agni";
            }
        }
        
        clearScreen();
        System.out.println("________________________________________________");
        System.out.println();
        System.out.println("Wield your wand for the future of the ");
        System.out.println("Valkyria Kingdom! Go and train with ");
        System.out.println(computerName + ", a " + computerElement + " mage.");
        System.out.println("Queen Erystrazsa will be watching!");
        System.out.println();
        System.out.println("Press \"ENTER\" to continue...");
        System.out.println("_______________________________________________");
        wordIn.nextLine();
    }
    
    public static String statusBar (double value) {
        String bar = " ";
        if (value <= 10) {
            bar = "[----------]";
        } else if (value <= 20) {
            bar = "[*---------]";
        } else if (value <= 30) {
            bar = "[**--------]";
        } else if (value <= 40) {
            bar = "[***-------]";
        } else if (value <= 50) {
            bar = "[****------]";
        } else if (value <= 60) {
            bar = "[*****-----]";
        } else if (value <= 70) {
            bar = "[******----]";
        } else if (value <= 80) {
            bar = "[*******---]";
        } else if (value <= 90) {
            bar = "[********--]";    
        } else if (value < 100) {
            bar = "[*********-]";
        } else if (value == 100) {
            bar = "[**********]";
        }
        return bar;
    }
    
    public static void playerMoves() {    
        String userHPBar = statusBar(userHP);
        String userMPBar = statusBar(userMP);
        String computerHPBar = statusBar(computerHP);
        String computerMPBar = statusBar(computerMP);
                        
        clearScreen();           
        turnNumber++;
        System.out.println("________________________________________________");
        System.out.println();     
        System.out.println("Turn No: " + turnNumber);         
        System.out.println("________________________________________________");
        System.out.println();     
        System.out.println(userName + " Status");     
        System.out.println("     Element: " + userElement);     
        System.out.println("     HP: " + userHP + " " + userHPBar);     
        System.out.println("     MP: " + userMP + " " + userMPBar);
        System.out.println("     Shield: " + userShield);
        System.out.println("________________________________________________");        
        System.out.println();     
        System.out.println(computerName + " (Enemy) Status");     
        System.out.println("     Element: " + computerElement); 
        System.out.println("     HP: " + computerHP + " " + computerHPBar);     
        System.out.println("     MP: " + computerMP + " " + computerMPBar); 
        System.out.println("     Shield: " + computerShield);
        System.out.println("________________________________________________");
        System.out.println();     
        
        // will display moves depending on user element, user HP    
        if (userHP >= 20) {
            if (userElement.equals("fire")) {
                System.out.println("Offensive Spells:"); 
                System.out.println("     1) Piercing Wand (2 normal damage, 0 MP)"); 
                System.out.println("     2) Ash Ball (6 normal damage, 20 MP");   
                System.out.println("     3) Incinerate (10 fire-based damage, 50 MP");     
                System.out.println("     4) Amaterasu (20 fire-based damage, 75 MP,");
                System.out.println("        20% chance to miss");   
                System.out.println();     
                System.out.println("Defensive Spells:");   
                System.out.println("     5) Molten Shield (forge shield that absorbs");    
                System.out.println("        75% of the foe’s next attack)");
                System.out.println("     6) Fire Dance (generate 10 MP points)");             
            } else if (userElement.equals("water")) {
                System.out.println("Offensive Spells:"); 
                System.out.println("     1) Piercing Wand (2 normal damage, 0 MP)"); 
                System.out.println("     2) Mud Ball (6 normal damage, 20 MP");   
                System.out.println("     3) Hydro Cannon (10 fire-based damage, 50 MP");     
                System.out.println("     4) Tidal Storm (20 fire-based damage, 75 MP,");
                System.out.println("        20% chance to miss");   
                System.out.println();     
                System.out.println("Defensive Spells:");   
                System.out.println("     5) Aqua Armor (forge shield that absorbs");    
                System.out.println("        75% of the foe’s next attack)");
                System.out.println("     6) Water Dance (generate 10 MP points)");              
            } else if (userElement.equals("nature")) {
                System.out.println("Offensive Spells:"); 
                System.out.println("     1) Piercing Wand (2 normal damage, 0 MP)"); 
                System.out.println("     2) Seed Ball (6 normal damage, 20 MP");   
                System.out.println("     3) Petal Barrage (10 fire-based damage, 50 MP");     
                System.out.println("     4) Jungle Outburst (20 fire-based damage, 75 MP,");
                System.out.println("        20% chance to miss");   
                System.out.println();     
                System.out.println("Defensive Spells:");   
                System.out.println("     5) Wooden Wall (forge shield that absorbs");    
                System.out.println("        75% of the foe’s next attack)");
                System.out.println("     6) Leaf Dance (generate 10 MP points)");                
            }
        } else {          // healing spell will be an option if userHP < 20   
            if (userElement.equals("fire")) {
                System.out.println("Offensive Spells:"); 
                System.out.println("     1) Piercing Wand (2 normal damage, 0 MP)"); 
                System.out.println("     2) Ash Ball (6 normal damage, 20 MP");   
                System.out.println("     3) Incinerate (10 fire-based damage, 50 MP");     
                System.out.println("     4) Amaterasu (20 fire-based damage, 75 MP,");
                System.out.println("        20% chance to miss");   
                System.out.println();     
                System.out.println("Defensive Spells:");   
                System.out.println("     5) Molten Shield (forge shield that absorbs");    
                System.out.println("        75% of the foe’s next attack)");
                System.out.println("     6) Fire Dance (generate 10 MP points)");
                System.out.println("     7) Pyro-Meditate (heal 5 HP points) ");
            } else if (userElement.equals("water")) {
                System.out.println("Offensive Spells:"); 
                System.out.println("     1) Piercing Wand (2 normal damage, 0 MP)"); 
                System.out.println("     2) Mud Ball (6 normal damage, 20 MP");   
                System.out.println("     3) Hydro Cannon (10 fire-based damage, 50 MP");     
                System.out.println("     4) Tidal Storm (20 fire-based damage, 75 MP,");
                System.out.println("        20% chance to miss");   
                System.out.println();     
                System.out.println("Defensive Spells:");   
                System.out.println("     5) Aqua Armor (forge shield that absorbs");    
                System.out.println("        75% of the foe’s next attack)");
                System.out.println("     6) Water Dance (generate 10 MP points)");
                System.out.println("     7) Healing Water (heal 5 HP points) ");             
            } else if (userElement.equals("nature")) {
                System.out.println("Offensive Spells:"); 
                System.out.println("     1) Piercing Wand (2 normal damage, 0 MP)"); 
                System.out.println("     2) Seed Ball (6 normal damage, 20 MP");   
                System.out.println("     3) Petal Barrage (10 fire-based damage, 50 MP");     
                System.out.println("     4) Jungle Outburst (20 fire-based damage, 75 MP,");
                System.out.println("        20% chance to miss");   
                System.out.println();     
                System.out.println("Defensive Spells:");   
                System.out.println("     5) Wooden Wall (forge shield that absorbs");    
                System.out.println("        75% of the foe’s next attack)");
                System.out.println("     6) Leaf Dance (generate 10 MP points)");
                System.out.println("     7) Solar Healing (heal 5 HP points) ");      
            }
        }
        
        System.out.println();           
        System.out.println("TYPE THE NUMBER OF SPELL AND PRESS \"ENTER\" ... ");
        Scanner numIn = new Scanner(System.in);
        double userSpell = numIn.nextDouble();
        System.out.println();
        System.out.println("________________________________________________");
        System.out.println();
        
        // user spells effect if user element is FIRE
        if (userElement.equals("fire")) {
            if (userSpell == 1) {           
                // 2 normal damage, 0 MP
                if (computerShield == 0) {  
                    computerHP -= 2;
                    System.out.println("You used piercing wand.");
                    System.out.println("You dealt 2 damage points to your foe.");
                } else {
                    computerHP -= 0.5;
                    computerShield--;
                    System.out.println("You used piercing wand.");                
                    System.out.println("However, " + computerName + " activated his shield.");
                    System.out.println("You dealt reduced damage of 0.5 HP to him.");
                }

            } else if (userSpell == 2 && userMP >= 20) {    
                // 6 normal damage, 20 MP
                if (computerShield == 0) {
                    computerHP -= 6;
                    userMP -= 20; 
                    System.out.println("You hurled an ash ball. It was perfectly aimed!");
                    System.out.println("You dealt 6 damage points to your foe.");
                } else {
                    computerHP -= 1.5;
                    userMP -= 20;
                    computerShield--;
                    System.out.println("You hurled an ash ball.  It was perfectly aimed!");
                    System.out.println("However, " + computerName + " activated his shield.");
                    System.out.println("You dealt reduced damage of 1.5 HP to him");
                }

            } else if (userSpell == 3 && userMP >= 50) {    
                // 10 elemental damage, 50 MP
                // if computer element is NATURE, has elemental advantage
                if (computerElement.equals("nature")) {
                    if (computerShield == 0) {
                        computerHP -= 12.5;
                        userMP -= 50;
                        System.out.println("Blazing fire was thrown towards " + computerName);
                        System.out.println("Due to your elemental advantage, your attack has additional damage.");
                        System.out.println("You dealt 12.5 damage points to your foe.");                
                    } else {
                        computerHP -= 10;
                        userMP -= 50;
                        computerShield--;
                        System.out.println("Blazing fire was thrown towards " + computerName);
                        System.out.println("Due to your elemental advantage, your attack has additional damage.");
                        System.out.println("However, " + computerName + " activated his shield to nullify more damage.");
                        System.out.println("You dealt damage of 10 HP to him.");
                    }
                // if computer element is WATER, has no elemental advantage
                } else if (computerElement.equals("water")) {
                    if (computerShield == 0) {
                        computerHP -= 10;
                        userMP -= 50;
                        System.out.println("Blazing fire was thrown towards " + computerName);
                        System.out.println("You dealt 10 damage points to your foe.");                
                    } else {
                        computerHP -= 2.5;
                        userMP -= 50;
                        computerShield--;
                        System.out.println("Blazing fire was thrown towards " + computerName);
                        System.out.println("However, " + computerName + " activated his shield.");
                        System.out.println("You dealt reduced damage of 2.5 HP to him.");
                    }
                }

            } else if (userSpell == 4 && userMP >= 75) {    
                // 20 elemental damage, 75 MP, 20% chance to miss";
                Random roll = new Random();
                double ultimateUserChance = roll.nextInt(5) + 1;
                // if computer element is NATURE, has elemental advantage
                if (computerElement.equals("nature")) {
                    if (computerShield == 0) {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the amaterasu spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 25;
                            userMP -= 75;
                            System.out.println("Black fire of hell ignited around " + computerName +".");
                            System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                            System.out.println("Due to your elemental advantage, your attack has additional damage.");
                            System.out.println("You dealt 25 damage points.");

                        }
                    } else {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the amaterasu spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 20;
                            userMP -= 75;
                            computerShield--;
                            System.out.println("Black fire of hell ignited around " + computerName +".");
                            System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                            System.out.println("Due to your elemental advantage, your attack has additional damage.");
                            System.out.println("However, " + computerName + " activated his shield to nullify more damage.");
                            System.out.println("You dealt damage of 20 HP to him.");
                        }
                    }
                // if computer element is WATER, has no elemental advantage
                } else if (computerElement.equals("water")) {
                    if (computerShield == 0) {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the amaterasu spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 20;
                            userMP -= 75;
                            System.out.println("Black fire of hell ignited around " + computerName +".");
                            System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                            System.out.println("You dealt 20 damage points.");

                        }
                    } else {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the amaterasu spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 5;
                            userMP -= 75;
                            computerShield--;
                            System.out.println("Black fire of hell ignited around " + computerName +".");
                            System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                            System.out.println("However, " + computerName + " activated his shield.");
                            System.out.println("You dealt reduced damage of 5 HP to him.");
                        }
                    }
                }    
            } else if (userSpell == 5) {    // forge shield that absorbs 75% of the foe’s next attack            
                userShield++;
                System.out.println("You produced 1 layer of molten shield.");
                System.out.println("This will reduce your foe's damage next turn.");

            } else if (userSpell == 6) {    // generate 10 MP points
                userMP += 10;
                System.out.println("The fire spirit was enchanted by your captivating");
                System.out.println("fire dance. You received 10 MP.");
                System.out.println("He awaits your next spell.");            

            } else if (userSpell == 7 && userHP < 20) {    // heal 5 HP points
                userHP += 5;
                System.out.println("By pyro-meditating, you generated 5 HP.");
                System.out.println("Good move! Queen Erystrazsa wants to see");
                System.out.println("more in this battle.");         

            }
        }
        //---------------------------------
        
        // user spells effect if user element is WATER
        if (userElement.equals("water")) {
            if (userSpell == 1) {           
                // 2 normal damage, 0 MP
                if (computerShield == 0) {  
                    computerHP -= 2;
                    System.out.println("You used piercing wand.");
                    System.out.println("You dealt 2 damage points to your foe.");
                } else {
                    computerHP -= 0.5;
                    computerShield--;
                    System.out.println("You used piercing wand.");                
                    System.out.println("However, " + computerName + " activated his shield.");
                    System.out.println("You dealt reduced damage of 0.5 HP to him.");
                }

            } else if (userSpell == 2 && userMP >= 20) {    
                // 6 normal damage, 20 MP
                if (computerShield == 0) {
                    computerHP -= 6;
                    userMP -= 20; 
                    System.out.println("You hurled a mud ball. It was perfectly aimed!");
                    System.out.println("You dealt 6 damage points to your foe.");
                } else {
                    computerHP -= 1.5;
                    userMP -= 20;
                    computerShield--;
                    System.out.println("You hurled a mud ball.  It was perfectly aimed!");
                    System.out.println("However, " + computerName + " activated his shield.");
                    System.out.println("You dealt reduced damage of 1.5 HP to him");
                }

            } else if (userSpell == 3 && userMP >= 50) {    
                // 10 elemental damage, 50 MP
                // if computer element is FIRE, has elemental advantage
                if (computerElement.equals("fire")) {
                    if (computerShield == 0) {
                        computerHP -= 12.5;
                        userMP -= 50;
                        System.out.println("A powerful water cannon blasted towards " + computerName);
                        System.out.println("Due to your elemental advantage, your attack has additional damage.");
                        System.out.println("You dealt 12.5 damage points to your foe.");                
                    } else {
                        computerHP -= 10;
                        userMP -= 50;
                        computerShield--;
                        System.out.println("A powerful water cannon blasted towards " + computerName);
                        System.out.println("Due to your elemental advantage, your attack has additional damage.");
                        System.out.println("However, " + computerName + " activated his shield to nullify more damage.");
                        System.out.println("You dealt damage of 10 HP to him.");
                    }
                // if computer element is NATURE, has no elemental advantage
                } else if (computerElement.equals("nature")) {
                    if (computerShield == 0) {
                        computerHP -= 10;
                        userMP -= 50;
                        System.out.println("A powerful water cannon blasted towards " + computerName);
                        System.out.println("You dealt 10 damage points to your foe.");                
                    } else {
                        computerHP -= 2.5;
                        userMP -= 50;
                        computerShield--;
                        System.out.println("A powerful water cannon blasted towards " + computerName);
                        System.out.println("However, " + computerName + " activated his shield.");
                        System.out.println("You dealt reduced damage of 2.5 HP to him.");
                    }
                }

            } else if (userSpell == 4 && userMP >= 75) {    
                // 20 elemental damage, 75 MP, 20% chance to miss";
                Random roll = new Random();
                double ultimateUserChance = roll.nextInt(5) + 1;
                // if computer element is FIRE, has elemental advantage
                if (computerElement.equals("fire")) {
                    if (computerShield == 0) {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the tidal storm spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 25;
                            userMP -= 75;
                            System.out.println("Water around " + computerName +" become violent and formed");
                            System.out.println("a storm. Queen Erystrazsa even felt the intensity from a distance.");
                            System.out.println("Due to your elemental advantage, your attack has additional damage.");
                            System.out.println("You dealt 25 damage points.");

                        }
                    } else {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the tidal storm spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 20;
                            userMP -= 75;
                            computerShield--;
                            System.out.println("Water around " + computerName +" become violent and formed");
                            System.out.println("a storm. Queen Erystrazsa even felt the intensity from a distance.");
                            System.out.println("Due to your elemental advantage, your attack has additional damage.");
                            System.out.println("However, " + computerName + " activated his shield to nullify more damage.");
                            System.out.println("You dealt damage of 20 HP to him.");
                        }
                    }
                // if computer element is NATURE, has no elemental advantage
                } else if (computerElement.equals("nature")) {
                    if (computerShield == 0) {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the tidal storm spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 20;
                            userMP -= 75;
                            System.out.println("Water around " + computerName +" become violent and formed");
                            System.out.println("a storm. Queen Erystrazsa even felt the intensity from a distance.");
                            System.out.println("You dealt 20 damage points.");

                        }
                    } else {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the tidal storm spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 5;
                            userMP -= 75;
                            computerShield--;
                            System.out.println("Water around " + computerName +" become violent and formed");
                            System.out.println("a storm. Queen Erystrazsa even felt the intensity from a distance.");
                            System.out.println("However, " + computerName + " activated his shield.");
                            System.out.println("You dealt reduced damage of 5 HP to him.");
                        }
                    }
                }
                
            } else if (userSpell == 5) {    
                // forge shield that absorbs 75% of the foe’s next attack            
                userShield++;
                System.out.println("You produced 1 layer of aqua armor.");
                System.out.println("This will reduce your foe's damage next turn.");

            } else if (userSpell == 6) {    
                // generate 10 MP points
                userMP += 10;
                System.out.println("The water spirit was enchanted by your captivating");
                System.out.println("water dance. You received 10 MP.");
                System.out.println("He awaits your next spell.");                     

            } else if (userSpell == 7 && userHP < 20) {    
                // heal 5 HP points
                userHP += 5;
                System.out.println("By consuming healing water, you generated 5 HP.");
                System.out.println("Good move! Queen Erystrazsa wants to see");
                System.out.println("more in this battle.");         

            }
        }
        //---------------------------------
        
        // user spells effect if user element is NATURE
        if (userElement.equals("nature")) {
            if (userSpell == 1) {           
                // 2 normal damage, 0 MP
                if (computerShield == 0) {  
                    computerHP -= 2;
                    System.out.println("You used piercing wand.");
                    System.out.println("You dealt 2 damage points to your foe.");
                } else {
                    computerHP -= 0.5;
                    computerShield--;
                    System.out.println("You used piercing wand.");                
                    System.out.println("However, " + computerName + " activated his shield.");
                    System.out.println("You dealt reduced damage of 0.5 HP to him.");
                }

            } else if (userSpell == 2 && userMP >= 20) {    
                // 6 normal damage, 20 MP
                if (computerShield == 0) {
                    computerHP -= 6;
                    userMP -= 20; 
                    System.out.println("You hurled a seed ball. It was perfectly aimed!");
                    System.out.println("You dealt 6 damage points to your foe.");
                } else {
                    computerHP -= 1.5;
                    userMP -= 20;
                    computerShield--;
                    System.out.println("You hurled a seed ball.  It was perfectly aimed!");
                    System.out.println("However, " + computerName + " activated his shield.");
                    System.out.println("You dealt reduced damage of 1.5 HP to him");
                }

            } else if (userSpell == 3 && userMP >= 50) {    
                // 10 elemental damage, 50 MP
                // if computer element is WATER, has elemental advantage
                if (computerElement.equals("water")) {
                    if (computerShield == 0) {
                        computerHP -= 12.5;
                        userMP -= 50;
                        System.out.println("A violent petal barrage pounded " + computerName);
                        System.out.println("Due to your elemental advantage, your attack has additional damage.");
                        System.out.println("You dealt 12.5 damage points to your foe.");                
                    } else {
                        computerHP -= 10;
                        userMP -= 50;
                        computerShield--;
                        System.out.println("A violent petal barrage pounded " + computerName);
                        System.out.println("Due to your elemental advantage, your attack has additional damage.");
                        System.out.println("However, " + computerName + " activated his shield to nullify more damage.");
                        System.out.println("You dealt reduced damage of 10 HP to him.");
                    }
                // if computer element is FIRE, has no elemental advantage
                } else if (computerElement.equals("fire")) {
                    if (computerShield == 0) {
                        computerHP -= 10;
                        userMP -= 50;
                        System.out.println("A violent petal barrage pounded " + computerName);
                        System.out.println("You dealt 10 damage points to your foe.");                
                    } else {
                        computerHP -= 2.5;
                        userMP -= 50;
                        computerShield--;
                        System.out.println("A violent petal barrage pounded " + computerName);
                        System.out.println("However, " + computerName + " activated his shield.");
                        System.out.println("You dealt reduced damage of 2.5 HP to him.");
                    }
                }
                
            } else if (userSpell == 4 && userMP >= 75) {    
                // 20 elemental damage, 75 MP, 20% chance to miss";
                Random roll = new Random();
                double ultimateUserChance = roll.nextInt(5) + 1;
                // if computer element is WATER, has elemental advantage
                if (computerElement.equals("water")) {
                    if (computerShield == 0) {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the jungle outburst spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 25;
                            userMP -= 75;
                            System.out.println("The roots of trees near " + computerName);
                            System.out.println("emerged and smashed him with overwhelming force.");
                            System.out.println("Queen Erystrazsa even felt the pain of each whips.");
                            System.out.println("Due to your elemental advantage, your attack has additional damage.");
                            System.out.println("You dealt 25 damage points.");
                        }
                    } else {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the jungle outburst spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 20;
                            userMP -= 75;
                            computerShield--;
                            System.out.println("The roots of trees near " + computerName);
                            System.out.println("emerged and smashed him with overwhelming force.");
                            System.out.println("Even Queen Erystrazsa cannot imagine the pain of each whip.");
                            System.out.println("Due to your elemental advantage, your attack has additional damage.");
                            System.out.println("However, " + computerName + " activated his shield to nullify more damage.");
                            System.out.println("You dealt damage of 20 HP to him.");
                        }
                    }
                // if computer element is FIRE, has no elemental advantage
                } else if (computerElement.equals("fire")) {
                    if (computerShield == 0) {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the jungle outburst spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 20;
                            userMP -= 75;
                            System.out.println("The roots of trees near " + computerName);
                            System.out.println("emerged and smashed him with overwhelming force.");
                            System.out.println("Queen Erystrazsa even felt the pain of each whips.");
                            System.out.println("You dealt 20 damage points.");
                        }
                    } else {
                        if (ultimateUserChance == 1) {
                            System.out.println("You tried to cast the jungle outburst spell.");
                            System.out.println("However, you failed. You still need more practice!");                    
                            System.out.println("You recovered 50 MP though.");
                            userMP -= 25; 
                        } else {
                            computerHP -= 5;
                            userMP -= 75;
                            computerShield--;
                            System.out.println("The roots of trees near " + computerName);
                            System.out.println("emerged and smashed him with overwhelming force.");
                            System.out.println("Even Queen Erystrazsa cannot imagine the pain of each whip.");
                            System.out.println("However, " + computerName + " activated his shield");
                            System.out.println("You dealt reduced damage of 5 HP to him.");
                        }
                    }
                }
                
            } else if (userSpell == 5) {    
                // forge shield that absorbs 75% of the foe’s next attack            
                userShield++;
                System.out.println("You produced 1 layer of wooden wall.");
                System.out.println("This will reduce your foe's damage next turn.");

            } else if (userSpell == 6) {    
                // generate 10 MP points
                userMP += 10;
                System.out.println("The nature spirit was enchanted by your captivating");
                System.out.println("nature dance. You received 10 MP.");
                System.out.println("He awaits your next spell.");                     

            } else if (userSpell == 7 && userHP < 20) {    
                // heal 5 HP points
                userHP += 5;
                System.out.println("By the power of the sun, you generated 5 HP.");
                System.out.println("Good move! Queen Erystrazsa wants to see");
                System.out.println("more in this battle.");         

            }
        }
        //---------------------------------
        
        // generate 10 MP after each turn
        userMP += 10;
        
        System.out.println();
        System.out.println("Press \"ENTER\" to continue...");
        System.out.println("_______________________________________________");
        Scanner wordIn = new Scanner(System.in);
        wordIn.nextLine();
    }
    
    public static void computerSpellsAlgorithm() { 
        Random roll = new Random();
        
        
        // computer spells if computer element is NATURE
        if (computerElement.equals("nature")) {
            if (computerHP <= 10) {   
                // healing spell (100%)
                computerHP += 5;            
                System.out.println(computerName + " used the solar healing spell.");
                System.out.println("By the power of the sun, he generated 5 HP.");

            } else if (computerHP <= 20) {           
                double computerHP20 = roll.nextInt(5) + 1; 
                if (computerHP20 == 1) {    
                    // shield (20%)
                    computerShield++;
                    System.out.println(computerName + " used the wooden wall spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else {                    
                    // healing spell (80%)
                    System.out.println(computerName + " used the solar healing spell.");
                    System.out.println("By the power of the sun, he generated 5 HP.");
                    computerHP += 5;  
                }

            } else if (computerMP < 20) {   
                double computerMP19 = roll.nextInt(10) + 1;
                if (computerMP19 == 1) {     
                    // shield (10%)       
                    computerShield++;
                    System.out.println(computerName + " used the wooden wall spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else if (computerMP19 == 2 || computerMP19 == 3 || computerMP19 == 4 ) { 
                    //  basic attack (30%)
                    if (userShield == 0) {     
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                    } else {
                        userHP -= 0.5;
                        userShield--;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 0.5 HP.");
                    }
                } else {                   
                    // MP charge (60%)
                    computerMP += 10;
                    System.out.println(computerName + " performed the leaf dance ritual.");
                    System.out.println("The nature spirit granted him with 10 MP.");
                }

            } else if (computerMP < 50) {    
                double computerMP49 = roll.nextInt(5) + 1;
                if (computerMP49 == 1) { 
                    // shield (20%)
                    computerShield++;           
                    System.out.println(computerName + " used the wooden wall spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else if (computerMP49 == 2) { 
                    // basic attack (20%)
                    if (userShield == 0) {      
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                    } else {
                        userHP -= 0.5;
                        userShield--;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 0.5 HP.");
                    }
                } else if (computerMP49 == 3) { 
                    // MP charge (20%)
                    computerMP += 10;
                    System.out.println(computerName + " performed the leaf dance ritual.");
                    System.out.println("The nature spirit granted him with 10 MP.");
                } else { 
                    // normal spell (40%)
                    if (userShield == 0) {     
                        userHP -= 6;
                        computerMP -= 20; 
                        System.out.println(computerName + " hurled a seed ball towards you.");
                        System.out.println("You were damaged with 6 HP.");
                    } else {
                        userHP -= 1.5;
                        computerMP -= 20;
                        userShield--;
                        System.out.println(computerName + " hurled a seed ball towards you.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 1.5 HP.");
                    }
                }

            } else if (computerMP < 75) { 
                double computerMP74 = roll.nextInt(10) + 1;
                if (computerMP74 == 1) { 
                    // shield (10%)
                    computerShield++;               
                    System.out.println(computerName + " used the wooden wall spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else if (computerMP74 == 2) { 
                    // basic attack (10%)
                    if (userShield == 0) {          
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                    } else {
                        userHP -= 0.5;
                        userShield--;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 0.5 HP.");
                    }
                } else if (computerMP74 == 3 || computerMP74 == 4) { 
                    // MP charge (20%)
                    computerMP += 10;           
                    System.out.println(computerName + " performed the leaf dance ritual.");
                    System.out.println("The nature spirit granted him with 10 MP.");
                } else if (computerMP74 == 5 || computerMP74 == 6) { 
                    // normal spell (20%)
                     if (userShield == 0) {     
                        userHP -= 6;
                        computerMP -= 20; 
                        System.out.println(computerName + " hurled a seed ball towards you.");
                        System.out.println("You were damaged with 6 HP.");
                    } else {
                        userHP -= 1.5;
                        computerMP -= 20;
                        userShield--;
                        System.out.println(computerName + " hurled a seed ball towards you.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 1.5 HP.");
                    }
                } else {
                    // elemental spell (40%), has no elemental advantage
                    if (userElement.equals("fire")) {
                        if (userShield == 0) {     
                            userHP -= 10;
                            computerMP -= 50;
                            System.out.println(computerName + " casted a violent petal barrage against you.");
                            System.out.println("You were damaged with 10 HP");
                        } else {
                            userHP -= 2.5;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted a violent petal barrage against you.");
                            System.out.println("Fortunately, your shield substantially protected you.");
                            System.out.println("You were slightly damaged with 2.5 HP.");
                        }
                    // elemental spell (40%), has elemental advantage
                    } else if (userElement.equals("water")) {
                        if (userShield == 0) {      
                            userHP -= 12.5;
                            computerMP -= 50;
                            System.out.println(computerName + " casted a violent petal barrage against you.");
                            System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                            System.out.println("elevated damage of 12.5 HP");
                        } else {
                            userHP -= 10;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted a violent petal barrage against you.");
                            System.out.println("Unfortunately, your shield is just enough to protect you.");
                            System.out.println("from the additional damage due to elemental advantage.");
                            System.out.println("You were damaged with 10 HP.");
                        }
                    }
                }

            } else if (computerMP >= 75) {  
                double computerMP75 = roll.nextInt(5) + 1;
                double ultimateComputerChance = roll.nextInt(5) + 1;
                
                if (computerMP75 == 1) { 
                    // elemental spell (20%), has no elemental advantage
                    if (userElement.equals("fire")) {
                        if (userShield == 0) {
                            userHP -= 10;
                            computerMP -= 50;
                            System.out.println(computerName + " casted a violent petal barrage against you.");
                            System.out.println("You were damaged with 10 HP");
                        } else {
                            userHP -= 2.5;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted a violent petal barrage against you.");
                            System.out.println("Fortunately, your shield substantially protected you.");
                            System.out.println("You were slightly damaged with 2.5 HP");
                        }
                    }    
                    // elemental spell (20%), has elemental advantage
                    else if (userElement.equals("water")) {
                        if (userShield == 0) {      
                            userHP -= 12.5;
                            computerMP -= 50;
                            System.out.println(computerName + " casted a violent petal barrage against you.");
                            System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                            System.out.println("elevated damage of 12.5 HP");
                        } else {
                            userHP -= 10;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted a violent petal barrage against you.");
                            System.out.println("Unfortunately, your shield is just enough to protect you.");
                            System.out.println("from the additional damage due to elemental advantage.");
                            System.out.println("You were damaged with 10 HP.");
                        }
                    }
                    
                } else  {                      
                    if (userShield == 0) {
                        // without shield, ultimate elemental spell (80%), has no elemental advantage, might miss
                        if (userElement.equals("fire")) {
                            if (ultimateComputerChance == 1) { 
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 20;          
                                computerMP -= 75;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("The roots of surrounding trees emerged and smashed you with");
                                System.out.println("overwhelming force. Even Queen Erystrazsa cannot");
                                System.out.println("imagine the pain of each whip.");
                                System.out.println("You were damaged with 20 HP");
                            }
               
                        // without shield, ultimate elemental spell (80%), has elemental advantage, might miss
                        } else if (userElement.equals("water")) {
                            if (ultimateComputerChance == 1) {
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 25;          
                                computerMP -= 75;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("The roots of surrounding trees emerged and smashed you with");
                                System.out.println("overwhelming force. Even Queen Erystrazsa cannot");
                                System.out.println("imagine the pain of each whip.");
                                System.out.println();
                                System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                                System.out.println("elevated damage of 25 HP");
                            }
                        }
                    } else {
                        // with shield, ultimate elemental spell (80%), has no elemental advantage, might miss
                        if (userElement.equals("fire")) {
                            if (ultimateComputerChance == 1) {
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 5;          
                                computerMP -= 75;
                                userShield--;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("The roots of surrounding trees emerged and smashed you with");
                                System.out.println("overwhelming force. Fortunately, your shield");
                                System.out.println("substantially protected you.");
                                System.out.println("You were slightly damage with 5 HP");
                            }
                            
                        // with shield, ultimate elemental spell (80%), has elemental advantage, might miss
                        } else if (userElement.equals("water")) {
                            if (ultimateComputerChance == 1) {
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 20;          
                                computerMP -= 75;
                                userShield--;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("The roots of surrounding trees emerged and smashed you with");
                                System.out.println("overwhelming force.");
                                System.out.println();
                                System.out.println("Unfortunately, your shield is just enough to protect you.");
                                System.out.println("from the additional damage due to elemental advantage.");
                                System.out.println("You were damage with 20 HP");
                            }
                        }    
                    }
                }
            } else {              
                // for peace of mind that computer will cast basic attack
                if (userShield == 0) {          
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                } else {
                    userHP -= 0.5;
                    userShield--;
                    System.out.println(computerName + " used piercing wand.");
                    System.out.println("Fortunately, your shield substantially protected you.");
                    System.out.println("You were slightly damage with 0.5 HP.");
                }
            }
        }
        //---------------------------------
        
        
        
        // computer spells if computer element is WATER
        if (computerElement.equals("water")){
            if (computerHP <= 10) {
                // healing spell (100%)
                computerHP += 5;            
                System.out.println(computerName + " casted spell to give healing power to ordinary water.");
                System.out.println("By the power of the healing water, he generated 5 HP.");

            } else if (computerHP <= 20) {           
                double computerHP20 = roll.nextInt(5) + 1; 
                if (computerHP20 == 1) {    
                    // shield (20%)
                    computerShield++;
                    System.out.println(computerName + " used the aqua armor spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else {                    
                    // healing spell (80%)
                    System.out.println(computerName + " casted spell to give healing power to ordinary water.");
                    System.out.println("By the power of the healing water, he generated 5 HP.");
                    computerHP += 5;  
                }

            } else if (computerMP < 20) {   
                double computerMP19 = roll.nextInt(10) + 1;
                if (computerMP19 == 1) {     
                    // shield (10%)       
                    computerShield++;
                    System.out.println(computerName + " used the aqua armor spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else if (computerMP19 == 2 || computerMP19 == 3 || computerMP19 == 4 ) { 
                    //  basic attack (30%)
                    if (userShield == 0) {     
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                    } else {
                        userHP -= 0.5;
                        userShield--;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 0.5 HP.");
                    }
                } else {                   
                    // MP charge (60%)
                    computerMP += 10;
                    System.out.println(computerName + " performed the water dance ritual.");
                    System.out.println("The water spirit granted him with 10 MP.");
                }

            } else if (computerMP < 50) {    
                double computerMP49 = roll.nextInt(5) + 1;
                if (computerMP49 == 1) { 
                    // shield (20%)
                    computerShield++;           
                    System.out.println(computerName + " used the aqua armor spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else if (computerMP49 == 2) { 
                    // basic attack (20%)
                    if (userShield == 0) {      
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                    } else {
                        userHP -= 0.5;
                        userShield--;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 0.5 HP.");
                    }
                } else if (computerMP49 == 3) { 
                    // MP charge (20%)
                    computerMP += 10;
                    System.out.println(computerName + " performed the water dance ritual.");
                    System.out.println("The water spirit granted him with 10 MP.");
                } else { 
                    // normal spell (40%)
                    if (userShield == 0) {      
                        userHP -= 6;
                        computerMP -= 20; 
                        System.out.println(computerName + " hurled a mud ball towards you.");
                        System.out.println("You were damaged with 6 HP.");
                    } else {
                        userHP -= 1.5;
                        computerMP -= 20;
                        userShield--;
                        System.out.println(computerName + " hurled a mud ball towards you.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 1.5 HP.");
                    }
                }

            } else if (computerMP < 75) { 
                double computerMP74 = roll.nextInt(10) + 1;
                if (computerMP74 == 1) { 
                    // shield (10%)
                    computerShield++;               
                    System.out.println(computerName + " used the aqua armor spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else if (computerMP74 == 2) { 
                    // basic attack (10%)
                    if (userShield == 0) {          
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                    } else {
                        userHP -= 0.5;
                        userShield--;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 0.5 HP.");
                    }
                } else if (computerMP74 == 3 || computerMP74 == 4) { 
                    // MP charge (20%)
                    computerMP += 10;           
                    System.out.println(computerName + " performed the water dance ritual.");
                    System.out.println("The water spirit granted him with 10 MP.");
                } else if (computerMP74 == 5 || computerMP74 == 6) { 
                    // normal spell (20%)
                     if (userShield == 0) {     
                        userHP -= 6;
                        computerMP -= 20; 
                        System.out.println(computerName + " hurled a mud ball towards you.");
                        System.out.println("You were damaged with 6 HP.");
                    } else {
                        userHP -= 1.5;
                        computerMP -= 20;
                        userShield--;
                        System.out.println(computerName + " hurled a mud ball towards you.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 1.5 HP.");
                    }
                } else {
                    // elemental spell (40%), has no elemental advantage
                    if (userElement.equals("nature")) {
                        if (userShield == 0) {     
                            userHP -= 10;
                            computerMP -= 50;
                            System.out.println(computerName + " casted a bruising hydro cannon against you.");
                            System.out.println("You were damaged with 10 HP");
                        } else {
                            userHP -= 2.5;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted a bruising hydro cannon against you.");
                            System.out.println("Fortunately, your shield substantially protected you.");
                            System.out.println("You were slightly damaged with 2.5 HP.");
                        }
                    // elemental spell (40%), has elemental advantage
                    } else if (userElement.equals("fire")) {
                        if (userShield == 0) {      
                            userHP -= 12.5;
                            computerMP -= 50;
                            System.out.println(computerName + " casted a bruising hydro cannon against you.");
                            System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                            System.out.println("elevated damage of 12.5 HP");
                        } else {
                            userHP -= 10;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted a bruising hydro cannon against you.");
                            System.out.println("Unfortunately, your shield is just enough to protect you.");
                            System.out.println("from the additional damage due to elemental advantage.");
                            System.out.println("You were damaged with 10 HP.");
                        }
                    }
                }

            } else if (computerMP >= 75) {  
                double computerMP75 = roll.nextInt(5) + 1;
                double ultimateComputerChance = roll.nextInt(5) + 1;
                
                if (computerMP75 == 1) { 
                    // elemental spell (20%), has no elemental advantage
                    if (userElement.equals("nature")) {
                        if (userShield == 0) {
                            userHP -= 10;
                            computerMP -= 50;
                            System.out.println(computerName + " casted a bruising hydro cannon against you.");
                            System.out.println("You were damaged with 10 HP");
                        } else {
                            userHP -= 2.5;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted a bruising hydro cannon against you.");
                            System.out.println("Fortunately, your shield substantially protected you.");
                            System.out.println("You were slightly damaged with 2.5 HP");
                        }
                    }    
                    // elemental spell (20%), has elemental advantage
                    else if (userElement.equals("fire")) {
                        if (userShield == 0) {      
                            userHP -= 12.5;
                            computerMP -= 50;
                            System.out.println(computerName + " casted a bruising hydro cannon against you.");
                            System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                            System.out.println("elevated damage of 12.5 HP");
                        } else {
                            userHP -= 10;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted a bruising hydro cannon against you.");
                            System.out.println("Unfortunately, your shield is just enough to protect you.");
                            System.out.println("from the additional damage due to elemental advantage.");
                            System.out.println("You were damaged with 10 HP.");
                        }
                    }
                    
                } else  {                      
                    if (userShield == 0) {
                        // without shield, ultimate elemental spell (80%), has no elemental advantage
                        if (userElement.equals("nature")) {
                            if (ultimateComputerChance == 1) { // ultimate elemental spell might miss
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 20;          
                                computerMP -= 75;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("Water around you become violent and formed a storm.");
                                System.out.println("Queen Erystrazsa even felt the intensity from a distance.");
                                System.out.println("You were damaged with 20 HP");
                            }
               
                        // without shield, ultimate elemental spell (80%), has elemental advantage
                        } else if (userElement.equals("fire")) {
                            if (ultimateComputerChance == 1) { // ultimate elemental spell might miss
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 25;          
                                computerMP -= 75;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("Water around you become violent and formed a storm.");
                                System.out.println("Queen Erystrazsa even felt the intensity from a distance.");
                                System.out.println();
                                System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                                System.out.println("elevated damage of 25 HP");
                            }
                        }
                    } else {
                        // with shield, ultimate elemental spell (80%), has no elemental advantage
                        if (userElement.equals("nature")) {
                            if (ultimateComputerChance == 1) {
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 5;          
                                computerMP -= 75;
                                userShield--;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("Water around you become violent and formed a storm.");
                                System.out.println("Queen Erystrazsa even felt the intensity from a distance.");
                                System.out.println("Fortunately, your shield substantially protected you.");
                                System.out.println("You were slightly damage with 5 HP");
                            }
                            
                        // with shield, ultimate elemental spell (80%), has elemental advantage
                        } else if (userElement.equals("fire")) {
                            if (ultimateComputerChance == 1) {
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 20;          
                                computerMP -= 75;
                                userShield--;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("Water around you become violent and formed a storm.");
                                System.out.println("Queen Erystrazsa even felt the intensity from a distance.");
                                System.out.println();
                                System.out.println("Unfortunately, your shield is just enough to protect you.");
                                System.out.println("from the additional damage due to elemental advantage.");
                                System.out.println("You were damage with 20 HP");
                            }
                        }    
                    }
                }
            } else {              // for peace of mind that computer will cast basic attack
                if (userShield == 0) {          
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                } else {
                    userHP -= 0.5;
                    userShield--;
                    System.out.println(computerName + " used piercing wand.");
                    System.out.println("Fortunately, your shield substantially protected you.");
                    System.out.println("You were slightly damage with 0.5 HP.");
                }
            }
        }
        //---------------------------------
        
        
        
        // computer spells if computer element is FIRE
        if (computerElement.equals("fire")) {
            if (computerHP <= 10) {         
                // healing spell (100%)
                computerHP += 5;            
                System.out.println(computerName + " concentrated and peformed pyro-meditation.");
                System.out.println("He generated 5 HP.");

            } else if (computerHP <= 20) {           
                double computerHP20 = roll.nextInt(5) + 1; 
                if (computerHP20 == 1) {    
                    // shield (20%)
                    computerShield++;
                    System.out.println(computerName + " used the molten shield spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else {                    
                    // healing spell (80%)
                    System.out.println(computerName + " concentrated and peformed pyro-meditation.");
                    System.out.println("He generated 5 HP.");
                    computerHP += 5;  
                }

            } else if (computerMP < 20) {   
                double computerMP19 = roll.nextInt(10) + 1;
                if (computerMP19 == 1) {     
                    // shield (10%)       
                    computerShield++;
                    System.out.println(computerName + " used the molten shield spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else if (computerMP19 == 2 || computerMP19 == 3 || computerMP19 == 4 ) { 
                    //  basic attack (30%)
                    if (userShield == 0) {     
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                    } else {
                        userHP -= 0.5;
                        userShield--;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 0.5 HP.");
                    }
                } else {                   
                    // MP charge (60%)
                    computerMP += 10;
                    System.out.println(computerName + " performed the fire dance ritual.");
                    System.out.println("The fire spirit granted him with 10 MP.");
                }

            } else if (computerMP < 50) {    
                double computerMP49 = roll.nextInt(5) + 1;
                if (computerMP49 == 1) { 
                    // shield (20%)
                    computerShield++;           
                    System.out.println(computerName + " used the molten shield spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else if (computerMP49 == 2) { 
                    // basic attack (20%)
                    if (userShield == 0) {      
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                    } else {
                        userHP -= 0.5;
                        userShield--;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 0.5 HP.");
                    }
                } else if (computerMP49 == 3) { 
                    // MP charge (20%)
                    computerMP += 10;
                    System.out.println(computerName + " performed the fire dance ritual.");
                    System.out.println("The fire spirit granted him with 10 MP.");
                } else { 
                    // normal spell (40%)
                    if (userShield == 0) {      
                        userHP -= 6;
                        computerMP -= 20; 
                        System.out.println(computerName + " hurled an ash ball towards you.");
                        System.out.println("You were damaged with 6 HP.");
                    } else {
                        userHP -= 1.5;
                        computerMP -= 20;
                        userShield--;
                        System.out.println(computerName + " hurled an ash ball towards you.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 1.5 HP.");
                    }
                }

            } else if (computerMP < 75) { 
                double computerMP74 = roll.nextInt(10) + 1;
                if (computerMP74 == 1) { 
                    // shield (10%)
                    computerShield++;               
                    System.out.println(computerName + " used the molten shield spell.");
                    System.out.println("This will reduce the damage of your next spell.");
                } else if (computerMP74 == 2) { 
                    // basic attack (10%)
                    if (userShield == 0) {          
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                    } else {
                        userHP -= 0.5;
                        userShield--;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 0.5 HP.");
                    }
                } else if (computerMP74 == 3 || computerMP74 == 4) { 
                    // MP charge (20%)
                    computerMP += 10;           
                    System.out.println(computerName + " performed the fire dance ritual.");
                    System.out.println("The fire spirit granted him with 10 MP.");
                } else if (computerMP74 == 5 || computerMP74 == 6) { 
                    // normal spell (20%)
                     if (userShield == 0) {     
                        userHP -= 6;
                        computerMP -= 20; 
                        System.out.println(computerName + " hurled an ash ball towards you.");
                        System.out.println("You were damaged with 6 HP.");
                    } else {
                        userHP -= 1.5;
                        computerMP -= 20;
                        userShield--;
                        System.out.println(computerName + " hurled an ash ball towards you.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 1.5 HP.");
                    }
                } else {
                    // elemental spell (40%), has no elemental advantage
                    if (userElement.equals("water")) {
                        if (userShield == 0) {     
                            userHP -= 10;
                            computerMP -= 50;
                            System.out.println(computerName + " casted the incinerate spell which produced.");
                            System.out.println("multiple blazing fire rushing towards you.");
                            System.out.println("You were damaged with 10 HP");
                        } else {
                            userHP -= 2.5;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted the incinerate spell which produced.");
                            System.out.println("multiple blazing fire rushing towards you.");
                            System.out.println("Fortunately, your shield substantially protected you.");
                            System.out.println("You were slightly damaged with 2.5 HP.");
                        }
                    // elemental spell (40%), has elemental advantage
                    } else if (userElement.equals("nature")) {
                        if (userShield == 0) {      
                            userHP -= 12.5;
                            computerMP -= 50;
                            System.out.println(computerName + " casted the incinerate spell which produced.");
                            System.out.println("multiple blazing fire rushing towards you.");
                            System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                            System.out.println("elevated damage of 12.5 HP");
                        } else {
                            userHP -= 10;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted the incinerate spell which produced.");
                            System.out.println("multiple blazing fire rushing towards you.");
                            System.out.println("Unfortunately, your shield is just enough to protect you.");
                            System.out.println("from the additional damage due to elemental advantage.");
                            System.out.println("You were damaged with 10 HP.");
                        }
                    }
                }

            } else if (computerMP >= 75) {  
                double computerMP75 = roll.nextInt(5) + 1;
                double ultimateComputerChance = roll.nextInt(5) + 1;
                
                if (computerMP75 == 1) { 
                    // elemental spell (20%), has no elemental advantage
                    if (userElement.equals("water")) {
                        if (userShield == 0) {
                            userHP -= 10;
                            computerMP -= 50;
                            System.out.println(computerName + " casted the incinerate spell which produced.");
                            System.out.println("multiple blazing fire rushing towards you.");
                            System.out.println("You were damaged with 10 HP");
                        } else {
                            userHP -= 2.5;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted the incinerate spell which produced.");
                            System.out.println("multiple blazing fire rushing towards you.");
                            System.out.println("Fortunately, your shield substantially protected you.");
                            System.out.println("You were slightly damaged with 2.5 HP");
                        }
                    }    
                    // elemental spell (20%), has elemental advantage
                    else if (userElement.equals("nature")) {
                        if (userShield == 0) {      
                            userHP -= 12.5;
                            computerMP -= 50;
                            System.out.println(computerName + " casted the incinerate spell which produced.");
                            System.out.println("multiple blazing fire rushing towards you.");
                            System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                            System.out.println("elevated damage of 12.5 HP");
                        } else {
                            userHP -= 10;
                            computerMP -= 50;
                            userShield--;
                            System.out.println(computerName + " casted the incinerate spell which produced.");
                            System.out.println("multiple blazing fire rushing towards you.");
                            System.out.println("Unfortunately, your shield is just enough to protect you.");
                            System.out.println("from the additional damage due to elemental advantage.");
                            System.out.println("You were damaged with 10 HP.");
                        }
                    }
                    
                } else  {                      
                    if (userShield == 0) {
                        // without shield, ultimate elemental spell (80%), has no elemental advantage
                        if (userElement.equals("water")) {
                            if (ultimateComputerChance == 1) { // ultimate elemental spell might miss
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 20;          
                                computerMP -= 75;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("Black fire of hell ignited around you.");
                                System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                                System.out.println("You were damaged with 20 HP");
                            }
               
                        // without shield, ultimate elemental spell (80%), has elemental advantage
                        } else if (userElement.equals("nature")) {
                            if (ultimateComputerChance == 1) { // ultimate elemental spell might miss
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 25;          
                                computerMP -= 75;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("Black fire of hell ignited around you.");
                                System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                                System.out.println();
                                System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                                System.out.println("elevated damage of 25 HP");
                            }
                        }
                    } else {
                        // with shield, ultimate elemental spell (80%), has no elemental advantage
                        if (userElement.equals("water")) {
                            if (ultimateComputerChance == 1) {
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 5;          
                                computerMP -= 75;
                                userShield--;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("Black fire of hell ignited around you.");
                                System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                                System.out.println("Fortunately, your shield substantially protected you.");
                                System.out.println("You were slightly damage with 5 HP");
                            }
                            
                        // with shield, ultimate elemental spell (80%), has elemental advantage
                        } else if (userElement.equals("nature")) {
                            if (ultimateComputerChance == 1) {
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("But, something seemed wrong. Fortunately, his spell failed.");
                                System.out.println("He recovered 50 MP though...");
                                System.out.println();
                                System.out.println("Prepare yourself as " + computerName + " might try to do it again.");
                                computerMP -= 25; 
                            } else {
                                userHP -= 20;          
                                computerMP -= 75;
                                userShield--;
                                System.out.println(computerName + " casted his ultimate elemental spell.");
                                System.out.println("Black fire of hell ignited around you.");
                                System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                                System.out.println();
                                System.out.println("Unfortunately, your shield is just enough to protect you.");
                                System.out.println("from the additional damage due to elemental advantage.");
                                System.out.println("You were damage with 20 HP");
                            }
                        }    
                    }
                }
            } else {              // for peace of mind that computer will cast basic attack
                if (userShield == 0) {          
                        userHP -= 2;
                        System.out.println(computerName + " used piercing wand.");
                        System.out.println("You were damaged with 2 HP.");
                } else {
                    userHP -= 0.5;
                    userShield--;
                    System.out.println(computerName + " used piercing wand.");
                    System.out.println("Fortunately, your shield substantially protected you.");
                    System.out.println("You were slightly damage with 0.5 HP.");
                }
            }
        }
        //---------------------------------
        
        
        
        
        
        
        
        
        System.out.println();
        System.out.println("Press \"ENTER\" to continue...");
        System.out.println("_______________________________________________");
        Scanner wordIn = new Scanner(System.in);
        wordIn.nextLine();
        
        // generate 10 MP after each turn
        computerMP += 10;
    } 

    public static void randomEncounter() {
        Scanner wordIn = new Scanner(System.in);
        Random roll = new Random();
        double d20Result = roll.nextInt(20) + 1; 
        
        if (d20Result == 1) {
            double d20Result1 = roll.nextInt(20) + 1; 
            if (d20Result1 == 1) {
                clearScreen();
                System.out.println("________________________________________________");
                System.out.println();
                System.out.println("Queen Erystrazsa is delighted by your battle with");
                System.out.println(computerName + ". To spice things up, the queen");
                System.out.println("fully healed " + computerName + " with");
                System.out.println("her moonlight blessing spell.");
                System.out.println();
                System.out.println("Press \"ENTER\" to continue...");
                System.out.println("________________________________________________");
                wordIn.nextLine();
                computerHP = 100;
            }
            
        } else if (d20Result <= 5) {
            double d20Result25 = roll.nextInt(5) + 1; 
            if (d20Result25 == 1) {
                clearScreen();
                System.out.println("________________________________________________");
                System.out.println();
                System.out.println("Queen Erystrazsa is delighted by your battle with");
                System.out.println(computerName + ". To spice things up, the queen");
                System.out.println("use her moonspark spell to heal " + computerName);
                System.out.println("with 5 HP.");
                System.out.println();
                System.out.println("Press \"ENTER\" to continue...");
                System.out.println("________________________________________________");
                wordIn.nextLine();
                computerHP += 5;                
            }  
            
        } else if (d20Result <= 9) {
            double d20Result69 = roll.nextInt(5) + 1; 
            if (d20Result69 == 1) {
                System.out.println("________________________________________________");
                System.out.println();
                System.out.println("Queen Erystrazsa is delighted by your battle with");
                System.out.println(computerName + ". To spice things up, the queen");
                System.out.println("commanded your foe's wand to use the piercing");
                System.out.println("wand move against you.");
                System.out.println(); 
                // Opponent gets a free basic attack on you
                userHP -= 2;
                System.out.println(computerName + " used piercing wand.");
                System.out.println("You were damaged with 2 HP."); 
                System.out.println();
                System.out.println("Press \"ENTER\" to continue...");
                System.out.println("________________________________________________");
                wordIn.nextLine();
            }
            
        } else if (d20Result == 10) {
            double d20Result10 = roll.nextInt(20) + 1; 
            if (d20Result10 == 1) {
                System.out.println("________________________________________________");
                System.out.println();
                System.out.println("Queen Erystrazsa is delighted by your battle with");
                System.out.println(computerName + ". To spice things up, the queen");
                System.out.println("commanded your foe's wand to use his ultimate");
                System.out.println("elemental spell against you.");
                System.out.println();
                
                // Opponent gets a free ultimate elemental spell on you
                if (userElement.equals("nature") && computerElement.equals("fire")) {
                    if (userShield == 0) {
                        userHP -= 25;  
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("Black fire of hell ignited around you.");
                        System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                        System.out.println();
                        System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                        System.out.println("elevated damage of 25 HP");
                    } else { 
                        userHP -= 20;   
                        userShield--;
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("Black fire of hell ignited around you.");
                        System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                        System.out.println();
                        System.out.println("Unfortunately, your shield is just enough to protect you.");
                        System.out.println("from the additional damage due to elemental advantage.");
                        System.out.println("You were damage with 20 HP");
                    }
                    
                } else if (userElement.equals("water") && computerElement.equals("fire")) {
                    if (userShield == 0) {
                       userHP -= 20;          
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("Black fire of hell ignited around you.");
                        System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                        System.out.println("You were damaged with 20 HP"); 
                    } else { 
                        userHP -= 5; 
                        userShield--;
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("Black fire of hell ignited around you.");
                        System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                        System.out.println("Fortunately, your shield substantially protected you.");
                        System.out.println("You were slightly damage with 5 HP");
                    }
                    
                } else if (userElement.equals("fire") && computerElement.equals("water")) {
                    if (userShield == 0) {
                        userHP -= 25;     
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("Water around you become violent and formed a storm.");
                        System.out.println("Queen Erystrazsa even felt the intensity from a distance.");
                        System.out.println();
                        System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                        System.out.println("elevated damage of 25 HP");
                    } else { 
                        userHP -= 20;     
                        userShield--;
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("Water around you become violent and formed a storm.");
                        System.out.println("Queen Erystrazsa even felt the intensity from a distance.");
                        System.out.println();
                        System.out.println("Unfortunately, your shield is just enough to protect you.");
                        System.out.println("from the additional damage due to elemental advantage.");
                        System.out.println("You were damage with 20 HP");
                    }
                    
                } else if (userElement.equals("nature") && computerElement.equals("water")) {
                    if (userShield == 0) {
                        userHP -= 20;          
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("Water around you become violent and formed a storm.");
                        System.out.println("Queen Erystrazsa even felt the intensity from a distance.");
                        System.out.println("You were damaged with 20 HP");
                    } else { 
                        userHP -= 5;          
                        userShield--;
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("Water around you become violent and formed a storm.");
                        System.out.println("Queen Erystrazsa even felt the intensity from a distance.");
                        System.out.println("You were slightly damage with 5 HP");
                    }
                    
                } else if (userElement.equals("water") && computerElement.equals("nature")) {
                    if (userShield == 0) {
                        userHP -= 25;     
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("The roots of surrounding trees emerged and smashed you with");
                        System.out.println("overwhelming force. Even Queen Erystrazsa cannot");
                        System.out.println("imagine the pain of each whip.");
                        System.out.println();
                        System.out.println("As " + computerName + " has elemental advantage, he inflicted");
                        System.out.println("elevated damage of 25 HP");
                    } else { 
                        userHP -= 20;          
                        userShield--;
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("The roots of surrounding trees emerged and smashed you with");
                        System.out.println("overwhelming force.");
                        System.out.println();
                        System.out.println("Unfortunately, your shield is just enough to protect you.");
                        System.out.println("from the additional damage due to elemental advantage.");
                        System.out.println("You were damage with 20 HP");
                    }
                    
                } else if (userElement.equals("fire") && computerElement.equals("nature")) {
                    if (userShield == 0) {
                        userHP -= 20;          
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("The roots of surrounding trees emerged and smashed you with");
                        System.out.println("overwhelming force. Even Queen Erystrazsa cannot");
                        System.out.println("imagine the pain of each whip.");
                        System.out.println("You were damaged with 20 HP");
                    } else { 
                        userHP -= 5;          
                        userShield--;
                        System.out.println(computerName + " casted his ultimate elemental spell.");
                        System.out.println("The roots of surrounding trees emerged and smashed you with");
                        System.out.println("overwhelming force. Fortunately, your shield");
                        System.out.println("substantially protected you.");
                        System.out.println("You were slightly damage with 5 HP");
                    }
                }
                
                System.out.println();
                System.out.println("Press \"ENTER\" to continue...");
                System.out.println("________________________________________________");
                wordIn.nextLine();
            }
            
        } else if (d20Result == 11) {
            double d20Result11 = roll.nextInt(20) + 1; 
            if (d20Result11 == 1) {
                clearScreen();
                System.out.println("________________________________________________");
                System.out.println();
                System.out.println("Queen Erystrazsa is delighted by your battle with");
                System.out.println(computerName + ". To help you in your fierce battle");
                System.out.println("the queen commanded your wand to use your ultimate");
                System.out.println("elemental spell against " + computerName);
                System.out.println();
         
                
                // You get a free ultimate elemental spell on your opponent
                if (userElement.equals("fire") && computerElement.equals("nature")) {
                    if (computerShield == 0) {
                        computerHP -= 25;
                        System.out.println("Black fire of hell ignited around " + computerName +".");
                        System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                        System.out.println("Due to your elemental advantage, your attack has additional damage.");
                        System.out.println("You dealt 25 damage points.");
                    } else {
                        computerHP -= 20;
                        computerShield--;
                        System.out.println("Black fire of hell ignited around " + computerName +".");
                        System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                        System.out.println("Due to your elemental advantage, your attack has additional damage.");
                        System.out.println("However, " + computerName + " activated his shield to nullify more damage.");
                        System.out.println("You dealt damage of 20 HP to him."); 
                    }
                    
                } else if (userElement.equals("fire") && computerElement.equals("water")) {
                    if (computerShield == 0) {
                        computerHP -= 20;
                        System.out.println("Black fire of hell ignited around " + computerName +".");
                        System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                        System.out.println("You dealt 20 damage points.");
                    } else {
                        computerHP -= 5;
                        computerShield--;
                        System.out.println("Black fire of hell ignited around " + computerName +".");
                        System.out.println("Queen Erystrazsa even felt the heat from a distance.");
                        System.out.println("However, " + computerName + " activated his shield.");
                        System.out.println("You dealt reduced damage of 5 HP to him.");
                    }
                    
                } else if (userElement.equals("water") && computerElement.equals("fire")) {
                    if (computerShield == 0) {
                        computerHP -= 25;
                        System.out.println("Water around " + computerName +" become violent and formed");
                        System.out.println("a storm. Queen Erystrazsa even felt the intensity from a distance.");
                        System.out.println("Due to your elemental advantage, your attack has additional damage.");
                        System.out.println("You dealt 25 damage points.");
                    } else {
                        computerHP -= 20;
                        computerShield--;
                        System.out.println("Water around " + computerName +" become violent and formed");
                        System.out.println("a storm. Queen Erystrazsa even felt the intensity from a distance.");
                        System.out.println("Due to your elemental advantage, your attack has additional damage.");
                        System.out.println("However, " + computerName + " activated his shield to nullify more damage.");
                        System.out.println("You dealt damage of 20 HP to him.");
                        
                    }
                    
                } else if (userElement.equals("water") && computerElement.equals("nature")) {
                    if (computerShield == 0) {
                        computerHP -= 20;
                        System.out.println("Water around " + computerName +" become violent and formed");
                        System.out.println("a storm. Queen Erystrazsa even felt the intensity from a distance.");
                        System.out.println("You dealt 20 damage points.");

                    } else {
                        computerHP -= 5;
                        computerShield--;
                        System.out.println("Water around " + computerName +" become violent and formed");
                        System.out.println("a storm. Queen Erystrazsa even felt the intensity from a distance.");
                        System.out.println("However, " + computerName + " activated his shield.");
                        System.out.println("You dealt reduced damage of 5 HP to him.");
                    }
                        
                } else if (userElement.equals("nature") && computerElement.equals("water")) {
                    if (computerShield == 0) {
                            computerHP -= 25;
                            System.out.println("The roots of trees near " + computerName);
                            System.out.println("emerged and smashed him with overwhelming force.");
                            System.out.println("Queen Erystrazsa even felt the pain of each whips.");
                            System.out.println("Due to your elemental advantage, your attack has additional damage.");
                            System.out.println("You dealt 25 damage points.");
                        
                    } else {
                            computerHP -= 20;
                            computerShield--;
                            System.out.println("The roots of trees near " + computerName);
                            System.out.println("emerged and smashed him with overwhelming force.");
                            System.out.println("Even Queen Erystrazsa cannot imagine the pain of each whip.");
                            System.out.println("Due to your elemental advantage, your attack has additional damage.");
                            System.out.println("However, " + computerName + " activated his shield to nullify more damage.");
                            System.out.println("You dealt damage of 20 HP to him.");
                    }
                    
                } else if (userElement.equals("nature") && computerElement.equals("fire")) {
                    if (computerShield == 0) {
                            computerHP -= 20;
                            System.out.println("The roots of trees near " + computerName);
                            System.out.println("emerged and smashed him with overwhelming force.");
                            System.out.println("Queen Erystrazsa even felt the pain of each whips.");
                            System.out.println("You dealt 20 damage points.");
                    } else {
                            computerHP -= 5;
                            computerShield--;
                            System.out.println("The roots of trees near " + computerName);
                            System.out.println("emerged and smashed him with overwhelming force.");
                            System.out.println("Even Queen Erystrazsa cannot imagine the pain of each whip.");
                            System.out.println("However, " + computerName + " activated his shield");
                            System.out.println("You dealt reduced damage of 5 HP to him.");
                    }
                }
                
                System.out.println();
                System.out.println("Press \"ENTER\" to continue...");
                System.out.println("________________________________________________");
                wordIn.nextLine();
            }
            
        } else if (d20Result <= 15) {
            double d20Result1215 = roll.nextInt(5) + 1; 
            if (d20Result1215 == 1) {
                clearScreen();
                System.out.println("________________________________________________");
                System.out.println();
                System.out.println("Queen Erystrazsa is delighted by your battle with");
                System.out.println(computerName + ". To help you in your fierce battle");
                System.out.println("the queen commanded your wand to use the piercing wand");
                System.out.println("move against " + computerName);
                System.out.println();
                // You get a free basic attack on your opponent
                computerHP -= 2;
                System.out.println("You used piercing wand.");
                System.out.println("You dealt 2 damage points to your foe.");
                System.out.println();
                System.out.println("Press \"ENTER\" to continue...");
                System.out.println("________________________________________________");
                wordIn.nextLine();
            }
            
        } else if (d20Result <= 19) {
            double d20Result1619 = roll.nextInt(5) + 1; 
            if (d20Result1619 == 1) {
                clearScreen();
                System.out.println("________________________________________________");
                System.out.println();
                System.out.println("Queen Erystrazsa is delighted by your battle with");
                System.out.println(computerName + ". To help you in your fierce battle,");
                System.out.println("the queen use her moonspark spell to heal you");
                System.out.println("with 5 HP.");
                System.out.println();
                System.out.println("Press \"ENTER\" to continue...");
                System.out.println("________________________________________________");
                wordIn.nextLine();
                userHP += 5;
            }
            
        } else {
            double d20Result20 = roll.nextInt(20) + 1; 
            if (d20Result20 == 1) {
                clearScreen();
                System.out.println("_________________________________________________");
                System.out.println();
                System.out.println("Queen Erystrazsa is delighted by your battle with");
                System.out.println(computerName + ". To help you in your fierce battle,");
                System.out.println("the queen fully healed you with her");
                System.out.println("moonlight blessing spell.");
                System.out.println();                
                System.out.println("Press \"ENTER\" to continue...");
                System.out.println("_________________________________________________");
                wordIn.nextLine();
                userHP = 100;
            }
            
        }
        
    }
    public static void gameOverCheck() {      // check if users/computer HP <= 0
        if (userHP <= 0 || computerHP <= 0) {
            clearScreen();
            if (userHP <= 0) {
                System.out.println("____________________________________________________");
                System.out.println();
                System.out.println("You lost all your HP before you're able to take down");
                System.out.println(computerName + ". Queen Erystrazsa is still so proud");
                System.out.println("of your spells and strategy. Even you lost, ");
                System.out.println("always raise your wand!");
                System.out.println("____________________________________________________");
                System.exit(0);
            } else if (computerHP <= 0) {
                System.out.println("____________________________________________________");
                System.out.println();
                System.out.println("Congratulations! " + computerName + " lost all his");
                System.out.println("HP. Queen Erystrazsa thinks that you are now ready");
                System.out.println("to defend the kingdom whenever the elves tried to");
                System.out.println("invade the Valkyria Kingdom. Always raise your wand!");
                System.out.println("____________________________________________________");
                System.exit(0);
            }
        }
    }
    public static void main(String[] args) {

        
        welcomeMenu();

        do {    
            playerMoves();
            gameOverCheck();
            computerSpellsAlgorithm();
            gameOverCheck();
            if ((turnNumber % 5) == 0) {        // appears every 5 rounds
                randomEncounter();
                gameOverCheck();
            }
        } while (userHP > 0 || computerHP > 0);

        
        
    }
    
}
