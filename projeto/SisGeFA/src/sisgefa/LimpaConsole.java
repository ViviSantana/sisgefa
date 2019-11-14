package sisgefa;

import java.io.IOException;

public class LimpaConsole {

	
	public void LimpaConsole(){

        try{
                 Runtime.getRuntime().exec("cls");
        }
        catch (Exception e){
        //  Tratar Exceptions
        }
    }
}
