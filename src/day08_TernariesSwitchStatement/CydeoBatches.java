package day08_TernariesSwitchStatement;

public class CydeoBatches {
    public static void main(String[] args) {

        String batchType = "S morning";


        System.out.println("--------------------------------------IF STATEMENT---------------------------------------");
        String result="";

        if (batchType == "US morning"){
            result = batchType+ " ========> Class times are 10-5 EST. M, T, Th, F.";
        } else if (batchType == "US evening") {
            result = batchType+" ========> Class times are 7-10 EST. M, T, W, Th, S, S";
        } else if (batchType == "EU") {
            result = batchType + " ========> Class times are  10-5 EST. M, T, W, Th, F.";
        }else {
            result = batchType+" - Invalid Batch";
        }
        System.out.println(result);

        System.out.println("------------------------------------SWITCH STATEMENT-------------------------------------");

        String result2;

        switch (batchType){
            case "US morning":
                result2 = batchType + " ========> Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                result2 = batchType +" ========> Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU":
                result2 = batchType+" ========> Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result2 = batchType+" - Invalid Batch";
        }
        System.out.println(result2);

        System.out.println("------------------------------IF & SWITCH STATEMENT MIXED--------------------------------");

        String result3 ="";

        if (batchType=="US morning"||batchType=="US evening"||batchType=="UE"){

            switch (batchType) {
                case "US morning":
                    result3 = batchType + " ========> Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    result3 = batchType + " ========> Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;

                default:
                    result3 = batchType + " ========> Class times are  10-5 EST. M, T, W, Th, F.";
            }
        }else{result3 = batchType+" - Invalid Bach";

            }
        System.out.println(result3);


    }
}
/*
10. Create a class named CydeoBatches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */