public class BodyOfWater{
    private String name;
    private int largestDiameter;
    private double avgDepth;
    private boolean isSaltWater;

    public BodyOfWater(String n, int l, double a, boolean s){
        name = n;
        largestDiameter = l;
        avgDepth = a;
        isSaltWater = s;
    }

    public BodyOfWater(String n, double a){
        name = n;
        avgDepth = a;
    }

    public void setName(String n){
        name = n;
    }

    public void setlargestDiameter(int d){
        largestDiameter = d;
    }

    public void setavgDepth(double a){
        avgDepth = a;
    }

    public void setisSaltWater(boolean s){
        isSaltWater = s;
    }

    public String name(){
        return name;
    }

    public int largestDiameter(){
        return largestDiameter;
    }

    public double avgDepth(){
        return avgDepth;
    }

    public boolean isSaltWater(){
        return isSaltWater;
    }

    public void printState(){
        System.out.println("Name:" + name);
        System.out.println("Largest Diameter:" + largestDiameter);
        System.out.println("Average Depth:" + avgDepth);
        System.out.println("Salt Water? :" + isSaltWater);
    }


}
