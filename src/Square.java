public class Square {
    private int bok;
    private int pole;
    private int obw;

    public Square(int bok) {
        this.bok = bok;
        this.pole = bok*bok;
        this.obw = bok*4;
    }

    public int getBok() {
        return bok;
    }

    public int getPole() {
        return pole;
    }

    public int getObw() {
        return obw;
    }

    public void setBok(int bok) {
        this.bok = bok;
        this.pole = bok*bok;
        this.obw = bok*4;
    }

    public void setPole(int pole) {
        this.pole = pole;
        this.bok = (int) Math.sqrt(pole);
        this.obw = this.bok*4;
    }
}
