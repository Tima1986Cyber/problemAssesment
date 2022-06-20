package codingAssesment;

public class FindBox {

    public static void main(String[] args) {

        System.out.println("Scenario 1: ");
        countBox(350,400);

        System.out.println("Scenario 2: ");
        countBox(50,50);

        System.out.println("Scenario 3: ");
        countBox(100,0);
    }
    /*
    1. find sum of oranges and apples;
    2. find how many box will need fit to 200 capacity by sum devide to 200
    3. if reminder of sum%200 equal to 0, then all fruites fit to combination boxes
    4. if reminder not equal to 0, then whole number is combination box count, reminder is small boxes
    5. totaly 3 combination boxes, with 300 oranges and 300 apples;
    6. to find orangesBoxReminder: orangeCount  % 300. to find applesBoxReminder: applesCount%300;
    7. small box capacity is 50.
    8. if reminder of orangesBoxReminder%50 equal to 0. then orangesBox is orangesBoxReminder/50
    9. if reminder of orangesBoxReminder%50 is not equal to 0, then add +1;
    10. same logic for applesBox

     */

    static public void countBox(int orangesCount, int applesCount) {

        int combinationBox;

        int sum = orangesCount + applesCount;
        int orangesReminder;
        int orangesBox;
        int applesReminder;
        int applesBox;

        if (sum % 200 != 0) {

            combinationBox = sum / 200;
            if(combinationBox == 0){
                combinationBox = 0;
                if(orangesCount%50 !=0){
                    orangesBox = orangesCount/50+1;
                }
                else{
                    orangesBox = orangesCount/50;
                }
                if(applesCount%50 !=0){
                    applesBox = applesCount/50 +1;
                }else{
                    applesBox = applesCount/50;
                }

            }
            else {
                orangesReminder = orangesCount % (combinationBox * 100);
                applesReminder = applesCount % (combinationBox * 100);


                if (orangesReminder % 50 != 0) {
                    orangesBox = orangesReminder / 50 + 1;

                } else {
                    orangesBox = orangesReminder / 50;
                }

                if (applesReminder % 50 != 0) {
                    applesBox = applesReminder / 50 + 1;
                } else {
                    applesBox = applesReminder / 50;
                }
            }

        } else {
            combinationBox = sum / 200;
            applesBox=0;
            orangesBox = 0;
        }

        System.out.println("Combination box is "+combinationBox+"\n orangesBox is "+orangesBox+"\n applesBox is "+applesBox);

    }}





