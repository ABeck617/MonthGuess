public class MonthGuess {
    public static void main(String args[]){
        // 12 Months in a year

        // a value corresponding to each month

        // create a variable to store month value

        //create a switch statement which will print out month name corresponding to the month value

        int month = 9;
        String printedMonth = "";

        switch(month){
            case 1:
                printedMonth = "January";
                break;
            case 2:
                printedMonth = "February";
                break;
            case 3:
                printedMonth = "Marc";
                break;
            case 4:
                printedMonth = "April";
                break;
            case 5:
                printedMonth = "May";
                break;
            case 6:
                printedMonth = "June";
                break;
            case 7:
                printedMonth = "July";
                break;
            case 8:
                printedMonth = "August";
                break;
            case 9:
                printedMonth = "September";
                break;
            case 10:
                printedMonth = "October";
                break;
            case 11:
                printedMonth = "November";
                break;
            case 12:
                printedMonth = "December";
                break;
        }
        System.out.println(printedMonth);

    }
}
