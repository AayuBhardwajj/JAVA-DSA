package OOPS;

public class Maruti {
    private String model;
    private String chasisNum;
    int year;
    public Maruti(String model, String chasisNum, int year){
        this.model= model;
        this.chasisNum=chasisNum;
        this.year=year;
    }
    /*void declareModel(String newM){
        model=newM;
    }
    void declareChasisNum(String newN){
        chasisNum=newN;
    }
    void setyear(int newy){
        year=newy;
    }*/

    public void setModel(String newM){
        model=newM;
    }
    public void setChasis(String newCh){
        chasisNum= newCh;
    }
    public void setYear(int newY){
        year=newY;
    }

    public String getModel(){
        return model;
    }
    public  String getChasis(){
        return chasisNum;
    }
    public static void main(String args[]){
       Maruti m1= new Maruti("Alto", "11223", 2005);
       System.out.println(m1.getModel());
       m1.setModel("Eartiga");
       System.out.println(m1.getModel());
       System.out.println(m1.getChasis());
       m1.setChasis("001");
       System.out.println(m1.getChasis());
    }
}
