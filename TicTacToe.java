import java.util.*;

class TicTacToe {
    public static void main(String[] args) {

        System.out.println("+================================+");
        System.out.println("|          TIC TAC TOE           |");
        System.out.println("+================================+");
        Scanner sc=new Scanner(System.in);

        // Get board size from user (minimum 2)
        int n=0;
        do{
            System.out.println("Enter the Board Size (2-n)");
            n=sc.nextInt();
        }while(n<=1);

        // Initialize empty board
        char [][] board=new char[n][n];
        for(char i[]:board)
        {
            Arrays.fill(i,' ');
        }

        // Print initial empty board
        printBoard(board,n);

        boolean finish=false; // Flag to check if game has ended
        boolean player_num=true; // True = Player1 (X), False = Player2 (O)
        System.out.println();

        // Get player names, ensure they are unique
        String p1="",p2="";
        do{
            System.out.println("Enter PlayerA Name: ");
            p1=sc.next();
            System.out.println("Enter PlayerB Name: ");
            p2=sc.next();
            if (p1.equals(p2)) {
                System.out.println("Both names cannot be the same. Try again.");
            }
        }while(p1.equals(p2));
        System.out.println();

        // Start the game show the player names as heading
        start(p1,p2);
        String player=new String(p1);

        // Main game loop
        while(!finish)
        {
            // Check for draw
            if(isFull(board))
            {
                System.out.println("+========================+");
                System.out.println("|          DRAW          |");
                System.out.println("+========================+");
                break;
            }
            // Player move input
            System.out.print(player+": ");
            System.out.println("Enter the coordinates of the row and column");
            int x=sc.nextInt();
            int y=sc.nextInt();
            // Process the player's turn
            boolean val=playerTurn(x, y, player_num, board,n);
            // If the move is valid, update board and check for win
            if(val)
            {
                printBoard(board,n);
                finish=check(board,n);

                // Announce winner if game ended
                if(finish)
                {
                    System.out.println("Game Has Ended.");
                    System.out.println("+====================================+");
                    System.out.println("|          CONGRATULATIONS!!         |");
                    System.out.println("+====================================+");
                    System.out.println(player+" Has Won!!!");
                    System.out.println(" /\\_/\\  ");
                    System.out.println("( o.o ) ");
                    System.out.println(" > ^ <  ");
                }

                // Switch player
                player_num=!player_num;
                player=(player.equals(p1))?p2:p1;
            }
        }
        sc.close();
    }

    // Function to print the board in a formatted way
    public static void printBoard(char [][] board,int n){
        for(int i=0;i<board.length;i++)
        {
            System.out.print("+");
            for(int k=0;k<n;k++)
            System.out.print("---+");
            System.out.println();
            for(int j=0;j<board[i].length;j++)
            {
                System.out.print("| ");
                System.out.print(board[i][j]+" ");
                
            }
            System.out.print("|  ");
            System.out.println();
            
        }
        System.out.print("+");
            for(int k=0;k<n;k++)
            System.out.print("---+");
            System.out.println();
    }

    // Function to handle a player's move
    public static boolean playerTurn(int x,int y,boolean player_num,char[][] board,int n)
    {
        // Check if coordinates are within bounds
        if(x>=n||y>=n||x<0||y<0)
        {
            System.out.println("Invalid Input. Please Try Again");
            return false;
        }
        // Check if the chosen cell is empty
        if(board[x][y]!=' ')
        {
            System.out.println("Space is not empty, Try Again");
            return false;
        }
        // Place player's symbol (X or O) on the board
        if(player_num)
        {
            board[x][y]='X';
        }
        else{
            board[x][y]='O';
        }
        return true;
    }

    // Function to check if a player has won
    public static boolean check(char[][] board,int n)
    {
        // Check rows
        for(int i=0;i<n;i++)
        {
            char ch=board[i][0];
            if(ch!=' ')
            {
                boolean same=true;
                for(int j=1;j<n;j++)
                {
                    if(board[i][j]!=ch)
                    {
                        same=false;
                        break;
                    }
                }
                if(same)
                {
                    return true;
                }
            }
        }
        // Check columns
        for(int j=0;j<n;j++)
        {
            char ch=board[0][j];
            if(ch!=' ')
            {
                boolean same=true;
                for(int i=1;i<n;i++)
                {
                    if(board[i][j]!=ch)
                    {
                        same=false;
                        break;
                    }
                }
                if(same)
                {
                    return true;
                }
            }
        }
        // Check main diagonal
        char ch=board[0][0];
        if(ch!=' ')
        {
            boolean same=true;
            for(int i=1;i<n;i++)
            {
                if(board[i][i]!=ch)
                {
                    same= false;
                    break;
                }
            }
            if(same)
                {
                    return true;
                }
        }
        // Check anti-diagonal
        ch=board[0][n-1];
        if(ch!=' ')
        {
            boolean same=true;
            for(int i=1;i<n;i++)
            {
                if(board[i][n-i-1]!=ch)
                {
                    same= false;
                    break;
                }
            }
            if(same)
                {
                    return true;
                }
        }
        return false;
    }
    
    // Function to check if the board is full (draw)
    public static boolean isFull(char [][] board)
    {
        int n=board.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]==' ')
                {
                    return false;
                }
            }
        }
        return true;
    }

    // Function to print the start game message
    public static void start(String p1,String p2)
    {
        System.out.println("+================================+");
        System.out.println("|     LET'S PLAY TIC TAC TOE     |");
        System.out.println("+================================+");
        System.out.println("      "+p1+" (X) vs "+p2+" (O)  ");
        System.out.println("----------------------------------");
        System.out.println();
    }
}