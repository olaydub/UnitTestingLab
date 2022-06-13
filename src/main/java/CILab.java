public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        //null check
        if (myString.length() > 1){
            //check first character, if upper case ensure the rest are only upper case or lower case (exclusive)
            if (Character.isUpperCase(myString.charAt(0))){
                //they should all be upper case now
                if (Character.isUpperCase(myString.charAt(1))){
                    //ensure the rest are upper case
                    for (int i = 2; i < myString.length(); i++){
                        if (Character.isLowerCase(myString.charAt(i))){
                            return false;
                        }
                    }
                } else { //remaining characters should be lower case
                    for (int i = 2; i < myString.length(); i++){
                        if (Character.isUpperCase(myString.charAt(i))){
                            return false;
                        }
                    }
                }
            } else { //they should all be lower case
                for (int i = 1; i < myString.length(); i++){
                    if (Character.isUpperCase(myString.charAt(i))){
                        return false;
                    }
                }
            }
        }
        return true; //string length 1 or it satisfies all conditions
    }

}

