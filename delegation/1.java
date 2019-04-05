class Cookie {
    int size = 5;
    boolean hasChocolateChips:Bool = false;
}


interface BakeryDelegate {
    void cookieWasBaked(Cookie cookie);
}


class Bakery
{
    BackeryDelegate delegate;

    func makeCookie()
    {
        Cookie cookie = Cookie();
        cookie.size = 6;
        cookie.hasChocolateChips = true;

        delegate.cookieWasBaked(cookie);
    }
}


class BackingDelegate implements BakeryDelegate
{
    void cookieWasBaked(Cookie cookie)
    {
        print("Yay! A new cookie was baked, with size (cookie.size)")
    }
}



CookieShop shop = new CookieShop();

Backery bakery = new Bakery();
bakery.delegate = bakingDelegate;

bakery.makeCookie()


