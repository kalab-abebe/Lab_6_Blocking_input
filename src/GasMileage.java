void main() {
    Scanner in = new Scanner(System.in);
    double tankcapacity = 0;
    double mpg = 0;
    double priceperGallon = 0;
    double cost100 = 0;
    double totalMiles =0;
    boolean done = false;
    String trash ="";


    do{
        IO.println("Enter the tank capacity in gallons: ");
        if(in.hasNextDouble())
        {
            tankcapacity = in.nextDouble();
            in.nextLine(); // clear the newline from the buffer
            done = true;
        }
        else{
            trash = in.nextLine();
            IO.println("you must enter a vaild capacity not " + trash);
        }

    }while(!done);
    IO.println("the capacity is " + tankcapacity);
    done = false;



    do{
        IO.println("Enter the Miles per gallons: ");
        if(in.hasNextDouble())
        {
            mpg = in.nextDouble();
            in.nextLine(); // clear the newline from the buffer
            done = true;
        }
        else{
            trash = in.nextLine();
            IO.println("you must enter a vaild mpg per Gallon not " + trash);
        }

    }while(!done);
    IO.println("the mpg is " + mpg);


    done = false;



    do{
        IO.println("Enter the price per gallons: ");
        if(in.hasNextDouble())
        {
            priceperGallon = in.nextDouble();
            in.nextLine(); // clear the newline from the buffer
            done = true;
        }
        else{
            trash = in.nextLine();
            IO.println("you must enter a vaild price per Gallon per Gallon not " + trash);
        }

    }while(!done);
    IO.println("the price per Gallon is " + priceperGallon);
    // Given size of tank, cost per gallon, and miles per gallon
    //Cost to go 100 miles
    // 100 / mpg * price per gallon
    cost100 = 100 / mpg * priceperGallon;
    totalMiles = tankcapacity * mpg;

    IO.println(" the cost to go 100 miles is " + cost100);
    IO.println(" the total miles on a full tank is" + totalMiles);




}