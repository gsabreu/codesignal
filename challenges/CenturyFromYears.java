package challenges;

public class CenturyFromYears {

    int centuryFromYear(int year) {
        int century = 0;
        if(year % 100 == 0) {
            century = year/100;
        } else {
            century = (year / 100 ) + 1;
        }
       return century;
    }
    
    
}
