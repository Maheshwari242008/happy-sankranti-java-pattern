// Program to print "HAPPY SANKRANTI" using pattern printing in Java
// Implemented using functions for better readability
// Developed and executed in Visual Studio Code

public class happySankranti
{
    // Method to print letter 'A'
    public static void printA()
    {
        // Loop for rows
        for(int i=1;i<=7;i++)
        {
            // Loop for columns
            for(int j=1;j<=6;j++)
            {
                // Conditions to form letter 'A'
                if(j==1 || j==6 || i==1 || i==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            // Move to next line after each row
            System.out.println();
        }
        // Space after printing letter
        System.out.println();
    }

    // Method to print letter 'P'
    public static void printP()
    {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=6;j++)
            {
                // Left vertical line, top bar and right curve
                if(j==1 || i==1 || (i==2 && j==6) || (i==3 && j==6) || i==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Method to print letter 'N'
    public static void printN()
    {
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=6;j++)
            {
                // Left column, right column and diagonal
                if(i==j || j==1 || j==6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Space after letter
        System.out.println();
    }

    // Main method
    public static void main(String[]args)
    {
        // -------- Letter H --------
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=6;j++)
            {
                
                if(j==1 || j==6 || i==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // -------- Letter A --------
        printA();

        // -------- Letter P --------
        printP();
        System.out.println();

        // -------- Letter P (Repeated) --------
        printP();
        System.out.println();

        // -------- Letter Y --------
        // Upper V shape of Y
        for(int i=5;i>=1;i--)
        {
            for(int sp=1;sp<=5-i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                if(j==1|| j==2*i-1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Lower vertical line of Y
        for(int i=1;i<=4;i++)
        {
            for(int sp=1;sp<=5-i;sp++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                if(j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // -------- Letter S --------
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=6;j++)
            {
                // Top, middle, bottom and side curves of S
                if(i==1 || i==4 || i==7 || (i<=4 && j==1) || (i>=4 && j==6))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } 
        System.out.println();

        // -------- Letter A --------
        printA();

        // -------- Letter N --------
        printN();

        // -------- Letter K --------
        // Upper diagonal of K
        for(int i=6;i>=2;i--)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1 || i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower diagonal of K
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1 || i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // -------- Letter R --------
        // Upper part similar to P
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=6;j++)
            {
                if(j==1 || i==1 || j==6 || i==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Diagonal leg of R
        for(int i=2;i<=6;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j==1 || j==i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // -------- Letter A --------
        printA();

        // -------- Letter N --------
        printN();

        // -------- Letter T --------
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=7;j++)
            {
                // Top bar and center vertical line
                if(i==1 || j==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        // -------- Letter I --------
        for(int i=1;i<=6;i++)
        {
            for(int j=1;j<=7;j++)
            {
                // Top bar, bottom bar and center line
                if(i==1 || i==6 || j==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
