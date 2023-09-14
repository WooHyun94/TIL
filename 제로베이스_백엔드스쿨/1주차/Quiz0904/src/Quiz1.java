import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
* 우현
* 과제 1
* */
public class Quiz1 {
    public static void main(String[] args) {
        String html = "<!DOCTYPE HTML>\n" + ""
                        +"<html>\n"
                        +"\t<head>\n"
                        +"\t\t<meta charset=\"UTF-8\"/>\n"
                        +"\t\t<style>\n"
                        +"\t\t\ttable { border-collapse:  collapes; width: 100%%; }\n"
                        +"\t\t\tth, td { border: solid 1px #000; }\n"
                        +"\t\t</style>\n"
                        +"\t</head>\n"
                        +"\t<body>\n"
                        +"\t\t<h1>자바 환경정보</h1>\n"
                        +"<br>\n"
                        +"\t\t<table>\n"
                        +"\t\t\t<tr>\n"
                        +"\t\t\t\t<th>키</th>\n"
                        +"\t\t\t\t<th></th>\n"
                        +"\t\t\t</tr>\n";

        for(Object k : System.getProperties().keySet()){
            String key = k.toString();
            String value = System.getProperty(key);
            String now = "<tr>\n<td>" + key + "</td>\n<td>" + value + "</td>\n</tr>";
            html += now;
        }
        html += "</table>\n</body>\n</html>";

        try{
            File file = new File("property.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(html);
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
