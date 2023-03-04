package day07_ifStatemenContinue;

public class xz {


        public static void main(String[] args) {

            String size = "small";
            int calories = 0;
            double price = 0;

            if (size == "tall" || size == "grande" || size == " venti"){

                if (size == "tall") {
                    calories = 90;
                    price = 3.69;
                }
                if (size == "grande") {
                    calories = 120;
                    price = 3.99;
                }
                if (size == "venti") {
                    calories = 150;
                    price = 4.29;
                }

            }else{
                System.out.println("invalid size");
            }


        }
    }

