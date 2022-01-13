package day31_Constructors.Restaurant;

public class LocalRestaurant {
    /*
    6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set. Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set. Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information

     */
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Anne", "Belmont", 4);
        // create servers with info set
        Server server1 = new Server();
        server1.setInfo("Courtney", 12, 16.50, true);

        Server server2 = new Server();
        server2.setInfo("Alex", 14, 16.50, false);

        Server server3 = new Server();
        server3.setInfo("Brenda", 16, 16.75, false);

        Server server4 = new Server();
        server4.setInfo("Juan", 18, 15.50, true);

        Server[] servers = {server2, server3, server4};

        Chef chef1 = new Chef();
        chef1.setInfo("Daniel", 20, 20.50, false);

        Chef chef2 = new Chef();
        chef2.setInfo("Sam", 22, 30.15, true);

        Chef chef3 = new Chef();
        chef3.setInfo("Susan", 24, 30.15, true);

        Chef[] chefs = {chef1,chef2};

        restaurant1.hireServer(server1);
        restaurant1.hireServer(servers);
        restaurant1.hireChef(chefs);
        restaurant1.hireChef(chef3);

        System.out.println(restaurant1);

        System.out.println("----------------------------");


        System.out.println(server1);
        System.out.println(server2);
        System.out.println(server3);
        System.out.println(server4);
        System.out.println("------------------------------");
        System.out.println(chef1);
        System.out.println(chef2);
        System.out.println(chef3);
        System.out.println("----------------------------");
        server1.takeOrder();
        server3.cleanTable();
        chef3.makeOrder();
        chef1.washDishes();
        System.out.println("----------------------");

        for(Server eachServer : restaurant1.serversList){
            System.out.println(eachServer.name+ " : "+ eachServer.hourlyRate + " "+ eachServer.fullOrPart());
        }

        for (Chef eachChef : restaurant1.chefsList){
            System.out.println(eachChef.name + " : "+eachChef.hourlyRate+" "+eachChef.fullOrPart());
        }

        System.out.println("----------------------");
        restaurant1.terminateChef(22);
        restaurant1.terminateServer(18);

        System.out.println(restaurant1);




    }
}
