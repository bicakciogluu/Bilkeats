

public class Food {
    protected String name;
    protected int uniqueID;
    protected static int signedNoOfFoods= 0;
    protected int ID;
    protected double rating;
    protected boolean[] preferenceInstances = new boolean[4];
    protected boolean isEdibleByUser;
    protected String reasonForInedibility;

    public Food(String name){
        this.name=name;
        signedNoOfFoods++;
        this.ID=signedNoOfFoods;
        this.rating=5.0;
        this.isEdibleByUser=true;
        this.reasonForInedibility="";
        this.preferenceInstances[0]=false;
        this.preferenceInstances[1]=false;
        this.preferenceInstances[2]=false;
        this.preferenceInstances[3]=false;


    }
    public boolean[] getPreferenceInstances(){
        return this.preferenceInstances;
    }
    public static Food[] getAllFoods(){
        Food[] allFoods = new Food[100];
        allFoods[0]= new Food("AA");
        allFoods[1]= new Food("BB");
        allFoods[2]= new Food("CC");
        allFoods[1].preferenceInstances[0]=true;

        return allFoods;
    }
    public boolean getEdibility(){
        System.out.println(this.reasonForInedibility);
        return this.isEdibleByUser;
    }

}