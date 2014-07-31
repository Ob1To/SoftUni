package newTW;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Queue;
import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.input.Key;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.TerminalSize;
import java.util.LinkedList;
 
class Position
{
    public int row, col;
    public Position(int col, int row) {
        this.col = col;
        this.row = row;
    }
   
}
 
 
 
public class SnakeFinal {
 
         
	public static void main(String[] args) {
               
		byte right = 0;
		byte left = 1;
		byte down = 2;
		byte up = 3;
		double foodDissapearTime = 10500;
		int negativePoints = 0;
		double sleepTime=100;
		int obstacleColumns;
		int obstacleRows;

        Terminal terminal = TerminalFacade.createTerminal(System.in, System.out, Charset.forName("UTF8"));
        terminal.enterPrivateMode();
        TerminalSize terminalSize = terminal.getTerminalSize();
       
       
       
        Position[] directions = new Position[]
            {
                new Position(1, 0), // right
                new Position(-1, 0), // left
                new Position(0, 1), // down
                new Position(0, -1), // up
            };
       
        int direction = right;
       
        ArrayList<Position> Grid =new ArrayList<Position>();
       
        for (int colGrid=0; colGrid<=terminalSize.getColumns();colGrid++)
        {
        	Grid.add(new Position(colGrid, 0));    
        }
       
        for (int colGrid=0; colGrid<=terminalSize.getColumns();colGrid++)
        {
        	Grid.add(new Position(colGrid, terminalSize.getRows()-1));     
        }
       
        for (int rowGrid=0; rowGrid<=terminalSize.getRows();rowGrid++)
        {
        	Grid.add(new Position(0, rowGrid));    
        }
       
        for (int rowGrid=0; rowGrid<=terminalSize.getRows();rowGrid++)
        {
        	Grid.add(new Position(terminalSize.getColumns()-1, rowGrid));  
        }
       
        for (int colGrid=0; colGrid<=11;colGrid++)
        {
        	Grid.add(new Position(20, colGrid));   
        }
       
        for (int colGrid=19; colGrid<=terminalSize.getColumns();colGrid++)
        {
        	Grid.add(new Position(30, colGrid));   
        }
       
        for (int colGrid=0; colGrid<=11;colGrid++)
        {
        	Grid.add(new Position(45, colGrid));   
        }
       
        for (int colGrid=19; colGrid<=terminalSize.getColumns();colGrid++)
        {
        	Grid.add(new Position(55, colGrid));   
        }
       
        for (int colGrid=0; colGrid<=11;colGrid++)
        {
        	Grid.add(new Position(70, colGrid));   
        }
       
        for (int colGrid=19; colGrid<=terminalSize.getColumns();colGrid++)
        {
        	Grid.add(new Position(80, colGrid));
        }
        terminal.setCursorVisible(false);
        for (Position i: Grid)
        {
            terminal.moveCursor(i.col, i.row);
            terminal.putCharacter('♻');
 
        }
       
        Queue<Position> snakeElements = new LinkedList<Position>();
       
        for (int i = 6; i <= 9; i++)
        {
            snakeElements.add(new Position(i,15));
        }
        terminal.applyForegroundColor(Terminal.Color.RED);
       
        for (Position p: snakeElements)
        {
            terminal.moveCursor(p.col, p.row);
            terminal.putCharacter('o');
        }
       
		Position snakeHead = new Position(9,15);
		       
		Position food;
		int foodColumns;
		int foodRows;
		boolean isInGrid=false;
		boolean isInSnake=false;
		do {
			isInGrid=false;
			isInSnake=false;
			foodColumns = 2 + (int)(Math.random() * ((terminalSize.getColumns() - 2) ));                               
			foodRows = 2 + (int)(Math.random() * ((terminalSize.getRows() - 2) ));                         
			food = new Position(foodColumns,foodRows);
			   
			for(Position i:Grid)
			{
			if (i.row==foodRows&&i.col==foodColumns)
			{
			isInGrid=true;
			}
			}                                  
			for(Position i:snakeElements)
			{
			if (i.row==foodRows&&i.col==foodColumns)
			{
			isInSnake=true;
			}
			}
			terminal.moveCursor(food.col, food.row);
			terminal.applyForegroundColor(Terminal.Color.YELLOW);
			}
			while((isInGrid==true)||(isInSnake==true)||foodColumns<1||foodColumns>terminalSize.getColumns()-1||foodRows<1||foodRows>terminalSize.getRows()-1);
			terminal.putCharacter('@');
			long tStart = System.currentTimeMillis();
		while(true) {
            Key key = terminal.readInput();
            if (key != null)
            {
                System.out.println(key);
                if (key.getKind() == Key.Kind.ArrowLeft) {
                    if (direction != right) direction = left;
                } 
                if (key.getKind() == Key.Kind.ArrowRight) {
                    if (direction != left) direction = right;
                } 
                if (key.getKind() == Key.Kind.ArrowUp) {
                    if (direction != down) direction = up;
                }       
                if (key.getKind() == Key.Kind.ArrowDown) {
                    if (direction != up) direction = down;
                }                       
                if (key.getKind() == Key.Kind.Tab) {
                    System.exit(0);
                }               
            }
               
            Position nextDirection = directions[direction];
            Position snakeNewHead = new Position(
                    snakeHead.col + nextDirection.col,
                    snakeHead.row + nextDirection.row);
            boolean  snakeBite=false;
            boolean isBitingTheGrid=false;
            for(Position i:snakeElements){
            	if (snakeNewHead.row==i.row&&snakeNewHead.col==i.col)
            	{
            		snakeBite=true;
            	}
            }
            for(Position i:Grid){
                if (snakeNewHead.row==i.row&&snakeNewHead.col==i.col)
                {
                    isBitingTheGrid=true;
                }
            }
            if (isBitingTheGrid==true || snakeBite==true)
            {
                    terminal.moveCursor(6,6);
                    terminal.putCharacter('G');
                    terminal.putCharacter('A');
                    terminal.putCharacter('M');
                    terminal.putCharacter('E');
                    terminal.putCharacter(' ');
                    terminal.putCharacter('O');
                    terminal.putCharacter('V');
                    terminal.putCharacter('E');
                    terminal.putCharacter('R');
                   
                    terminal.moveCursor(6,7);
                    terminal.putCharacter('Y');
                    terminal.putCharacter('O');
                    terminal.putCharacter('U');
                    terminal.putCharacter('R');
                    terminal.putCharacter(' ');
                    terminal.putCharacter('P');
                    terminal.putCharacter('O');
                    terminal.putCharacter('I');
                    terminal.putCharacter('N');
                    terminal.putCharacter('T');
                    terminal.putCharacter('S');
                   
                    terminal.putCharacter(' ');
                       
                   
            int userPoints = Math.max(0, ((snakeElements.size() - 4) * 100)+negativePoints);
            String userPointsStr=Integer.toString(userPoints);
            char[] charArray = userPointsStr.toCharArray();
               
            for (int i=0;i<=charArray.length-1;i++)
            {
            	terminal.putCharacter((char)charArray[i]);  
            }       
            
            while(true)
            {
	                Key exit = terminal.readInput();
	                if (exit != null)
	                {
	                    if (exit.getKind() == Key.Kind.Tab)
	                    {
	                        System.exit(0);
	                    }      
	                }
	            }
	        }
	               
	        if (snakeNewHead.col==food.col&&snakeNewHead.row==food.row)
	        {
				terminal.moveCursor(snakeNewHead.col, snakeNewHead.row);
				terminal.applyForegroundColor(Terminal.Color.RED);
				terminal.putCharacter('o');
				snakeElements.add(snakeNewHead);
	            snakeHead =snakeNewHead;
	            do {
	            	isInGrid=false;
	                isInSnake=false;
	                obstacleColumns = 2 + (int)(Math.random() * ((terminalSize.getColumns() - 2) ));                           
	                obstacleRows = 2 + (int)(Math.random() * ((terminalSize.getRows() - 2) ));                     
	                Position obstacle = new Position(obstacleColumns,obstacleRows);
	                   
	                for(Position i:Grid)
	                {
	                    if (i.row==obstacleRows&&i.col==obstacleColumns)
	                    {
	                        isInGrid=true;
	                    }
	                }                                  
	                for(Position i:snakeElements)
	                {
	                    if (i.row==obstacleRows&&i.col==obstacleColumns)
	                    {
	                        isInSnake=true;
	                    }
	                }
	                terminal.moveCursor(obstacle.col, obstacle.row);
	                terminal.applyForegroundColor(Terminal.Color.DEFAULT);  
	           }
	           while((isInGrid==true)||(isInSnake==true)||foodColumns<1||foodColumns>terminalSize.getColumns()-1||foodRows<1||foodRows>terminalSize.getRows()-1);
	           Position obstacle = new Position(obstacleColumns,obstacleRows);
	           Grid.add(obstacle);
	           terminal.putCharacter('♻');
	                       
	           do {
	        	   isInGrid=false;
	        	   isInSnake=false;
	        	   foodColumns = 2 + (int)(Math.random() * ((terminalSize.getColumns() - 2) ));                               
	        	   foodRows = 2 + (int)(Math.random() * ((terminalSize.getRows() - 2) ));                         
	        	   food = new Position(foodColumns,foodRows);
	                   
	        	   for(Position i:Grid)
	        	   {
	        		   if (i.row==foodRows&&i.col==foodColumns)
	        		   {
	        			   isInGrid=true;
	        		   }
	        	   }                                  
	        	   for(Position i:snakeElements)
	        	   {
	        		   if (i.row==foodRows&&i.col==foodColumns)
	        		   {
	        			   isInSnake=true;
	        		   }
	        	   }
	        	   terminal.moveCursor(food.col, food.row);
	        	   terminal.applyForegroundColor(Terminal.Color.YELLOW);      
	           }
	           while((isInGrid==true)||(isInSnake==true)||foodColumns<1||foodColumns>terminalSize.getColumns()-1||foodRows<1||foodRows>terminalSize.getRows()-1);
	           		terminal.putCharacter('@');
	           		tStart = System.currentTimeMillis();
	           		sleepTime=sleepTime-1; 
	        }
	        else
	        {       
				terminal.moveCursor(snakeNewHead.col, snakeNewHead.row);
				terminal.applyForegroundColor(Terminal.Color.RED);
				terminal.putCharacter('o');
				snakeElements.add(snakeNewHead);
				snakeHead =snakeNewHead;
				Position removeLast = snakeElements.poll();
				terminal.moveCursor(removeLast.col, removeLast.row);
				terminal.putCharacter(' ');
	        }
	               
	        long tEnd = System.currentTimeMillis();
	       
	        if (tEnd-tStart>foodDissapearTime)
	        {
	        	terminal.moveCursor(food.col, food.row);
	            terminal.putCharacter(' ');
	            do {     
	            	isInGrid=false;
	            	isInSnake=false;
	                foodColumns = 2 + (int)(Math.random() * ((terminalSize.getColumns() - 2) ));                               
	                foodRows = 2 + (int)(Math.random() * ((terminalSize.getRows() - 2) ));                         
	                food = new Position(foodColumns,foodRows);
	                   
	                for(Position i:Grid)
	                {
	                	if (i.row==foodRows&&i.col==foodColumns)
	                    {
	                		isInGrid=true;
	                    }
	                }                                  
	                for(Position i:snakeElements)
	                {
	                	if (i.row==foodRows&&i.col==foodColumns)
	                    {
	                		isInSnake=true;
	                    }
	                }
	                terminal.moveCursor(food.col, food.row);
	                terminal.applyForegroundColor(Terminal.Color.YELLOW);
	                       
	           	}
	            while((isInGrid==true)||(isInSnake==true)||foodColumns<1||foodColumns>terminalSize.getColumns()-1||foodRows<1||foodRows>terminalSize.getRows()-1);
	            terminal.putCharacter('@');
	            tStart = System.currentTimeMillis();
	            negativePoints-=10;       
	        }
	               
	        try {
	        	Thread.sleep((int)sleepTime);
	    	} catch (InterruptedException e) {
	    		e.printStackTrace();
	    	}
		}
	}
}


