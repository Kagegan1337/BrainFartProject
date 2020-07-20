package fancyTseRemoteController.models;

public class TransportReturn {

    private boolean boolReturn = false;

    private String stringReturn = "";


    public TransportReturn(boolean boolReturn) {
        this.boolReturn = boolReturn;
    }

    public TransportReturn(String stringReturn) {
        this.stringReturn = stringReturn;
    }

    public boolean isBoolReturn() {
        return boolReturn;
    }

    public void setBoolReturn(boolean boolReturn) {
        this.boolReturn = boolReturn;
    }

    public String getStringReturn() {
        return stringReturn;
    }

    public void setStringReturn(String stringReturn) {
        this.stringReturn = stringReturn;
    }
}
