public class mazePathDiagonal {
    static void mazeDiagonal(int r,int c,int endRow,int endCol,String str){
        if(r==endRow && c==endRow){
            System.out.println(str);
            return;
        }
        if(r <endRow && c < endCol){
            mazeDiagonal(r+1,c+1,endRow,endCol,str+"D"); // Diagonal
        }
        if(r<endRow){
            mazeDiagonal(r+1,c,endRow,endCol,str + "V"); // Down
        }
        if(c<endCol){
            mazeDiagonal(r,c+1,endRow,endCol,str + "R"); // Right
        }
    }

    public static void main(String[] args) {
        mazeDiagonal(0,0,2,2,"");
    }
}
