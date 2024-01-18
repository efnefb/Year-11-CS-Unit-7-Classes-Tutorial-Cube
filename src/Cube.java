public class Cube {

    private static int side;

    public Cube(){
        side = 1;
    }

    public Cube(int s) throws IllegalArgumentException{
        if (s<1) throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        else{
            side = s;
        }
    }

    public int getSide(){
       return side;
    }

    public void setSide(int s) throws IllegalArgumentException{
        if(s<1) throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        else{
            side = s;
        }
    }

    public int getSurfaceArea(){
        return 6 * side * side;
    }

    public int getVolume(){
        return side*side*side;
    }

    public String toString(){
        return "Cube{side=" + side + "}";
    }

}
