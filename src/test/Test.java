package test;


import weather.ArrayOfString;
import weather.WeatherWebService;
import weather.WeatherWebServiceSoap;

/**
 * @author wgt
 * @date 17-12-28
 */
public class Test {
    public static void main(String[] args) throws Exception {
        WeatherWebService weatherWebService = new WeatherWebService();
        WeatherWebServiceSoap soap = weatherWebService.getWeatherWebServiceSoap();
        System.out.println("-----------------------");
        ArrayOfString weatherInfo = soap.getWeatherbyCityName("北京");
        for(String str : weatherInfo.getString()) {
            System.out.println("天气信息: " + str);
        }
    }
}
