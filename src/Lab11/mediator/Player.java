package Lab11.mediator;

public class Player implements IPlayer {

    private String name;
    private boolean isWin;
    private boolean youTurn;
    private int score;
    private int color;
    private ReversiMediator mediator;

    public Player(String name) {
        this.name = name;
    }

    public ReversiMediator getMediator() {
        return mediator;
    }

    public void setMediator(ReversiMediator mediator) {
        this.mediator = mediator;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWin() {
        return isWin;
    }

    public void setWin(boolean isWin) {
        this.isWin = isWin;
    }

    public boolean isYouTurn() {
        return youTurn;
    }

    public void setYouTurn(boolean youTurn) {
        this.youTurn = youTurn;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void move(int x, int y) {
        mediator.move(this, x, y);
    }
}
