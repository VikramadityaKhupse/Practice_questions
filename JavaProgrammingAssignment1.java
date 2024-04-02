//Java code to return count of valid registration numbers according to SGGS format

class SY2022bit052 {
    public static void main(String[] args) {
        
        SY2022bit052 instance = new SY2022bit052();
        // long validRegistrationsCount = instance.getValidRegistrationsCountAp3(args);
        // System.out.println(validRegistrationsCount);

        int i =0;
        while (i < 1) {
            long starting_time1 = System.nanoTime();
            System.out.println("\nStarting time of approach1: " + starting_time1);
            System.out.println("Number of valid registration counts: " + instance.getValidRegistrationsCountAp1(args));
            System.out.println("Total time taken: " + (System.nanoTime() - starting_time1));

            long starting_time2 = System.nanoTime();
            System.out.println("\nStarting time of approach2: " + starting_time2);
            System.out.println("Number of valid registration counts: " + instance.getValidRegistrationsCountAp2(args));
            System.out.println("Total time taken: " + (System.nanoTime() - starting_time2));

            long starting_time3 = System.nanoTime();
            System.out.println("\nStarting time of approach3: " + starting_time2);
            System.out.println("Number of valid registration counts: " + instance.getValidRegistrationsCountAp3(args));
            System.out.println("Total time taken: " + (System.nanoTime() - starting_time3));
            i++;
        }

    }


//Approach1
    public long getValidRegistrationsCountAp1(String[] registrations) {
        long count = 0;
        long less_than_50_count = 0;

        for (String registration : registrations) {
            registration = registration.strip().toLowerCase();
            if (registration.length() != 10) {
                continue;
            }

            boolean are_initial_4_digit = yearCheck(registration.substring(0, 4));
            boolean are_middle_3_word = branchCheck(registration.substring(4, 7));
            boolean are_last_3_digit = digitCheck(registration.substring(7));


            if (are_initial_4_digit && are_last_3_digit && are_middle_3_word) {
                count++;
                 
                if(Integer.parseInt(registration.substring
                (7)) > 0 && Integer.parseInt(registration.substring(7))<51){
                	less_than_50_count++;
                }
                
                
            }
        }
        

        return less_than_50_count;
    }

//Approach2
    public long getValidRegistrationsCountAp2(String[] registrations) {
        long count = 0;
        long less_than_50_count = 0;

        for (String registration : registrations) {
            registration = registration.strip().toLowerCase();
            if (registration.length() != 10) {
                continue;
            }

            boolean are_initial_4_digit = yearCheck(registration.substring(0, 4));
            boolean are_middle_3_word = branchCheck(registration.substring(4, 7));
            boolean are_last_3_digit = digitCheck(registration.substring(7));


            if (are_initial_4_digit && are_last_3_digit && are_middle_3_word) {
                count++;
                 
                if(getLessThan50(registration.substring(7))){
                	less_than_50_count++;
                }
                
                
            }
        }
        

        return less_than_50_count;
    }

//Approach3
    public long getValidRegistrationsCountAp3(String[] registrations) {
        long count = 0;
        long less_than_50_count = 0;

        for (String registration : registrations) {
            registration = registration.strip().toLowerCase();
            if (registration.length() != 10) {
                continue;
            }

            boolean are_initial_4_digit = yearCheck(registration.substring(0, 4));
            boolean are_middle_3_word = branchCheck(registration.substring(4, 7));
            boolean are_last_3_digit = digitCheck(registration.substring(7));


            if (are_initial_4_digit && are_last_3_digit && are_middle_3_word) {
                count++;
                 
                if(registration.substring(7).hashCode() > 47664 && registration.substring(7).hashCode() < 47820){
                	less_than_50_count++;
                }
                
                
            }
        }
        

        return less_than_50_count;
    }

    private boolean branchCheck(String string) {
        String[] validDepartments = {"bit", "bcs", "bch", "bme"};
        for (String department : validDepartments) {
            if (string.equals(department)) {
                return true;
            }
        }
        return false;
    }

    private boolean yearCheck(String year) {
        for(int i = 0; i < year.length(); i++){
            if(!Character.isDigit(year.charAt(i))){

                return false;
            }
        }
        int int_year = Integer.parseInt(year);
        return int_year >= 2000 && int_year <= 2024;
    }

    private boolean digitCheck(String input_string){

        for(int i = 0; i < input_string.length(); i++){
            if(!Character.isDigit(input_string.charAt(i))){

                return false;
            }
        }return true;
    }
    
    private boolean getLessThan50(String input_string){
    	long integer_number = (Character.getNumericValue(input_string.charAt(0))*100)+(Character.getNumericValue(input_string.charAt(1))*10)+(Character.getNumericValue(input_string.charAt(2)));
    		if(integer_number > 0 && integer_number < 51){
    			return true;
    		}
    		return false;
 
    
    }
    
 
    
    
}



		
	
	
	
		
	







