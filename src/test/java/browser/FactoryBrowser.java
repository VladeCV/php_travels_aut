package browser;

public class FactoryBrowser {
    public static IBrowser make(String browserType){
        IBrowser browser;
        switch (browserType.toLowerCase()) {
//            case "proxyChrome":
//                browser = new ProxyChrome();
//                break;
//
            default:
                browser = new Chrome();
                break;
        }
        return browser;
    }
}
