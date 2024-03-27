import java.util.Scanner; // Import the Scanner class
class array {
            public static void main(String args[]) {
                int arr[][]=new int[3][4]; // Declare and initialize a 2D array of size 3*4
                Scanner sc = new Scanner(System.in); // Declare and initialize the Scanner object

                // Input from user
                for(int i=0;i<3;i++) {
                    for(int j=0;j<4;j++) {
                        arr[i][j]=sc.nextInt();
                    }
                }

                // Close the Scanner object
                sc.close();

                // Output to the console
                System.out.println("The entered matrix is:");
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<4;j++)
                    {
                        System.out.print(arr[i][j]+" ");
                    }
                    System.out.println();
                }
                
                //transpose of given matrix
                System.out.println("\nTransposed Matrix:");
                int transpose[][] = new int[4][3];//create a transpose matrix of size 4*3
                for (int i = 0; i < 3; i++ ) {
                    for (int j = 0; j < 4; j++ ) {
                        transpose[j][i] = arr[i][j];
                    }
                }
                for (int i = 0; i < 4; i++ ) {
                    for (int j = 0; j < 3; j++ ) {
                        System.out.print(transpose[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
