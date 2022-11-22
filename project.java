import java.util.Scanner;

public class Proekt {
    public static  void main(String[] args){
        Scanner xxx = new Scanner(System.in);
        greeting();//100

        travelTimeBudget();//100

        timeDifference();//100

         countryArea();//100

        nextDestination();//100

        }public static void greeting(){
        Scanner xxx = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name: ");
         String a1 = xxx.nextLine();
        System.out.print("");
        System.out.print("Nice to meet you "+a1+", where are you traveling to? ");
         String aa2 =xxx.nextLine();
        System.out.print("");
        System.out.println("Great! " +aa2+" sounds like a great trip");
    }

    public static void travelTimeBudget(){
        Scanner xxx = new Scanner(System.in);
        System.out.print("How many days are you going to spend traveling? ");
        int b1 = xxx.nextInt();
        System.out.print("");
        System.out.print("How much money, in USD, are you planning to spend on your trip: ");
        double bb2 = xxx.nextInt();
        System.out.print("");
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String bbb3 = xxx.next().toUpperCase();
        System.out.print("");
        System.out.print("How many "+ bbb3+ " are there in 1 USD? ");
        Double bbbb4 = xxx.nextDouble();
        System.out.println("");
        int bx1 = b1 *24,bx2 = bx1 * 60,bx3 = bx2 *60;
        double  by2 = (bb2 / b1) ; by2 =Math.floor(by2*100)/100.0;
        double by3 = bb2 * bbbb4,by4= by3/b1; by4 =Math.floor(by4*100)/100.0;
        if(b1==1) {
            System.out.println("If you are traveling for " + b1 + " day that is same as " + bx1 + " hours or " + bx2 + " minutes or " + bx3 + " seconds.");
            System.out.println("if you are going to spend $"+ (int)bb2 +" USD that means per day you can spend up to $"+ (int)by2 +" USD");
            System.out.println("Your total budget in " + bbb3+ " is "+by3+ " "+bbb3+", which per day is "+ by4 +" "+bbb3);
        }else{
            System.out.println("If you are traveling for " + b1 + " days that is same as " + bx1 + " hours or " + bx2 + " minutes or " + bx3 + " seconds.");
        System.out.println("if you are going to spend $"+ (int)bb2 +" USD that means per day you can spend up to $"+ by2 +" USD");
        System.out.println("Your total budget in " + bbb3+ " is "+by3+ " "+bbb3+", which per day is "+ by4 +" "+bbb3);}

    }

    public static void timeDifference(){
        Scanner xxxx = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int d1 = xxxx.nextInt();

        if(d1%24==0){System.out.println("That means that when it is midnight at home it will be 00:00 in your travel " +
                "destination and when it's noon at home it will be 12:00");
        }
    if(d1%24==-12 || d1%24==12) {
        System.out.println("That means that when it is midnight at home it will be 12:00 in your travel destination and when it`s noon  at home  it will  be  00:00");
    }if((d1>0 && d1%24!=12)&& d1%24!=0){d1 = d1 % 12;
            System.out.println("That means that when it is midnight at home it will be " + d1 + ":00 in your travel destination and when it`s noon  at home  it will  be " + (12 + d1) + ":00");
        }if((d1<0 && d1%24!=-12)&& d1%24!=0){d1 = d1%24;
        if(d1%24>-24 && d1%24<-12){
            System.out.println("That means that when it is midnight at home it will be " + (24+d1) + ":00 in your travel destination and when it`s noon  at home  it will  be " + ((24 +(d1%12)) + ":00"));
        }else
            System.out.println("That means that when it is midnight at home it will be " + (24+d1) + ":00 in your travel destination and when it`s noon  at home  it will  be " + ((12 +(d1%12)) + ":00"));
        }
    }

        public static void countryArea(){
        Scanner xxx = new Scanner(System.in);
        System.out.print("What is square area of your destination country in km2? ");
        int d1 =xxx.nextInt();
        System.out.print("");
        double d2 = d1 * 0.38610215854245; d2 =Math.floor(d2*100)/100.0;
        System.out.print("In miles2 that is "+d2);
        System.out.println("");
    } public static void nextDestination() {
        Scanner xxx = new Scanner(System.in);
        System.out.print("How many places you traveled to : ");
        int m = xxx.nextInt();
        String[] c = new String[m];
        for(int i = 0;i<c.length;i++){
            System.out.print("Enter the name: ");c[i]=xxx.next();
        }System.out.println("");
        System.out.println("Next place you want to travel to : ");
        System.out.println("");
        String[] sl = { "Italy ","England" ,"Netherlands" ,"Germany" ,"France"};
        for(int u =0;u< sl.length;u++) {
            System.out.println(u+": "+sl[u]);
        }
        System.out.println("");
        System.out.print("Your input should be -> "); int x = xxx.nextInt();
        System.out.println("");
        System.out.println("Thank you, Your next location is : "+sl[x-1]);
    }
}
