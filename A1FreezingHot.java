class FreezingHot extends ConsoleProgram{

    //determins if a number is below 0 and another is above 100

    public void run(){
        
        // variables
        double temp1;
        double temp2;

        // user inputs
        temp1 = readDouble("'''\n"); // the prompt here is to save on lines
        temp2 = readDouble("");

        // boolean for the output
        boolean icyHot = (temp1 > 100 && temp2 < 0) || (temp1 < 0 || temp2 > 100);

        // output
        System.out.println(icyHot + "\n'''");
    }
}