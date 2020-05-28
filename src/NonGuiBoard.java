import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NonGuiBoard {
    private static ArrayList<Property> Board = new ArrayList<>();
    public static ArrayList<Player> players = new ArrayList<>();
    private static Property Go = new Property("Go", 0,0,0,0,0,false,false, false ,false, null, null, 0, 0, 0, 0, 0);
    private static Property Mediterranean = new Property("Mediterranean Ave.", 60,2,30,0,50,false,true, true,false, null, "brown", 10,30,90,160,250);
    private static Property CC1 = new Property("Community Chest", 0,0,0,0,0,false,false, false, false, null, null, 0,0,0,0,0);
    private static Property Baltic = new Property("Baltic Ave.", 60,4,30,0,50,false,true, true, false,null, "brown", 20,60,180,320,450);
    private static Property IncomeTax = new Property("Income Tax", 0,0,0,0,0,false,false, false, false,null, null,0,0,0,0,0);
    private static Property ReadingRailroad = new Property("Reading Railroad", 200, 25,0,0,0, false, false, true, false,null,"railroad",50,100,150,200,0);
    private static Property Oriental = new Property("Oriental Ave.", 100,6,50,0,50,false,true,true,false,null,"lightblue",30,90,270,400,550);
    private static Property C1 = new Property("Chance", 0,0,0,0,0,false,false, false,false,null,null,0,0,0,0,0);
    private static Property Vermont = new Property("Vermont Ave.", 100,6,50,0,50,false,true,true,false,null,"lightblue", 30,90,270,400,550);
    private static Property Connecticut = new Property("Connecticut Ave.", 120,8,60,0,50,false,true,true,false,null,"lightblue", 40,100,300,450,600);
    private static Property jailSpace = new Property("Jail Space", 0,0,0,0,0,false,false, false, false,null,null,0,0,0,0,0);
    private static Property StCharles = new Property("St. Charles", 140,10,70,0,100,false,true,true,false,null,"pink",50,150,450,625,750);
    private static Property ElectricComp = new Property("Electric Company", 150,0,75,0,0,false,false, true,false,null,"utility",1,0,0,0,0);
    private static Property States = new Property("States Ave.", 140,10,70,0,100,false,true,true,false,null,"pink",50,150,450,625,750);
    private static Property Virginia = new Property("Virginia Ave.", 160,12,80,0,100,false,true,true,false,null,"pink",60,180,500,700,900);
    private static Property PennsylvaniaRailroad = new Property("Pennsylvania Railroad", 200, 25,0,0,0, false, false, true, false, null,"railroad",50,100,150,200,0);
    private static Property StJames = new Property("St. James.", 180,14,90,0,100,false,true,true,false, null,"orange",70,200,550,750,950);
    private static Property CC2 = new Property("Community Chest", 0,0,0,0,0,false,false, false,false,null,null,0,0,0,0,0);
    private static Property Tennessee = new Property("Tennessee Ave.", 180,14,90,0,100,false,true,true,false, null,"orange",70,200,550,750,950);
    private static Property NewYork = new Property("New York Ave.", 200,16,100,0,100,false,true,true,false, null,"orange",80,220,600,800,1000);
    private static Property FreeParking = new Property("Free Parking", 0,0,0,0,0,false,false, false,false, null,null,0,0,0,0,0);
    private static Property Kentucky = new Property("Kentucky Ave.", 220,18,110,0,150,false,true,true,false, null,"red",90,250,700,875,1050);
    private static Property C2 = new Property("Chance", 0,0,0,0,0,false,false, false,false, null,null,0,0,0,0,0);
    private static Property Indiana = new Property("Indiana Ave.", 220,18,110,0,150,false,true,true,false, null,"red",90,250,700,875,1050);
    private static Property Illinois = new Property("Illinois Ave.", 240,20,120,0,150,false,true,true,false, null,"red",100,300,750,925,1100);
    private static Property BandORailroad = new Property("B&O Railroad", 200, 25,0,0,0, false, false, true, false, null,"railroad",50,100,150,200,0);
    private static Property Atlantic = new Property("Atlantic Ave.", 260,22,130,0,150,false,true,true,false, null,"yellow",110,330,800,975,1150);
    private static Property WaterWorks = new Property("Water Works", 150,0,75,0,0,false,false,true,false, null,"utility",1,0,0,0,0);
    private static Property Ventnor = new Property("Ventnor Ave.", 260,22,130,0,150,false,true,true,false, null,"yellow",110,330,800,975,1150);
    private static Property MarvinGardens = new Property("Marvin Gardens", 280,24,140,0,150,false, true,true,false, null,"yellow",120,360,850,1025,1200);
    private static Property goToJail = new Property("Go To Jail", 0,0,0,0,0,false,false, false,false, null,null,0,0,0,0,0);
    private static Property Pacific = new Property("Pacific Ave", 300,26,150,0,200,false, true,true,false,null,"green",130,390,900,1100,1275);
    private static Property NorthCarolina = new Property("North Carolina Ave.", 300,26,150,0,200,false, true,true,false,null,"green",130,390,900,1100,1275);
    private static Property CC3 = new Property("Community Chest", 0,0,0,0,0,false,false, false, false,null,null,0,0,0,0,0);
    private static Property Pennsylvania = new Property("Pennsylvania Ave.", 320,28,160,0,200,false, true,true, false,null,"green",150,450,1000,1200,1400);
    private static Property ShortLine = new Property("ShortLine", 200, 25,0,0,0, false, false, true, false, null,"railroad",50,100,150,200,0);
    private static Property ParkPlace = new Property("Park Place", 350,35,175,0,200,false, true,true, false, null,"blue",175,500,1100,1300,1500);
    private static Property C3 = new Property("Chance", 0,0,0,0,0,false,false, false, false, null,null,0,0,0,0,0);
    private static Property Boardwalk = new Property("Boardwalk", 400,50,200,0,200,false, true,true, false, null,"blue",200,600,1400,1700, 2000);

    public static void main (String [] args) throws FileNotFoundException {
        Board.add(Go);
        Board.add(Mediterranean);
        Board.add(CC1);
        Board.add(Baltic);
        Board.add(IncomeTax);
        Board.add(ReadingRailroad);
        Board.add(Oriental);
        Board.add(C1);
        Board.add(Vermont);
        Board.add(Connecticut);
        Board.add(jailSpace);
        Board.add(StCharles);
        Board.add(ElectricComp);
        Board.add(States);
        Board.add(Virginia);
        Board.add(PennsylvaniaRailroad);
        Board.add(StJames);
        Board.add(CC2);
        Board.add(Tennessee);
        Board.add(NewYork);
        Board.add(FreeParking);
        Board.add(Kentucky);
        Board.add(C2);
        Board.add(Indiana);
        Board.add(Illinois);
        Board.add(BandORailroad);
        Board.add(Atlantic);
        Board.add(WaterWorks);
        Board.add(Ventnor);
        Board.add(MarvinGardens);
        Board.add(goToJail);
        Board.add(Pacific);
        Board.add(NorthCarolina);
        Board.add(CC3);
        Board.add(Pennsylvania);
        Board.add(ShortLine);
        Board.add(C3);
        Board.add(ParkPlace);
        Board.add(Boardwalk);
        ChanceDeck chance = new ChanceDeck();
        CommunityTreasureDeck communityTreasure = new CommunityTreasureDeck();
        Scanner scan = new Scanner(System.in);
        boolean gameOn = true;
        ArrayList<String> UserBoard = new ArrayList<>();
        for(Property p: Board){
            //System.out.println(p.getName());
            UserBoard.add(p.getName());
        }
        Random die = new Random();
        System.out.println("How Many Players? (1-8)");
        int ps = scan.nextInt();
        for(int i = 0 ; i < ps; i++){
           Player p = new Player("Player " + (i+1), 1500,0,0, false);
           players.add(p);

           //System.out.println(p.getName());
        }
        int curr = 0;
        Scanner boardScan = new Scanner(new File("displayBoard"));
        while(gameOn){
                checkPlayers();
                while(boardScan.hasNextLine()){
                    System.out.println(boardScan.nextLine());
                }
                monopolyCheck(players.get(curr));
                System.out.println(players.get(curr).getName() + "'s Turn");
                System.out.println("Type roll to Roll or manage to Manage Properties, You have: " + players.get(curr).getMoney() + "$ in the bank.(Note you may have to type your selection twice in order for it to register)");
                if(scan.next().equals("roll")) {
                    int roll1 = die.nextInt(6) + 1;
                    int roll2 = die.nextInt(6) + 1;
                    if (!players.get(curr).getInJail() || roll1 == roll2) {
                        System.out.println("You rolled: " + roll1 + roll2);
                        int pos = players.get(curr).getPosition();
                        if (pos + roll1 + roll2 < Board.size()) {
                            //System.out.println("pos: " + pos);
                            players.get(curr).setPositon(pos + roll1 + roll2);
                            pos = pos + roll1 + roll2;
                            //System.out.println("pos After: " + pos);
                            //System.out.println(UnusedGUIComponents.Board.get(pos).getName());
                            if (Board.get(pos).isOwnable() && !Board.get(pos).isOwned()) {
                                System.out.println("Would you like to buy: " + Board.get(pos).getName() + " for " + Board.get(pos).getPrice() + " (yes/no)" + " Current Money: " + players.get(curr).getMoney());
                                if (scan.next().equals("yes")) {
                                    players.get(curr).addProperty(Board.get(pos));
                                    players.get(curr).setMoney(players.get(curr).getMoney() - Board.get(pos).getPrice());
                                    Board.get(pos).setOwnable(false);
                                    Board.get(pos).setOwned(true);
                                    Board.get(pos).setPlayer(players.get(curr));
                                    curr = (curr + 1) % players.size();
                                } else if (scan.next().equals("no")) {
                                    curr = (curr + 1) % players.size();
                                }
                            } else if (Board.get(pos).getOwnedBy() != players.get(curr)) {
                                if(!Board.get(pos).getMortgaged()) {
                                    if (Board.get(pos).getColor().equals("utility")) {
                                        if (Board.get(pos).getRent() == 0) {
                                            System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + (4 * (roll1 + roll2)));
                                        }
                                        if (Board.get(pos).getRent() == 1) {
                                            System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + (10 * (roll1 + roll2)));
                                        }

                                    } else {
                                        players.get(curr).setMoney(players.get(curr).getMoney() - Board.get(pos).getRent());
                                        for (Player p : players) {
                                            if (Board.get(pos).getOwnedBy() == p) {
                                                System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + Board.get(pos).getRent());
                                                p.setMoney(p.getMoney() + Board.get(pos).getRent());
                                                System.out.println("Your new money count: " + players.get(curr).getMoney());
                                            }
                                        }
                                    }
                                }
                                curr = (curr + 1) % players.size();
                            }
                            else if ((!Board.get(players.get(curr).getPosition()).isOwnable()) && (Board.get(players.get(curr).getPosition()).getName().equals("Community Chest") || Board.get(pos).getName().equals("Chance"))) {
                                int cncPos = players.get(curr).getPosition();
                                if(Board.get(players.get(curr).getPosition()).getName().equals("Chance")) {
                                    chance.draw(players.get(curr));
                                }
                                if(Board.get(players.get(curr).getPosition()).getName().equals("Community Chest")) {
                                    communityTreasure.draw(players.get(curr));
                                }
                                if (cncPos != players.get(curr).getPosition()) {
                                    if (Board.get(pos).isOwnable() && !Board.get(pos).isOwned()) {
                                        System.out.println("Would you like to buy: " + Board.get(pos).getName() + " for " + Board.get(pos).getPrice() + " (yes/no)" + " Current Money: " + players.get(curr).getMoney());
                                        if (scan.next().equals(" yes")) {
                                            players.get(curr).addProperty(Board.get(pos));
                                            players.get(curr).setMoney(players.get(curr).getMoney() - Board.get(pos).getPrice());
                                            Board.get(pos).setOwnable(false);
                                            Board.get(pos).setOwned(true);
                                            curr = (curr + 1) % players.size();
                                        } else if (scan.next().equals("no")) {
                                            curr = (curr + 1) % players.size();
                                        }
                                    } else if (Board.get(pos).getOwnedBy() != players.get(curr)) {
                                        if(!Board.get(pos).getMortgaged()) {
                                            if (Board.get(pos).getColor().equals("utility")) {
                                                if (Board.get(pos).getRent() == 0) {
                                                    System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + (4 * (roll1 + roll2)));
                                                }
                                                if (Board.get(pos).getRent() == 1) {
                                                    System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + (10 * (roll1 + roll2)));
                                                }

                                            } else {
                                                players.get(curr).setMoney(players.get(curr).getMoney() - Board.get(pos).getRent());
                                                for (Player p : players) {
                                                    if (Board.get(pos).getOwnedBy() == p) {
                                                        System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + Board.get(pos).getRent());
                                                        p.setMoney(p.getMoney() + Board.get(pos).getRent());
                                                        System.out.println("Your new money count: " + players.get(curr).getMoney());
                                                    }
                                                }
                                            }
                                        }
                                        curr = (curr + 1) % players.size();

                                    }
                                    else if (Board.get(pos).getName().equals("Go To Jail")){
                                        System.out.println("Go to Jail, Do not pass go, Do not collect 200$");
                                        players.get(curr).setPositon(10);
                                        players.get(curr).setInJail(true);
                                        curr = (curr + 1) % players.size();
                                    }
                                    else {
                                        curr = (curr + 1) % players.size();
                                    }
                                }
                            }
                            else if (Board.get(pos).getName().equals("Go To Jail")){
                                System.out.println("Go to Jail, Do not pass go, Do not collect 200$");
                                players.get(curr).setPositon(10);
                                players.get(curr).setInJail(true);
                                curr = (curr + 1) % players.size();

                            }
                            else if(Board.get(pos).getName().equals("Income Tax")){
                                System.out.println("Income Tax, Pay 200$");
                                players.get(curr).setMoney(players.get(curr).getMoney() - 200 );
                                curr = (curr + 1) % players.size();
                            }
                            else {
                                curr = (curr + 1) % players.size();
                            }

                        }
                        else if (pos + roll1 + roll2 > Board.size()) {
                            players.get(curr).setPositon((pos + roll1 + roll2) - Board.size());
                            pos = pos + roll1 + roll2 - Board.size();
                            players.get(curr).setMoney(players.get(curr).getMoney() + 200);
                            if (Board.get(pos).isOwnable() && !Board.get(pos).isOwned()) {
                                System.out.println("Would you like to buy: " + Board.get(pos).getName() + " for " + Board.get(pos).getPrice() + " (yes/no)" + " Current Money: " + players.get(curr).getMoney());
                                if (scan.next().equals(" yes")) {
                                    players.get(curr).addProperty(Board.get(pos));
                                    players.get(curr).setMoney(players.get(curr).getMoney() - Board.get(pos).getPrice());
                                    Board.get(pos).setOwnable(false);
                                    Board.get(pos).setOwned(true);
                                    Board.get(pos).setPlayer(players.get(curr));
                                    curr = (curr + 1) % players.size();
                                } else if (scan.next().equals("no")) {
                                    curr = (curr + 1) % players.size();
                                }
                            } else if (Board.get(pos).getOwnedBy() != players.get(curr)) {
                                if(!Board.get(pos).getMortgaged()) {
                                    if (Board.get(pos).getColor().equals("utility")) {
                                        if (Board.get(pos).getRent() == 0) {
                                            System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + (4 * (roll1 + roll2)));
                                        }
                                        if (Board.get(pos).getRent() == 1) {
                                            System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + (10 * (roll1 + roll2)));
                                        }

                                    } else {
                                        players.get(curr).setMoney(players.get(curr).getMoney() - Board.get(pos).getRent());
                                        for (Player p : players) {
                                            if (Board.get(pos).getOwnedBy() == p) {
                                                System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + Board.get(pos).getRent());
                                                p.setMoney(p.getMoney() + Board.get(pos).getRent());
                                                System.out.println("Your new money count: " + players.get(curr).getMoney());
                                            }
                                        }
                                    }
                                }
                                curr = (curr + 1) % players.size();
                            } else if ((!Board.get(players.get(curr).getPosition()).isOwnable()) && (Board.get(players.get(curr).getPosition()).getName().equals("Community Chest") || Board.get(pos).getName().equals("Chance"))) {
                                int cncPos = players.get(curr).getPosition();
                                if(Board.get(players.get(curr).getPosition()).getName().equals("Chance")) {
                                    chance.draw(players.get(curr));
                                }
                                if(Board.get(players.get(curr).getPosition()).getName().equals("Community Chest")) {
                                    communityTreasure.draw(players.get(curr));
                                }
                                if (cncPos != players.get(curr).getPosition()) {
                                    if (Board.get(pos).isOwnable() && !Board.get(pos).isOwned()) {
                                        System.out.println("Would you like to buy: " + Board.get(pos).getName() + " for " + Board.get(pos).getPrice() + " (yes/no)" + " Current Money: " + players.get(curr).getMoney());
                                        if (scan.next().equals(" yes")) {
                                            players.get(curr).addProperty(Board.get(pos));
                                            players.get(curr).setMoney(players.get(curr).getMoney() - Board.get(pos).getPrice());
                                            Board.get(pos).setOwnable(false);
                                            Board.get(pos).setOwned(true);
                                            curr = (curr + 1) % players.size();
                                        } else if (scan.next().equals("no")) {
                                            curr = (curr + 1) % players.size();
                                        }
                                    } else if (Board.get(pos).getOwnedBy() != players.get(curr)) {
                                        if(!Board.get(pos).getMortgaged()) {
                                            if (Board.get(pos).getColor().equals("utility")){
                                                if(Board.get(pos).getRent() == 0) {
                                                    System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + (4 * (roll1 + roll2)));
                                                }
                                                if(Board.get(pos).getRent() == 1) {
                                                    System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + (10 * (roll1 + roll2)));
                                                }

                                            }
                                            else {
                                                players.get(curr).setMoney(players.get(curr).getMoney() - Board.get(pos).getRent());
                                                for (Player p : players) {
                                                    if (Board.get(pos).getOwnedBy() == p) {
                                                        System.out.println("You landed on: " + Board.get(pos).getName() + ", It will cost you: " + Board.get(pos).getRent());
                                                        p.setMoney(p.getMoney() + Board.get(pos).getRent());
                                                        System.out.println("Your new money count: " + players.get(curr).getMoney());
                                                    }
                                                }
                                            }
                                        }
                                        curr = (curr + 1) % players.size();

                                    }
                                    else if (Board.get(pos).getName().equals("Go To Jail")){
                                        System.out.println("Go to Jail, Do not pass go, Do not collect 200$");
                                        players.get(curr).setPositon(10);
                                        players.get(curr).setInJail(true);
                                        curr = (curr + 1) % players.size();
                                    }
                                    else {
                                        curr = (curr + 1) % players.size();
                                    }
                                }
                            }
                            else if (Board.get(pos).getName().equals("Go To Jail")){
                                System.out.println("Go to Jail, Do not pass go, Do not collect 200$");
                                players.get(curr).setPositon(10);
                                players.get(curr).setInJail(true);
                                curr = (curr + 1) % players.size();
                            }
                            else if(Board.get(pos).getName().equals("Income Tax")){
                                System.out.println("Income Tax, Pay 200$");
                                players.get(curr).setMoney(players.get(curr).getMoney() - 200 );
                                curr = (curr + 1) % players.size();
                            }
                            else {
                                curr = (curr + 1) % players.size();
                            }

                        }
                    }
                }
                else if(scan.next().equals("manage")){
                    ArrayList<Property> playerHouseProperties = monopolyCheck(players.get(curr));
                    System.out.println("Type mortgage to Mortgage a Property or houses to Add Houses to Properties(Can only add if listed in houseable properties)");
                    if (scan.next().equals("mortgage")){
                        if(players.get(curr).playerProperties().size() == 0){
                            System.out.println("Sorry you have no properties to mortgage at this time.");
                        }
                        else {
                            System.out.println("Which property do you want to mortgage?(Enter the name as listed in Properties)");
                            String propName = scan.next();
                            boolean hasProp = false;
                            for (Property playProps : players.get(curr).playerProperties()) {
                                if (playProps.getName().equals(propName)) {
                                    hasProp = true;
                                }
                            }
                            if (hasProp) {
                                for (Property prop : players.get(curr).playerProperties()) {
                                    if (prop.getName().equals(propName)) {
                                        prop.setMortgaged(true);
                                        players.get(curr).setMoney(players.get(curr).getMoney() + prop.getMortgage());
                                    }
                                }
                                System.out.print("You have mortgaged: " + propName);
                            } else {
                                System.out.println("Sorry You don't own that property.");
                            }
                        }
                    }
                    else if(scan.next().equals("houses")){
                        if(playerHouseProperties.size() == 0){
                            System.out.println("Sorry you have no houseable properties");
                        }
                        else {
                            System.out.println("Which property do you want to put a house on?(Type the name of the property)");
                            System.out.println(playerHouseProperties);
                            String selection = scan.next();
                            if (playerHouseProperties.contains(selection)) {
                                int housePrice = 0;
                                Property selected = null;
                                for (Property prop : playerHouseProperties) {
                                    if (prop.getName().equals(selection)) {
                                        housePrice = prop.getHousePrice();
                                        selected = prop;
                                    }
                                }
                                System.out.print("How many houses(#1-5)?, Current Money: " + players.get(curr).getMoney() + "Price per House: " + housePrice + "Current Houses(Max 5): " + selected.getHouseLevel());
                                int houses = scan.nextInt() + selected.getHouseLevel();
                                if ((houses - selected.getHouseLevel()) * housePrice > players.get(curr).getMoney() || houses > 5) {
                                    System.out.println("Try Again");
                                } else {
                                    selected.setNewRent(houses);
                                    selected.setHouseLevel(houses);
                                }

                            }
                            else{
                                System.out.println("Try Again");
                            }
                        }
                    }

                }
            }

        }
        public static ArrayList monopolyCheck(Player p){
            String props = "Properties: ";
            String mort = "Mortgaged Properties: ";
            for(Property prop : p.playerProperties()){
                props = props + prop.getName() + ", ";
            }
            for(Property m : p.playerProperties()){
                if(m.getMortgaged()){
                    mort = mort + m.getName() + ", ";
                }
            }
            ArrayList<Property> monopolyProperties = new ArrayList<>();
            int brownCount = 0;
            int lightBlueCount = 0;
            int pinkCount = 0;
            int orangeCount = 0;
            int redCount = 0;
            int yellowCount = 0;
            int greenCount = 0;
            int blueCount = 0;
            int railroadCount =0;
            int utilityCount = 0;
            for (Property prop: p.playerProperties()) {
                if(prop.getColor().equals("brown")){
                    brownCount++;
                }
                if(prop.getColor().equals("lightblue")){
                    lightBlueCount++;
                }
                if(prop.getColor().equals("pink")){
                    pinkCount++;
                }
                if(prop.getColor().equals("orange")){
                    orangeCount++;
                }
                if(prop.getColor().equals("red")){
                    redCount++;
                }
                if(prop.getColor().equals("yellow")){
                    yellowCount++;
                }
                if(prop.getColor().equals("green")){
                    greenCount++;
                }
                if(prop.getColor().equals("blue")){
                    blueCount++;
                }
            }
            if(brownCount == 2){
                for (Property prop: p.playerProperties()) {
                    if(prop.getColor().equals("brown")){
                        prop.setRent(prop.getRent()*2);
                        monopolyProperties.add(prop);
                    }
                }
            }
            if(lightBlueCount == 3){
                for (Property prop: p.playerProperties()) {
                    if(prop.getColor().equals("lightblue")){
                        prop.setRent(prop.getRent()*2);
                        monopolyProperties.add(prop);
                    }
                }
            }
            if(pinkCount == 3){
                for (Property prop: p.playerProperties()) {
                    if(prop.getColor().equals("pink")){
                        prop.setRent(prop.getRent()*2);
                        monopolyProperties.add(prop);
                    }
                }
            }
            if(orangeCount == 3){
                for (Property prop: p.playerProperties()) {
                    if(prop.getColor().equals("orange")){
                        prop.setRent(prop.getRent()*2);
                        monopolyProperties.add(prop);
                    }
                }
            }
            if(redCount == 3){
                for (Property prop: p.playerProperties()) {
                    if(prop.getColor().equals("red")){
                        prop.setRent(prop.getRent()*2);
                        monopolyProperties.add(prop);
                    }
                }
            }
            if(yellowCount == 3){
                for (Property prop: p.playerProperties()) {
                    if(prop.getColor().equals("yellow")){
                        prop.setRent(prop.getRent()*2);
                        monopolyProperties.add(prop);
                    }
                }
            }
            if(greenCount == 3){
                for (Property prop: p.playerProperties()) {
                    if(prop.getColor().equals("green")){
                        prop.setRent(prop.getRent()*2);
                        monopolyProperties.add(prop);
                    }
                }
            }
            if(blueCount == 2){
                for (Property prop: p.playerProperties()) {
                    if(prop.getColor().equals("blue")){
                        prop.setRent(prop.getRent()*2);
                        monopolyProperties.add(prop);
                    }
                }
            }
            for (Property prop: p.playerProperties()) {
                if (prop.getColor().equals("railroad")) { //should have made color into type but was lazy
                    railroadCount++;
                }
            }
            for(Property rails: p.playerProperties()){
                if (rails.getColor().equals("railroad")) { //second railroad loop probably not the best in terms of run time.
                    rails.setNewRent(railroadCount);
                }
            }
            for(Property util: p.playerProperties()){
                if (util.getColor().equals("utility")) { //should have made color into type but was lazy
                    utilityCount++;
                }
            }
            if (utilityCount == 2) {
                for (Property util : p.playerProperties()) {
                    if (util.getColor().equals("utility")) { //should have made color into type but was lazy
                        util.setNewRent(1);
                    }
                }
            }


            System.out.println(p.getName()+ "'s " + props);
            System.out.println(p.getName()+ "'s " +mort);
            System.out.println(p.getName() + "'s Houseable Properties: "+ monopolyProperties);
            return monopolyProperties;
        }
        public static void checkPlayers(){ //check to see if a player need to be removed from play
            for(Player p : players){
                int pPos = 0;
                int checkSum = p.getMoney();
                for(Property prop: p.playerProperties()){
                    if (prop.getMortgaged() == false){
                        checkSum = checkSum + prop.getMortgage();
                    }
                }
                if(checkSum < 0){
                    players.remove(pPos);
                }
                pPos++;
            }
        }

      }

