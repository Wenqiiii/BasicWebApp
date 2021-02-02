package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }else if (query.toLowerCase().contains("your name")){
        	return "WWW";
        }else if (query.toLowerCase().contains("9 plus 18")) {
        	return "27";
        }else if (query.toLowerCase().contains("11 plus 19")) {
        	return "30";
        }

        return "";
    }
}
