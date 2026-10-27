public enum Codici {
    Rosso(1) , Arancione(2), Verde( 3), BIanco(4), Azzurro( 5);

    private final int num;

    private Codici(int num){
        this.num= num;
    }

    public int getNum() {
        return num;
    }
}
