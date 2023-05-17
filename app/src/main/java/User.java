public class User {
    private String userInfo = "TODO";
    private String username;
    static int noOfUsers = 0;
    private int userID;
    private boolean[] allergiesAndPreferences = new boolean[4];//0:vegan,1:lactose intolerant,2:nut allergy,3:celiac(gluten intolerance)
    private Food[] foodListForUser;
    public User(String username){
        this.userID=noOfUsers+1;
        noOfUsers++;
        this.username=username;
        this.allergiesAndPreferences[0]=false;
        this.allergiesAndPreferences[1]=false;
        this.allergiesAndPreferences[2]=false;
        this.allergiesAndPreferences[3]=false;
        this.foodListForUser=Food.getAllFoods().clone();
        this.updateFoodPreferences();



    }
    public boolean[] getPreferences(){
        return this.allergiesAndPreferences;
    }
    public void updateFoodPreferences(){
        for(Food f:foodListForUser){
            if(!(f==null)){
                if(f.getPreferenceInstances()[0] && this.getPreferences()[0]){
                    f.isEdibleByUser=false;
                    f.reasonForInedibility=f.reasonForInedibility+"Non-Vegan";

                }
                if(f.getPreferenceInstances()[1] && this.getPreferences()[1]){
                    f.isEdibleByUser=false;
                    f.reasonForInedibility=f.reasonForInedibility+"Includes Dairy";

                }
                if(f.getPreferenceInstances()[2] && this.getPreferences()[2]){
                    f.isEdibleByUser=false;
                    f.reasonForInedibility=f.reasonForInedibility+"Includes Nuts";
                }
                if(f.getPreferenceInstances()[3] && this.getPreferences()[3]){
                    f.isEdibleByUser=false;
                    f.reasonForInedibility=f.reasonForInedibility+"Includes Gluten";

                }
            }



        }

    }
    public static void main(String[] args) {
        User yigitkosum = new User("yiit");
        for(Food f : yigitkosum.foodListForUser){
            if(!(f==null)) {
                System.out.println(f.getEdibility());
            }
        }


    }

















}

















