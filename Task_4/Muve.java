package Task_4;

public class Muve {
     int n;
     String Spair1;
     String Spair2;
     String Spair3;

            //арг      count        spair1             spair2                spair3
    public Muve(int valueN, String valueStart, String valueTemp, String valueFinish) {
        this.n = valueN; 
        this.Spair1 = valueStart;
        this.Spair1 = valueTemp;
        this.Spair3 = valueFinish;
    }

   
    // public Muve( var value) {
    //     this(3,1,2,3);
        
    // }
   

    public Muve(var  value) {
        this(value);
    }
    public Muve() {
        this(3,2,1,3);
    }


    // public static void MuveS(Muve an, Muve bS, Muve cF) {
    // }

    // public Muve(int value){
    //     this(value,value,value);
    // }
    
    public int getN(){
        return n;
    }
    public String getStart(){
        return Spair1;
    }
    public String getSpairTemp(){
        return Spair1 ;
    }
    public String getFinish(){
        return Spair3;
    }

    public void setN(int value){
        this.n = value;
    }
    public void setStart(String value){
        this.Spair1 = value;
    }
    public void setSpairTemp(String value){
        this.Spair1 = value;
    }
    public void setFinish(String value){
        this.Spair3 = value;
    }
   


    



  
}    
