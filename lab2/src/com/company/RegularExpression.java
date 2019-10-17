package com.company;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpression {
    private String text;
    private Pattern pattern = Pattern.compile("\\w+@\\w+\\.(com|ru)");

    public void setText(String str){ text = str; }
    public String getText(){return text;}

    public String findEmail(){
        Matcher m = pattern.matcher(text);
        String str = "";
        while (m.find()){
            str+= text.substring(m.start(), m.end()) + "\n";
        }
        //str += m.toString() + "\n";
        //text email@gmail.com email@mail.ru some text some email@il.ru
        return str;
    }
}
