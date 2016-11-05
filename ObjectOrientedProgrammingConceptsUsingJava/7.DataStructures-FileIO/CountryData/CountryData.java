
/**
 * Write a description of class CountryData here.
 * 
 * @author (Ebubechukwu Nnabuihe Abara) 
 * @version (a version number or a date)
 */
import java.io.*;
import java.util.*;
public class CountryData
{
    public static void main(String[] args) throws IOException
    {
        int arguement = Integer.parseInt(args[0]);
        ArrayList<String> data = new ArrayList<String>();
        ArrayList<String> city = new ArrayList<String>();
        ArrayList<String> populationS = new ArrayList<String>();
        
        ArrayList<String> country = new ArrayList<String>();
        ArrayList<Integer> population = new ArrayList<Integer>();      
        String tempValueS = "";
        int tempValue = 0;
        int count = 0;
        
        String filepath = "C:\\Users\\EBUBECHUKWU\\Documents\\Queen Mary\\semesterb\\oop\\shortassessment\\sa7\\filedata.txt";
        BufferedReader inStream = new BufferedReader(new FileReader(filepath));
        
        while(true)
        {
            String line = inStream.readLine();
            if(line == null)
            {
                break;
            }
            data.add(line);
        }
        
        inStream.close(); //close file readingx 
        System.out.println("Lines: " + data.size()); //TESTING
        
        for(int i=0; i<data.size(); i++)
        {
            String str = data.get(i);
            System.out.println(str); //TESTING
            
            ArrayList<String> splitArrayList = new ArrayList<>(Arrays.asList(str.split(" ")));
            
            String splitA = splitArrayList.get(0);
            String splitB = splitArrayList.get(1);
            String splitC = splitArrayList.get(2);
            
            city.add(splitA);
            populationS.add(splitB);
            country.add(splitC);
            
            System.out.println("City: " + (city.size()) + " Population: " + (populationS.size()) + " Country: " +  (country.size())); //TESTING 
            System.out.println("City " + i + ": " + city.get(i)); //TESTING
            System.out.println("Population " + i + ": " + populationS.get(i)); //TESTING
            System.out.println("Country " + i + ": " + country.get(i)); //TESTING
        }        
        
        for(int i=0; i<populationS.size(); i++)
        {
            tempValueS = populationS.get(i);
            tempValue = Integer.parseInt(tempValueS);
            
            population.add(tempValue);
            System.out.println("Population " + i + ": " + population.get(i)); //TESTING
        }
        
        for (int i=0; i<population.size(); i++)
        {
            if(population.get(i) >= arguement)
            {
                count = count + 1;
            }
        }
        System.out.println(count + " cities have population equals to or over " + arguement + ".");
        
    }
}
