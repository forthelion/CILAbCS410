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
        int count = 0;
        String string = getString();
        for ( int i = 0; i < string.length(); i++){
            char ch =  string.charAt(i);
            if (ch == Character.toUpperCase(ch)){
                count++;
            }
        }
        if (count == string.length() || count == 0 || (count == 1 && Character.isUpperCase(string.charAt(0)))) {
            return true;
        }

        return false;
    }

}

