abstract class Shape implements Locatable,Selectable {
    private int x,y;
    private boolean isSelected;
    abstract double getArea();
    abstract double getPerimeter();
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public void setLocation(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public boolean getSelected(){
        return isSelected;
    }

    public void setSelected(boolean bl){
        isSelected=bl;
    }
    public boolean contains(int x, int y){
        if(this.x==x && this.y==y) return true;
        else return false;
    }
    
    public String toString() {
        if(getSelected()) return "is selected!";
        else return "is Not selected";
    }
}