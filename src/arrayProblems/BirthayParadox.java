package arrayProblems;

    // Birthday Paradox.
// Write a method that computes the number of people (by simulation)
// that must enter a room until two of them share a birthday.
// Assume that there are 365 possible birthdays, and that birthdays are
// uniformly distributed throughout the year.

import java.util.Random;

public class BirthayParadox {

    public int birthdayParadox() {
        Random rand = new Random();
        boolean[] bool = new boolean[356];
        int count = 0;
        while (true) {
            int random = rand.nextInt(356);
            count++;
            if (bool[random]) {
                System.out.println(random);
                break;
            }
            bool[random] = true;
        }
        return count;
    }

    public void birthdayParadox2() {
        int days = 365;     // number of days
        int people = 0;                           // total number of people

        //  hasBirthday[d] = true if someone born on day d; false otherwise
        //  auto-initialized to false
        boolean[] hasBirthday = new boolean[days];

        while (true) {
            people++;
            int d = (int) (days * Math.random());    // integer between 0 and days-1
            if (hasBirthday[d]) break;               // two people with the same birthday, so break out of loop
            hasBirthday[d] = true;                   // update array
        }

        System.out.println(people);
    }
}




