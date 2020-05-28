import java.util.ArrayList;

public class Player {
    private String name;
    private int money;
    private ArrayList<Property> properties;
    private int jailFreeCards;
    private int position;
    private boolean inJail;


    public Player(String name, int money, int jailFreeCards, int position ,boolean inJail){
        this.name = name;
        this.money = money;
        properties = new ArrayList<>();
        this.jailFreeCards = jailFreeCards;
        this.position = position;
        this.inJail = inJail;

    }
    public String getName(){
        return this.name;
    }
    public int getMoney(){
        return this.money;
    }
    public int getJailFreeCards(){
        return this.jailFreeCards;
    }
    public boolean getInJail(){
        return this.inJail;
    }
    public String printProperties(){
        String props = "";
        for(Property p : properties){
            props = props + p.getName() + "\n";
        }
        return props;
    }
    public void addProperty(Property p){
        properties.add(p);
    }
    public void setMoney(int m){
        this.money = m;
    }

    public int getPosition() {
        return position;
    }
    public void setPositon(int p){
        this.position = p;
    }
    public void setJailFreeCards(int j){
        this.jailFreeCards = j;
    }
    public void setInJail(boolean ij){
        this.inJail = ij;
    }
    public ArrayList<Property> playerProperties(){
        return this.properties;
    }
    //    public void addPlayer(String name, int money, int jailFreeCards, boolean inJail){
//        Player p = new Player(name, money, jailFreeCards, inJail);
//        players.add(p);
//    }
//    public void removePlayer(String name){
//        for(Player p : players){
//            if (p.name == name){
//                players.remove(p);
//            }
//        }
//    }
}
