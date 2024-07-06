package rocks.zipcodewilmington.tictactoe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public static List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        Board.list = list;
    }


Character [][] matrix;
    //public Character [][] matrix = new Character[][]{};
//    public Board matrix = new Board(new Character[][]{
//        {'X', 'O', 'X'},
//        {'O', 'O', 'X'},
//        {'X', 'X', 'O'}
//    });


    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Board() {
    }

    public static void main(String[] args){

//        System.out.println("Hello, World!");
//        Board board = new Board();
//        board.getRow1();
//        board.getRow2();
//        board.getRow3();
//        board.getCol1();
//        board.getCol2();
//        board.getRow3();
//        board.getCross1();
//        board.getCross2();
//        System.out.println(list);
//        board.isTie();
//        board.isInFavorOfO();


    }

    public Boolean isInFavorOfX() {

        if(getWinner().equals("X")){
            return true;
        }
        System.out.println(list);
        return false;
    }

    public Boolean isInFavorOfO() {
        //return false;
        if(getWinner().equals("O")){
            return true;
        }
        return false;
    }

    public Boolean isTie() {
        if(getWinner().equals("")){
            return true;
        }
        return false;
    }

    public String getWinner() {
        Board board = new Board();
        list.clear();
        list.add(getRow1());
        list.add(getRow2());
        list.add(getRow3());
        list.add(getCol1());
        list.add(getCol2());
        list.add(getCol3());
        list.add(getRow3());
        list.add(getCross1());
        list.add(getCross2());
            if(list.contains("XXX")){
                return "X";
            }else if(list.contains("OOO")){
                return "O";
            }else{
                return "";
            }

    }
    public String getRow1(){
        Board b = new Board();
        String row = "";
        //Board m = new Board();
            for(int i= 0; i< 3; i++){
                row += matrix[0][i];
            }
      return row;
    }

    public String getRow2(){
        Board b = new Board();
        String row = "";
        for(int i= 0; i< 3; i++){
            row += matrix[1][i];
        }
        return row;

    }

    public String getRow3(){
        Board b = new Board();
        String row = "";
        for(int i= 0; i< 3; i++){
           row+= matrix[2][i];
        }
     return row;

    }

    public String getCol1(){
        Board b = new Board();
        String row = "";
        for(int i= 0; i< 3; i++){
            row += matrix[i][0];
        }
       return row;

    }

    public String getCol2(){
        Board b = new Board();
        String row = "";
        for(int i= 0; i< 3; i++){
            row+= matrix[i][1];
        }
        return row;

    }
    public String getCol3(){
        Board b = new Board();
        String row = "";
        for(int i= 0; i< 3; i++){
           row+= matrix[i][2];
        }
     return row;

    }
    public String getCross1(){
        Board b = new Board();
        String row = "";
        for(int i= 0; i< 3; i++){
            row+= matrix[i][i];
        }
        return row;

    }
    public String getCross2(){
        Board b = new Board();
        String row = "";
        int j = matrix.length-1;
        for(int i= 0; i< 3; i++){
            row+= matrix[i][j];
            j--;
        }
        return row;
    }


}
