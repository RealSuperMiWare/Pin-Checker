class PinChecker{
    //declare isPin and isCorrectLength boolean
    boolean isNumber, isCorrectLenth;

    //check pin algorithm
    /*1 - All numbers - DONE
    *2 - between 4 and 6 chars*/
    public boolean CheckPinIsNumbers(String pin){
        isNumber = false;
        if(pin.matches("[0-9]+")){
            isNumber = true;
        }else{
            Log.d("Failed", "Pin can only contain numbers and must be " +
                    "between 4 and 6 characters.");
        }
        return isNumber;
    }
    //Check pin length
    public boolean CheckPinLength(String pin){
        isCorrectLenth = false;
        if((pin.length() >= 4) && (pin.length() <= 6)){
            isCorrectLenth = true;
        }else{
            Log.d("Failed", "Pin must be between 4 and 6 characters");
        }
        return isCorrectLenth;
    }
    //FULL PIN CHECK
    //When implementing into your code here is the method you should call
    public void FullPinCheck(String pin){
        if((CheckPinIsNumbers(pin)) && (CheckPinLength(pin))){
            //... does pass
            //... Alert user there username can NOT be changed
            Log.d("Check Status : ", "Pin was successfully checked");
        }else{
            //... Alert the user the pin check failed
            Log.d("Check Status : ", "Pin failed");
        }
    }
}