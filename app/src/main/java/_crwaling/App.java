/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package _crwaling;



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.JobHoldUntil;

import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.w3c.dom.ElementTraversal;


public class App {

    
    

    public void ygosu(final String URL) {
        try{
            // private final String URL = "https://ygosu.com/community/stock";
            
            Document document =  Jsoup.connect(URL).get();

            Element table = document.select("table").get(0);
            Elements infos = table.select("tbody tr");


            List<Element> elementList = new ArrayList<>();
            int cnt=0;
            for (Element info : infos) {
                Elements tds = info.select("td");
                // elementList = tds.stream()
                //                     .filter(element -> !element.getElementsByClass("tit").isEmpty()
                //                             ).toList();
                
                // System.out.println(elementList);
                System.out.println(tds.text());
            }
            
            
            
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    
    public void naver(final String URL){
        
        // private String URL = "https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=101";
        int cnt=0;
        try{
            
            Document document =  Jsoup.connect(URL).get();
            Elements eles = document.select("div[class=\"list_body section_index\"]");
            for (Element e : eles.select("li")) {
                if(e.classNames().equals("photo")){
                    continue;
                }
                System.out.println(e.text()); 
                cnt++;
            }
            System.out.println("cnt : "+cnt);
            // System.out.println(eles.text());
            // System.out.println(document.getElementsByClass("main_preview"));
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }

    private boolean isTrueInKeyword(String str, String keyword){
        if(StringUtils.contains(str, keyword)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    public static void main(String[] args) {
        try{
            
            Object obj = new JSONParser().parse(new FileReader("D:\\fastcampus\\94_crwaling\\app\\src\\main\\resources\\sitelist.json"));
            JSONObject jObject = (JSONObject) obj;

            // new App().ygosu(jObject.get("ygosu").toString()); 
            App app = new App();
            app.ygosu((String) jObject.get("ygosu"));
            // new App().naver(jObject.get("naver").toString());
            

        }catch(ParseException e){
            // JSON 파일 오류
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

        

        
    }
}
