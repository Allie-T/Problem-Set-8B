

public class CharMatrixDriver{
    
     public static void main (String[] args) {

      System.out.println("Create a CharMatrix filled with o's ...");
      CharMatrix matrix = new CharMatrix(3, 10, 'o');
      matrix.display();
      
      System.out.println(); 
      System.out.println("Number of Rows in the 2D Array: " + matrix.numRows());
      
      System.out.println("Number of Columns in the 2D Array: " + matrix.numCols());
      
      int indexR = 2;
      int indexC = 9;
      System.out.println("Return char at [" + indexR + ","+indexC+"]: "+ matrix.charAt(indexR, indexC));
        
      System.out.println();
      System.out.println("Testing setCharAt ...");
      System.out.println("  CharMatrix before method call:");
      matrix.display();
      
      matrix.setCharAt(0, 9, ' ');
      
      System.out.println("  CharMatrix after method call:");
      matrix.display();
      System.out.println();
      
      int emptyR = 0;
      int emptyC = 9;
      System.out.println("Character at ["+emptyR+","+emptyC+"] is empty: "+ matrix.isEmpty(emptyR,emptyC));
      
      System.out.println();
      System.out.println("Filling...");
      matrix.fillRect(0,0,0,9,'x');
      matrix.display();
      
      System.out.println();
      System.out.println("Emptying...");
      matrix.clearRect(0,3,1,5);
      matrix.display();
      
      int row = 0;
      int col = 5;
      System.out.print("number of non-space char in row " + row + ": ");
      System.out.println(matrix.countInRow(row));
      System.out.print("number of non-space char in col " + col + ": ");
      System.out.println(matrix.countInCol(col));
      
      
      

     

   }  
    
}
