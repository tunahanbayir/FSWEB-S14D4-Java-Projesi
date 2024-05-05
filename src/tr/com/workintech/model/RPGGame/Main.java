package tr.com.workintech.model.RPGGame;

public class Main {
    public static void main(String[] args) {
        Troll troll = new Troll("Ork", 100, 20);
        Werewolf werewolf = new Werewolf("Kurtadam", 100, 10);
        System.out.println("Troll attacks " + troll.attack());
        System.out.println("Werewolf attacks " + werewolf.attack());

        System.out.println("Troll bleed " + troll.bleed());
        System.out.println("Werewolf bleed " + werewolf.bleed());
    }
}
