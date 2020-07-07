import java.util.Random;

public class Dice {

    Random rand;
    String dieFace;

    public Dice() {
        this.rand = new Random();
    }

    public String roll() {
        int currentRoll = this.rand.nextInt(6) + 1;
        switch(currentRoll) {
            case 1:
                this.dieFace = "⚀";
                break;
            case 2:
                this.dieFace = "⚁";
                break;
            case 3:
                this.dieFace = "⚂";
                break;
            case 4:
                this.dieFace = "⚃";
                break;
            case 5:
                this.dieFace = "⚄";
                break;
            case 6:
                this.dieFace = "⚅";
                break;
            default:
                this.dieFace = "Error rolling dice.";
                break;
        }

        return dieFace;
    }
}
