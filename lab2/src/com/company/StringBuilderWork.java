package com.company;

public class StringBuilderWork {
    private StringBuilder text;
    public void setText(StringBuilder str) {text = str;}
    public StringBuilder getText(){return text;}
    public void setPlus(){
        int n;
        String str = "";
        for (int i = 0; i < text.length() - 2; i++){
            if (text.charAt(i) > '0' && text.charAt(i) <= '9' &&
                    text.charAt(i + 1) >= '0' && text.charAt(i + 1) <= '9' &&
                    (text.charAt(i + 2) < '0' || text.charAt(i + 2) > '9')){
                //  В условии проверяется что бы данная ячейка была цифрой, следующая была цифрой, а 3 уже не была
                n = Integer.parseInt(text.substring(i, i+2));
                for (int j = 0; j < n; j++)
                    str+= "+";
                text = text.replace(i, i + 2, str);
                str = "";
            }
            i = text.indexOf(" ", i + 1);
            if (i < 0) break;
        }
    }
    public void addKONEC(){
        StringBuilder buf = new StringBuilder(text);
        int minLength = buf.length(), minInd = 0, n;
        for (int i = 0; i < buf.length(); i++){
            if (buf.charAt(i) == '.' || buf.charAt(i) == '!' || buf.charAt(i) == '?'){
                buf.replace(i, i+1, "\n");
            }
        }
        for (int i = 0; i < buf.length(); i++){
            n = buf.indexOf("\n", i);
            if (minLength > n - i){
                minLength = n - i;
                minInd = n;
            }

            i = n;
        }
        text.replace(minInd, minInd + 1, "КОНЕЦ.");
    }
    public void changeNum() {
        StringBuilder buf;
        for (int i = 0; i < text.length() - 3; i++) {
            if (text.charAt(i) > '0' && text.charAt(i) <= '9' &&
                    text.charAt(i + 1) >= '0' && text.charAt(i + 1) <= '9' &&
                    text.charAt(i + 2) >= '0' && text.charAt(i + 2) <= '9' &&
                    (text.charAt(i + 3) < '0' || text.charAt(i + 3) > '9')) {
                buf = new StringBuilder(text.substring(i, i + 3));
                text.replace(i, i + 3, buf.reverse().toString());
            }
        }
    }
}
