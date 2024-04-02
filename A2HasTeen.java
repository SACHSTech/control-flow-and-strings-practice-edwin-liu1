class HasTeen extends ConsoleProgram{

    // given 3 numbers determins if 1 or more the the numbers are "teen"
     
    public void run(){

        // variables
        int num1;
        int num2;
        int num3;

        boolean teen;

        // input
        num1 = readInt("'''\n");
        num2 = readInt("");
        num3 = readInt("");

        // are the numbers "teen"?
        if (num1 < 20 && num1 > 12){
            teen = true;
        } else if (num2 < 20 && num2 > 12){
            teen = true;
        } else if (num3 < 20 && num3 > 12){
            teen = true;
        } else {
            teen = false;
        }

        // output
        System.out.println(teen + "\n'''");

    }
}