package weekThree;

//! THIS IS THE CLASS (NOTICE HOW WE SET UP THE BLUEPRINT ROBOT, GIVING IT A NAME AND SPEED)
public class Robot {
    String name;
    double speed;

    //! THIS IS THE CONSTRUCTOR HERE WE ARE GIVING NAME AND SPEED A VALUE
    public Robot (String robotName, double robotSpeed){
        name = robotName;
        speed = robotSpeed;
    }

    public void introduce(){
        System.out.println("Hi, Im " + name + ". My speed is " + speed + ".");
    }

    //! CREATING OUR OWN OBJECT USING THE BLUEPRINT
    public static void main(String[] args) {
        Robot myRobot = new Robot("Atlantis", 3.0);
        myRobot.introduce();
    }
}