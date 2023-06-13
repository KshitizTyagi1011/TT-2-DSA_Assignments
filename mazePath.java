public class mazePath {
    static void maze(int r,int c,int endRow,int endCol,String str){
        if(r==endRow && c==endRow){
            System.out.println(str);
            return;
        }
        if(r<endRow){
            maze(r+1,c,endRow,endCol,str + "D");
        }
        if(c<endCol){
            maze(r,c+1,endRow,endCol,str + "R");
        }
    }

    public static void main(String[] args) {
        maze(0,0,2,2,"");
    }
}
