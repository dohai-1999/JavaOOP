package TinhTriuTuong;

abstract public class Action {
    abstract public void openURL(String url);
    abstract public void clickElement();
    abstract public void setText(String text);
    abstract public void setText(String text, String keys);

    public String getTextElement(String element){
        System.out.println("get text of element:" +element);
        return "TEXT" ;
    }
}
