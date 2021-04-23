package be.intecbrussel.cookie_list;

import org.json.Cookie;
import org.json.CookieList;
import org.json.JSONObject;

public class JSONDemo {
    public static void main(String[] args) {
        String cookie = "username = Mark Den; expires = Thu, 15 Jun 2020 12:00:00 UTC; path = /";

        //Case 1: Converts Cookie String to JSONObject
        JSONObject cookieJSONObject = Cookie.toJSONObject(cookie);

        JSONObject cookielistJSONObject = new JSONObject();
        cookielistJSONObject.put(cookieJSONObject.getString("name"),
                cookieJSONObject.getString("value"));

        String cookieList = CookieList.toString(cookielistJSONObject);
        System.out.println(cookieList);
        System.out.println(CookieList.toJSONObject(cookieList));
    }
}
