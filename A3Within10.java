class Within10 extends ConsoleProgram{

    // given 2 values. outputs whichever one is closest to 10 and 0 in a tie

    public void run(){

        // varaibles
        int num1;
        int num2;

        int difference1;
        int difference2;

        int closest = 0;

        // user input
        num1 = readInt("'''\n");
        num2 = readInt("");

        // difference calculations
        difference1 = Math.abs(num1 - 10);
        difference2 = Math.abs(num2 - 10);

        // which is greater?
        if (difference1 < difference2){
            closest = num1;
        } else if (difference2 < difference1){
            closest = num2;
        }

        // output
        System.out.println(closest + "\n'''");
    }
}
