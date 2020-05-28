import java.util.ArrayList;

public class Property  {
    private String name;
    private int price;
    private int rent;
    private int mortgage;
    private int houseLevel;
    private int housePrice;
    private boolean mortgaged;
    private boolean houseable;
    private boolean ownable;
    private boolean owned;
    private  Player player;
    private String color;
    private int house1Price;
    private int house2Price;
    private int house3Price;
    private int house4Price;
    private int house5Price;
    public ArrayList<Property> properties = new ArrayList<>();
    //UnusedGUIComponents.BoardSquare elements
    public Property(String name,int price, int rent, int mortgage, int houseLevel, int housePrice, boolean mortgaged, boolean houseable, boolean ownable,boolean owned, Player ownedBy, String color, int house1Price, int house2Price, int house3Price, int house4Price, int house5Price){

        this.name = name;
        this.price = price;
        this.rent = rent;
        this.mortgage = mortgage;
        this.houseLevel = houseLevel;
        this.housePrice = housePrice;
        this.mortgaged = mortgaged;
        this.houseable = houseable;
        this.ownable = ownable;
        this.owned = owned;
        this.color = color;
        this.house1Price = house1Price;
        this.house2Price = house2Price;
        this.house3Price = house3Price;
        this.house4Price = house4Price;
        this.house5Price = house5Price;

        player = ownedBy;


        //this.type = type;
        properties.add(this);

    }

//    public void addProperty(String name,int price, int rent, int mortgage, int houseLevel, int housePrice, boolean mortgaged){
//        Property p = new Property(name, price, rent, mortgage, houseLevel, housePrice, mortgaged);
//    }

    public String getName() {
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public int getRent(){
        return this.rent;
    }
    public int getMortgage() {
        return this.mortgage;
    }
    public int getHouseLevel(){
        return this.houseLevel;
    }
    public int getHousePrice(){
        return this.housePrice;
    }
    public boolean isHouseable(){
        return this.houseable;
    }
    public boolean isOwnable(){
        return this.ownable;
    }
    public boolean isOwned(){
        return this.owned;
    }
    public void setRent(int r){
        this.rent = r;
    }
    public void setMortgaged(boolean m){
        this.mortgaged = m;
    }
    public void setOwnable(boolean able){
        this.ownable = able;
    }
    public void setOwned(boolean own){
        this.owned = own;
    }
    public void setPlayer(Player p){
        this.player = p;
    }
    public String getColor(){
        return this.color;
    }
    public Player getOwnedBy(){
        return this.player;
    }
    public boolean getMortgaged(){
        return this.mortgaged;
    }
    public void setNewRent(Integer i){
        int newRent = 0;
        if(i == 1){
            newRent = this.house1Price;
        }
        if(i == 2){
            newRent = this.house2Price;
        }
        if(i == 3){
            newRent = this.house3Price;
        }
        if(i == 4){
            newRent = this.house4Price;
        }
        if(i == 5){
            newRent = this.house5Price;
        }
        this.rent = newRent;
    }

    public void setHouseLevel(int i){
        this.houseLevel = i;
    }


}
