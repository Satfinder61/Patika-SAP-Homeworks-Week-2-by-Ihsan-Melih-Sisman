public class ChineseZodiac {

    int birthYear;

    public ChineseZodiac(int birthYear) {
        this.birthYear = birthYear;
    }

        /*
        Chinese astrology is a type of astrology that has been used for 4000 thousand years and describes people with 12
        different signs and symbols. The Chinese Zodiac is an animal ring in which these 12 signs are evenly spaced (10 degrees wide)
        and have little to do with the stars.

        Note: When calculating the Chinese zodiac, it is based on the remainder of the 12th division of the person's birth year.
        */

    public void chineseZodiacCalculator() {
        if (birthYear % 12 == 0) {
            System.out.print("Maymun");
        } else if (birthYear % 12 == 1) {
            System.out.print("Horoz");
        } else if (birthYear % 12 == 2) {
            System.out.print("Köpek");
        } else if (birthYear % 12 == 3) {
            System.out.print("Domuz");
        } else if (birthYear % 12 == 4) {
            System.out.print("Fare");
        } else if (birthYear % 12 == 5) {
            System.out.print("Öküz");
        } else if (birthYear % 12 == 6) {
            System.out.print("Kaplan");
        } else if (birthYear % 12 == 7) {
            System.out.print("Tavşan");
        } else if (birthYear % 12 == 8) {
            System.out.print("Ejderha");
        } else if (birthYear % 12 == 9) {
            System.out.print("Yılan");
        } else if (birthYear % 12 == 10) {
            System.out.print("At");
        } else if (birthYear % 12 == 11) {
            System.out.print("Koyun");
        }

    }

}

