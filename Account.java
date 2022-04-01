import java.util.*;

public class Account{

private String id;
private String name;
private int Balance;



public Account(String id, String name, int balance){
    this.id = id;
    this.name = name;
    Balance = 1000;

}



//Getter and Setter Methods

public String getId(){
    return id;
}

public String getName(){
    return name;
}

public int getBalance(){
    return Balance;
}

public int Credit(amount int){

}

public int Debit(amount int){

}

public String toString(){
    return("Account A has balance")
}





