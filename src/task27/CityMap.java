package task27;

import java.util.ArrayList;
import java.util.HashMap;

public class CityMap {
    public static void main(String[] args)
    {
        HashMap<String, ArrayList<String>> Map = new HashMap<>();
        ArrayList<City> cityList = new ArrayList<>();
        cityList.add(new City("Moscow", "Russia"));
        cityList.add(new City("Rostov", "Russia"));
        cityList.add(new City("London", "UK"));
        cityList.add(new City("Berlin", "Germany"));
        cityList.add(new City("Washington", "USA"));
        cityList.add(new City("Vienn", "Austria"));

        ArrayList<String> countries = new ArrayList<>();
        for(City cityy : cityList)
        {
            if(!countries.contains(cityy.getCountry()))
            {
                countries.add(cityy.getCountry());
            }
        }

        ArrayList <ArrayList<String>> finalList = new ArrayList<>();
        for(String country : countries)
        {
            ArrayList<String> specialCountriesList = new ArrayList<>();
            for(City cityy : cityList) {
                if(cityy.getCountry() == country)
                {
                    specialCountriesList.add(cityy.getCity());
                }
            }
            finalList.add(specialCountriesList);
        }

        for(int i = 0; i < countries.size(); i++)
        {
            Map.put(countries.get(i), finalList.get(i));
        }

        System.out.println(Map);
    }
}