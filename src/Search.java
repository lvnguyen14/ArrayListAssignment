public class Search {

        public static int findString(String[] array, String find) {
            // Køre gennem et loop for at finde String
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(find)) {
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            String[] array = {"Rasmus", "Nugyen", "blyat"};
            String find = "Nugyen";

            int result = findString(array, find);

            if (result != -1) {
                System.out.println("String er fundet: " + result);
            } else {
                System.out.println("String er ikke fundet.");
            }
        }
    }
