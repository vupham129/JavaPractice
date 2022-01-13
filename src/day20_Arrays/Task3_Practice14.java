package day20_Arrays;

public class Task3_Practice14 {
    public static void main(String[] args) {
        /*
        3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
         */
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int indexNumberOfGloves = 0;
        String iPadInsideList = "";
        String[] report = new String[6];

        for (int i = 0; i < items.length; i++) { // i: index number of each element of string items
            //1. find out the first index number of "Gloves"
            for (int j = 0; j < items.length; j++) { // j: to find the first index number of Gloves
                if("Gloves".equals(items[j])){
                    indexNumberOfGloves = j;
                }

            }
            //2. find out if "iPad" is contained in the item list

            for (int k = 0; k < items.length; k++) {// k: to find out if iPad is inside the items string
                if(items[k].contains("iPad")){
                    iPadInsideList = "yes";
                }else{
                    iPadInsideList = "no";
                }
            }
            //3. Print the report of each shopping item
            //            name - price - #ID
            report[i] = "Name of item: "+items[i]+" - Prices: "+prices[i]+" - #ID "+itemIDs[i]; // shopping list string

        }

        System.out.println("indexNumberOfGloves = " + indexNumberOfGloves);
        System.out.println("iPadInsideList = " + iPadInsideList);
        for (int l = 0; l < report.length; l++) { // l: index number of each element of shopping list string
            System.out.println(report[l]);
        }




    }
}
