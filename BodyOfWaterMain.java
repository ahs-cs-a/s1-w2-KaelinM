public class BodyOfWaterMain {
    public static void main(String[] args) {
        BodyOfWater b = new BodyOfWater("Lake Powell", 100, 25, true);
      
        System.out.println("Name:" + b.name());
        System.out.println("Largest Diameter:" + b.largestDiameter() + " feet");
        System.out.println("Average Depth:" + b.avgDepth() + " feet");
        System.out.println("Salt Water? :" + b.isSaltWater());

        //b.setName("Lake Tahoe");
        //b.setlargestDiameter(50);
        //b.setavgDepth(1000);
        //b.setisSaltWater(false);

        BodyOfWater b1 = new BodyOfWater("Lake Tahoe", 25);
        

        System.out.println("Name:" + b1.name());
        System.out.println("Largest Diameter:" + b1.largestDiameter() + " feet");
        System.out.println("Average Depth:" + b1.avgDepth() + " feet");
        System.out.println("Salt Water? :" + b1.isSaltWater());

        b.setName("Pacific Ocean");
        System.out.println("Name changed to:" + b.name());




        //BodyOfWater b1 = new BodyOfWater("Lake Tahoe", 25);
        //b1.printState();


    }

}
