/**
 * This class represents the information of the battlefield that the pets fight in.
 * @author hchoi395
 * @version 11.0.13
 */
public class PetBattlefield {
    private Pet[] firstTeam;
    private Pet[] secondTeam;
    /**
     * PetBattlefield constructor that takes in 2 parameters.
     * @param firstTeam Pet[] parameter of the first team of pets.
     * @param secondTeam Pet[] parameter of the second team of pets.
     */
    public PetBattlefield(Pet[] firstTeam, Pet[] secondTeam) {
        if (firstTeam.length <= 5) {
            this.firstTeam = firstTeam;
        } else {
            this.firstTeam = new Pet[5];
        }
        if (secondTeam.length <= 5) {
            this.secondTeam = secondTeam;
        } else {
            this.secondTeam = new Pet[5];
        }
    }
    @Override
    public String toString() {
        String s = "First Team: ";
        for (int i = 0; i < firstTeam.length; i++) {
            if (firstTeam[i] == null) {
                if (i == firstTeam.length - 1) {
                    s += "Empty";
                } else {
                    s += "Empty, ";
                }
            } else {
                if (i == firstTeam.length - 1) {
                    s += firstTeam[i].toString();
                } else {
                    s += firstTeam[i].toString() + ", ";
                }
            }
        }
        s += " vs Second Team: ";
        for (int i = 0; i < secondTeam.length; i++) {
            if (secondTeam[i] == null) {
                if (i == secondTeam.length - 1) {
                    s += "Empty";
                } else {
                    s += "Empty, ";
                }
            } else {
                if (i == secondTeam.length - 1) {
                    s += secondTeam[i].toString();
                } else {
                    s += secondTeam[i].toString() + ", ";
                }
            }
        }
        return s;
    }
    /**
     * Method that compares the two teams and gives an expected result of the fight.
     */
    public void compareTeams() {
        int firstTeamWin = 0;
        int secondTeamWin = 0;
        for (int i = 0; i < firstTeam.length; i++) {
            if (firstTeam[i] == null && secondTeam[i] != null) {
                secondTeamWin++;
            } else if (firstTeam[i] == null && secondTeam[i] == null) {
                firstTeamWin++;
                secondTeamWin++;
            } else {
                if (firstTeam[i].compareTo(secondTeam[i]) > 0) {
                    firstTeamWin++;
                } else if (firstTeam[i].compareTo(secondTeam[i]) < 0) {
                    secondTeamWin++;
                }
            }
        }
        if (firstTeamWin > secondTeamWin) {
            System.out.println("The first team will probably win.");
        } else if (firstTeamWin < secondTeamWin) {
            System.out.println("The second team will probably win.");
        } else {
            System.out.println("It is an even match.");
        }
    }
    /**
     * Method that puts the teams against each other and prints what team wins.
     */
    public void battle() {
        int i = 0;
        int j = 0;
        while (i < firstTeam.length && j < secondTeam.length) {
            if (firstTeam[i] == null) {
                i++;
                if (secondTeam[j] == null) {
                    j++;
                }
                continue;
            }
            if (secondTeam[j] == null) {
                j++;
                continue;
            }
            if (firstTeam[i].hasFainted()) {
                firstTeam[i] = null;
                i++;
                if (secondTeam[j].hasFainted()) {
                    secondTeam[j] = null;
                    j++;
                }
                continue;
            }
            if (secondTeam[j].hasFainted()) {
                secondTeam[j] = null;
                j++;
                continue;
            }
            firstTeam[i].attackPet(secondTeam[j]);
            secondTeam[j].attackPet(firstTeam[i]);
        }
        if (i == firstTeam.length && j == secondTeam.length) {
            System.out.println("Both teams fainted.");
        } else if (i != firstTeam.length && j == secondTeam.length) {
            System.out.println("The first team won!");
        } else if (j != secondTeam.length && i == firstTeam.length) {
            System.out.println("The second team won!");
        }
    }
    /**
     * Main method that runs the methods of the classes.
     * @param args args parameter.
     */
    public static void main(String[] args) {
        Pet[] firstTeam = {new Turtle(8, 6, false), new Hippo(1, 1, 2), new Skunk(1, 1, 1), new Skunk(1, 1, 1), null};
        Pet[] secondTeam = {null, new Skunk(1, 1, 10), new Hippo(1, 1, 1), new Skunk(1, 1, 1), new Skunk(1, 1, 1)};
        PetBattlefield battle = new PetBattlefield(firstTeam, secondTeam);
        System.out.println(battle.toString());
        battle.compareTeams();
        battle.battle();
        System.out.println(battle.toString());
    }
}
