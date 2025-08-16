package TinhTriuTuong;

public class ActionKeyword extends Action{
    @Override
    public void openURL(String url) {
        System.out.println("\uD83D\uDE03 Open URL: "+url);
    }

    @Override
    public void clickElement() {
        System.out.println("\uD83D\uDE03 Click on element: ");
    }

    @Override
    public void setText(String text) {
        System.out.println("\uD83D\uDE03 Enter text in put: " + text);
    }

    @Override
    public void setText(String text, String keys) {
        System.out.println("\uD83D\uDE03 Enter text in put: " + text);
        System.out.println("\uD83D\uDE03 Enter key: " +keys);
    }


}
