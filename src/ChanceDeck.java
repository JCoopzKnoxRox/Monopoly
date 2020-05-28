import java.util.LinkedList;
import java.util.List;

public class ChanceDeck {
    private  List<Card> cardPile = new LinkedList<>();
    private List<Card> discard = new LinkedList<>();

    public ChanceDeck(){
        cardPile.add(new Card("Advance to Boardwalk") {
            public void action(Player player){
                player.setPositon(38);
                System.out.println("Change location of player token to Boardwalk");
            }
        });
        cardPile.add(new Card("Advance to Go") {
            public void action(Player player){
                player.setPositon(0);
                player.setMoney(player.getMoney() + 200);
                System.out.println("Change location of player token to GO --> Collect 200$");
            }
        });
        cardPile.add(new Card("Advance to Illinois Ave") {
            public void action(Player player){
                int currPos = player.getPosition();
                player.setPositon(24);
                if(currPos > 24){
                    player.setMoney(player.getMoney() + 200);
                }
                System.out.println("Change location of player token to Illinois Ave.");
            }
        });
        cardPile.add(new Card("Advance to Next Utility") {
                public void action(Player player){
                    int currPos = player.getPosition();
                    if(currPos < 12 || currPos > 27){
                        player.setPositon(12);
                    }
                    else if(currPos > 12 && currPos < 27){
                        player.setPositon(27);
                    }
                    System.out.println("Change location of player token to Nearest Utility");
                }

        });
        cardPile.add(new Card("Advance to Next Railroad") {
            public void action(Player player) {
                int currPos = player.getPosition();
                if (currPos < 5 || currPos > 35) {
                    player.setPositon(5);
                } else if (currPos < 15) {
                    player.setPositon(10);
                }
                else if (currPos < 25) {
                    player.setPositon(10);
                }
                else if (currPos < 35) {
                    player.setPositon(10);
                }
                System.out.println("Change location of player token to Nearest Railroad");
            }

        });
        cardPile.add(new Card("Bank pays you dividend of 50$") {
            public void action(Player player){
                player.setMoney(player.getMoney() + 50);
                System.out.println("Bank pays you dividend of 50$");
            }
        });
        cardPile.add(new Card("Recieve Jail Free Card") {
            public void action(Player player){
                player.setJailFreeCards(player.getJailFreeCards()+1);
                System.out.println("Receive One Get Out of Jail Free Card");
            }
        });
        cardPile.add(new Card("Go Back Three Spaces") {
            public void action(Player player){
                player.setPositon(player.getPosition()-3);
                System.out.println("Go Back Three Spaces");
            }
        });
        cardPile.add(new Card("Go To Jail") {
            public void action(Player player){
                player.setInJail(true);
                player.setPositon(10);
                System.out.println("Go Directly To Jail");
            }
        });
        cardPile.add(new Card("Make Repairs to All Properties") {
            public void action(Player player){
                int sub = 0;
                for(Property p : player.playerProperties()){
                    sub = sub + p.getHouseLevel();
                }
                player.setMoney(player.getMoney() - (sub*25));
                System.out.println("Make Repairs to All Properties(25$ per House/Hotel)");
            }
        });
        cardPile.add(new Card("Advance to Reading Railroad") {
            public void action(Player player){
                if(player.getPosition() > 15){
                    player.setMoney(player.getMoney() + 200);
                }
                player.setPositon(15);
                System.out.println("Advance to Reading Railroad");
            }
        });
        cardPile.add(new Card("Building Loan Matures") {
            public void action(Player player){
                player.setMoney(player.getMoney() + 150);
                System.out.println("Your Building Loan Matures, Collect 150$");
            }
        });
        cardPile.add(new Card("Pay Poor Tax") {
            public void action(Player player){
                player.setMoney(player.getMoney() - 15);
                System.out.println(" Pay Poor Tax (15$)");
            }
        });
        cardPile.add(new Card("Pay Each Player 50$") {
            public void action(Player player){
                int pCount = 0;
                for(Player p : NonGuiBoard.players){
                    if(p != player){
                        p.setMoney(p.getMoney() +50);
                        pCount++;
                    }
                }
                player.setMoney(player.getMoney() - (50*pCount));
            }
        });
        cardPile.add(new Card("Get 100$") {
            public void action(Player player){
                player.setMoney(player.getMoney() - 15);
                System.out.println("You won a Crossword Competition, Collect 100$");
            }
        });

    }
    public void draw(Player p){
        if(cardPile.size() == 0){
            while(discard.size() != 0) {
                Card card = discard.get(0);
                cardPile.add(card);
                discard.remove(0);
            }
        }
        Card card = cardPile.get(0);
        card.action(p);
        discard.add(card);
        cardPile.remove(0);
    }


}
