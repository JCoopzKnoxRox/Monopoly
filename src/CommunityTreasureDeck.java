import java.util.LinkedList;
import java.util.List;

public class CommunityTreasureDeck {
    private List<Card> cardPile = new LinkedList<>();
    private List<Card> discard = new LinkedList<>();

    public CommunityTreasureDeck(){
        cardPile.add(new Card("Advance to Go") {
            public void action(Player player){
                player.setPositon(0);
                player.setMoney(player.getMoney() +200);
                System.out.println("Change location of player token to Go, Collect 200$");
            }
        });
        cardPile.add(new Card("Collect 200$") {
            public void action(Player player){
                player.setMoney(player.getMoney()+200);
                System.out.println("Bank Error in your favor, Collect 200$");
            }
        });
        cardPile.add(new Card("Pay 50$") {
            public void action(Player player){
                player.setMoney(player.getMoney()-50);
                System.out.println("Doctors's fee, Pay 50$");
            }
        });
        cardPile.add(new Card("Gain 50$") {
            public void action(Player player){
                player.setMoney(player.getMoney()+50);
                System.out.println("Stock Sale, Gain 50$");
            }
        });
        cardPile.add(new Card("Gain 50$") {
            public void action(Player player){
                player.setJailFreeCards(player.getJailFreeCards()+1);
                System.out.println("You Received a Get Out of Jail Free Card");
            }
        });
        cardPile.add(new Card("Go To Jail") {
            public void action(Player player){
                player.setInJail(true);
                player.setPositon(10);
                System.out.println("Go Directly To Jail");
            }
        });
        cardPile.add(new Card("Collect 50$ from each player") {
            public void action(Player player){
                int pCount = 0;
                for(Player p : NonGuiBoard.players){
                    if(p != player){
                        p.setMoney(p.getMoney() -50);
                        pCount++;
                    }
                }
                player.setMoney(player.getMoney() + (50*pCount));
                System.out.println("Grand Opera Night, Collect 50$ from each player.");
            }
        });
        cardPile.add(new Card("Collect 50$") {
            public void action(Player player){
                player.setMoney(player.getMoney()+50);
                System.out.println("Holiday Fund Matures, Collect 50$");
            }
        });
        cardPile.add(new Card("Collect 20$") {
            public void action(Player player){
                player.setMoney(player.getMoney()+20);
                System.out.println("Income Tax Refund, Collect 20$");
            }
        });
        cardPile.add(new Card("Go To Jail") {
            public void action(Player player){
                player.setMoney(player.getMoney()+100);
                System.out.println("Life Insurance Matures, collect 100$");
            }
        });
        cardPile.add(new Card("Get 10$ from each player.") {
            public void action(Player player){
                int pCount = 0;
                for(Player p : NonGuiBoard.players){
                    if(p != player){
                        p.setMoney(p.getMoney() -10);
                        pCount++;
                    }
                }
                player.setMoney(player.getMoney() + (10*pCount));
                System.out.println("Its your Birthday, Collect 10$ from each player.");
            }
        });
        cardPile.add(new Card("Pay 50$") {
            public void action(Player player){
                player.setMoney(player.getMoney()-50);
                System.out.println("Hospital Fees, Pay 50$");
            }
        });
        cardPile.add(new Card("Pay 50$") {
            public void action(Player player){
                player.setMoney(player.getMoney()-50);
                System.out.println("School Fees, Pay 50$");
            }
        });
        cardPile.add(new Card("Receive 25$") {
            public void action(Player player){
                player.setMoney(player.getMoney()+25);
                System.out.println("Consultancy Fees Reimbursement, Receive 25$");
            }
        });
        cardPile.add(new Card("Pay 50$") {
            public void action(Player player){
                player.setMoney(player.getMoney()-50);
                System.out.println("Hospital Fees, Pay 50$");
            }
        });
        cardPile.add(new Card("Make Repairs to All Properties") {
            public void action(Player player){
                int sub = 0;
                for(Property p : player.playerProperties()){
                    sub = sub + p.getHouseLevel();
                }
                player.setMoney(player.getMoney() - (sub*40));
                System.out.println("Make Repairs to All Properties(40$ per House/Hotel)");
            }
        });
        cardPile.add(new Card("Receive 25$") {
            public void action(Player player){
                player.setMoney(player.getMoney()+10);
                System.out.println("You've won Second place in a beauty competition, Receive 10$");
            }
        });
        cardPile.add(new Card("Receive 25$") {
            public void action(Player player){
                player.setMoney(player.getMoney()+100);
                System.out.println("You inherit 100$");
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
