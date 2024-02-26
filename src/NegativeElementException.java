public class NegativeElementException extends Exception{
    private int index;

    public NegativeElementException (int index){
        this.index=index;

    }
    public int getIndex() {
        return index;
    }
}
