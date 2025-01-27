package main;

import java.util.ArrayList;


public class Safe {
    private String pinCode;
    private ArrayList<String> safeFolder = new ArrayList<>();

    public Safe(String pinCode) {
        this.pinCode = pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public void addToList(String listing) {
        safeFolder.add(listing);
    }

    public ArrayList<String> getList(String givenPin) {
        if(givenPin.equals(pinCode)) {
            return safeFolder;
        } else {System.out.println("Väärä PIN-koodi!"); return null;}
    }
}


