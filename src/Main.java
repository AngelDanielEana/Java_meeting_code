import ro.ase.acs.models.Meeting;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Meeting m1 = new Meeting("Business", 2, 4);
        System.out.println(m1.getName());
        m1.setName("Problem Solving");
        System.out.println(m1.getName());
        String[] participants = {"Wayne", "Andrew", "Allan", "Cindy", "Katy"};
        m1.setParticipants(participants);
        System.out.println(Arrays.toString(m1.getParticipants()));
        System.out.println("Answer: " + m1.checkParticipant("Jack"));
        Meeting m2 = new Meeting("Team Engaging", 4, 6);
        Meeting m3;
      try {
          m3 = (Meeting) m2.clone();
      } catch (CloneNotSupportedException e) {
          throw new RuntimeException(e);
       }
        System.out.println(m3.getName());
    }

}





